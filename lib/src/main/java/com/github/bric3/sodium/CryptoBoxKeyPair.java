package com.github.bric3.sodium;

import java.util.Base64;


public record CryptoBoxKeyPair(
        byte[] publicKey,
        byte[] secretKey
) {
    public String publicKeyBase64String() {
        return Base64.getEncoder().encodeToString(publicKey);
    }

    public String secretKeyBase64String() {
        return Base64.getEncoder().encodeToString(secretKey);
    }

    public String publicKeyHexString() {
        return Utils.bytesToHex(publicKey);
    }

    public String secretKeyHexString() {
        return Utils.bytesToHex(secretKey);
    }
}
