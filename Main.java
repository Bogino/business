import company.Company;
import employee.Employee;
import employee.Operator;
import employee.SalesManager;
import employee.TopManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Company apple = new Company();
        TopManager vasya = new TopManager("Vasya", apple);
        apple.setIncome(12000000);

        ArrayList<Employee> operators = new ArrayList<>();
        for (int i =0; i < 200; i++)
        {
            operators.add(new Operator(Integer.toString(i), apple));
        }
        ArrayList<Employee> salesManagers = new ArrayList<>();
        for (int i =0; i < 50; i++)
        {
            salesManagers.add(new SalesManager(Integer.toString(i), apple));
        }
        ArrayList<Employee> topManagers = new ArrayList<>();
        for (int i =0; i < 20; i++)
        {
            topManagers.add(new TopManager(Integer.toString(i), apple));
        }
        apple.hire(operators);
        apple.hire(salesManagers);
        apple.hire(topManagers);
        System.out.println(apple.getStaff().size());


        apple.getLowestSalaryStaff(1005);
        System.out.println("===========================");
        apple.getTopSalaryStaff(15);

        System.out.println(apple.getStaff().size());

    }
}
