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

package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class exam20201119_3 {

    //1,2,3,4,5,6,7,8,9
    //9,1,2,3,4,5,6,7,8
    //8,9,1,2,3,4,5,6,7
    //7,8,9,1,2,3,4,5,6

    public static int[][] multi = new int[4][9];
    public static void main(String[] args){
        adder("1,2,3,4,5,6,7,8,9",0);
        adder("9,1,2,3,4,5,6,7,8",1);
        adder("8,9,1,2,3,4,5,6,7",2);
        adder("7,8,9,1,2,3,4,5,6",3);

        int ans =0;
        for (int[] stuff:multi) {
            for (int instuff:stuff) {
                ans+=instuff;
            }
        }
        System.out.println(ans);
    }

    public static void adder(String stg,int index){
        int loop=0;
        for (String stuff:stg.split(",")) {
            multi[index][loop] = Integer.valueOf(stuff);
            loop++;
        }
    }
}