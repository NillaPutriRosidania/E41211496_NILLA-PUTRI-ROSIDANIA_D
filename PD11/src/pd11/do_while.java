
package pd11;

import java.util.Scanner;
public class do_while {


    public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  
  String input = "";
//        while (!input.equalsIgnoreCase("quit")) {            
//            System.out.println("Ketik 'quit' untuk keluar:");
//            
//            input = scan.next();
//            System.out.println(input);
            
            do {    
                System.out.print("Ketik 'quit' untuk keluar : ");
                input = scan.next( );
                System.out.println(input);
                
            
        } while (!input.equalsIgnoreCase("quit"));
        }
    }
    

