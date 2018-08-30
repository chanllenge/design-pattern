package com.chan.design.singleton;

import com.chan.common.Stdout;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 2:37 PM
 * Description:
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {

    }

    public static Singleton instance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.instance();
        Singleton singleton1 = Singleton.instance();

        Stdout.println("addr1 " + singleton + " addr2" + singleton1);
        Stdout.println(singleton.equals(singleton1));
    }
}
