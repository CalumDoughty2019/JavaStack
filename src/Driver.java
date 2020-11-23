import java.util.NoSuchElementException;

public class Driver {

    private static StackADT<Integer> arrayStack = new ArrayStack<>();
    private static StackADT<Integer> arrayListStack = new ArrayListStack<>();
    private static StackADT<Integer> linkedListStack = new LinkedListStack<>();

    public static void main(String[] args){
        System.out.println("ArrayStack Popped: " + arrayStack.pop());
        arrayStack.push(1);
        System.out.println("ArrayStack Popped: " + arrayStack.pop());
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        System.out.println("ArrayStack Popped: " + arrayStack.pop());
        System.out.println("ArrayStack Topped: " + arrayStack.top());
        //
        try {
            arrayStack.push(1);
            arrayStack.push(2);
            arrayStack.push(3);
            arrayStack.push(1);
            arrayStack.push(2);
            arrayStack.push(3);
        }catch(IllegalStateException e){
            System.out.println("Stack is Full");
        }


        System.out.println();
        System.out.println("ArrayListStack Popped: " + arrayListStack.pop());
        arrayListStack.push(1);
        System.out.println("ArrayListStack Popped: " + arrayListStack.pop());
        arrayListStack.push(1);
        arrayListStack.push(2);
        arrayListStack.push(3);
        System.out.println("ArrayListStack Popped: " + arrayListStack.pop());
        System.out.println("ArrayListStack Topped: " + arrayListStack.top());
        //arrayList expands dynamically //no Exception required
        arrayListStack.push(1);
        arrayListStack.push(2);
        arrayListStack.push(3);
        arrayListStack.push(1);
        arrayListStack.push(2);
        arrayListStack.push(3);


        System.out.println();
        try{
            System.out.println("ArrayListStack Popped: " + linkedListStack.pop());
        }catch(NoSuchElementException e){
            System.out.println("Stack is Empty");
        }
//        System.out.println("ArrayListStack Popped: " + linkedListStack.pop());
        linkedListStack.push(1);
        System.out.println("ArrayListStack Popped: " + linkedListStack.pop());
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println("ArrayListStack Popped: " + linkedListStack.pop());
        System.out.println("ArrayListStack Topped: " + linkedListStack.top());
        //arrayList expands dynamically //no Exception required
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(9);
        System.out.println("Size: " + linkedListStack.size());
        System.out.println("isEmpty: " + linkedListStack.isEmpty());
        System.out.println("Top: " + linkedListStack.top());
    }
}
