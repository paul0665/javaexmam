public class test {

    public static void main(String[] args){
        //在前面跟結尾加/* */ 可以做備註  另外一行的話在前面加//就可以了
        double a = 64.0024D; //可以加小數點
        // 後面通常加D或F
        float b = 4873.26F;  //可以加小數點
        // 後面通常加D或F
        int c = 10;
        //通常不會加東西
        String d = "20";
        //數字外面要有" "包住        且可以打中文英文
        long e = 30L;
        //後面通常加L
        boolean z = true; //true=是 成立/false否 不成立

        System.out.print("Hello");
        System.out.print(" world");
        //print不會換行
        System.out.println(); //分隔

        System.out.println("Hello");
        System.out.println(" world");
        //println會在字串結束時換行

        System.out.println(); //分隔

        System.out.println("Hello world " + c); //同時輸出c
        //使用+可以同時輸出一個以上的變數/字串
        System.out.print("Hello world\nytfytfyt\n");
        //  \n可以換到下一行
        System.out.println("a = " + a);
        // "= "a + a); 會變成a=64.0024
        System.out.println(a);
        System.out.println(); //換行

        int f = 50;
        int g = 50;
        float i =f+g;
        System.out.println("f+g = " + i);
        i = f-g;
        System.out.println("f-g = " +i );
        i = f*g;
        System.out.println("f*g = " +i );
        i = Float.valueOf(f)/Float.valueOf(g);
        // int float double 這類東西 第一個字大寫 後面加上valueOf() 可將()內的物件強行轉化成該型態資料型態
        System.out.println("f/g = " +i );
        System.out.println();
        if(g>f){ // 括號理的情況成立
            System.out.println("g>f");
        }else if (g<f) { // 當if前面的判斷不成立
            System.out.println("g<f");
        }else if(g==f){// 當if前面的判斷不成立
            System.out.println("g==f");
        } else {// 最終解決方案 收尾

        }
        int aa = 100;
        int bb = 66;

        System.out.print("aa == bb: ");System.out.println(aa == bb);
        System.out.print("aa != bb: ");System.out.println(aa != bb);
        System.out.print("aa > bb: ");System.out.println(aa > bb);
        System.out.print("aa < bb: ");System.out.println(aa < bb);
        System.out.print("aa >= bb: ");System.out.println(aa >= bb);
        System.out.print("aa <= bb: ");System.out.println(aa <= bb);
    }
}