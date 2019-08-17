public class TopManager extends Company implements Employee {

    private int FIXED_SALARY = 150000;
    private int PRIZE = 70000;
    private int monthSalary;

    @Override
    public int getMonthSalary() {
        monthSalary = getIncome() > 10000000? FIXED_SALARY + PRIZE : FIXED_SALARY;
        return monthSalary;
    }
}
