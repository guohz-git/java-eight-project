package com.java.eight.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class Java8Tester {
    public static void main(String[] args) {
        try {
            String base64EncodedString = Base64.getEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
            System.out.println(base64EncodedString);
            //解码
            byte[] base64EncodedBytes = Base64.getDecoder().decode(base64EncodedString);
            System.out.println("原始数据"+new String(base64EncodedBytes,"UTF-8"));
            base64EncodedString = Base64.getUrlEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
            System.out.println("Base64 编码字符串 (URL) :" + base64EncodedString);
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }

            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 编码字符串 (MIME) :" + mimeEncodedString);
        }catch (UnsupportedEncodingException e){
            System.out.println();
        }
    }
}
