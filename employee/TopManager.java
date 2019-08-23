package employee;

import company.Company;

public class TopManager implements Employee {

    private final int FIXED_SALARY = 150000;
    private final int PRIZE = 70000;
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
