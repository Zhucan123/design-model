package com.zc.designmodel.structural.Decorator;

import com.zc.designmodel.designInterface.Sourceable;

/**
 * Created by zhuCan
 * Project design-model.
 * Date 2019/3/27   Time 11:05.
 * 装饰器模式,装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装
 * 饰对象实现同一个接口，装饰对象持有被装饰对象的实例，
 */
public class Decorator extends DecoratorParent implements Sourceable {
    private DecoratorParent decoratorParent;

    public Decorator(DecoratorParent decoratorParent) {
        super();
        this.decoratorParent = decoratorParent;
    }

    public void method() {
        System.err.println("加入前置功能!");
        decoratorParent.method();
        System.err.println("加入后置扩展!");
    }
}

class DecoratorParent implements Sourceable {


    @Override
    public void method() {
        System.err.println("这是装饰器的父类方法!");
    }
}

class DecoratorTest {
    /**
     * @author zhuCan
     * date 2019/3/27 11:20
     * description : 装饰器模式的应用场景：
     * 1、需要扩展一个类的功能。
     * 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是
     * 静态的，不能动态增删。）
     * 缺点：产生过多相似的对象，不易排错
     */
    public static void main(String... args) {
        Decorator decorator = new Decorator(new DecoratorParent());
        decorator.method();
    }
}

