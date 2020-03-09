
package package1;

import java.util.Scanner;

/**
 *
 * @author scott.tyson
 */
public class MyShop {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        MyShop obj = new MyShop();
        
        System.out.println("Welcome to My Shop");
        System.out.println("Today's Produce:\n");
        
        obj.display();
        
        System.out.print("What do you want to buy? ");
        String itemToBuy = input.nextLine();
        System.out.print("How many? ");
        int numberToBuy = input.nextInt();
        
        if (obj.calculate(itemToBuy, numberToBuy) != -1 ){
            System.out.print("You purchased "+numberToBuy );
            System.out.println(" " + itemToBuy );
            System.out.print("The total amount is: $"+obj.calculate(itemToBuy,
                    numberToBuy));
        } else{
            System.out.println("Invalid Order.");
        }
        
        System.out.println("");
        
    }
    
    String p1 = "Apple";
    String p2 = "Pear";
    String p3 = "Mango";
    
    public void display(){
        
        System.out.println(p1+"| $"+price(p1)+ "| 10");
        System.out.println(p2+" | $"+price(p2)+ "| 5");
        System.out.println(p3+"| $"+price(p3)+ "| 20");
        System.out.println("");
    }
    
    public double price(String item){
        if(item.equals(p1)){
            return 1;  
        }else if (item.equals(p2)){
            return .5;  
        }else{
            return .3;  
        }
    }
    
    public double calculate(String item, int amount ){
        double total = 0;
        if(item.equalsIgnoreCase(p1)){
            total = price(p1) * amount;
        }else if (item.equalsIgnoreCase(p2)){
            total = price(p2) * amount;
            
        }else if (item.equalsIgnoreCase(p3)){
            total = price(p3) * amount;  
        }else{
            total = -1; 
        }
        return total;
        
    }
}
