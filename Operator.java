public class Operator extends Company implements Employee {

    private int FIXED_SALARY = 80000;

    @Override
    public int getMonthSalary() {
        return FIXED_SALARY;
    }
}
