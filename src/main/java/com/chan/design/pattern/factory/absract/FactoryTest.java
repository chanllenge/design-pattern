package com.chan.design.pattern.factory.absract;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 4:39 PM
 * Description:
 */
public class FactoryTest {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        factory.createProduct1().info();
        factory.createProduct2().info();
    }
}
