import java.util.Scanner;

public class Wybor {
    Scanner scanner;
    public static int punkt;


    Wybor(){
        scanner = new Scanner(System.in);
        System.out.println("1 - Dodaj go�cia");
        System.out.println("2 - Wy�wietl go�ci");
        System.out.println("3 - Sprawd� go�cia po imieniu");
        System.out.println("4 - Wyjd�");

        punkt = scanner.nextInt();

    }

}
