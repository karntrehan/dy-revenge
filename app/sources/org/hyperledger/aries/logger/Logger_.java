package org.hyperledger.aries.logger;

import java.util.Arrays;
import p476go.Seq;

public final class Logger_ implements Seq.Proxy {
    private final int refnum;

    static {
        Logger.touch();
    }

    public Logger_() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    Logger_(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Logger_)) {
            return false;
        }
        Logger_ logger_ = (Logger_) obj;
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
        return "Logger_" + "{" + "}";
    }
}
