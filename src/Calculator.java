import Operation.Operation;

import java.util.Scanner;
import java.util.*;

/**
 * Created by qqy on 15/7/30.
 */
public class Calculator {
    private static double returnResult(double numberA, double numberB, String operate) {
        Operation oper;
        oper = OperationFactory.creatOperate(operate);
        oper.setNumberA(numberA);
        oper.setNumberB(numberB);
        double result = oper.getResult();
        return result;
    }

    public static void main(String[] args) {

        double result;
        Scanner input = new Scanner(System.in);
        System.out.print("please input number A:");
        double numberA = input.nextDouble();
        System.out.print("please input number B:");
        double numberB = input.nextDouble();
        System.out.print("please input operator:");
        String oper = input.next();
        System.out.println("==============================");
        result = returnResult(numberA, numberB, oper);
        System.out.println(numberA+oper+numberB+"="+result);

    }


}
