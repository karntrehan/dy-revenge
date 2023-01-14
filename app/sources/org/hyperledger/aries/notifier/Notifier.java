package org.hyperledger.aries.notifier;

import p476go.Seq;

public abstract class Notifier {
    static {
        Seq.touch();
        _init();
    }

    private Notifier() {
    }

    private static native void _init();

    public static void touch() {
    }
}
