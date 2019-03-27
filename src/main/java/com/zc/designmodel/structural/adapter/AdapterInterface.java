package com.zc.designmodel.structural.adapter;

/**
 * Created by zhuCan
 * Project design-model.
 * Date 2019/3/27   Time 10:42.
 * 接口适配器模式
 * 接口的适配器是这样的：有时我们写的一个接口中有
 * 多个抽象方法，当我们写该接口的实现类时，必须实现该接口的所有方法，这明显有时比较浪
 * 费，因为并不是所有的方法都是我们需要的，有时只需要某一些，此处为了解决这个问题，我
 * 们引入了接口的适配器模式，借助于一个抽象类，该抽象类实现了该接口，实现了所有的方法，
 * 而我们不和原始的接口打交道，只和该抽象类取得联系，所以我们写一个类，继承该抽象类，
 * 重写我们需要的方法就行。看一下类图
 */
public class AdapterInterface {
}

interface extend {
    void go();

    void run();
}

abstract class ParentAdalpter implements extend {
    public void go() {
    }

    public void run() {
    }
}

class Adapter1 extends ParentAdalpter {
    public void go() {
        System.err.println("Adapter1 go");
    }
}

class Adapter2 extends ParentAdalpter {
    public void run() {
        System.err.println("Adapter2 run");
    }
}

class AdapterInterfaceTest {
    public static void main(String... args) {
        Adapter1 adapter1 = new Adapter1();
        Adapter2 adapter2 = new Adapter2();
        adapter1.go();
        adapter1.run();
        adapter2.go();
        adapter2.run();
    }
}