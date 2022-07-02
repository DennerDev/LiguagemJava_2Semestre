import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        Random geraadorDeNumeros = new Random();

        int magico;

        magico = geraadorDeNumeros.nextInt(26); // Resto para gerar um némro até 25
        System.out.println("O número mágico é " + magico);
    }
}
