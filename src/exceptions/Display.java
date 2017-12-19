package exceptions;

import java.util.Scanner;

public class Display {

    public static void startLoop(Scanner in, Terminal terminal) {
        while (true) {
            System.out.print("Enter your pin: ");
            if (terminal.initWithPin()){
                provideOperations(in, terminal);
                return;
            }
        }
    }

    private static void provideOperations(Scanner in, Terminal terminal) {
        while (true){
            System.out.println("\nEnter operation number to continue:");
            System.out.println("1 - to request balance");
            System.out.println("2 - to put money");
            System.out.println("3 - to get money");
            System.out.println();
            int in_data = in.nextInt();
            switch (in_data) {
                case 1:
                    terminal.requestBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to put: ");
                    terminal.putMoney(in.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter amount to get: ");
                    terminal.getMoney(in.nextDouble());
                    break;
                default:
                    System.out.println("No such operation");
                    break;
            }
//            System.out.println("\nExit? y/n");
//            String nextActions = in.next();
//            if (nextActions.equals("y")) {
//                break;
//            }
        }
    }
}
