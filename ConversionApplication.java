import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md.rifat
 */

    import java.util.Scanner;

    public class ConversionApplication {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Hello! This program will help you convert your height to centimeters.");
       
        int x;
        int y;

        System.out.println("Please enter your height in feet:");
        x= input.nextInt();

        System.out.println ("Please enter your height in inches:");
        y = input.nextInt();
        double z;

        z= x * 30.48;
        
        double t;
        t = y * 2.54;
        double s;
        s = z + t;
                
        System.out.println("Your height in centimeters is" + s);

   }
    
    
}
