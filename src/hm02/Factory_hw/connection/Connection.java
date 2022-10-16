package hm02.Factory_hw.connection;

import hm02.Factory_hw.framework.Product;

public class Connection extends Product {
    private String protocol;

    Connection(String method) {
        this.protocol = method;
    }

    @Override
    public void use() {
        System.out.println("use " + protocol + " to get a Connection. ");
    }

    public String getProtocol() {
        return protocol;
    }
}
