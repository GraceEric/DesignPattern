package com.eric.java.patterns.decorator.javaowner;

import java.io.*;

/**
 * InputTest: 测试类
 *
 * @author: MrServer
 * @since: 2018/1/8 上午10:46
 */
public class InputTest {

    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/eric/Documents/workspace/Java/DesignPattern/src/com/eric/java/patterns/decorator/test.txt")));

            try {
                while ((c = in.read()) >= 0) {
                    System.out.print((char) c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}