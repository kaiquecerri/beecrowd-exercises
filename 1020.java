import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int years = days/365;
        int months = (days - 365*years)/30;
        days = days - (years*365 + months *30);
        
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);
    }
}
