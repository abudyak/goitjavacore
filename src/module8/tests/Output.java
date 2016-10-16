package module8.tests;


public class Output {

    public static void main(String[] args) {
        GenericStack<String> gs = new GenericStack<String>();
        gs.push("Hello");
        System.out.println(gs);
        System.out.println(gs.pop());
        System.out.println(gs);


        GenericStack<Integer> gsInteger = new GenericStack<Integer>();
        gsInteger.push(36);
        System.out.println("\n" + gsInteger);
        System.out.println(gsInteger.pop());
        System.out.println(gsInteger);


        GenericStack<String> gsStr = new GenericStack<String>();
        gsStr.push("Hello");
        System.out.print(gsStr.pop() + " ");
        GenericStack<Integer> gsInt = new GenericStack<Integer>();
        gsInt.push(36);
        System.out.println(gsInt.pop());

        GenericStack<String> gsString = new GenericStack<String>();
        gsString.push("Hello");
        System.out.print(gsString.pop() + " ");
       // gsString = new GenericStack<Integer>(); Compilation error
        gsInteger.push(36);
        System.out.println(gsInteger.pop());


    }
}
