import java.util.Scanner;

public class cantBedgyCuzOfPearlSad {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.println("%d/%d=%d", num, den, div);
            keyboard.close();

        }catch (NumberFormatException nfe){
            System.out.println("invalid number");

        }catch (ArithmeticException ae){
            System.out.println("Division by 0");

        }
        System.out.println("The end");{

        }catch (RuntimeException)



    }
}