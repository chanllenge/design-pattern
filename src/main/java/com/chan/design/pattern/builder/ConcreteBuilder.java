package com.chan.design.pattern.builder;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 4:57 PM
 * Description:
 */
public class ConcreteBuilder extends AbstractBuilder {
    Product product = new Product();

    @Override
    public void setProduct(String arg1, String arg2) {
        product.setProductName(arg1);
        product.setProductType(arg2);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
