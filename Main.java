import java.io.IOException;
import java.net.CacheRequest;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Company apple = new Company();
        apple.generateStaff();
        System.out.println(apple.staff.size());
        Operator operator = new Operator();
        System.out.println(operator.getOperator("3").getMonthSalary());

    }
}
