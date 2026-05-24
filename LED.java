import java.io.IOException;
import java.util.Scanner;

public class LED {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        int ledsPerNumber[] = {6,2,5,5,4,5,6,3,7,6};
        
        input.nextLine();
        for(int i=0; i < times; i++) {
            String value = input.nextLine();
            int valueLength = value.length();
            int leds = 0;
            
            for(int j=0; j < valueLength; j++)
                leds += ledsPerNumber[(int) value.charAt(j)-'0'];

            System.out.println(leds + " leds");
        } 

        input.close();
    }
}
