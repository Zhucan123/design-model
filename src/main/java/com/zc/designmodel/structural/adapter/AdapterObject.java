package com.zc.designmodel.structural.adapter;

/**
 * Created by zhuCan
 * Project design-model.
 * Date 2019/3/27   Time 10:33.
 * 对象适配器模式  ,主要是用持有实例来实现的
 */
public class AdapterObject implements Target {
    private Adapter adapter;

    public AdapterObject(Adapter adapter) {
        super();
        this.adapter = adapter;

    }

    @Override
    public void show() {
        adapter.show();
    }

    @Override
    public void write() {
        System.err.println("这是接口的方法!");
    }
}

class AdapterObjectTest {
    public static void main(String... args) {
        Adapter adapter = new Adapter();
        AdapterObject adapterObject = new AdapterObject(adapter);
        adapterObject.show();
        adapterObject.write();
    }
}
