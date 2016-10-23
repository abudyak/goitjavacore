package module4.homework.task123456;


public interface BankSystem {

    boolean withdrawOfUser(User user, int amount);
    boolean fundUser(User user, int amount);
    boolean transferMoney(User fromUser, User toUser, int amount);
    boolean paySalary(User user);

}
