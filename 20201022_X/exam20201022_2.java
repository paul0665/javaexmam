public class exam20201022_2 {

    static final float a = -3.2F;
    static final float b = 0F;
    static final float c = 6.5F;

    public static void main(String[] args){
        getAns(a);
        getAns(b);
        getAns(c);
    }
    public static float getAns(float input) {
        float ans = 0F;
        ans = input < 0F ? ans = input * -1F :
                (
                        input >= 0F ? input:input
                );
        System.out.println("\ngetAns input: " + input + "\ngetAns return: "+ ans);
        return ans;
    }
}
