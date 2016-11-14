package com.pingan.abstractfactory;

/**
 * Author：liupeng264 on 2016/11/14 17:55
 * Address：liupeng264@pingan.com.cn
 */
  //创建工厂类接口
public interface AbstractFactory {
    //制造发动机
     Engine createEngine();
    //制造空调
    Aircondition createAircondition();
}
