public class Operator extends Company implements Employee, Comparable<Employee> {

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
