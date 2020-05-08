package com.gemini.classloader;

import java.io.*;
import java.lang.reflect.Type;

import static com.sun.xml.internal.messaging.saaj.packaging.mime.util.ASCIIUtility.getBytes;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/25 15:32
 */
public class MyClassLoader extends ClassLoader {

    private String name;

    public MyClassLoader(ClassLoader parent, String name) {
        super(parent);
        this.name = name;
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = getBytes("D:\\workspace\\yu\\algorithm\\target\\classes\\com\\gemini\\classloader\\Test1.class");
        return this.defineClass(name, bytes, 0, bytes.length);
    }


    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        ClassLoader systemClassLoader = getSystemClassLoader().getParent();
        Class clazz = null;
        try {
            clazz = systemClassLoader.loadClass(name);
        } catch (ClassNotFoundException e) {
            // e.printStackTrace();
        }
        if (clazz == null) {
            return findClass(name);
        }
        return clazz;
        // return findClass(name);
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader loader1 = new MyClassLoader(MyClassLoader.class.getClassLoader(), "MyClassLoader");

        Class clazz = loader1.loadClass("com.gemini.classloader.Test1");
        System.out.println(clazz.getClassLoader());
        Object instance = clazz.newInstance();

        MyClassLoader loader2 = new MyClassLoader(MyClassLoader.class.getClassLoader(), "MyClassLoader");
        MyClassLoader loader3 = new MyClassLoader(MyClassLoader.class.getClassLoader(), "MyClassLoader");

        Class clazz2 = loader2.loadClass("com.gemini.classloader.Test1");
        Class clazz3 = loader3.loadClass("com.gemini.classloader.Test1");
        System.out.println(clazz2.equals(clazz3));


    }

    /**
     * @param path
     * @return
     */
    public byte[] getBytes(String path) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;

    }
}

