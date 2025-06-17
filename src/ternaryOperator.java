public class ternaryOperator{
    public static void main(String[] args) {
        
        //ternary operator ? = Return 1 or 2 values if a condition is true

        //Variable = (condition) ? ifTrue : iffalse;
        
        int score = 40;
        
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        
        System.out.println(passOrFail);

        int  income = 35000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);


    }
}