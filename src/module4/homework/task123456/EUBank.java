package module4.homework.task123456;


public class EUBank extends Bank{

    /*
    * EUBank:
    * limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
    * limit of funding - 20000 if EUR and 10000 if USD
    * monthly rate - 0% with USD and 1% with EUR
    * commission - 5% if USD and up to 1000, 7% if USD and more than 1000
    * 2% if EUR and up to 1000 and 4% if EUR and more than 1000
    */

    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) return 2000;
        if (getCurrency() == Currency.EUR) return 2200;
        return 1200; // if neither USD nor EUR (default limit of withdrawal)
    }

    int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) return 10000;
        if (getCurrency() == Currency.EUR) return 20000;
        return 10000; // if neither USD nor EUR (default limit of funding)
    }

    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 0; // per cent
        if (getCurrency() == Currency.EUR) return 1; // per cent
        return 2; // iif neither USD nor EUR (default monthly rate)
    }

    int getCommission(int amount) {
        int commission = 5; // default commission

        if (getCurrency() == Currency.USD) if (amount <= 1000) {
            commission = 5; // per cent
        } else {
            commission = 7; // per cent
        }

        if (getCurrency() == Currency.EUR) if (amount >= 1000) {
            commission = 2;
        } else {
            commission = 4;
        }

        return commission;
    }
}
