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

package lib;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.PrintStream;

public class Student {
    private String name;
    private int chinese;
    private int english;
    private int math;
    private double avg;


    @Getter(AccessLevel.PUBLIC) private static double classChineseAvg;
    @Getter(AccessLevel.PUBLIC) private static double classEnglishAvg;
    @Getter(AccessLevel.PUBLIC) private static double classMathAvg;

    public Student(String name) {
        this.name=name;
    }

    public Boolean setScore(int score ,String course){
        switch (course.toUpperCase()){
            default: return false;// Error input
            case "C": this.chinese = score;
            case "E": this.english = score;
            case "M": this.math = score;
        }
        return true;
    }

    public Double getScore(String course){
        switch (course.toUpperCase()){
            default: return null;// Error input
            case "C": return Double.valueOf(chinese);
            case "E": return Double.valueOf(english);
            case "M": return Double.valueOf(math);
            case "A": return getAvg();
        }
    }
    public Double getAvg(){
        return Double.valueOf((chinese+english+math)/3);
    }

    public Double getClassScore(String course){
        switch (course.toUpperCase()){
            default: {
                classChineseAvg += chinese;
                classEnglishAvg += english;
                classMathAvg += math;
                return 0D;
            }// Empty input
            case "C": {
                classChineseAvg=classChineseAvg/3;
                return classChineseAvg;
            }
            case "E": {
                classEnglishAvg=classEnglishAvg/3;
                return classEnglishAvg;
            }
            case "M": {
                classMathAvg=classMathAvg/3;
                return classMathAvg;
            }
        }
    }

    public String toString(){
        return "學生: " + name + " 國文: " + chinese + " 英文: " + english + " 數學: " + math + " 總分: " + (chinese+english+math) + " 平均: " + getAvg();
    }


}
