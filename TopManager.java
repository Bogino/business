import java.util.ArrayList;

public class TopManager extends Company implements Employee {

    private int FIXED_SALARY = 150000;
    private int PRIZE = 70000;
    private int monthSalary;
    private String name;
    private Company workplace;


    public TopManager(String name, Company company)
    {
        this.name = name;
        workplace = company;
    }

    @Override
    public int getMonthSalary()
    {
        monthSalary = workplace.getIncome() > 10000000? FIXED_SALARY + PRIZE : FIXED_SALARY;
        return monthSalary;
    }
}
