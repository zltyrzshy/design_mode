package hm03.AbstractFactory.listfactory;

import hm03.AbstractFactory.factory.Connection;

public class OracleConnection extends Connection {
    @Override
    public void makeConnection() {
        System.out.println("you have made a"+this.getClass().getSimpleName());
    }

    @Override
    public void getConnection() {
        System.out.println("you have got a"+this.getClass().getSimpleName());
    }
}
