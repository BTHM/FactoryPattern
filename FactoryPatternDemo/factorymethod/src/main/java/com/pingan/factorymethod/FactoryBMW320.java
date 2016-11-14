package com.pingan.factorymethod;

/**
 * Author：liupeng264 on 2016/11/14 17:44
 * Address：liupeng264@pingan.com.cn
 */
public class FactoryBMW320  implements FactoryBMW{
    @Override
    public BMW320 createBMW() {

        return new BMW320();
    }
}
