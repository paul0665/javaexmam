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
import java.util.List;

public class StudentX {

    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC) private String Name;
    private int DataBase;
    private int DataStructure;
    private int Java;
    @Getter(AccessLevel.PUBLIC) private int Total;
    private double Average;

    public StudentX(String name){
        this(name,60,60,60);
    }

    public StudentX(int database, int dataStructure, int java){
        this(null, database, dataStructure, java);
    }

    public StudentX(String name, int database, int dataStructure, int java){
        build(name, database, dataStructure, java);
    }

    private void build(String name, int database, int dataStructure, int java){
        this.Name = name;
        this.DataBase = database;
        this.DataStructure = dataStructure;
        this.Java = java;
        this.Total = (database+dataStructure+java);
        this.Average = ((database+dataStructure+java)/3);
    }
    //--------------main fun
    public void show(PrintStream printStream){
        String outString = "學生 %student%的資料庫%db%分,資料結構%ds%分,Java%java%分,總分%total%分,平均%avg%分";
        outString = outString.replace("%student%",Name);
        outString = outString.replace("%db%",String.valueOf(DataBase));
        outString = outString.replace("%ds%",String.valueOf(DataStructure));
        outString = outString.replace("%java%",String.valueOf(Java));

        outString = outString.replace("%total%",String.valueOf(Total));
        outString = outString.replace("%avg%",String.valueOf(Average));
        if(Average>=60)
            outString+= " 學期及格";
        else
            outString+= " 學期不及格";
        printStream.println(outString + "\n");
    }

    public void toCompare(StudentX compareStudent,PrintStream printStream){
        printStream.println(getName() + "與" + compareStudent.getName() + "相差" + Math.abs((compareStudent.getTotal()-getTotal())) + "分");
    }

    public static String Rank(StudentX s1,StudentX s2,StudentX s3){
        int temp = Math.max(Math.max(s1.getTotal(),s2.getTotal()),s3.getTotal());
        if(s1.getTotal()==temp)
            return s1.getName();
        if(s2.getTotal()==temp)
            return s2.getName();
        return s3.getName();
    }
}
