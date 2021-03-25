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

import java.awt.*;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Student {
    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC) private String Name;
    @Getter(AccessLevel.PUBLIC) private int DB;
    @Getter(AccessLevel.PUBLIC) private int DS;
    @Getter(AccessLevel.PUBLIC) private int Java;
    @Getter(AccessLevel.PUBLIC) private int Total;
    @Getter(AccessLevel.PUBLIC) private double Avg;

    public Student(String name){
        this.Name = name;
        this.DB = 60;
        this.DS = 60;
        this.Java = 60;
        this.Total = DB+DS+Java;
        this.Avg = (double) Total/3;

    }

    public Student(int db,int ds,int java){
        this.DB = db;
        this.DS = ds;
        this.Java = java;
        this.Total = db+ds+java;
        this.Avg = (double) Total/3;
    }

    public Student(String name ,int db,int ds,int java){
        setName(name);
        this.DB = db;
        this.DS = ds;
        this.Java = java;
        this.Total = db+ds+java;
        this.Avg = (double) Total/3;
    }


    public void show(PrintStream stream){
        stream.println("Name: " + getName());
        stream.println("資料庫: " + DB);
        stream.println("資料結構: " + DS);
        stream.println("Java: " + Java);
        stream.println("Total: " + Total);
        stream.println("Avg: " + (double)(DB+DS+Java)/3);
        stream.print("學期是否及格: " );
        if ((double)(DB+DS+Java)/3<60)
            stream.println("否" );
        else
            stream.println("是" );
        stream.println();
    }

    public void toCompare(PrintStream stream ,Student compareScoreClass){
        stream.println(Name + "與" + compareScoreClass.Name + "相差" + Math.abs(Total-compareScoreClass.Total));
    }

    public String Rank(Student s1,Student s2,Student s3){
        List<Student> Students = new ArrayList();
        Students.add(s1);
        Students.add(s2);
        Students.add(s3);
        Student temp = s1;
        for (Student s: Students){
            if (s.Avg>temp.Avg)
                temp=s;
        }
        return "最高分為" + temp.Name;
    }

}
