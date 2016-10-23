package module4.homework.task123456;


public class BankSystemImpl implements BankSystem {

    public boolean withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = amount * userBank.getCommission(amount) / 100;
        double amountOfWithdrawal = amount + commission;
        double balanceAfterWithdrawal = user.getBalance() - amountOfWithdrawal;

        if (balanceAfterWithdrawal < amountOfWithdrawal) {
            System.out.println("Not enough money on the balance");
            return false;
        }
        if (userBank.getLimitOfWithdrawal() > amountOfWithdrawal) {
            System.out.println("Limit of the withdrawal is out");
            return false;
        }
        user.setBalance(balanceAfterWithdrawal);
        return true;
    }

    public boolean fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        if (amount > userBank.getLimitOfFunding()) {
            System.out.println("Amount more then limit");
            return false;
        }
        user.setBalance(user.getBalance() + amount);
        return true;
    }

    public boolean transferMoney(User fromUser, User toUser, int amount) {
        boolean withdraw = withdrawOfUser(fromUser, amount);
        boolean fund = fundUser(toUser, amount);

        if (withdraw && fund) {
            System.out.println("Do transfer");
            return true;
        }
        return false;
    }

    public boolean paySalary(User user) {
        return fundUser(user, user.getSalary());
    }

}
