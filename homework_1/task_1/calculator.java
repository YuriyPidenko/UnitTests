package homework_1.task_1;
public class calculator {
    public double calculateDiscount(double amount, double discount) {
        if (amount < 0 || discount < 0 || discount > 100) {
            throw new ArithmeticException ("invalid arguments");
        }
        double discountAmount = amount * discount / 100;
        return amount - discountAmount;
    }
}