package org.hyperledger.aries.models;

import p476go.Seq;

public abstract class Models {
    static {
        Seq.touch();
        _init();
    }

    private Models() {
    }

    private static native void _init();

    public static native RequestEnvelope newRequestEnvelope(byte[] bArr);

    public static native ResponseEnvelope newResponseEnvelope();

    public static void touch() {
    }
}
