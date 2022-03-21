package com.main.security;

import java.math.BigInteger;  
import java.security.NoSuchAlgorithmException;  
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;  

public class HashCreatorImp implements HashCreator {
    public String getHash(String input) {
        try {
            MessageDigest msgDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = msgDigest.digest(input.getBytes(StandardCharsets.UTF_8));
            BigInteger num = new BigInteger(1, hash);
            StringBuilder hashString = new StringBuilder(num.toString(16));

            // Padding to make length uniform
            while (hashString.length()<32) {
                hashString.insert(0, '0');
            }
  
            return hashString.toString();
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
