package com.wei.test.encrypt;

import java.security.MessageDigest;

import com.google.common.io.BaseEncoding;

/**
 * 加密帮助类
 * <p>
 * 目前支持的编码类型 base64
 * <p>
 * 目前支持的加密算法类型
 * <ul>
 * <li>MD5</li>
 * <li>SHA-1</li>
 * <li>SHA-256</li>
 * </ul>
 * 
 * @author weichao
 *
 */
public class EncryptHelper {
    
    /**
     * BASE64编码
     * 
     * @param key 字节码
     * @return 编码后的字符串
     */
    public static String base64Encoder(byte[] key) {
        return BaseEncoding.base64().encode(key);
    }
    
    /**
     * BASE64解码
     * 
     * @param key BASE64编码后的字符串
     * @return 字节码
     */
    public static byte[] base64Decoder(String key) {
        return BaseEncoding.base64().decode(key);
    }
    
    /** 
     * MD5加密 
     *  
     * @param key 需要加密的字符串，默认用UFT-8编码取其字节码
     * @return 加密后的字节码
     */  
    public static byte[] encryptMD5(String key) {
        return encrypt(EncryptType.ENCRYPT_TYPE_MD5, key);
    }
    
    /**
     * MD5加密后再进行base64编码
     * 
     * @param key 明文
     * @return 密文
     */
    public static String encryptMD5_BASE64(String key) {
        return base64Encoder(encryptMD5(key));
    }
    
    /** 
     * SHA1加密 
     *  
     * @param key 需要加密的字符串，默认用UFT-8编码取其字节码
     * @return 加密后的字节码
     */  
    public static byte[] encryptSHA1(String key) {  
        return encrypt(EncryptType.ENCRYPT_TYPE_SHA1, key);
    } 
    
    /**
     * SHA1加密后再进行base64编码
     * 
     * @param key 明文
     * @return 密文
     */
    public static String encryptSHA1_BASE64(String key) {
        return base64Encoder(encryptSHA1(key));
    }
    
    /** 
     * SHA-256加密 
     *  
     * @param key 需要加密的字符串，默认用UFT-8编码取其字节码
     * @return 加密后的字节码
     */  
    public static byte[] encryptSHA256(String key) {  
        return encrypt(EncryptType.ENCRYPT_TYPE_SHA256, key);
    } 
    
    /**
     * SHA-256加密后再进行base64编码
     * 
     * @param key 明文
     * @return 密文
     */
    public static String encryptSHA256_BASE64(String key) {
        return base64Encoder(encryptSHA256(key));
    }
    
    /**
     * 按照给定的加密算法来加密明文
     * 
     * @param alogrithm 加密算法
     * @param key 明文
     * @return 加密后的字节码
     */
    public static byte[] encrypt(EncryptType alogrithm, String key) {
        try {
            MessageDigest sha = MessageDigest.getInstance(alogrithm.algorithm);  
            sha.update(key.getBytes("UTF-8"));  
            return sha.digest();
        } catch (Exception e) {
            throw new RuntimeException("加密出错", e);
        }  
    }
    
    public enum EncryptType {
        
        ENCRYPT_TYPE_SHA1("SHA-1"),
        ENCRYPT_TYPE_SHA256("SHA-256"),
        ENCRYPT_TYPE_MD5("MD5");
        
        private String algorithm;
        
        private EncryptType(String algorithm) {
            this.algorithm = algorithm;
        }
        
        public String algorithm() {
            return this.algorithm;
        }
    }
}

