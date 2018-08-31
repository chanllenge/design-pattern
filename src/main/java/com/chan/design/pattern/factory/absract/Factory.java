package com.chan.design.pattern.factory.absract;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 4:38 PM
 * Description:
 */
public class Factory implements IFactory {
    public IProduct1 createProduct1() {
        return new Product1();
    }

    public IProduct2 createProduct2() {
        return new Product2();
    }
}
