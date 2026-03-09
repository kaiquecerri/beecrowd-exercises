import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
        
    int empNumber = input.nextInt();
    int empWorkHours = input.nextInt();
    float receivePerHour = input.nextFloat();
    
    float salary = receivePerHour * empWorkHours;
    System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", empNumber, salary);
 
    }
 
}
