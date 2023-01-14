package org.hyperledger.aries.api;

public interface Iterator {
    void close();

    String key();

    boolean next();

    byte[] tags();

    byte[] value();
}
