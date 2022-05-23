import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BonusMilesService service = new BonusMilesService();
        System.out.println("Внесите стоимость билета: ");
        int ticketPrice = scan.nextInt();
        int miles = service.calculate(ticketPrice);
        System.out.println("У вас " + miles + " бонусных миль!");
    }
}

