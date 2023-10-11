import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tb = new Scanner(System.in);
        int poäng = 0;
        System.out.print("Vad heter Sveriges huvudstad? ");
        String stockholm = tb.nextLine();
        if(stockholm.equalsIgnoreCase("stockholm")){
            poäng++;
        }
        System.out.print("Vad är 30 + 2 * 2? ");
        String trettiofyra = tb.nextLine();
        System.out.print("Vilket är det största landet? ");
        String ryssland = tb.nextLine();
        System.out.print("Vilket land har mest invånare? ");
        String kina = tb.nextLine();
        System.out.print("Vilken färg har ett äpple om det är grönt? ");
        String grönt = tb.nextLine();

    }
}
