package test;

import java.util.Scanner;

public class ReverseAnumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number to Reverse: ");
        int num = sc.nextInt();

        // using Algorithm 

        int rev=0;

        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse of the number is : " + rev );
    }
}
