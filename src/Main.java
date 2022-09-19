public class Main {
    public static void main(String[] args) {
        boolean shouldContinue = true;


        while(shouldContinue){
            switch(Wybor.punkt) {
                case 1 -> Party.addGuest();
                case 2 -> System.out.println(Party.getGuest());
                case 3 -> new Check();
                case 4 -> shouldContinue = false;
            }
        }
    }
}