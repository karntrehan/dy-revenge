package org.hyperledger.aries.logger;

import org.hyperledger.aries.api.Api;
import org.hyperledger.aries.api.LoggerProvider;
import p476go.Seq;

public abstract class Logger {
    static {
        Seq.touch();
        Api.touch();
        _init();
    }

    private Logger() {
    }

    private static native void _init();

    public static native Logger_ new_(LoggerProvider loggerProvider);

    public static void touch() {
    }
}
