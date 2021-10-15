import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);

        System.out.println("Hello. Enter card number for validation");

        String cardNumber = sc.nextLine() ;

        if (cardNumber.length()== 16){
            System.out.println(CheckDigit.ValidCard(cardNumber));
            if (cardNumber.substring(0,1).equals("4")){
                System.out.println("VISA");
            }
            else if (cardNumber.substring(0,2).equals("51")||cardNumber.substring(0,2).equals("52")||
                    cardNumber.substring(0,2).equals("53")||cardNumber.substring(0,2).equals("54")||
                    cardNumber.substring(0,2).equals("55")){
                System.out.println("MASTERCARD");
            }
            else if (cardNumber.substring(0,2).equals("36")||cardNumber.substring(0,2).equals("38")){
                System.out.println("Diners Club ");
            }
            else if (cardNumber.substring(0,4).equals("6011")||cardNumber.substring(0,2).equals("65")){
                System.out.println("Discover");
            }
            else if (cardNumber.substring(0,2).equals("35")){
                System.out.println("JCB");
            }
            else if (cardNumber.substring(0,2).equals("34")||cardNumber.substring(0,2).equals("34")){
                System.out.println("American Express");
            }
          }

        else if (cardNumber.length()> 16||cardNumber.length() < 16&&(!cardNumber.matches("[0-9]"))){
          System.out.println("Length should be 16 symbols");
          System.out.println("Number should contain only digits");
          }
        else if(cardNumber.length()> 16||cardNumber.length() < 16){
            System.out.println("Length should be 16 symbols");
        }

        else if (!cardNumber.matches("[0-9]")&&cardNumber.length() < 16&&cardNumber.length() > 16){
          System.out.println("Number should contain only digits");
         }






    }
}
