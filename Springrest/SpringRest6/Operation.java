package com.springrest_6.caculator.calculatordemo;

public interface Operation {

 long apply(long a, long b);

 boolean valid(char operator);

}