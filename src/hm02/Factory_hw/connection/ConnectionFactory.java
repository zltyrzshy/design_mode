package hm02.Factory_hw.connection;

import hm02.Factory_hw.framework.Factory;
import hm02.Factory_hw.framework.Product;

public class ConnectionFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new Connection(owner);
    }

    @Override
    protected void registerProduct(Product product) {

    }
}
