import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Party {
    static Scanner scanner = new Scanner(System.in);


    private static final List<String> dodajGoscia = new ArrayList<>();

    public static void addGuest(){
        System.out.println("Podaj imiê goœcia");
        String name = scanner.nextLine();

        dodajGoscia.add(name);
    }


    public static List<String> getGuest() {
         return  dodajGoscia;
    }
}

