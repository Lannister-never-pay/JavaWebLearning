package com.emnets.java1115.proxy;

/**
 * @author lannisite
 * @program Lenovo
 * @description 描述
 * @date 2022/11/15 20:20
 */


public class Lenovo implements SaleComputer{
    @Override
    public String sale(double money) {
        System.out.println("花了"+money+"元买了一台电脑");
        return "联想电脑";
    }

    @Override
    public void show() {
        System.out.println("展示电脑...");
    }
}
