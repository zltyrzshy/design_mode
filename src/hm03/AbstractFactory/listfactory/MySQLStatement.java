package hm03.AbstractFactory.listfactory;

import hm03.AbstractFactory.factory.Statement;

public class MySQLStatement extends Statement {
    @Override
    public void makeStatement() {
        System.out.println("you have made a"+this.getClass().getSimpleName());
    }

    @Override
    public void getStatement() {
        System.out.println("you have got a"+this.getClass().getSimpleName());
    }
}
