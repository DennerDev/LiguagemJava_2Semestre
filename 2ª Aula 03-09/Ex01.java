/*    RESUMO E ANOTAÇÃOS
- O Nome da class é o nome do arquivo que você criou 
- println = Pola uma linha
 */


 /* 
 1) Ler uma número nº inteiro e mostrar na tela.  (Entrada --> Procesamento ---> Saída)
 */

 import java.util.Scanner; // Biblioteca que permite que o úsuario digite algo na tela.

class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in); // Para Ler algo voce tem que passar o (Denner) que você declarou no Scanner

        int num;
        System.out.println("Digite o primeiro número : ");
        num = ler.nextInt();

    } 

}