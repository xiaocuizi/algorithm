package com.gemini.nio;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 *
 * NIO测试
 * @author xiaocuizi
 * @since 0.0.1 2020/3/25 18:39
 */
public class BufferTest {

    public static void main(String[] args) {
//        private int mark = -1;
//        private int position = 0;
//        private int limit;
//        private int capacity;
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        print(buffer);
        String  str = "abcdefg";
        buffer.put(str.getBytes(Charset.defaultCharset()));
        print(buffer);
        buffer.flip();
        print(buffer);

        byte[] bytes = new byte[buffer.limit()];
        ByteBuffer buffer1 = buffer.get(bytes);
        System.out.println(new String(bytes));
        // clear清除缓冲区，让数据处于“被遗忘的状态”,但是数据本身还在

        // 直接缓冲区
        ByteBuffer buffer2 = ByteBuffer.allocateDirect(1024);
        System.out.println(buffer2.isDirect());
    }

    private static void print(ByteBuffer buffer) {
        System.out.println("------------------------------");
        System.out.printf("位置%s%n", buffer.position());
        System.out.printf("限制%s%n", buffer.limit());
        System.out.printf("容量%s%n", buffer.capacity());
    }
}
