package com.crossoverjie.design.pattern.factorymethod;

/**
 * Function:
 *
 * @author lhp
 *         Date: 19/03/2018 14:33
 * @since JDK 1.8
 */
public class Cat extends Animal {
    @Override
    protected void desc() {
        System.out.println("Cat name is=" + this.getName());
    }
}
