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

import libs.BMI;
import libs.Score;

public class main {
    public static void main(String[] args){
        BMI s1 = new BMI("Jack",180,50);
        BMI s2 = new BMI("Jennifer",160,40);
        s1.calculate();
        s2.calculate();
        s1.show();
        s2.show();

        //===END 1====
        System.out.println("\n===END 1====");
        Score Jack = new Score(86,62,72);
        Score Julia = new Score(75,55,84);

        System.out.print("\nJack: ");
        Jack.show();
        System.out.print("\nJulia: ");
        Julia.show();
        System.out.println();


        if(Jack.getAvg()>Julia.getAvg())
            System.out.println("Julia lose");
        else if(Jack.getAvg()==Julia.getAvg())
            System.out.println("All lost");
        else
            System.out.println("Jack lose");
    }
}
