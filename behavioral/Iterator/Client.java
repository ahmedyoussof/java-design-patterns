package behavioral.Iterator;

public class Client {

    public static void main(String[] args) {
        CustomCollection<String> collection = new CustomCollection<>(new String[]{"a", "b", "c", "d", "e"});
        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
