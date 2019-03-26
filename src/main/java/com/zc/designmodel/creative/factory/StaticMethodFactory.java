package com.zc.designmodel.creative.factory;

/**
 * Created by zhuCan
 * Project design-model.
 * Date 2019/3/26   Time 16:49.
 */
public class StaticMethodFactory {
    /**
     * @author zhuCan
     * date 2019/3/26 16:49
     * description : 静态工厂方法模式
     * 在多方法工厂模式基础上, 把方法 改成静态就不用创建对象了
     */
    public static Sender getComputerSender(){
        return new Computer();
    }
    public static Sender getCellphoneSender(){
        return new Cellphone();
    }
}

class Computer implements Sender{

    @Override
    public void send() {
        System.err.println("这是电脑发送的消息!");
    }
}

class Cellphone implements Sender{

    @Override
    public void send() {
        System.err.println("这是摩托罗拉手机发送的消息!");
    }
}

class StaticMethodFactoryTest{
    public static void main(String... args){
        StaticMethodFactory.getCellphoneSender().send();
        StaticMethodFactory.getComputerSender().send();
    }
}
