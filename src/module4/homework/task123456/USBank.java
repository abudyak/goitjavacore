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

    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) return 1000;
        if (getCurrency() == Currency.EUR) return 1200;
        return 1200; // if neither USD nor EUR (default limit of withdrawal)
    }

    int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) return Integer.MAX_VALUE; // unlimited funding
        if (getCurrency() == Currency.EUR) return 10000;
        return 10000; // if neither USD nor EUR (default limit of funding)
    }

    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 1; // 1 per cent
        if (getCurrency() == Currency.EUR) return 2; // 2 per cent
        return 2; // if neither USD nor EUR (default monthly rate)
    }

    int getCommission(int amount) {
        int commission = 5;

        if (getCurrency() == Currency.USD) if (amount <= 1000) {
            commission = 5; // 5 per cent
        } else {
            commission = 7; // 7 per cent
        }

        if (getCurrency() == Currency.EUR) if (amount >= 1000) {
            commission = 6;
        } else {
            commission = 8;
        }

        return commission;
    }

/*    @Override
    public String toString() {
        return "USBank{} " + super.toString();
    }*/
}

