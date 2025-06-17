public class stringMethods {
    public static void main(String[] args) {

        String name = "password";

        // int length = name.length();
        // char letter = name.charAt(2);
        // int index = name.indexOf(" ");
        // int lastIndex = name.lastIndexOf("0");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("a", "o");

        /*if (name.isEmpty()) {
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello " + name);
        }*/
        
       /* if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name DOESN'T contains any spaces");
        }
            */

        if(name.equals("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
 
    }
}
