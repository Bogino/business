public class TopManager extends Company implements Employee, Comparable<Employee> {

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
