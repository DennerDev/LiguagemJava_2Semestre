public class Ex08 {
    public static void main(String[] args) {
        int x=25, y=25, cont;

        for (cont=0 ; x>=y; cont++)
        x = x - y;
        
        System.out.print("x= " + x + "   y= " + y + "  cont= " + cont);
    }
}

// Resposta C.x=0     y=25  cont=1
