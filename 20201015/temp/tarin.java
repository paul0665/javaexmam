package temp;

public class tarin{

    static final float price = 137;

    //10/5/1
    public static void main(String[] args){
        float ans10 = 0;
        float ans5 = 0;
        float ans1 = 0;

        //10
        if ((price % 10)!=0){
            float i = price;
            while (true){
                if ((i % 10)==0){
                    ans10 = i/10;
                    break;
                }
                i++;
            }
        }else ans10=price;

        //5
        if ((price % 5)!=0){
            float i = price;
            while (true){
                if ((i % 10)==0){
                    ans5 = i/5;
                    break;
                }
                i++;
            }
        }else ans5=price;

        //1
        if ((price % 1)!=0){
            float i = price;
            while (true){
                if ((i % 1)==0){
                    ans1 = i/1;
                    break;
                }
                i++;
            }
        }else ans1=price;

        System.out.println("ans10 = " + ans10);
        System.out.println("ans5 = " + ans5);
        System.out.println("ans1 = " + ans1);

    }
}
