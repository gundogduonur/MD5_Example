package com.onurgundogdu;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Md5Example {
    public static void main(String[] args) {
    String word="Java Boost";
    byte[] digestByte;
    try{
        MessageDigest messageDigest=MessageDigest.getInstance("MD5");
        messageDigest.update(word.getBytes(StandardCharsets.UTF_8));
        digestByte=messageDigest.digest();
        StringBuilder builder=new StringBuilder();
        for (byte value:digestByte) {
            builder.append(String.format("%02x",value));
        }
        System.out.println("WORD: "+word);
        System.out.println("MD5: "+builder.toString());
    }
    catch (Exception exception)
    {
        System.out.println(exception.getLocalizedMessage());
    }
    }
}
