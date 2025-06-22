public class overloadedMethods {
    public static void main(String[] args) {
        

        //overloaded methods = methods that shares the same name,
        //                        but different parameters
        //                        signature = name + parameters

        String pizza = bakePizza("Flat bread", "Mozzarella", "Pepperoni");
        System.out.println(pizza);

    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
      static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
