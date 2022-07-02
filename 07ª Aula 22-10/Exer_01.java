/**
 * Escrever Unicid na tela 20 vezes na tela
 * 
 */

public class Exer_01 {
    public static void main(String[] args) {
        int contador;
        
        //Essa é estruturra para fazer o laço de repetição, com um contador no finail para que o laço tenha fim!
        
        contador = 1; // Valor inicial
        while(contador <= 20){
            System.out.println(contador + " - Unicid");

            contador++; //Isso faça com que contador não fique rodando de forma infinita
        }
    }
}
