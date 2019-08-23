import java.util.*;


public class Company {

    private int income;

    private ArrayList<Employee> staff = new ArrayList<>();

    public ArrayList<Employee> getTopSalaryStaff(int count)
    {
        TreeSet<Employee> employees = new TreeSet<>(new CompanyComparator());

        for (int i = 0; i < count; i++)
        {
            employees.add(staff.get(i));
            for (Employee employee : employees)
            {
                System.out.println(employee.getMonthSalary() + " " + employee.getClass().toString().replaceAll("class",""));
                break;
            }
        }
        return null;
    }
    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        TreeSet<Employee> employees = new TreeSet<>();

        for (int i = 0; i < count; i++)
        {
            employees.add(staff.get(i));
            for (Employee employee : employees)
            {
                System.out.println(employee.getMonthSalary() + " " + employee.getClass().toString().replaceAll("class",""));
                break;
            }
        }
        return null;
    }

    public void setIncome(int income)
    {
        this.income = income;
    }
    public int getIncome()
    {
        return income;
    }

    public Company getCompany()
    {
        return this;
    }

    public void generateStaff()
    {
        for (int i = 0; i < 270; i++)
        {
            staff.add(new SalesManager(Integer.toString(i), getCompany()));
            if (staff.size() == 270)
            {
                break;
            }
            staff.add(new TopManager(Integer.toString(i), getCompany()));
            if (staff.size() == 270)
            {
                break;
            }
            staff.add(new Operator(Integer.toString(i), getCompany()));
            if (staff.size() == 270)
            {
                break;
            }
        }
    }
    public void fireEmployee(Employee person)
    {
        staff.remove(person);
    }
    public void addPerson(Employee person)
    {
        staff.add(person);
    }
    public ArrayList<Employee> getStaff()
    {
        return staff;
    }


}
