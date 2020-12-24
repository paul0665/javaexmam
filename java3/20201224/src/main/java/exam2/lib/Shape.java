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

package exam2.lib;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.PrintStream;

public class Shape {
    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC) private int Bottom;
    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC) private int Height;
    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC) private double Perimeter;
    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC) private double Area;

    public void show(PrintStream stream) {
        stream.println("Bottom: " + getBottom());
        stream.println("Height: " + getHeight());

    }
}
