
public class Ex01 {
    public static void main(String[] args) {
        int  a=18, b=12;

        while (a>0 && b>0) {
           if (a > b) a = a -b;
           else       b = b -a;
        }

        System.out.print((a+b));
    }
}

// Resposta 6
