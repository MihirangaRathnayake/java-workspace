import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) throws InterruptedException {

        // for loop = execute some code a CERTAIN amount of time

        Scanner scanner = new Scanner(System.in);

        System.out.print("How manu seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!!!");

        scanner.close();
    }

}
