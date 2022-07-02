public class Ex14 {
    public static void main(String[] args) {
        int a , b, c, d;

        a = 15;
        b = 20; 
        c = b ;
        d = 0 ;

        while (a < b) {
            if ((c% a != 0 ) && (c%b != 0) ) {
              d = d + c;

              if ( (c%a == 0) && (c%b == 0)) break;
              c++;
            }
            System.out.println(d);
        }
    }
}

// Resposta 0
