public class exam20201022_1 {

    static final float price = 268;

    public static void main(String[] args){
        float payed = 0;
        float con50 = 0,con10=0,con5=0,con1 = 0;

        while (true){
            if(payed==price){
                System.out.println("-----------------------");
                System.out.println("Finished");
                System.out.println("50: " + con50);
                System.out.println("10: " + con10);
                System.out.println("5: " + con5);
                System.out.println("1: " + con1);
                payed = con50+con10+con5+con1;
                System.out.println("Total: " + payed);
                return;
            }else if(price-payed>=50){
                con50++;
                payed+=50;
                System.out.println("Enter 50");
            }else if(price-payed>=10){
                con10++;
                payed+=10;
                System.out.println("Enter 10");
            }else if(price-payed>=5){
                con5++;
                payed+=5;
                System.out.println("Enter 5");
            }
            else if(price-payed>=1){
                con1++;
                payed+=1;
                System.out.println("Enter 1");
            }
        }

        /*
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
        }else ans1=price;*/

        //System.out.println("ans10 = " + ans10);
        //System.out.println("ans5 = " + ans5);
        //System.out.println("ans1 = " + ans1);
    }
}
