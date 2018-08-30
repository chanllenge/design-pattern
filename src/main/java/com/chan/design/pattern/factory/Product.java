package com.chan.design.pattern.factory;

import com.chan.common.Stdout;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 3:38 PM
 * Description:
 */
public class Product implements IProduct {
    public void productMethod() {
        Stdout.println("product method");
    }
}
