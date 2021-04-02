package deneme;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionE {

    public static void main(String[] args) {

        String[] a={"","bwm","volvo","renault","honda"};

        System.out.println("hangi sirada ki arabayi istiyorsun");

         try {
             Scanner scan = new Scanner(System.in);
             int i = scan.nextInt();
             System.out.println(a[i]);
         }catch (RuntimeException e){
             System.out.println("girdiginiz sirada araba yok");
         }


    }


}
