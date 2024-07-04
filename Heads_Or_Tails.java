import java.util.Scanner;
import java.util.Random;

public class Heads_Or_Tails{

    public static void main(String[] args){
        int rounds = 3;
        int count_H = 0;
        int count_T = 0;
        Random random = new Random();
	Scanner sc = new Scanner(System.in);


	System.out.println("Who are you?");
	System.out.print("> ");

	String name = sc.next();

	System.out.println("Hello, " + name + "!");
	sc.close();

        System.out.println("Tossing a coin...");

        for(int round=1; round<=rounds; round++){
            int result = random.nextInt(2);

            if(result == 0){
                System.out.println("Round " + round + ": Heads");
                count_H++;
            } else{
                System.out.println("Round " + round + ": Tails");
                count_T++;
            }
        }

        System.out.println("Heads: " + count_H + ", Tails: " + count_T);

	if(count_H > count_T) System.out.println(name + " won!");
	else System.out.println(name + " lost.");

   }
}
