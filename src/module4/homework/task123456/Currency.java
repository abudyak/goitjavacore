package module4.homework.task123456;


public enum Currency {
    USD(840),
    EUR(978);

    private int number;

    Currency(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
