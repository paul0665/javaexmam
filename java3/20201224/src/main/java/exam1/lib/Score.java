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

package exam1.lib;import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.PrintStream;

public class Score {
    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC) private String Name;
    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC) private int Chinese;
    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC) private int English;
    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC) private int Math;

    public void set3Score(int chinese,int english,int math) {
        setChinese(chinese);
        setEnglish(english);
        setMath(math);
    }
    public Boolean set1Score(int score ,String course){
        switch (course.toUpperCase()){
            default: return false;// Error input
            case "C": setChinese(score);
            case "E": setEnglish(score);
            case "M": setMath(score);
        }
        return true;
    }

    public Double getAvg(){
        return Double.valueOf((getChinese()+getEnglish()+getMath())/3);
    }
    public void show(PrintStream stream){
        stream.println("Name: " + getName());
        stream.println("Chinese: " + getChinese());
        stream.println("English: " + getEnglish());
        stream.println("Math: " + getMath());
        stream.println("Avg: " + getAvg());
        stream.println();
    }

    public String compare(Score compareScoreClass,String course){
        switch (course.toUpperCase()){
            default: return null;//if failed
            case "C": {
                if(compareScoreClass.getChinese()>getChinese())
                    return compareScoreClass.getName() + " Win.";
                if(compareScoreClass.getChinese()<getChinese())
                    return getName() + " Win.";
                if (compareScoreClass.getChinese()==getChinese()){
                    if (getChinese()>=60)
                        return "Both Win.";
                    else
                        return "Both Lose.";
                }
            }

            case "E": {
                if(compareScoreClass.getEnglish()>getEnglish())
                    return compareScoreClass.getName() + " Win.";
                if(compareScoreClass.getEnglish()<getEnglish())
                    return getName() + " Win.";
                if (compareScoreClass.getEnglish()==getEnglish()){
                    if (getEnglish()>=60)
                        return "Both Win.";
                    else
                        return "Both Lose.";
                }
            }

            case "M": {
                if(compareScoreClass.getMath()>getMath())
                    return compareScoreClass.getName() + " Win.";
                if(compareScoreClass.getMath()<getMath())
                    return getName() + " Win.";
                if (compareScoreClass.getMath()==getMath()) {
                    if (getMath() >= 60)
                        return "Both Win.";
                    else
                        return "Both Lose.";
                }
            }
        }
        return null;//if failed
    }

}
