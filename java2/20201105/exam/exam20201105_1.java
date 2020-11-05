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

package exam;import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class exam20201105_1 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account name: ");
        String accoudnt = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Confirm password");
        if(scanner.nextLine().equals(password)){
            System.out.println("Account Created");
        }else {
            System.out.println("Password is different");
            return;
        }

        System.out.println("Enter account to Login: ");

        while (true){
            if(scanner.nextLine().equals(accoudnt)){
                System.out.println("Enter password: ");
                if (scanner.nextLine().equals(password)){
                    System.out.println("Welcome " + accoudnt);
                    return;
                }System.out.println("Wrong password");
            }else System.out.println("Unknown user");
        }


    }
}