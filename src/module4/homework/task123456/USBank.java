package module4.homework.task123456;


public class USBank extends Bank {

    /*
    * USBank:
    * limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
    * limit of funding - 10000 if EUR and no limit if USD
    * monthly rate - 1% with USD and 2% with EUR
    * commission - 5% if USD and up to 1000, 7% if USD and more than 1000
    * 6% if EUR and up to 1000 and 8% if EUR and more than 1000
    */

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 1000;
        } else if (getCurrency() == Currency.EUR) {
            return 1200;
        } else return 0; // if neither USD nor EUR (default limit of withdrawal)
    }

    int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) {
            return Integer.MAX_VALUE; // unlimited funding
        } else if (getCurrency() == Currency.EUR) {
            return 10000;
        } else {
            return 0; // if neither USD nor EUR (default limit of funding)
        }
    }

    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1; // 1 per cent
        } else if (getCurrency() == Currency.EUR) {
            return 2; // 2 per cent;
        } else return 2; // if neither USD nor EUR (default monthly rate)
    }

    int getCommission(int amount) {
        if (getCurrency() == Currency.USD && amount < 1000) {
            return 5; // 5 per cent
        } else if (getCurrency() == Currency.USD && amount >= 1000) {
            return 6;
        } else if (getCurrency() == Currency.EUR && amount < 1000) {
            return 7;
        } else if (getCurrency() == Currency.EUR && amount >= 1000) {
            return 8;
        }
        if (amount < 1000) {
            return 8;
        }
        return 0; //  per cent
    }

    @Override
    public String toString() {
        return "USBank{" +

                "id=" + getId() +
                ", bankCountry='" + getBankCountry() + '\'' +
                ", currency=" + getCurrency() +
                ", numberOfEmployees=" + getNumberOfEmployees() +
                ", avrSalaryOfEmployee=" + getAvrSalaryOfEmployee() +
                ", rating=" + getRating() +
                ", totalCapital=" + getTotalCapital() +
                '}';
    }

}

