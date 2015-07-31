package com.strategy.calculator;

import java.util.Scanner;

/**
 * Created by qqy on 15/7/31.
 */
public class Calculator {
    public static void main(String[] args) {

        OperationContext operationContext;

        Scanner input = new Scanner(System.in);
        System.out.print("please input number A:");
        double numberA = input.nextDouble();
        System.out.print("please input number B:");
        double numberB = input.nextDouble();
        System.out.print("please input operator:");
        String oper = input.next();
        System.out.println("——————————————————————————");

        operationContext=new OperationContext(oper);
        System.out.println(numberA+oper+numberB+"="+operationContext.getResult(numberA,numberB));

    }
}
