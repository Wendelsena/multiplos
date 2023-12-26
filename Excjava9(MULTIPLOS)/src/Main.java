import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int A, B;

        System.out.println("Descubra se seus números são múltiplos ou não (Apenas inteiros).");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite o primeiro número:  ");
        A = sc.nextInt();
        
        System.out.println("\nDigite o segundo número:  ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
        	System.out.println("São múltiplos!");
        }
        
        else {
        	System.out.println("Não são múltiplos");
        }

        	sc.close();

        }

    }

