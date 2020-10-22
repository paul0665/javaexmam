/*
 *
 * MIT License
 *
 * Copyright (c) 2020 Paul(paul0665)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package exam;public class exam20201022_1 {

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
    }
}
