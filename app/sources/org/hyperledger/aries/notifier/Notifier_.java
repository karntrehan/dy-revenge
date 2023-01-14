package org.hyperledger.aries.notifier;

import java.util.Arrays;
import p476go.Seq;

public final class Notifier_ implements Seq.Proxy {
    private final int refnum;

    static {
        Notifier.touch();
    }

    Notifier_(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Notifier_)) {
            return false;
        }
        Notifier_ notifier_ = (Notifier_) obj;
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native void notify(String str, byte[] bArr);

    public String toString() {
        return "Notifier_" + "{" + "}";
    }
}
