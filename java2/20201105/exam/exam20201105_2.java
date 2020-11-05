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

package exam;import java.util.Scanner;

public class exam20201105_2 {


    public static void main(String[] args){
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter score");
                while (true){
                    int score = scanner.nextInt();
                    if(score<=100&&score>=0){
                        switch (score/10){
                            default:System.out.println("Fail");return;
                            case 10:
                            case 9:
                                System.out.println("A");return;
                            case 8:System.out.println("B");return;
                            case 7:System.out.println("C");return;
                            case 6:System.out.println("D");return;
                        }
                    }else {
                        System.out.println("Error!");
                    }
                }
            }catch (Exception e){
                System.out.println("Error!");
            }
        }
    }
}