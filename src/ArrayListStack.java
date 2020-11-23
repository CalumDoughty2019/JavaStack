import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<E> implements StackADT<E> {

    private List<E> data;
    private int top;

    public ArrayListStack(){
        data =new ArrayList<>();
        //top = -1;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            return null;
        }
        return data.remove(data.size()-1);
    }

    @Override
    public E top() {
        if(isEmpty()){
            return null;
        }
        return data.get(data.size()-1);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void push(E element) {
        data.add(element);
    }
}
