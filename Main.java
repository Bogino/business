import java.io.IOException;
import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Company apple = new Company();
        TopManager vasya = new TopManager("Vasya", apple);
        apple.setIncome(12000000);
        Operator gena = new Operator("Gena", apple);
        apple.addPerson(gena);
        apple.fireEmployee(gena);
        apple.getStaff().remove(gena);
        System.out.println(apple.getStaff().size());
        Employee man = new TopManager("geg",apple);
        System.out.println(man.getMonthSalary());
        apple.getStaff().add(man);
        System.out.println(apple.getStaff().size());
        apple.generateStaff();
        System.out.println(apple.getStaff().size());


        apple.getLowestSalaryStaff(7);


    }
}
