package com.chan.design.pattern.prototype;

import com.chan.common.Stdout;

import java.util.ArrayList;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 5:15 PM
 * Description:
 */
public class ProtoType implements Cloneable {
    private ArrayList list = new ArrayList();
    @Override
    public ProtoType clone() {
        ProtoType protoType = null;
        try {
            protoType = (ProtoType) super.clone();
            protoType.list = (ArrayList) this.list.clone();
        } catch (CloneNotSupportedException ex) {
            Stdout.println("clone exception " + ex);
        }
        return protoType;
    }
}
