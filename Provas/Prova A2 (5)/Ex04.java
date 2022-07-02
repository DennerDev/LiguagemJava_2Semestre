

public class Ex04 {
    public static void main(String[] args) {
        int a, b, c, d, e = 0;

        a = 0;
        b = 1;
        e = a+b;

        for (c =3 ; c<=11 ; c++) {
            e = e + (a+b);
            d = a ;
            a = b ;
            b = b + d;
        }
        System.out.println(e);
    }
}    

// Resposta  143.

