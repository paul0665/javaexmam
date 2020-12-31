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

import lib.Object3D;
import lib.ReturnFun;

public class main {
    public static void main(String[] stg){
        Object3D object3D = new Object3D();
        ReturnFun returnFun = new ReturnFun();
        System.out.println(object3D.volume(4.3,9.3));
        System.out.println(object3D.volume(4.8,7.6,5.9,4.7));
        System.out.println(object3D.volume(5.7,4.5,3.3));
        System.out.println(object3D.volume(6,9,10));
        System.out.println(object3D.volume(3,8,9,2,-5,-3));
        System.out.println("---------------");
        System.out.println(returnFun.fx(11));
        System.out.println(returnFun.fn(19));
        System.out.println(returnFun.fp(7.2,5));
        System.out.println(returnFun.fp(7.2,-5));
    }
}
