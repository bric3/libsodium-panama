plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.assertj:assertj-core:3.19.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

}


java {
    // ./gradlew -q javaToolchains
    // https://docs.gradle.org/current/userguide/toolchains.html
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(16))
    }
    modularity.inferModulePath.set(true)

}



tasks {
    withType<JavaCompile>().configureEach {
        // https://github.com/gradle/gradle/issues/15538#issuecomment-744299876
        options.forkOptions.jvmArgs = listOf(
                "--add-opens", "jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED"
        )

        // javaC --add-modules jdk.incubator.foreign ...
        options.compilerArgs = listOf(
                "--add-modules", "jdk.incubator.foreign"
        )
        options.release.set(16)
    }

    withType<JavaExec>().configureEach {
        // java -Dforeign.restricted=permit --add-modules jdk.incubator.foreign
        jvmArgs(
                "-Dforeign.restricted=permit",
                "--add-modules", "jdk.incubator.foreign"
        )
    }

    getByName<Test>("test") {
        useJUnitPlatform()
        testLogging {
            showStandardStreams = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        }

        // java -Dforeign.restricted=permit --add-modules jdk.incubator.foreign
        jvmArgs(
                "-Dforeign.restricted=permit",
                "--add-modules", "jdk.incubator.foreign"
        )
    }
}