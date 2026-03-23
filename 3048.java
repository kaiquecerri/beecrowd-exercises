import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int sequenceSize = input.nextInt();
        
        int[] sequence = new int[sequenceSize];
        
        for(int i = 0; i < sequenceSize; i++) {
            sequence[i] = input.nextInt();
        }
        
        int lastNum = 2;
        int total = 0;
        
        for(int i = 0; i < sequenceSize; i++) {
            if(lastNum == 2) {
                if(sequence[i] == 1) {
                    total += 1;
                    lastNum = 1;
                }
            }
            
            if(lastNum == 1) {
                if(sequence[i] == 2) {
                    total += 1;
                    lastNum = 2;
                }
            }
        }
        
        System.out.println(total);
    }
 
}
