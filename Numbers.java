import java.io.IOException;
import java.util.Scanner;

public class Numbers {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        input.nextLine();
        
        String numbers[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i=0; i<times; i++) {
            String number = input.nextLine();
            
            for(int j=0; j<numbers.length; j++) {
                String testNumber = numbers[j];
                int minimumLength = Math.min(number.length(), testNumber.length());
    
                int differentCharacters = 0;
                for (int k = 0; k < minimumLength; k++) {
                    if (number.charAt(k) != testNumber.charAt(k)) {
                        differentCharacters++;
                    }
                }
                
                if(differentCharacters <= 1) {
                    System.out.println(j);
                    break;
                }
            }
        }

        input.close();
    }
}