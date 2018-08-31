package com.chan.design.pattern.prototype;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 5:23 PM
 * Description:
 */
public class ProtoTypeTest {

    public static void main(String[] args) {
        ConcreteProtoType concreteProtoType = new ConcreteProtoType();
        for(int i=0; i<3; i++) {
            ConcreteProtoType cp = (ConcreteProtoType)concreteProtoType.clone();
            cp.show();
        }
    }

}
