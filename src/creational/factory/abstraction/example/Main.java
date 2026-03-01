package creational.factory.abstraction.example;

import creational.factory.abstraction.example.chair.Chair;
import creational.factory.abstraction.example.store.BlueStore;
import creational.factory.abstraction.example.store.RedStore;
import creational.factory.abstraction.example.store.Store;
import creational.factory.abstraction.example.table.Table;

public class Main {
    static void main() {
        Store blueStore = new BlueStore();
        Table table1 = blueStore.createTable();
        Chair chair1 = blueStore.createChair();
        table1.print();
        chair1.print();

        Store redStore = new RedStore();
        Table table2 = redStore.createTable();
        Chair chair2 = redStore.createChair();
        table2.print();
        chair2.print();
    }
}
