// Ler 2 notas e mostrar a média, informa se o aluno está Aprovado ou Reprovado,
// sabendo que a média para aprovação é Seis.

import java.util.Scanner;

class Ex01{
    public static void main(String[] args) {
        float n1, n2, med;
        Scanner Denner = new Scanner(System.in);

        System.out.println("\n\n Sistema de Calculo de Notas");

        System.out.println("Digite o sua nota de português");
        n1 = Denner.nextFloat();

        System.out.println("Digite o sua nota de Matemática");
        n2 = Denner.nextFloat();

        med = (n1 + n2)/2;
        
        System.out.print(med);

        if (med >= 6) System.out.print("\nParabens Passou");
        else System.out.print("\nDe Ruim pra ti");
    }
}

