package com.chan.design.pattern.factory.absract;

import com.chan.common.Stdout;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 4:36 PM
 * Description:
 */
public class Product2 implements IProduct2 {
    public void info() {
        Stdout.println("this is product 2");
    }
}
