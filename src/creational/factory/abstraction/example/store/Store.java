package creational.factory.abstraction.example.store;

import creational.factory.abstraction.example.chair.Chair;
import creational.factory.abstraction.example.table.Table;

public interface Store {
    Table createTable();
    Chair createChair();
}

