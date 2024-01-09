import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        int BUS_AMOUNT;
        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of buses allowed to pass: ");
                BUS_AMOUNT = scanner.nextInt();
                if(BUS_AMOUNT < 0) { System.out.println("Enter a number > 0");
                    continue;}
                break;
            } catch (Exception ex) { System.out.println("Enter a number!"); }
        }
        for (int i = 0; i < BUS_AMOUNT; i++) {
            new Thread(new Bus(i + 1)).start();
            Thread.sleep(1000);
        }
    }
}
