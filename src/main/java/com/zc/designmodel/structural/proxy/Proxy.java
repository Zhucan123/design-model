package com.zc.designmodel.structural.proxy;

import com.zc.designmodel.designInterface.Sourceable;

/**
 * Created by zhuCan
 * Project design-model.
 * Date 2019/3/27   Time 11:21.
 * 代理模式  代理模式的应用场景：
 * 如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
 * 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
 * 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
 * 使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 */

/**
 * @author zhuCan
 * date 2019/3/27 11:33
 * description : 装饰器模式和代理模式很是相似,但是还是有区别的,装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。
 *
 * 在装饰器模式和代理模式之间还是有很多差别的。
 * 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。
 * 换句话 说，用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息
 * 。因此，当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。
 * 并且，当我们使用装饰器模 式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。
 *  我们可以用另外一句话来总结这些差别：使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，
 *  而装饰者能够在运行时递归地被构造
 */
public class Proxy implements Sourceable {
    private ProxyParent proxyParent;

    public Proxy() {
        super();
        this.proxyParent = new ProxyParent();
    }

    @Override
    public void method() {
        before();
        proxyParent.method();
        after();
    }

    private void before() {
        System.err.println("前置方法~");
    }

    private void after() {
        System.err.println("后置方法!");
    }
}

class ProxyParent implements Sourceable {

    @Override
    public void method() {
        System.err.println("被代理的类!");
    }
}

class ProxyTest {
    public static void main(String... args) {
        Proxy proxy = new Proxy();
        proxy.method();
    }
}
