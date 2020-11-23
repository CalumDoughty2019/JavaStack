public interface StackADT<E> {
    public E pop();

    public E top();

    public int size();

    public boolean isEmpty();

    public void push(E element);


}
