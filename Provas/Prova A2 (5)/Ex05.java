public class Ex05 {
    public static void main(String[] args) {
        int cont, x = 0;
        
        for (cont=4 ; cont > -3 ; cont--){
            x = x + cont;
            switch (cont){
                case 0: x = x - 2 * cont; break;
                case 1: x = x + cont; break; 
            }
        }
        System.out.print(x);
    }
}

// Resposta 8
