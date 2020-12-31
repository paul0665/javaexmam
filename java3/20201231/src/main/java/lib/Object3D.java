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

public class Object3D {
    private final double pi = 3.14;

    public double volume(double r,double h){
        return (r*r)*3.14/3*h;
    }


    public double volume(double l,double w,double h){
        return w*l/3*h;
    }

    public double volume(double a,double b,double c,double h){
        double hs = (a+b+c)/2;
        double cone = Math.sqrt(hs*(hs-a)*(hs-b)*(hs-c));
        return cone*h/3;
    }

    public int volume(int l,int w,int h){
        return l*w*h;
    }

    public double volume(double x1,double y1,double z1,double x2,double y2,double z2){
        return Math.abs((x1-x2)*(y1-y2)*(z1-z2));
    }
}
