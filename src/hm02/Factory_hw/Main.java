package hm02.Factory_hw;

import hm02.Factory_hw.connection.ConnectionFactory;
import hm02.Factory_hw.framework.Factory;

public class Main {
    public static final String[] protocols = {"IMAP", "HTTP", "POP3"};

    public static void main(String[] args) {
        Factory factory = new ConnectionFactory();
        for (String protocol : protocols) {
            factory.create(protocol).use();
        }
    }
}
