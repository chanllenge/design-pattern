package com.chan.design.pattern.builder;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 5:00 PM
 * Description:
 */
public class Director {
    private ConcreteBuilder builder = new ConcreteBuilder();

    public Product getProduct1() {
        builder.setProduct("x5", "BMW");
        return builder.getProduct();
    }

    public Product getProduct2() {
        builder.setProduct("q7", "奥迪");
        return builder.getProduct();
    }
}
