package p027c.p043d.p044a;

import java.util.concurrent.ScheduledFuture;

/* renamed from: c.d.a.d */
public final /* synthetic */ class C1520d implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ ScheduledFuture f4766f;

    public /* synthetic */ C1520d(ScheduledFuture scheduledFuture) {
        this.f4766f = scheduledFuture;
    }

    public final void run() {
        this.f4766f.cancel(true);
    }
}
