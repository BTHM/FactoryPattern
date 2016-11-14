package com.pingan.abstractfactory;

/**
 * Author：liupeng264 on 2016/11/14 17:58
 * Address：liupeng264@pingan.com.cn
 */
public class FactoryBMW320 implements AbstractFactory{
    @Override
    public Engine createEngine() {

        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {

        return new AirconditionB();
    }
}
