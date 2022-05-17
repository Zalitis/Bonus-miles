
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Внесите стоимость билета: ");
        Scanner scan = new Scanner(System.in);
        int ticketPrice = scan.nextInt();
        int stock = 20;
        int bonuses = ticketPrice / stock;
        System.out.println("У вас " + bonuses + " бонусных миль!");
    }
}

