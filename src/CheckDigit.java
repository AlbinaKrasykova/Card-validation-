public class CheckDigit {


    public static String ValidCard(String cardNum){


        int [] creditNum = new int[cardNum.length()];
        for (int i = 0; i< creditNum.length;i++){

            creditNum[i] = Integer.parseInt(cardNum.substring(i,i+1));

        }

        for(int i = creditNum.length-2; i<=0;i--){

           int TempValue = creditNum[i];
           TempValue = TempValue*2;
           if (TempValue>9){
               TempValue= TempValue % 10 + 1;
           }
        creditNum[i]=TempValue;
        }
        int sum = 0;
        for (int i = 0; i<creditNum.length;i++){
            sum +=creditNum[i];
        }
        if (sum%10 == 0){
            return  "Card is valid";
        }
        else return "Card is invalid";


    }
}
