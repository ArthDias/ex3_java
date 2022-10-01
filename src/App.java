import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        int numero = 0;
        int numero2 = 0;
        int soma = 0;

        System.out.print("Digite o primeiro número: ");
        numero = console.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = console.nextInt();

        soma = numero + numero2;

        System.out.println("O soma dos números informados é " + soma);
        console.close();
    }
}
