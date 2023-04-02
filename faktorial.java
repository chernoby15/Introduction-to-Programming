
import java.util.Scanner;

public class faktorial {

    public static void main(String[] args) {
        
        Scanner ade = new Scanner (System.in);

        int nomer;

        System.out.print ("Masukan angka : ");
        nomer = ade.nextInt();
        int hasil = nomer;
        System.out.print ("Perkalian faktorial " + nomer + " : ");
            for ( int i = nomer; i > 0; i--) 
            {
                System.out.print (i);
               if (i > 1 ) 
               {
                System.out.print (" X ");
                continue;
               }
               if (nomer != i ) 
               {
                hasil *= i;
               }
            }
        System.out.println ("  ");
        System.out.print ("Hasilnya adalah : " + hasil);
    }
}

