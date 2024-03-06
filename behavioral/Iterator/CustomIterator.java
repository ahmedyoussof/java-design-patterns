package behavioral.Iterator;

public class CustomIterator<T> implements Iterator {

    private CustomCollection<T> collection;

    private int currentIndex = 0;

    public CustomIterator(CustomCollection<T> collection) {
        this.collection = collection;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < collection.size();
    }

    @Override
    public T next() {
        return collection.get(currentIndex++);
    }

}
