package hm03.AbstractFactory.listfactory;

import hm03.AbstractFactory.factory.Connection;
import hm03.AbstractFactory.factory.Factory;
import hm03.AbstractFactory.factory.Statement;

public class MySQL extends Factory {

    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }

    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }
}
