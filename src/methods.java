public class methods {
    public static void main(String[] args) {

        // method = a block of code that is executed when called ()

        /*String name  = "Mihiranga";
        int age = 18;

        happyBirthday(name, age);
        
        System.out.println(cube(3));
     

        String fullName = getFullName("Mihiranga", "Rathnayake");
        System.out.println(fullName);

           */

           int age = 14;

           if(ageCheck(age)){
            System.out.println("You may sign up!");
           }
           else{
            System.out.println("You must be 18+ to sign up!");
           }
    }


    static void happyBirthday(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday daer %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}

