package com.pingan.abstractfactory;

/**
 * Author：liupeng264 on 2016/11/14 17:50
 * Address：liupeng264@pingan.com.cn
 */
//发动机以及型号
public interface Engine {

}


    class EngineA implements Engine{
        public EngineA(){
            System.out.println("制造-->EngineA");
        }
    }

     class EngineB implements Engine{
        public EngineB(){
            System.out.println("制造-->EngineB");
        }
    }

