public class Arithematic {
    public static void main(String args[]) {
        //Arithematic operators + - * / %
        int a = 10;
        long b = 12;
        long c = a+b;
        System.out.println(c);

        float d = 12.5f;
        long e = 12;
        float f = d+e;
        System.out.println(f);

        //INT*INT ANS INT BUT STORES INTO LONG
        int A = 438347634;
        long I = A*24223;
        System.out.println(I);

        //LONG A1 * 24223 AUTOMATICALLY CONVERT INTO BIG SIZE LONG SO ANS IN LONG SAVES INTO LONG
        long A1 = 438347634;
        long I1 = A1*24223;
        System.out.println(I1);

        // int h convert into double
        double g = 12.5;
        int h = 4;
        double i = g*h;
        System.out.println(i);

        float G= 12.5f;
        int H= 4;
        float J = G*H;
        System.out.println(J);

        //compound assignment operator
        int z=10;
        z+=5;
        System.out.println(z);

        byte y = 10;
        y = (byte) (y+11);
        System.out.println(y);

        //it uses impicit casting automatically
        byte Y = 10;
        Y+=11;
        System.out.println(Y);

        //increment and decrement ++ --
        //postincrement- first use and then increment
        //preincrement- first increment and then use

        int s = 10;
        //int r = s++;
        //System.out.println(r);
        //System.out.println(s);

        //int t = s++ + s; //(10+11)
        //System.out.println(t);

        //int u = ++s + s; //(11+11)
        //System.out.println(u);

        //int v = s + ++s; //s+(++S) = 10+11
        //System.out.println(v);

        int w = s++ + --s; //(10+10)
        System.out.println(w);
    }
}