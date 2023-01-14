package org.hyperledger.aries.notifier;

import java.util.Arrays;
import p476go.Seq;

public final class NotificationPayload implements Seq.Proxy {
    private final int refnum;

    static {
        Notifier.touch();
    }

    public NotificationPayload() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    NotificationPayload(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NotificationPayload)) {
            return false;
        }
        NotificationPayload notificationPayload = (NotificationPayload) obj;
        String topic = getTopic();
        String topic2 = notificationPayload.getTopic();
        if (topic == null) {
            if (topic2 != null) {
                return false;
            }
        } else if (!topic.equals(topic2)) {
            return false;
        }
        byte[] raw = getRaw();
        byte[] raw2 = notificationPayload.getRaw();
        return raw == null ? raw2 == null : raw.equals(raw2);
    }

    public final native byte[] getRaw();

    public final native String getTopic();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getTopic(), getRaw()});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setRaw(byte[] bArr);

    public final native void setTopic(String str);

    public String toString() {
        return "NotificationPayload" + "{" + "Topic:" + getTopic() + "," + "Raw:" + getRaw() + "," + "}";
    }
}
