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

public class main {
    static double classAvg;
    public static void main(String[] stg){
        Student student1 = new Student("Jack");
        Student student2 = new Student("Mary");
        Student student3 = new Student("John");
        student1.setScore(75,"C");
        student1.setScore(52,"E");
        student1.setScore(84,"M");
        student1.getClassScore("");

        student2.setScore(78,"C");
        student2.setScore(72,"E");
        student2.setScore(62,"M");
        student2.getClassScore("");

        student3.setScore(84,"C");
        student3.setScore(67,"E");
        student3.setScore(75,"M");
        student3.getClassScore("");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student1.getClassScore("C"));
        System.out.println(student1.getClassScore("E"));
        System.out.println(student1.getClassScore("M"));

        classAvg = ((Student.getClassChineseAvg()+Student.getClassMathAvg()+Student.getClassEnglishAvg())/3);
        System.out.println(classAvg);

    }
}
