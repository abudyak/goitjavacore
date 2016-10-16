package module8.tests;

import java.util.*;

public class GenericStack<E> {

    Stack<E> stk = new Stack<E>();
    public void push(E obj) {
        stk.push(obj);
    }
    public E pop() {
        E obj = stk.pop();
        return obj;
    }

    @Override
    public String toString() {
        return "GenericStack{" +
                "stk=" + stk +
                '}';
    }
}
