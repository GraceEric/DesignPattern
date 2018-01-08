package com.eric.java.patterns.decorator.javaowner;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * UpperCaseInputStream:
 *
 * @author: MrServer
 * @since: 2018/1/8 上午10:38
 */
public class UpperCaseInputStream extends FilterInputStream {


    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        //-1 :没有内容了
        return c == -1 ? c : Character.toUpperCase((char) c);
    }

    public int read(byte b[], int off, int len) throws IOException {

        int result = super.read(b, off, len);

        for (int i = 0; i < result; i++) {
            b[i] = (byte) Character.toUpperCase((char) b[i]);
        }
        return result;


    }


}