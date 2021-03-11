package lib;/*
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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class BMI {
    private int height;
    private int weight;
    @Getter(AccessLevel.PUBLIC) private double bmi;
    @Setter(AccessLevel.PUBLIC) @Getter(AccessLevel.PUBLIC) private String name;



    public void show(){
        System.out.println(name + " Status:");
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("BMI: " + bmi);
        System.out.println();
    }

    public void cau(){
        bmi = ((double)weight/(Math.pow((double)height/100,2)));
    }

    public Boolean setData(char course,int data){
        switch (course){
            default: return false;// Error input
            case 'H': this.height = data;
            case 'W': this.weight = data;
        }
        return true;
    }

    public void setHW(int height,int weight){
        this.height = height;
        this.weight = weight;
    }

    public String compare(BMI com){
        if(com.getBmi()==bmi)
            return "Both";
        if(com.getBmi()>bmi)
            return com.getName();
        if(com.getBmi()<bmi)
            return name;
        return null;
    }
}
