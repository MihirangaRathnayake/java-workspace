import java.util.Scanner;
public class logicalOperators {
   public static void main(String[] args) {
    
    //Username must be contains 4-12 characters
    //Username must not conatins any spaces and underscores

    Scanner scanner =  new Scanner(System.in);

    String username;

    System.out.print("Enter your new username: ");
    username = scanner.nextLine();

    if(username.length() < 4 || username.length() > 12){
        System.out.println("Username must contains 4-12 characters");
    }

    else if(username.contains(" ") || username.contains("_")){
        System.out.println("Username must not contains any spaces and userscores!!");
    }
    else{
        System.out.println("Welcome " + username);
    }

    scanner.close();
   } 
}
