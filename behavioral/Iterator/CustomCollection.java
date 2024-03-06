package behavioral.Iterator;

public class CustomCollection<T> implements Collection {

    private T[] elements;
    public CustomCollection(T[] elements) {
        this.elements = elements;
    }

    public T get(int index) {
        return elements[index];
    }

    public int size() {
        return elements.length;
    }

    @Override
    public Iterator<T> createIterator() {
        return new CustomIterator<>(this);
    }
}
