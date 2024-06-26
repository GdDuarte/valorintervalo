import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        
        if(num >= 0 && num <=25){
            System.out.println("Intervalo (0,25)");
        }else if(num >= 25.01 && num <= 50){
            System.out.println("Intervalo (25,50)");
        }else if(num >= 50.01 && num <= 70){
            System.out.println("Intervalo (50,75)");
        }else if(num >= 75.01 && num <= 100){
            System.out.println("Intervalo (75,100)");  
        }else if(num < 0 || num > 100){
            System.out.println("Fora de intervalo");
        }

        sc.close();    
    }
}
