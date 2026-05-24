import java.io.IOException;
import java.util.Scanner;

public class CupGame {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        char initialPositionLetter = input.next().charAt(0);
        
        int initialPosition = 0;
        switch(initialPositionLetter){
            case 'A': initialPosition = 0; break;
            case 'B': initialPosition = 1; break;
            case 'C': initialPosition = 2; break;
        }
        
        boolean cupGame[] = new boolean[3];
        cupGame[initialPosition] = true;
        
        for(int i=0; i<times; i++) {
            int nextMove = input.nextInt();
            
            if(nextMove == 1) {
                boolean temp = cupGame[0];
                cupGame[0] = cupGame[1];
                cupGame[1] = temp;
            } else if(nextMove == 2) {
                boolean temp = cupGame[1];
                cupGame[1] = cupGame[2];
                cupGame[2] = temp;
            } else {
                boolean temp = cupGame[0];
                cupGame[0] = cupGame[2];
                cupGame[2] = temp;
            }
        }
        
        if(cupGame[0] == true) System.out.println('A');
        if(cupGame[1] == true) System.out.println('B');
        if(cupGame[2] == true) System.out.println('C');

        input.close();
    }
}