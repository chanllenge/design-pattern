package com.chan.design.pattern.prototype;

import com.chan.common.Stdout;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 5:22 PM
 * Description:
 */
public class ConcreteProtoType extends ProtoType {
    public void show() {
        Stdout.println("原型类的实现类");
    }
}
