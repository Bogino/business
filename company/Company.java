package company;

import employee.CompanyComparator;
import employee.Employee;

import java.util.*;


public class Company {

    private int income;

    private ArrayList<Employee> staff = new ArrayList<>();

    public ArrayList<Employee> getTopSalaryStaff(int count)
    {
        if (count <= staff.size()){
        ArrayList<Employee> list = new ArrayList<>(staff);
        list.sort(new CompanyComparator());
        for (Employee employee: list.subList(0,count))
        {
            System.out.println(employee.getMonthSalary());
        }
        return list;}
        else
            {
                System.out.println("Введеное количество превышает штат сотрудников");
            }
        return null;
    }
    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        if (count <= staff.size()){
            ArrayList<Employee> list = new ArrayList<>(staff);
            list.sort(new CompanyComparator().reversed());
            for (Employee employee: list.subList(0,count))
            {
                System.out.println(employee.getMonthSalary());
            }
            return list;}
        else
        {
            System.out.println("Введеное количество превышает штат сотрудников");
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
    public static ArrayList<Employee> x(ArrayList<Employee> list, int number)
    {
        ArrayList<Employee> employees = new ArrayList<>(list);
        for (Employee employee : employees.subList(0,number))
        {
            System.out.println(employee.getMonthSalary());
        }
        return employees;
    }


}
