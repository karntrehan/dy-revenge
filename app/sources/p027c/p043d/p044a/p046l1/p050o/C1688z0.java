package p027c.p043d.p044a.p046l1.p050o;

import android.media.MediaCodec;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.d.a.l1.o.z0 */
class C1688z0 implements C1686y0 {

    /* renamed from: a */
    private final MediaCodec f5080a;

    /* renamed from: b */
    private final int f5081b;

    /* renamed from: c */
    private final ByteBuffer f5082c;

    /* renamed from: d */
    private final C9172b<Void> f5083d;

    /* renamed from: e */
    private final C1814b.C1815a<Void> f5084e;

    /* renamed from: f */
    private final AtomicBoolean f5085f = new AtomicBoolean(false);

    /* renamed from: g */
    private long f5086g = 0;

    /* renamed from: h */
    private boolean f5087h = false;

    C1688z0(MediaCodec mediaCodec, int i) {
        this.f5080a = (MediaCodec) C1177h.m4583e(mediaCodec);
        this.f5081b = C1177h.m4582d(i);
        this.f5082c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.f5083d = C1814b.m7736a(new C1640j0(atomicReference));
        this.f5084e = (C1814b.C1815a) C1177h.m4583e((C1814b.C1815a) atomicReference.get());
    }

    /* renamed from: f */
    private void m7297f() {
        if (this.f5085f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    /* renamed from: a */
    public C9172b<Void> mo5911a() {
        return C0768f.m3083i(this.f5083d);
    }

    /* renamed from: b */
    public void mo5912b(boolean z) {
        m7297f();
        this.f5087h = z;
    }

    /* renamed from: c */
    public boolean mo5913c() {
        if (this.f5085f.getAndSet(true)) {
            return false;
        }
        try {
            this.f5080a.queueInputBuffer(this.f5081b, this.f5082c.position(), this.f5082c.limit(), this.f5086g, this.f5087h ? 4 : 0);
            this.f5084e.mo6308c(null);
            return true;
        } catch (IllegalStateException e) {
            this.f5084e.mo6310f(e);
            return false;
        }
    }

    public boolean cancel() {
        if (this.f5085f.getAndSet(true)) {
            return false;
        }
        try {
            this.f5080a.queueInputBuffer(this.f5081b, 0, 0, 0, 0);
            this.f5084e.mo6308c(null);
        } catch (IllegalStateException e) {
            this.f5084e.mo6310f(e);
        }
        return true;
    }

    /* renamed from: d */
    public void mo5915d(long j) {
        m7297f();
        C1177h.m4579a(j >= 0);
        this.f5086g = j;
    }

    /* renamed from: g */
    public ByteBuffer mo5916g() {
        m7297f();
        return this.f5082c;
    }
}
