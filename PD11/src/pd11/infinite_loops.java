
package pd11;

public class infinite_loops {

    public static void main(String[] args) {
        int count = 1;
         while (count <= 25) {            
             System.out.println(count);
             count = count -1;
        }
    }
    
}
