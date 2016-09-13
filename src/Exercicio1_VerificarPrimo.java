/**
 * Created by sergiosilva on 13/09/2016.
 */
import java.util.Scanner;

public class Exercicio1_VerificarPrimo {
    static boolean verificarPrimo (double p) {
        int contador =1;
        int divisoresDoNumero = 0;
        while(p >= contador){
            if (p % contador == 0){
                divisoresDoNumero++;
            }
            contador++;
        }
        if (divisoresDoNumero ==2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o valor do número.");
        int p = entrada.nextInt();
        if (verificarPrimo(p)){
            System.out.println("O numero é primo.");
        }else {
            System.out.println("O numero não é primo");
        }
    }
}
