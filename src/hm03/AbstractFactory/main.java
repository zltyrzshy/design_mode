package hm03.AbstractFactory;

import hm03.AbstractFactory.factory.Connection;
import hm03.AbstractFactory.factory.Factory;
import hm03.AbstractFactory.factory.Statement;


public class main {
    public static void main(String args[]){
        Factory factory =Factory.getFactory(args[0]);
        Statement statement =factory.createStatement();
        statement.getStatement();
        statement.getStatement();
        Connection connection = factory.createConnection();
        connection.getConnection();
        connection.getConnection();
    }
}
