import java.util.Random;
import java.util.Scanner;
 
public class Choinka {
    public static void main(String[] arg) {
        String[] ozdoba = {"@", "O", "o", "*", "*", "*",};
        int h, a, f, i;
        
        System.out.print("Wprowadź wysokość choinki: ");
        Scanner input = new Scanner(System.in);
        h = input.nextInt();
        System.out.println();
        for (i = 0; i < h; i++) {
            for (a = 0; a < h * 2; a++) {
                if (a < (h - i) || a > (h + i)) {
                    System.out.print(" ");
                } else {    
                    if (1==0){
                        System.out.println("^");
                        for(int z = 0; z <= h - 1; z++){
                            System.out.print(" ");

                        }
                        System.out.print("o");
                        System.out.print("");
                        for(int z = 0; z <= h - 1; z++){
                            System.out.print(" ");
                        }
                        System.out.print("O");
                    }
                    else{
                    Random rnd = new Random();
                    f = rnd.nextInt(6);
                    
                    System.out.print(ozdoba[f]);
                }
                }
            }
            System.out.println();
            input.close();
            
         
        }
     
        for(int z = 0; z <= h - 1; z++){
            System.out.print(" ");
        }
        System.out.print("H");
        System.out.println("");
        for(int z = 0; z <= h - 1; z++){
            System.out.println(" ");
        }
        System.out.print("H");
    }
}