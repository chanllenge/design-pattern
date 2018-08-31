package com.chan.design.pattern.factory.absract;

import com.chan.common.Stdout;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 4:36 PM
 * Description:
 */
public class Product1 implements IProduct1 {
    public void info() {
        Stdout.println("this is product 1");
    }
}
