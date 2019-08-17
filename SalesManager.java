public class SalesManager extends Company implements Employee {

    private int FIXED_SALARY = 100000;
    private double PERCENT = 0.05;
    private int monthSalary;


    @Override
    public int getMonthSalary()
    {
        monthSalary = (int) (FIXED_SALARY + getIncome()*PERCENT);
        return monthSalary;
    }
}
