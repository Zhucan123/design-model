package com.zc.designmodel.creative.factory;

/**
 * Created by zhuCan
 * Project design-model.
 * Date 2019/3/26   Time 17:16.
 */
public class FactoryMethod {
    /**
     * @author zhuCan
     * date 2019/3/26 17:16
     * description : 工厂方法模式,
     * 简单工厂模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对
     * 工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？就
     * 用到工厂方法模式，创建一个工厂接口和创建多个工厂实现类，这样一旦需要增加新的功能，
     * 直接增加新的工厂类就可以了，不需要修改之前的代码。
     */

}
class MailSender implements Sender{

    @Override
    public void send() {
        System.err.println("发送邮件!");
    }
}
class SmsSender implements Sender{

    @Override
    public void send() {
        System.err.println("发送短信!");
    }
}

interface Provider{
    Sender producer();
}

//工厂类
class MailProducer implements Provider{

    @Override
    public Sender producer() {
        return new MailSender();
    }
}

//工厂类
class SmsProducer implements Provider{

    @Override
    public Sender producer() {
        return null;
    }
}

class FactoryMethodTest{
    public static void main(String ... args){
        Provider provider=MailSender::new;
        provider.producer().send();
        provider=SmsSender::new;
        provider.producer().send();
    }
}