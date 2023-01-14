package org.hyperledger.aries.config;

import org.hyperledger.aries.api.Api;
import p476go.Seq;

public abstract class Config {
    static {
        Seq.touch();
        Api.touch();
        _init();
    }

    private Config() {
    }

    private static native void _init();

    public static native Options new_();

    public static void touch() {
    }
}
