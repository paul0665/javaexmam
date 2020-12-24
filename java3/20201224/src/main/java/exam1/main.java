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

package exam1;import exam1.lib.Score;

public class main {
    public static void main(String[] stg){
        Score score1 = new Score();
        Score score2 = new Score();
        score1.setName("Jack");
        score1.set1Score(78,"C");
        score1.set1Score(65,"E");
        score1.set1Score(85,"M");
        score2.setName("Jennifer");
        score2.set3Score(82,71,65);

        score1.show(System.out);
        score2.show(System.out);

        System.out.println(score1.compare(score2,"C"));
        System.out.println(score1.compare(score2,"E"));
        System.out.println(score1.compare(score2,"M"));
        System.out.println();
        System.out.println(score2.compare(score1,"C"));
        System.out.println(score2.compare(score1,"E"));
        System.out.println(score2.compare(score1,"M"));
    }

}
