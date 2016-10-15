package market;

public class Person {

    String _name;
    double _balance;

    static int storeIndex = 0;
    Product[] store = new Product[500];

    public Person(String personName, double personBalance) {
        _name = personName;
        _balance = personBalance;

    }

    public void inputStore(Product item) {
        store[storeIndex] = item;
        storeIndex++;
    }

    public String getName() {
        String name = _name;
        return name;
    }

    public double getBalance() {
        double balance = _balance;
        return balance;
    }

    public int getStoreIndex() {
        int index = storeIndex;
        return index;
    }
}
