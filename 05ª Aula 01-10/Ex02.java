
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner Pizza = new Scanner(System.in);

        float V;
        int op;

        System.out.print("Digite o valor da compra: ");
        V = Pizza.nextFloat();

        System.out.println("\nMenu");

        System.out.println("\n1 -à vista com 10% descontos ");

        System.out.println("\n2 - cartão de credito com 5 % desconto");

        System.out.println("\n3 - em 2 vezes sem juros");

        System.out.println("\n4 - em 3 vezes sem juros");

        System.out.println("\nDigite a forma de pagamento <1//2/3/4:> ");

        op = Pizza.nextInt();

        switch (op) {
            case 1:
                System.out.printf("Pagará à vista com 10%% de desconto: %.2f reais ", (V * 0.90));
                break;
            case 2:
                System.out.printf("Pagará à vista com 5%% de desconto: %.2f reais ", (V * 0.95));
                break;
            case 3:
                System.out.printf("Pagará 2 parcelas de: %.2f reais ", (V / 2));
                break;
            case 4:
                System.out.printf("Pagará 3 parcelas de: %.2f reais ", (V * 1.10 / 3));
                break;
            default:
                System.out.println("Forma de pagemento inválido ");
                

        }
    }
}
