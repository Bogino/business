package company;

import employee.CompanyComparator;
import employee.Employee;

import java.util.*;


public class Company {

    private int income;

    private static ArrayList<Employee> staff = new ArrayList<>();

    public List<Employee> getTopSalaryStaff(int count)
    {
        return getSortedList(new CompanyComparator(),count);
    }
    public List<Employee> getLowestSalaryStaff(int count)
    {
       return getSortedList(new CompanyComparator().reversed(), count);
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

    public void hire(List<Employee> newStaff)
    {
        staff.addAll(newStaff);
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
    public static List<Employee> getSortedList(Comparator<Employee> comparator, int count)
    {
        count = count > staff.size() ? staff.size() : count;
        staff.sort(comparator);
        List<Employee> result = staff.subList(0,count);
        result.forEach(e -> System.out.println(e.getMonthSalary()));
        return result;
    }


}
