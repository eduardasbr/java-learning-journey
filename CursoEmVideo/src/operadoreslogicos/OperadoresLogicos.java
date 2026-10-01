package operadoreslogicos;

import java.awt.*;
import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {

        //  &&

        int x, y, z;

        x = 4;
        y = 7;
        z = 12;

        boolean r1;
        boolean r2;

        r1 = (x<y && y<z)?true:false;
        r2 = (x<y && y==z)?true:false;

        System.out.println("&& - Retorna 'True': " + r1);
        System.out.println("&& - Retorna 'False': " + r2);

        //   ||

        int a, b, c;

        a = 4;
        b = 6;
        c = 8;

        boolean e1;
        boolean e2;

        e1 = (a<b || b>c)?true:false;
        e2 = (a==b || b>c)?true:false;

        System.out.println("|| - Retorna 'True': " + e1);
        System.out.println("|| - Retorna 'False': " + e2);

        //     ^

        int d, e, f;

        d = 5;
        e = 7;
        f = 9;

        boolean e3;
        boolean e4;

        e3 = (d<e ^ e>f)?true:false;
        e4 = (d<e ^ e<f)?true:false;

        System.out.println("^ - Retorna 'True': " + e3);
        System.out.println("^ - Retorna 'False': " + e4);


        // Pratica: Votacao opcional ou nao

        int idade = 15;
        String voto;

        voto = ((idade>=16 && idade<=18) || (idade<=70))?"OBRIGATORIO":"OPCIONAL";


        System.out.println("O voto e: " + voto);

    }
}
