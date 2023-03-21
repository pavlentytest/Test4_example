import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Picture();
        products[1] = new Shoe();


    }
}
class Product {

}

class Picture extends Product {

}
class Shoe extends Product {

}

class A implements Iterable<Integer> {
    ArrayList<Integer> a = new ArrayList<>();

    void add(Integer e) {
        a.add(e);
    }

    @Override
    public Iterator<Integer> iterator() {
        return a.iterator();
    }
}