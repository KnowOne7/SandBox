package FAANG;

import java.util.Stack;

class ImplQuewithStacks {

    Stack<Integer> in;
    Stack<Integer> out;

    public ImplQuewithStacks() {
        this.in = new Stack<>();
        this.out = new Stack<>();

    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if(out.isEmpty())
            while(!in.isEmpty())
                out.push(in.pop());

        return out.pop();


    }

    public int peek() {
        if (out.isEmpty())
            while (!in.isEmpty())
                out.push(in.pop());

        return out.peek();
    }

    public boolean empty() {
        return (out.isEmpty() && in.isEmpty());
    }


}