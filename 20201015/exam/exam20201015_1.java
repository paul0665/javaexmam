package exam;

public class exam20201015_1 {

    static final double PI = 3.1416;

    public static void main(String[] args){
        byte b = -10;
        int i = 360;
        long l = 2147483647L;
        float f = 1.6f;
        double d = -0.01d;
        String s = "SHU-TE University";

        f = (float) (f*Math.pow(10,-19));
        System.out.println("b =  " + String.valueOf(b));
        System.out.println("i =  " + i);
        System.out.println("l =  " + l);
        System.out.println("f =  " + f);
        System.out.println("d =  " + d);
        System.out.println("s =  " + s);
        System.out.println("PI =  " + PI);

    }
}