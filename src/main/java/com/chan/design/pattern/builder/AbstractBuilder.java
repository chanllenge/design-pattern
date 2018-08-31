package com.chan.design.pattern.builder;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 4:48 PM
 * Description:
 */
abstract class AbstractBuilder {
    public abstract void setProduct(String arg1, String arg2);
    public abstract Product getProduct();
}
