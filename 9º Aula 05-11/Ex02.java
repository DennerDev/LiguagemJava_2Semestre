import java.util.Scanner; // Ususario digita
import java.util.Random;
import java.util.Date;
import java.util.concurrent.TimeUnit;
// import java.*; São abertas todas a biblioteca do (util)


public class Ex02 {
    public static void main(String[] args) {
        int x1, x2, x3, x4, magico, num, tent, vidas;

        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();

        x1 = gerador.nextInt(51); // Gera um némero até 50
        x2 = gerador.nextInt(51);
        x3 = gerador.nextInt(51);
        x4 = gerador.nextInt(51);

        System.out.println("Memorizando....");
        System.out.println (x1 + " " + x2+ " "+ x3 + " " + x4);

        try {
            TimeUnit.SECONDS.sleep(4); // deley de espera para a os números
        }catch (IncompatibleClassChangeError e){
           System.out.println(); 
        }
        

        
    }
}
