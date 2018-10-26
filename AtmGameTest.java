import java.util.Scanner;

public class AtmGameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AtmGame[] atmGames = new AtmGame[10];
        int opt, opt2;

        for (int i = 0; i < atmGames.length; i++) {
            atmGames[i] = new AtmGame(i, 100);
        }

        System.out.println("Enter an id: ");
        int id = scanner.nextInt();

        if (isId(atmGames, id)) {
            do {
                System.out.println("============MAIN MENU============");
                System.out.println("1. Check balance.");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("Enter a choise: ");

                opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("The balance is: " + atmGames[id].getBalance());
                    case 2:
                        System.out.println("Enter an amount to withdraw: ");
                        int amount = scanner.nextInt();
                        AtmGame.withdraw(amount);
                    case 3:
                    case 4:
                        System.exit(0);
                }
            }
            while (opt > 4);
        } else {
            do {
                System.out.println("Error ID. Input repeat: ?");
                System.out.println("1. Yes.");
                System.out.println("2. No");

                opt2 = scanner.nextInt();
                switch (opt2) {
                    case 1: System.exit(0);
                    case 2:
                }
            } while (opt2 > 2);
        }
    }

    public static boolean isId(AtmGame[] atmGame, int id){
        for (int i = 0; i < atmGame.length; i++) {
            if (id == atmGame[i].getId())
                return true;
        }
        return false;
    }

}