package creational.factory.abstraction.example.store;

import creational.factory.abstraction.example.chair.BlueChair;
import creational.factory.abstraction.example.chair.Chair;
import creational.factory.abstraction.example.table.BlueTable;
import creational.factory.abstraction.example.table.Table;

public class BlueStore implements Store{
    @Override
    public Table createTable() {
        return new BlueTable();
    }

    @Override
    public Chair createChair() {
        return new BlueChair();
    }
}
