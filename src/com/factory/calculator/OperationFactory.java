package com.factory.calculator;

import Operation.OperationAdd;
import Operation.OperationSub;
import Operation.OperationMul;
import Operation.OperationDiv;
import Operation.Operation;

/**
 * Created by qqy on 15/7/30.
 */
public class OperationFactory {

    public static Operation creatOperate(String operate) {

        Operation oper = null;

        switch (operate) {

            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                System.out.println("输入有误！");
                break;
        }

        return oper;
    }
}
