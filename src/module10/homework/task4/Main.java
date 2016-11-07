package module10.homework.task4;


public class Main {

    public static void main(String[] args) {
        ExceptionsInvolvingEachOther exceptionsInvolvingEachOther = new ExceptionsInvolvingEachOther();

        System.out.println("f() is involved:");
        exceptionsInvolvingEachOther.f();

        System.out.println("\ng() is involved:");
        exceptionsInvolvingEachOther.g();
    }

}
