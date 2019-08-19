import java.io.IOException;
import java.net.CacheRequest;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Company apple = new Company();
        TopManager vasya = new TopManager("Vasya", apple);
        apple.setIncome(12000000);
        System.out.println(vasya.getMonthSalary());
        apple.generateStaff();
        Operator gena = new Operator("Gena", apple);
        apple.addPerson(gena);
        System.out.println(apple.getStaff().size());





    }
}
