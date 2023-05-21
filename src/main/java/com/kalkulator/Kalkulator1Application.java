package com.kalkulator;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;


public class Kalkulator1Application {

	public static void main(String[] args) {

        Silnik silnik = new Silnik();

        System.out.println(silnik.dodawanie());
	}

}

class Silnik {

    int a=5,b=10;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int dodawanie() {

        return a+b;

    }
    public int dodejmowanie() {

       return a-b;

    }
}
