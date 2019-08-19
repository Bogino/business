import java.util.*;

public class Company {


    private int income;
    public ArrayList<Employee> getTopSalaryStaff(int count)
    {
        return null;
    }
    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        return null;
    }
    private ArrayList<Company> staff = new ArrayList<>();
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
            SalesManager salesManager = new SalesManager(Integer.toString(i), getCompany());
            staff.add(salesManager);
            if (staff.size() == 270)
            {
                break;
            }
            TopManager topManager = new TopManager(Integer.toString(i), getCompany());
            staff.add(topManager);
            if (staff.size() == 270)
            {
                break;
            }
            Operator operator = new Operator(Integer.toString(i), getCompany());
            staff.add(operator);
            if (staff.size() == 270)
            {
                break;
            }
        }
    }
    public void fireEmployee(Company person)
    {
        staff.remove(person);
    }
    public void addPerson(Company person)
    {
        staff.add(person);
    }
    public ArrayList<Company> getStaff()
    {
        return staff;
    }

}
