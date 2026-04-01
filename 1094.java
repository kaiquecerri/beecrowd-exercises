import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;
        
        for(int i=0; i < cases; i++) {
            int q = input.nextInt();
            char type = input.next().charAt(0);
            
            switch(type) {
                case 'C': coelhos += q;
                break;
                
                case 'R': ratos += q;
                break;
                
                case 'S': sapos += q;
                break;
            }
        }
        int total = coelhos + ratos + sapos;
        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (float) coelhos/total*100);
        System.out.printf("Percentual de ratos: %.2f %%\n", (float) ratos/total*100);
        System.out.printf("Percentual de sapos: %.2f %%\n", (float) sapos/total*100);
        
    }
 
}
