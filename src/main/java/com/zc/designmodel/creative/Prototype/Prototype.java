package com.zc.designmodel.creative.Prototype;

import java.io.*;

/**
 * Created by zhuCan
 * Project design-model.
 * Date 2019/3/27   Time 9:58.
 * 原型模式 ,对一个原型进行复制克隆,
 * 分为深拷贝和浅拷贝
 */
public class Prototype implements Cloneable {

    //浅拷贝 ,只会新建基础类型,但是对象只是新建个引用然后还是指向堆内存中原来的对象
    public Object simpleClone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    //深拷贝,用二进制的方式,基础类型和引用类型都是新建的
    public Object fullClone() throws IOException, ClassNotFoundException {

        //写入对象的二进制
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(this);

        //读出对象的二进制
        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        return objectInputStream.readObject();
    }
}
