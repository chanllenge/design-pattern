package com.chan.design.pattern.builder;

import com.chan.common.Stdout;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 5:04 PM
 * Description: 使用的是同一个product地址。
 */
public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();
        Product product1 = director.getProduct1();
        product1.show();
        Product product2 = director.getProduct2();
        product2.show();
        product1.show();
        Stdout.println(product1.equals(product2));
    }
}
