package org.hyperledger.aries.api;

public interface Provider {
    void close();

    byte[] getStoreConfig(String str);

    Store openStore(String str);

    void setStoreConfig(String str, byte[] bArr);
}
