package org.hyperledger.aries.storage;

import org.hyperledger.aries.api.Api;
import org.hyperledger.aries.api.Provider;
import p476go.Seq;

public abstract class Storage {
    static {
        Seq.touch();
        Api.touch();
        _init();
    }

    private Storage() {
    }

    private static native void _init();

    public static native Provider new_(Provider provider);

    public static void touch() {
    }
}
