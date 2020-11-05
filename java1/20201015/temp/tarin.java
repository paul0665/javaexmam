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
