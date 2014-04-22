import javax.swing.*;
import java.util.Scanner;
public class Factorial {

    /**
     * @param args the command line arguments
     */
   public static void main(String [] args){
	Scanner scan=new Scanner(System.in);
        System.out.println("input :");
        int x=scan.nextInt(); 
	int a=1;
	int b=2;
	for (int i=1; i<=x; i++){
		System.out.println("fibonaci :"+a);
			a=a+b;
			b=a-b;
			b=b-a;
			}
			}
}
