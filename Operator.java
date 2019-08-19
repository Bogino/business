import java.util.ArrayList;

public class Operator extends Company implements Employee {

    private int FIXED_SALARY = 80000;
    private String name;
    private Company workplace;

    public Operator(String name, Company company)
    {
        this.name = name;
        workplace = company;
    }


    @Override
    public int getMonthSalary()
    {
        return FIXED_SALARY;
    }
}
