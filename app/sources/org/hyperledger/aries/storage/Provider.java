package org.hyperledger.aries.storage;

import java.util.Arrays;
import p476go.Seq;

public final class Provider implements Seq.Proxy {
    private final int refnum;

    static {
        Storage.touch();
    }

    public Provider() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    Provider(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native void close();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Provider)) {
            return false;
        }
        Provider provider = (Provider) obj;
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public String toString() {
        return "Provider" + "{" + "}";
    }
}
