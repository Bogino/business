package employee;

import company.Company;

public class SalesManager implements Employee {

    private int FIXED_SALARY = 100000;
    private double PERCENT = 0.05;
    private int monthSalary;
    private Company workplace;
    private String name;


    public SalesManager(String name, Company company)
    {
        this.name = name;
        workplace = company;
    }


    @Override
    public int getMonthSalary()
    {
        monthSalary = (int) (FIXED_SALARY + workplace.getIncome()*PERCENT);
        return monthSalary;
    }

}
