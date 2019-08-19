import java.util.ArrayList;

public class Operator extends Company implements Employee {

    private int FIXED_SALARY = 80000;
    public static ArrayList<String> operators = new ArrayList<>();

    public Operator getOperator(String name)
    {
        if (operators.contains(name))
        {
            return this;
        }
        return null;
    }

    @Override
    public int getMonthSalary()
    {
        return FIXED_SALARY;
    }
}
