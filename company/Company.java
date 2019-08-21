package company;

import employee.CompanyComparator;
import employee.Employee;

import java.util.*;


public class Company {

    private int income;

    private ArrayList<Employee> staff = new ArrayList<>();

    public ArrayList<Employee> getTopSalaryStaff(int count)
    {
        ArrayList<Employee> list = new ArrayList<>();
        staff.sort(new CompanyComparator());
        list.addAll(staff);
        for (Employee employee: list.subList(0,count))
        {
            System.out.println(employee.getMonthSalary());
        }
        return list;
    }
    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        ArrayList<Employee> list = new ArrayList<>();
        staff.sort(new CompanyComparator().reversed());
        list.addAll(staff);
        for (Employee employee: list.subList(0,count))
        {
            System.out.println(employee.getMonthSalary());
        }
        return list;
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


}
