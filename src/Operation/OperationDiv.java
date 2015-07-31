package Operation;

/**
 * Created by qqy on 15/7/30.
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (getNumberB() == 0) {
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setValue(getNumberA() / getNumberB());
            return getValue();
        }
        return Double.parseDouble(null);
    }
}
