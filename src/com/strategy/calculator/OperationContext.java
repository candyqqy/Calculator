package com.strategy.calculator;

import Operation.Operation;
import Operation.OperationAdd;
import Operation.OperationSub;
import Operation.OperationMul;
import Operation.OperationDiv;

/**
 * Created by qqy on 15/7/31.
 */
public class OperationContext {

    Operation operation=null;
    public OperationContext(String oper){
        switch (oper){
            case "+":
                operation=new OperationAdd();
                break;
            case "-":
                operation=new OperationSub();
                break;
            case "*":
                operation=new OperationMul();
                break;
            case "/":
                operation=new OperationDiv();
                break;
            default:
                System.out.println("程序错误");
                break;
        }
    }

    public double getResult(double numberA,double numberB){

        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        return operation.getResult();
    }
}
