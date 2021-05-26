public class OperadoresComparacao {

    public static void main(String[] args) {

        boolean menorQue = 5 < 10;
        boolean maiorQue = 5 > 10;

        //Menor que:
        System.out.println("Menor que -> " + menorQue);

        //Maior que:
        System.out.println("Maior que -> " + maiorQue);

        //Menor ou igual:
        System.out.println(10 <= 10);

        //Maior ou igual:
        System.out.println(5 >= 10);

        //Igualdade:
        System.out.println(5 == 10);

        //Diferente:
        System.out.println(5 != 10);

        System.out.println("---------------------------------------");

        int x = 5;
        System.out.println(x>0);
        System.out.println(x==3);
        System.out.println(10<=30);
        System.out.println(x!=2);

        System.out.println("------Operadores Logicos (AND OR NOT)------");
        System.out.println("AND------------------------------------");
        boolean y = ((x <= 20) && (x == 10));
        System.out.println(y);
        boolean w = ((x>0) && (x!=3));
        System.out.println(w);
        boolean q = ((x<=20) && (x==10) && (x!=3));
        System.out.println(q);
        System.out.println("OR-------------------------------------");
        boolean r = ((x <= 20) || (x == 10));
        System.out.println(r);
        boolean f = ((x>0) || (x!=3));
        System.out.println(f);
        boolean t = ((x<=20) || (x==10) || (x!=3));
        System.out.println(t);
        System.out.println("NOT------------------------------------");
        boolean i = !(x == 10);
        System.out.println(i);
        boolean k = !(x >= 2);
        System.out.println(k);
        boolean h = !((x<=20) && (x==10));
        System.out.println(h);

    }
}

