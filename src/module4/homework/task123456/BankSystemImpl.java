package module4.homework.task123456;


public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = amount * userBank.getCommission(amount) / 100;
        double amountOfWithdrawal = amount + commission;
        double balanceAfterWithdrawal = user.getBalance() - amountOfWithdrawal;

        if ((balanceAfterWithdrawal >= 0) && (amount <= userBank.getLimitOfWithdrawal())) {
            user.setBalance(balanceAfterWithdrawal);
        }
    }

    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();

        if (amount <= userBank.getLimitOfFunding()) {
            user.setBalance(user.getBalance() + amount);
        }
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank userBank = fromUser.getBank();

        double commission = amount * userBank.getCommission(amount) / 100;
        double amountToTransfer = amount + commission;

        if (fromUser.getBalance() - amountToTransfer >= 0) {
            fromUser.setBalance(fromUser.getBalance() - amountToTransfer);
            toUser.setBalance(toUser.getBalance() + amount);
        }
    }

    public void paySalary(User user) {
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(user.getSalary()) / 100;
        user.setBalance(user.getBalance() + user.getSalary() - commission);
    }

}
