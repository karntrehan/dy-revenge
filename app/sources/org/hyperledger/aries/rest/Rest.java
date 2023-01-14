package org.hyperledger.aries.rest;

import org.hyperledger.aries.api.Api;
import org.hyperledger.aries.config.Config;
import org.hyperledger.aries.config.Options;
import org.hyperledger.aries.models.Models;
import p476go.Seq;

public abstract class Rest {
    static {
        Seq.touch();
        Api.touch();
        Config.touch();
        Models.touch();
        _init();
    }

    private Rest() {
    }

    private static native void _init();

    public static native Aries newAries(Options options);

    public static void touch() {
    }
}
