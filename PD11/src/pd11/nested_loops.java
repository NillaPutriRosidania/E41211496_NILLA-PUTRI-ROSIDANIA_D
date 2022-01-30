
package pd11;

public class nested_loops {

    public static void main(String[] args) {
    int count1 = 1;
        while (count1 <= 10) {            
           int count2 = 1;
            while (count2 <= 20) {                
                System.out.println("Here");
                count2++;
            }  count1++;
        }
    }
    
}
