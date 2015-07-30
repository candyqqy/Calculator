package Operation;

/**
 * Created by qqy on 15/7/30.
 */
public class OperationAdd extends Operation {
    @Override
    public double getNumberA() {
        return super.getNumberA();
    }

    @Override
    public void setNumberA(double numberA) {
        super.setNumberA(numberA);
    }

    @Override
    public double getNumberB() {
        return super.getNumberB();
    }

    @Override
    public void setNumberB(double numberB) {
        super.setNumberB(numberB);
    }

    @Override
    public double getResult() {
        double result;
        result = getNumberA() + getNumberB();
        return result;
    }
}
