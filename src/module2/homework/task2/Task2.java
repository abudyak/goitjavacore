package module2.homework.task2;


public class Task2 {

    static void moneyWithdrawal(double balance, double withdrawal) {

        double transactionCommission = withdrawal * 0.05; // 5% is transaction commission
        double balanceCalculation = balance - (withdrawal + transactionCommission);

        if (balanceCalculation >= 0) {
            balance = balanceCalculation;
            System.out.printf("ОК %.2f %.2f%n", transactionCommission, balance);
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] arg) {
        double balance = 100;
        double withdrawal = 10;
        moneyWithdrawal(balance, withdrawal);

        balance = 100;
        withdrawal = 99;
        moneyWithdrawal(balance, withdrawal);

    }

}
