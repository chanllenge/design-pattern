package com.chan.design.pattern.factory;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 3:36 PM
 * Description:
 */
public class Factory implements IFactory {
    public IProduct createProduct() {
        return new Product();
    }
}
