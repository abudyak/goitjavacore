package module10.homework.task4;


import module10.homework.task2.MyOwnException;

public class ExceptionsInvolvingEachOther {

    /*
    Create a class with two methods, f( ) and g( ).
    In g( ), throw an exception of a new type that you define.
    In f( ), call g( ), catch its exception and, in the catch clause,
    throw a different exception (of a second type that you define).
    Test your code in main( ).
    */

    public void f() {
        try {
            g();
            throw new MyOwnException(" My exception from from f()");
        } catch (MyOwnException e) {
            e.printStoredString();
        }

    }

    public void g() {
        try {
            throw new MyOwnException("My exception from g()");
        } catch (MyOwnException e) {
            e.printStoredString();
        }
    }
}
