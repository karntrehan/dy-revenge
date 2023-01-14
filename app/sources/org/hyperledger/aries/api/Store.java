package org.hyperledger.aries.api;

public interface Store {
    void batch(byte[] bArr);

    void close();

    void delete(String str);

    void flush();

    byte[] get(String str);

    byte[] getBulk(byte[] bArr);

    byte[] getTags(String str);

    void put(String str, byte[] bArr, byte[] bArr2);

    Iterator query(String str, long j);
}
