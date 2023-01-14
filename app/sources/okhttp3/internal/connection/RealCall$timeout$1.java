package okhttp3.internal.connection;

import p493i.C10593d;

public final class RealCall$timeout$1 extends C10593d {
    final /* synthetic */ RealCall this$0;

    RealCall$timeout$1(RealCall realCall) {
        this.this$0 = realCall;
    }

    /* access modifiers changed from: protected */
    public void timedOut() {
        this.this$0.cancel();
    }
}
