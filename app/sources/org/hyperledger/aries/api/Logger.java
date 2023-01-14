package org.hyperledger.aries.api;

public interface Logger {
    void debug(String str);

    void error(String str);

    void fatal(String str);

    void info(String str);

    void panic(String str);

    void warn(String str);
}
