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
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    modularity.inferModulePath.set(true)

}



tasks {
    withType<JavaCompile>().configureEach {
        // javac --add-modules jdk.incubator.foreign ...
        options.compilerArgs = listOf(
                "--add-modules", "jdk.incubator.foreign"
        )
        options.release.set(17)
    }

    withType<JavaExec>().configureEach {
        // java --add-modules jdk.incubator.foreign --enable-native-access=ALL-UNNAMED
        jvmArgs("--enable-native-access=ALL-UNNAMED",
                "--add-modules", "jdk.incubator.foreign"
        )
        javaLauncher.set(project.javaToolchains.launcherFor(java.toolchain))
    }

    getByName<Test>("test") {
        useJUnitPlatform()
        testLogging {
            showStandardStreams = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        }

        // java --add-modules jdk.incubator.foreign --enable-native-access=ALL-UNNAMED
        jvmArgs("--enable-native-access=ALL-UNNAMED",
                "--add-modules", "jdk.incubator.foreign"
        )
    }
}
