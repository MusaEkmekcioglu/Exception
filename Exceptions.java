package deneme;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        System.out.println("enter a value to multiply ");
        Scanner scan=new Scanner(System.in);

       try{
           int str= scan.nextInt();
           str=str*2;
           System.out.println("result=" + str);
       }catch (Exception e){
           System.out.println("you need to enter number");
       }
       finally {
           System.out.println("thanks...");
       }

    }
}
