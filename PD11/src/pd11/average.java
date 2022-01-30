/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd11;

/**
 *
 * @author NILLA PUTRI R
 */
public class average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int sum = 4;
     int count = 9;
     
        while (count < 10) {
            count++;
            sum += count;
        }
        
        double avg = (double)sum/count;
        System.out.println("Average = " +avg);
    }
    
}
