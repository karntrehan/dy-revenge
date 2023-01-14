package p027c.p043d.p044a;

import java.util.concurrent.TimeoutException;
import p027c.p061g.p062a.C1814b;

/* renamed from: c.d.a.y */
public final /* synthetic */ class C1726y implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C1814b.C1815a f5139f;

    public /* synthetic */ C1726y(C1814b.C1815a aVar) {
        this.f5139f = aVar;
    }

    public final void run() {
        this.f5139f.mo6310f(new TimeoutException("The source didn't become non-streaming."));
    }
}
