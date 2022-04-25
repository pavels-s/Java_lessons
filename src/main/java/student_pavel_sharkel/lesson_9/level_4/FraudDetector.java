package main.java.student_pavel_sharkel.lesson_9.level_4;

class FraudDetector {

    boolean isFraud(Trader trader) {
        if (isNameOk(trader) && isValueOk(trader) && isCityOk(trader) && isCountryOk(trader)) { return true;} else {return false;}

        }

        boolean isNameOk(Trader trader) {
            String traderName = trader.getFullName();
            if (traderName.equals("Pokemon")) {
                return false;
            } else {
                return true;
            }
        }

        boolean isValueOk(Trader trader) {
            Transaction transaction = new Transaction(trader, 10);
            if ((transaction.getAmount() > 1000000) || (transaction.getAmount() <= 0)) {
                return false;
            } else {
                return true;
            }
        }

        boolean isCityOk(Trader trader) {
            if (trader.getCity().equals("Sydney")) {
                return false;
            } else {
                return true;
            }
        }

        boolean isCountryOk(Trader trader) {
            if (trader.getCountry().equals("Jamaica")) {
                return false;
            } else {
                return true;
            }
        }

        boolean isGermanTransaction(Trader trader, Transaction transaction) {
            if (trader.getCountry().equals("Germany") && transaction.getAmount() > 1000) {
                return false;
            } else {
                return true;
            }
        }
}
