package com.utils;

import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 生成唯一自增的24位ID.
 */
public class IDGenerator {
    private static AtomicInteger _nextInc = new AtomicInteger((new Random()).nextInt());
    private static int _genmachine;

    public IDGenerator() {
    }

    public static String nextUUID24() {
        //获取当前系统时间.
        int time = (int) (System.currentTimeMillis() / 1000L);
        int machine = _genmachine;
        int inc = _nextInc.getAndIncrement();
        return toHexString(time, machine, inc);
    }

    private static String toHexString(int time, int machine, int inc) {
        StringBuilder builder = new StringBuilder(24);
        byte[] var = toByteArray(time, machine, inc);
        for (byte b : var) {
            builder.append(String.format("%02x", b & 255));
        }
        return builder.toString();
    }

    private static byte[] toByteArray(int time, int machine, int inc) {
        byte[] bytes = new byte[12];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        byteBuffer.putInt(time);
        byteBuffer.putInt(machine);
        byteBuffer.putInt(inc);
        return bytes;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(IDGenerator.nextUUID24());
        }
    }
}
