
import java.util.Scanner;

class Ex03 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        float A, B;
        char op;

        System.out.println("Digite o primeiro número: ");
        A = leitura.nextFloat();

        System.out.println("qual é a operação desejada < + - * / >: ");
        op = leitura.next().charAt(0);

        System.out.println("Digite o primeiro número: ");
        B = leitura.nextFloat();

        switch (op) { // int ou char
            case '+':
                System.out.printf("A soma é %.2f ", A + B);
                break; // Println a soma deve estar dentro de aspas ---> (A+B)
            case '-':
                System.out.printf("A subtração é %.2f ", A - B);
                break;
            case '*':
                System.out.printf("A multiplicação é %.2f ", A * B);
                break;
            case '/':
                if (B == 0)
                    System.out.printf("Não podemos dividir por zero ");
                else
                    System.out.printf("A divisão é %.2f ", A / B);
                break;
            default:
                System.out.println("Operação inválida! ");

        }

    }
}