package Operation;

/**
 * Created by qqy on 15/7/30.
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        setValue(getNumberA() + getNumberB());
        return getValue();
    }
}
