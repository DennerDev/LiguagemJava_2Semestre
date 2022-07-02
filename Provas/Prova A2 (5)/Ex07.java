public class Ex07 {
    public static void main(String[] args) {
        int z, n=10, x=1, y=1, i=0;

        System.out.print(x + "   " + y);

        while (i < n-2){
            z = x + y ;
            System.out.print(z + " ");
            x =y;
            y = z;
            y = z;
            i = i + 1;
        }
    }
}

// Resposta 12 3 5 8 13 21 34 55 