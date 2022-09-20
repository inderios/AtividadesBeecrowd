import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Bee1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha1 = br.readLine();
        String linha2 = br.readLine();
        String[] produto1 = new String[3];
        String[] produto2 = new String[3];
        produto1 = linha1.split(" ");
        produto2 = linha2.split(" ");
        double quantPrd1 = Double.parseDouble(produto1[1]);
        double valorProd1 = Double.parseDouble(produto1[2]);
        double quantPrd2 = Double.parseDouble(produto2[1]);
        double valorProd2 = Double.parseDouble(produto2[2]);
        double resultado = quantPrd1 * valorProd1 + quantPrd2 * valorProd2;
        System.out.printf("VALOR A PAGAR: %.2f\n", resultado);
    }
}
