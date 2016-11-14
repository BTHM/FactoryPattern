package com.pingan.factorypatterndemo;

/**
 * Author：liupeng264 on 2016/11/14 17:20
 * Address：liupeng264@pingan.com.cn
 *
 *
 *
 * 1) 工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑，用来创建产品
 2) 抽象产品角色：它一般是具体产品继承的父类或者实现的接口。
 3) 具体产品角色：工厂类所创建的对象就是此角色的实例。在Java中由一个具体类实现。
 */
public class Factory {
    public BMW createBMW(int type){
        switch(type){
            case 320:
                return new BMW320();

            case 532:
                return new BMW532();
                //break;
            default:
                break;
        }
        return  null;
    }
}
