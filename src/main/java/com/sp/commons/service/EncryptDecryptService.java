package com.sp.commons.service;

public interface EncryptDecryptService {
   public String encrypt(final String plainText, final String secretKey);
   public String decrypt(final String cipherText, final String secretKey);
}
