public class SalesManager extends Company implements Employee, Comparable<Employee> {

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

    @Override
    public int compareTo(Employee employee) {

        if (getMonthSalary() > employee.getMonthSalary())
        {
            return -1;
        }
        if (getMonthSalary() < employee.getMonthSalary())
        {
            return 1;
        }
        return 0;
    }
}
