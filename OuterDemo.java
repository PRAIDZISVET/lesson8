package com.itacademy.lesson8;

public class OuterDemo {
    public static void main(String[] args) {
        Outer outer = new Outer("Test");
        //Outer.Inner inner = outer.new Inner (); // Создание экземпляра ВНУТРЕННЕГО КЛАССА
        Outer.Inner inner = new Outer.Inner(); // создание ВЛОЖЕННОГО КЛАССА (static)
        inner.print ();
    }

}
