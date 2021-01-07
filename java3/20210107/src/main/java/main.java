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

import lib.Student;
import lib.StudentX;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] stg){
        System.out.println("-------- 1 --------");
        Student student_1 = new Student("Robert");
        student_1.show(System.out);

        Student student_2 = new Student("Jack",88,73,63);
        student_2.show(System.out);

        Student student_3 = new Student(64,53,47);
        student_3.setName("Jennifer");
        student_3.show(System.out);

        System.out.println("-------- 2 --------");

        StudentX studentx_1 = new StudentX("Robert");
        studentx_1.show(System.out);

        StudentX studentx_2 = new StudentX("Jack",88,73,63);
        studentx_2.show(System.out);

        StudentX studentx_3 = new StudentX(64,53,47);
        studentx_3.setName("Jennifer");
        studentx_3.show(System.out);

        System.out.println("最高分為" + StudentX.Rank(studentx_1,studentx_2,studentx_3));

        List<StudentX> studentXList =new ArrayList<>();
        studentXList.add(studentx_1);
        studentXList.add(studentx_2);
        studentXList.add(studentx_3);

        System.out.println();
        studentx_1.toCompare(studentx_2,System.out);
        studentx_1.toCompare(studentx_3,System.out);
        System.out.println();
        studentx_2.toCompare(studentx_1,System.out);
        studentx_2.toCompare(studentx_3,System.out);
        System.out.println();
        studentx_3.toCompare(studentx_1,System.out);
        studentx_3.toCompare(studentx_2,System.out);
        System.out.println();

        for(int i=1;i<=3;i++){
            StudentX max = getMax(studentXList);
            System.out.println("第" + i + "名 " + max.getName() + " 總分為 " + max.getTotal());
            studentXList.remove(max);
        }



    }

    private static StudentX getMax(List<StudentX> studentXList){
        StudentX max = studentXList.get(0);
        for (StudentX stuff :studentXList)
            if(stuff.getTotal()>max.getTotal())
                max= stuff;
        return max;
    }
}
