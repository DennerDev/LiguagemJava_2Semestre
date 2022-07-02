// 2ª Considere o seguinte progama e informe o wue será impresso no vídeo.

public class Ex02 {
    public static void main(String[] args) {
        int i, num, res;

        num = 1;
        res = 0;

        for (i=1 ; i < 4 ; i++) {
            num = num * i;
            res = res + num;
            System.out.print(res + "*");
        }

    }
}

// Resposta 1*3*9


