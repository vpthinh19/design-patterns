package creational.factory.abstraction.example.store;

import creational.factory.abstraction.example.chair.Chair;
import creational.factory.abstraction.example.chair.RedChair;
import creational.factory.abstraction.example.table.RedTable;
import creational.factory.abstraction.example.table.Table;

public class RedStore implements Store{
    @Override
    public Table createTable() {
        return new RedTable();
    }

    @Override
    public Chair createChair() {
        return new RedChair();
    }
}
