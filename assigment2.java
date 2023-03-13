import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class assigment2 {
    
    public static void main(String[] args) {
        
        String namaitem;
        double total = 0;
        double harga;
        int jmlh, disc;
        
        
        Scanner scanner = new Scanner(System.in);
              
            System.out.println("ES Companies Portal - Cashier App ");
            System.out.println("==================================");
            System.out.print("Input item's name : ");
            namaitem = scanner.nextLine();
            
            System.out.print("Input item's price : $ ");
            harga = scanner.nextDouble();
            
            // Get item quantity
            System.out.print("Input item's quantity: ");
            jmlh = scanner.nextInt();

            System.out.print("Input item's discount: ");
            disc = scanner.nextInt();
            
            total += harga * jmlh;
            
            // Clear scanner buffer
            scanner.nextLine();
        
        
        System.out.println("You have to pay: $ " + total);
        scanner.close();
    }
}