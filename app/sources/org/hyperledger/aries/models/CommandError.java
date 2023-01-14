package org.hyperledger.aries.models;

import java.util.Arrays;
import p476go.Seq;

public final class CommandError implements Seq.Proxy {
    private final int refnum;

    static {
        Models.touch();
    }

    public CommandError() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    CommandError(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CommandError)) {
            return false;
        }
        CommandError commandError = (CommandError) obj;
        String message = getMessage();
        String message2 = commandError.getMessage();
        if (message == null) {
            if (message2 != null) {
                return false;
            }
        } else if (!message.equals(message2)) {
            return false;
        }
        return getCode() == commandError.getCode() && getType() == commandError.getType();
    }

    public final native long getCode();

    public final native String getMessage();

    public final native long getType();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getMessage(), Long.valueOf(getCode()), Long.valueOf(getType())});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setCode(long j);

    public final native void setMessage(String str);

    public final native void setType(long j);

    public String toString() {
        return "CommandError" + "{" + "Message:" + getMessage() + "," + "Code:" + getCode() + "," + "Type:" + getType() + "," + "}";
    }
}
