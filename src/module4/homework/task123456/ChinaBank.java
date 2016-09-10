package module4.homework.task123456;


public class ChinaBank extends Bank{

    /*
    * ChinaBank:
    * limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
    * limit of funding - 5000 if EUR and 10000 if USD
    * monthly rate - 1% with USD and 0% with EUR
    * commission - 3% if USD and up to 1000, 5% if USD and more than 1000
    * 10% if EUR and up to 1000 and 11% if EUR and more than 1000
    */

    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) return 100;
        if (getCurrency() == Currency.EUR) return 150;
        return 1200; // if neither USD nor EUR (default limit of withdrawal)
    }

    int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) return 10000;
        if (getCurrency() == Currency.EUR) return 5000;
        return 10000; // if neither USD nor EUR (default limit of funding)
    }

    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 1; // per cent
        if (getCurrency() == Currency.EUR) return 0; // per cent
        return 2; // if neither USD nor EUR (default monthly rate)
    }

    int getCommission(int amount) {
        int commission = 5; // default commission

        if (getCurrency() == Currency.USD) if (amount <= 1000) {
            commission = 3; // per cent
        } else {
            commission = 5; // per cent
        }

        if (getCurrency() == Currency.EUR) if (amount >= 1000) {
            commission = 10;
        } else {
            commission = 11;
        }

        return commission;
    }
}
