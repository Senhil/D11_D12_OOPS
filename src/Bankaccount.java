
    import java.util.Scanner;

    //Contains the bank account info
    public class Bankaccount {

        static double amount = 0;

        Scanner scan = new Scanner(System.in);

        public static double getAmount() {
            return amount;
        }

        public static void setAmount(double amount) {
            Bankaccount.amount = amount;
        }

    }

