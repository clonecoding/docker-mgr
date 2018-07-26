package com.jdddata.dockermgr.common.util;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class CryptoUtilTest {

    @Test
    public void test1() throws UnsupportedEncodingException {
        byte[] decrypt = CryptoUtil.encrypt("123", "12345678");
        System.out.println(CryptoUtil.parseByte2HexStr(decrypt));

    }

    @Test
    public void test2() {
        String richie = CryptoUtil.encrypt("123");
        System.out.println(richie);

        System.out.println(CryptoUtil.decrypt(richie));
    }

}