import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int seconds = input.nextInt();
        int minutes = seconds/60;
        seconds = seconds%60;
        int hours = minutes/60;
        minutes = minutes%60;
        
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
 
    }
 
}
