import java.util.*;

public class Company {


    private static int income;
    public ArrayList<Employee> getTopSalaryStaff(int count)
    {
        return null;
    }
    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        return null;
    }
    public ArrayList<String> staff = new ArrayList<>();
    public void setIncome(int income)
    {
        this.income = income;
    }
    public int getIncome()
    {
        return income;
    }



    public void generateStaff()
    {
        for (int i = 0; i < 270; i++)
        {
            SalesManager.salesManagers.add(Integer.toString(i));
            staff.add(SalesManager.salesManagers.get(i));
            if (staff.size()==270){break;}
            TopManager.topManagers.add(Integer.toString(i));
            staff.add(TopManager.topManagers.get(i));
            if (staff.size()==270){break;}
            Operator.operators.add(Integer.toString(i));
            staff.add(Operator.operators.get(i));
            if (staff.size()==270){break;}
        }
    }

}
