package com.zc.designmodel.creative.factory;

/**
 * Created by zhuCan
 * Project design-model.
 * Date 2019/3/26   Time 16:21.
 */
public class SimpleFactory {
    /**
     * @author zhuCan
     * date 2019/3/26 16:21
     * description : 简单工厂方法模式   单方法普通版
     * 这个版本会导致传入的参数不对获取不到对应的对象
     */
    public Sender getSender(String type){
        if ("email".equals(type)){
            return new Email();
        }else if ("sms".equals(type)){
            return new Sms();
        }else{
            return null;
        }
    }
}
interface Sender{
    void send();
}

class Email implements Sender{

    @Override
    public void send() {
        System.err.println("这是邮件发送!");
    }
}

class Sms implements Sender{

    @Override
    public void send() {
        System.err.println("这是短信发送!");
    }
}

class SimpleFactoryTest{
    public static void main(String[] args){
        SimpleFactory simpleFactory=new SimpleFactory();
        Sender sender=simpleFactory.getSender("sms");
        sender.send();
        sender=simpleFactory.getSender("email");
        sender.send();
        sender=simpleFactory.getSender("qq");
        sender.send();

    }
}
