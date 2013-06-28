package com.wei.test.encrypt;

/**
 * @author weichao
 *
 */
public class EncryptTest {

    public static void main(String[] de) {
        String md = EncryptHelper.encryptMD5_BASE64("123");
        String sha1 = EncryptHelper.encryptSHA1_BASE64("123");
        String sha256 = EncryptHelper.encryptSHA256_BASE64("123");;
        System.out.println(md);
        System.out.println(sha1);
        System.out.println(sha256);
    }
}
