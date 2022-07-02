import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       
       int q, t, i, v;
       float m = 0;
       
       System.out.print ("Digite um número <<varável q>>: ");
       q = ler.nextInt();

       if (q <= 0 )  System.out.println("Valor inválido");
       else {
           t = 0;
           i = 1;
           while (i <= q ) {
               System.out.print ("Digite um número <<variável v>>: ");
               v = ler.nextInt();
               t = t+ v;
               i++;
           }
           m = t / q;       
        }
        System.out.println(m);
    }
}

// Resposta = 44.0
