import java.util.ArrayList;

public class TopManager extends Company implements Employee {

    private int FIXED_SALARY = 150000;
    private int PRIZE = 70000;
    private int monthSalary;
    public static ArrayList<String> topManagers = new ArrayList<>();

    public TopManager getTopManager(String name)
    {
        if (topManagers.contains(name))
        {
            return this;
        }
        return null;
    }

    @Override
    public int getMonthSalary() {
        monthSalary = getIncome() > 10000000? FIXED_SALARY + PRIZE : FIXED_SALARY;
        return monthSalary;
    }
}
