
package midmonthexam;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter number ");
        int input=sc.nextInt();
        int fact=1;
        for(int i=1;i<=input;i++){
            fact*=i;
        }
        System.out.println("Factorial number is "+fact);
    }
}
