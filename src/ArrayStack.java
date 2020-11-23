public class ArrayStack<E> implements StackADT<E>{

    private E[] data;
    private int size;
    private int top;
    private static int capacity = 5;

    public ArrayStack(int capacity){
        data = (E[]) new Object[capacity];
        top = -1;
    }

    public ArrayStack(){
        this(capacity); //makes call to other constructor (above this), populates it with global variable
    }

    @Override
    public E pop() {
        if(isEmpty()){
            return null;
        }
        E elementToReturn = data[top]; //hold value at top
        data[top] = null; //data value at top to null //remove it
        top--; //decrement the top by 1 //we have now reduced size

        return elementToReturn;
    }

    @Override
    public E top() {
        if(isEmpty()){
            return null;
        }
        return data[top];
    }

    @Override
    public int size() {
        return top+1; //points to index of last item in there
    }

    @Override
    public boolean isEmpty() { //if true we know its empty
        return top == -1;
        //return false;
    }

    @Override
    public void push(E element) throws IllegalStateException{ //EX: when number of objects in the array meets the capacity of the array
        if(size() == data.length){
            throw new IllegalStateException("Stack is Full");
        }
        data[++top] = element; //++top does increment before being used in this statement
    }
}
