package com.chan.design.pattern.builder;

import com.chan.common.Stdout;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 4:54 PM
 * Description:
 */
public class Product {
    private String productName;
    private String productType;

    public void show() {
        Stdout.println("product name " + productName + " type " + productType);
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public void setProductType(String type) {
        this.productType = type;
    }
}
