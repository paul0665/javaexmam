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

package libs;import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.PrintStream;

public class Score {
    private int Chinese;
    private int English;
    private int Math;
    private int Avg;

    public Score(int Chinese,int English,int Math){
        this.Chinese = Chinese;
        this.English = English;
        this.Math = Math;
        Avg = Integer.valueOf((Chinese+English+Math)/3);
    }
    public int getAvg(){
        return Avg;
    }
    public void show(){
        System.out.print(" Chinese: " + Chinese);
        System.out.print(" English: " + English);
        System.out.print(" Math: " + Math);
        System.out.print(" Avg: " + Avg);
    }

}
