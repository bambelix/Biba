import java.util.Scanner;

public class Check {
    Scanner scanner;


    Check(){
        scanner = new Scanner(System.in);
        String check;

        System.out.println("Podaj imi� sprawdzanego go�cia");
        check = scanner.nextLine();
        if(Party.getGuest().contains(check)){
            System.out.println("jest");
        }else{
            System.out.println("ni ma");
        }
    }


}
