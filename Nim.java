import java.util.*;

public class Nim {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int move = 0;
        int hMove = 0;
        int starval = 12;
        
        System.out.println("Fjern et antal stjerner fra 1 til 3\n");
        while (starval > 0) {
            System.out.println("Antal stjerner:");
            for(int x = 1; x <= starval ; x++) { //Print stjerner
                System.out.print("* ");
            }
            System.out.println("\nDin tur");
            
            //Spillerens tur
            hMove = scanner.nextInt();
            while (hMove < 1 || hMove > 3) { //Hvis spilleren er dum
                System.out.print("Ikke tilladt, indtast en værdi mellem 1 og 3\n");
                hMove = scanner.nextInt();
                System.out.print("\n");
            }
            starval = starval - hMove;
            System.out.print("\n");
            
            if (starval <= 0) { // Spilleren vinder
                System.out.println("Du vandt!");
            } else { // Computerens tur
                System.out.println("Antal stjerner:");
                for(int x = 1; x <= starval ; x++) {
                   System.out.print("* ");
                }
                System.out.println("\nComputerens tur");
            
                move = random.nextInt(3) + 1;
                starval = starval - move;
                System.out.println(move + "\n");
                
                if (starval <= 0) { // Computeren vinder
                    System.out.println("Computeren vandt!");
                }
            
            }
            
        }
    }
}