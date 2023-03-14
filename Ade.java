/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ian.ade;
import java.util.Scanner;
/**
 *
 * @author mcbookair
 */
public class Ade {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
        System.out.println(" ____________________________________");
        System.out.println("|               PROUDCT              |");
        System.out.println("|____________________________________|");
        System.out.println("| Name             |  Price          |");
        System.out.println("|1. Keyboard       |   $49.99        |");
        System.out.println("|2. Mouse          |   $19.99        |");
        System.out.println("|3. Monitor        |   $99.99        |");
        System.out.println("|4. VGA RTX 3060   |   $200.99       |");
        System.out.println("|__________________|_________________|");
        System.out.println("");

        int price = 0;
        double price_product[] = {49.99, 19.99, 99.99, 200.99 };
        String product;
        int theprice;
        int money;
 

        for (String ade = "Y"; ade.equals("Y")||ade.equals("y");){
            
        System.out.println("_____________________________________");
        System.out.print("Choose : ");
        int input_product = scan.nextInt();
        System.out.print("Input quantity [1..20] : ");
        int jumlah = scan.nextInt();
        System.out.println("_____________________________________");

        if (input_product == 1)
        {
            product = "Keyboard";
            price = price + (int) price_product[0] * jumlah;
            theprice= (int)price_product[0] * jumlah;
            System.out.println("your product : " + product +"    x"+ jumlah+"   |  $ "+ theprice);
            
        }
            else if (input_product == 2)
            {
                product = "Mouse";
                price = price + (int) price_product[1] * jumlah;
                theprice= (int)price_product[1] * jumlah;
             System.out.println("your product : " + product +"    x"+ jumlah+"   |  $ "+ theprice);
            }
                else if (input_product == 3)
                {
                    product = "Monitor";
                    price = price + (int)price_product[2] * jumlah;
                    theprice= (int)price_product[2] * jumlah;
                 System.out.println("your product : " + product +"    x"+ jumlah+"   |  $ "+ theprice);
                }
                    else if (input_product == 4)
                    {
                        product = "VGA RTX 3060";
                        price = price + (int)price_product[3] * jumlah;
                        theprice= (int)price_product[3] * jumlah;
                        System.out.println("your product : " + product +"    x"+ jumlah+"   |  $ "+ theprice);
                    }
                     else
                    {
                        System.out.println("Sorry product not found.");
                    }

            System.out.println("Need more product ? Y/n");
            ade = scan.next();

        }
        System.out.println("___________________________________________________________________");
        System.out.println("Input your money $" +price+"");
        System.out.print("your money");
        money = scan.nextInt();
        System.out.println("___________________________________________________________________");
        int kembalian = money-price;
        System.out.println("your change $" +kembalian+".");
        System.out.println("Thanks for shopping");
    }
}
