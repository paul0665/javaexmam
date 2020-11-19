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

public class exam20201119_2 {

    //68,95,15,43,26
    //45 89 1 24 6

    public static ArrayList<Integer> numlist1= new ArrayList<Integer>();
    public static ArrayList<Integer> numlist2 = new ArrayList<Integer>();
    public static String input1 = "68,95,15,43,26";

    public static void main(String[] args){
        for (String stuff:input1.split(",")) {
            numlist1.add(Integer.valueOf(stuff));
        }
        System.out.println("list1: " + numlist1);
        Scanner scanner = new Scanner(System.in);
        for(int loop = 0;loop<5;loop++){
            System.out.print("Enter number " + loop + " ");
            numlist2.add(scanner.nextInt());
        }

        System.out.println("list2: " + numlist2);

        numlist1.addAll(numlist2);

        int min=numlist1.get(0);
        int max=numlist1.get(0);
        for (int stuff:numlist1) {
            if(stuff<min) min=stuff;
            if(stuff>max) max=stuff;
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}