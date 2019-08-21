package company;

import employee.CompanyComparator;
import employee.Employee;

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
        return employees;
    }
    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        TreeSet<Employee> employees = new TreeSet<>(new CompanyComparator().reversed());

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
