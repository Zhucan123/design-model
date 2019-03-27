package com.zc.designmodel.creative.factory;

/**
 * Created by zhuCan
 * Project design-model.
 * Date 2019/3/26   Time 16:36.
 */
public class SimpleFactoryMethod {
    /**
     * @author zhuCan
     * date 2019/3/26 16:36
     * description : 这个是多方法版本的 简单工厂方法模式
     * 没一个方法返回对应的对象
     */
    public Sender getTencentSender() {
        return new Tencent();
    }

    public Sender getWechartSender() {
        return new Wechart();
    }
}

class Tencent implements Sender {

    @Override
    public void send() {
        System.err.println("这是腾讯qq消息发送!");
    }
}

class Wechart implements Sender {

    @Override
    public void send() {
        System.err.println("这是微信消息发送!");
    }
}

class SimpleFactoryMethodTest {
    //话说...就是传入一个或多个这个类型的数据,可以替换[]哈
    public static void main(String... args) {
        SimpleFactoryMethod simpleFactoryMethod = new SimpleFactoryMethod();
        simpleFactoryMethod.getTencentSender().send();
        simpleFactoryMethod.getWechartSender().send();
    }
}