import java.util.Scanner;
public class BeeCrowd2006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cha = input.nextInt();
        String respostas = input.nextLine();
        String[] respostasString = respostas.split(" ");
        int[] respostaInt = conversor(respostasString);
        int k = 0;
        int corretos = 0;
        while(k < respostaInt.length) {
            if (cha == respostaInt[k]){
                corretos++;
            }
            k++;
        System.out.println(corretos);
        }
    }
    public static int[] conversor(String[] linhaString){
        int[] respostaInt = new int[linhaString.length];
        for(int k = 0; k < linhaString.length; k++) {
            respostaInt[k] = Integer.parseInt(linhaString[k]);
        }
        return respostaInt;
    }
}

