import java.util.Scanner;

public class weightConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int option;

        System.out.println("---------Weight Conversion Program---------");

        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        if (option == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.45359237;

            System.out.printf("The new weight in kgs is: %.2f", newWeight);

        } else if (option == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;

            System.out.printf("The new weight in pounds is: %.2f", newWeight);
        }
        else{
            System.out.println("You haven't selected a valid option!!!");
        }

        scanner.close();

    }
}