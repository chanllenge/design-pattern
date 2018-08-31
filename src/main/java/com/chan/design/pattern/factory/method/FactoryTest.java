package com.chan.design.pattern.factory.method;


/**
 * Created by yuyuanhe
 * Date: 8/30/18 3:40 PM
 * Description:
 */
public class FactoryTest {

    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();
    }
}
