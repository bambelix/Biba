import java.util.Scanner;

public class Wybor {
    Scanner scanner;
    public static int punkt;


    Wybor(){
        scanner = new Scanner(System.in);
        System.out.println("1 - Dodaj goúcia");
        System.out.println("2 - Wyúwietl goúci");
        System.out.println("3 - Sprawdü goúcia po imieniu");
        System.out.println("4 - Wyjdü");

        punkt = scanner.nextInt();

    }

}
