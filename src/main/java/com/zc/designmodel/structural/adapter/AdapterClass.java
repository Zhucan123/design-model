package com.zc.designmodel.structural.adapter;

/**
 * Created by zhuCan
 * Project design-model.
 * Date 2019/3/27   Time 10:21.
 * 类适配器 模式   主要是用继承来实现 覆盖接口的同名方法
 */
public class AdapterClass extends Adapter implements Target {

    @Override
    public void write() {
        System.err.println("这是重写的接口方法");
    }
}

interface Target {
    void show();

    void write();
}

class Adapter {
    public void show() {
        System.err.println("这是适配器的方法");
    }
}

class AdapterClassTest {
    public static void main(String... args) {
        //这样target的实现类就有了 adapter的方法了
        Target target = new AdapterClass();
        target.show();
        target.write();
    }
}
