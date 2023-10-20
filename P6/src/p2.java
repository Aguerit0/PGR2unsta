import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert one chain");
        String chain = keyboard.nextLine();
        int x = chain.length();
        if (x % 2 != 0) {
            x++;
        }
        int start = 0, medium = x / 2, end = x;
        String spaceChain = " " + chain.substring(start, medium) + " " + chain.substring(medium, end) + " ";
        System.out.println(spaceChain);
    }
}
