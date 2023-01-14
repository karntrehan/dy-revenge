package org.hyperledger.aries.rest;

import java.util.Arrays;
import p476go.Seq;

public final class Incoming implements Seq.Proxy {
    private final int refnum;

    static {
        Rest.touch();
    }

    public Incoming() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    Incoming(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Incoming)) {
            return false;
        }
        Incoming incoming = (Incoming) obj;
        String id = getID();
        String id2 = incoming.getID();
        if (id == null) {
            if (id2 != null) {
                return false;
            }
        } else if (!id.equals(id2)) {
            return false;
        }
        String topic = getTopic();
        String topic2 = incoming.getTopic();
        return topic == null ? topic2 == null : topic.equals(topic2);
    }

    public final native String getID();

    public final native String getTopic();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getID(), getTopic()});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setID(String str);

    public final native void setTopic(String str);

    public String toString() {
        return "Incoming" + "{" + "ID:" + getID() + "," + "Topic:" + getTopic() + "," + "}";
    }
}
