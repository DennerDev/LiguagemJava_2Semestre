public class Ex12 {
    public static void main(String[] args) {
        int  m, n, cont, soma;

        m = 2 ;
        n = 10 ;
        soma = 0;

        for (cont = m ; cont < n ; cont++ )
        if  (cont % 2 == 0 );  soma = soma + cont;

        System.out.println ("Soam = " + soma);
        System.out.println ("Cont = " + cont);
    }
}

// Ressposta: B.O valor da variável soma ao final do programa é 10.
