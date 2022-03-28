/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.github.bric3.sodium;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assumptions.assumeThat;

public class LibsodiumTest {

    private Libsodium libsodium;

    @BeforeEach
    void can_set_path_on_macos() {
        assumeThat(OS.IS_MACOS).isTrue();
        assumeThat(Path.of("/usr/local/lib/libsodium.dylib")).exists().isRegularFile();

//        libsodium = Libsodium.withName("sodium");
        libsodium = Libsodium.withPath(Path.of("/usr/local/lib/libsodium.dylib")).ofJextract();
        // libsodium = Libsodium.withPath(Path.of("/usr/local/lib/libsodium.dylib"));
    }

    @Test
    void can_invoke_crypto_box_sealbytes() throws Throwable {
        assumeThat(libsodium.crypto_box_sealbytes()).isEqualTo(48);
    }

    @Test
    void can_invoke_crypto_box_publickeybytes() throws Throwable {
        assumeThat(libsodium.crypto_box_publickeybytes()).isEqualTo(32);
    }

    @Test
    void can_invoke_crypto_box_secretkeybytes() throws Throwable {
        assumeThat(libsodium.crypto_box_secretkeybytes()).isEqualTo(32);
    }

    @Test
    void can_invoke_crypto_box_keypair() throws Throwable {
        var keyPair = libsodium.crypto_box_keypair();

        System.out.printf("pk: %s%nsk: %s%n",
                          keyPair.publicKeyHexString(),
                          keyPair.secretKeyHexString());
        System.out.printf("pk: %s%nsk: %s%n",
                          keyPair.publicKeyBase64String(),
                          keyPair.secretKeyBase64String());
    }

    @Test
    void can_invoke_crypto_box_seal() throws Throwable {
        var libsodium = this.libsodium;

        var pk = Utils.hexToBytes("4A4D4B70F5BACE21B87E1DAE136850C5F2E594C1F732E7C5F0F66CBC7954667E");

        var cipherText = libsodium.crypto_box_seal("Hello foreign code !", pk);

        assertThat(cipherText).hasSize(69);
    }

    @Test
    void can_invoke_crypto_box() throws Throwable {
        var libsodium = this.libsodium;
        var keyPair = libsodium.crypto_box_keypair();

        var pk = Utils.hexToBytes("A8D1304EFA7D85AB9612AC95B1B191AA2C17891CA9FF6AD4CFCD81C245DF6F5A");
        var sk = Utils.hexToBytes("1DF2D6487E5587F2B40019981FEB7812086DFA625D538C61E4EC8CF9A5D4E618");

        var cipherText = libsodium.crypto_box_seal("Hello foreign code !", pk);

        assertThat(cipherText).hasSize(69);

        var deciphered = libsodium.crypto_box_seal_open(cipherText, pk, sk);

        assertThat(deciphered).isEqualTo("Hello foreign code !");
    }

    @Test
    void can_invoke_crypto_box_with_large_char() throws Throwable {
        var libsodium = this.libsodium;
        var keyPair = libsodium.crypto_box_keypair();

        var pk = Utils.hexToBytes("A8D1304EFA7D85AB9612AC95B1B191AA2C17891CA9FF6AD4CFCD81C245DF6F5A");
        var sk = Utils.hexToBytes("1DF2D6487E5587F2B40019981FEB7812086DFA625D538C61E4EC8CF9A5D4E618");

        var cipherText = libsodium.crypto_box_seal("中文鍵盤/中文键盘", pk);

        assertThat(cipherText).hasSize(74);

        var deciphered = libsodium.crypto_box_seal_open(cipherText, pk, sk);

        assertThat(deciphered).isEqualTo("中文鍵盤/中文键盘");
    }
}
