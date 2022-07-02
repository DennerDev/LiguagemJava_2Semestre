// 9ª Análise o progama abaixo e informe qual o valor será impresso no video, após a execução do programa 

public class Ex09 {
    public static void main(String[] args) {
        int r=10, s=5, t=10, i;

        for (i=1 ; i<=5 ; i++) {
          if (r >= s) t = t+s;
          else        t = t-s;

          r++;
          s = s+2;
        }

        System.out.print(t);
    }
}

// Resposta  55