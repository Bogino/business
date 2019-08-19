import java.util.ArrayList;
import java.util.StringTokenizer;

public class SalesManager extends Company implements Employee {

    private int FIXED_SALARY = 100000;
    private double PERCENT = 0.05;
    private int monthSalary;
    public static ArrayList<String> salesManagers = new ArrayList<>();

    public SalesManager getSalesManager(String name)
    {
        if (salesManagers.contains(name))
        {
            return this;
        }
        return null;
    }

    @Override
    public int getMonthSalary()
    {
        monthSalary = (int) (FIXED_SALARY + getIncome()*PERCENT);
        return monthSalary;
    }
}
