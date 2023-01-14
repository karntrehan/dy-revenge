package p027c.p043d.p044a.p046l1.p050o;

import android.media.MediaCodec;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.d.a.l1.o.q0 */
public class C1659q0 implements C1657p0 {

    /* renamed from: f */
    private final MediaCodec f5002f;

    /* renamed from: o */
    private final MediaCodec.BufferInfo f5003o;

    /* renamed from: p */
    private final int f5004p;

    /* renamed from: q */
    private final ByteBuffer f5005q;

    /* renamed from: r */
    private final C9172b<Void> f5006r;

    /* renamed from: s */
    private final C1814b.C1815a<Void> f5007s;

    /* renamed from: t */
    private final AtomicBoolean f5008t = new AtomicBoolean(false);

    C1659q0(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.f5002f = (MediaCodec) C1177h.m4583e(mediaCodec);
        this.f5004p = i;
        this.f5005q = mediaCodec.getOutputBuffer(i);
        this.f5003o = (MediaCodec.BufferInfo) C1177h.m4583e(bufferInfo);
        AtomicReference atomicReference = new AtomicReference();
        this.f5006r = C1814b.m7736a(new C1620b(atomicReference));
        this.f5007s = (C1814b.C1815a) C1177h.m4583e((C1814b.C1815a) atomicReference.get());
    }

    /* renamed from: h */
    private void m7163h() {
        if (this.f5008t.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    /* renamed from: F */
    public MediaCodec.BufferInfo mo5846F() {
        return this.f5003o;
    }

    /* renamed from: H */
    public boolean mo5847H() {
        return (this.f5003o.flags & 1) != 0;
    }

    /* renamed from: a */
    public C9172b<Void> mo5852a() {
        return C0768f.m3083i(this.f5006r);
    }

    /* renamed from: a0 */
    public long mo5848a0() {
        return this.f5003o.presentationTimeUs;
    }

    public void close() {
        if (!this.f5008t.getAndSet(true)) {
            try {
                this.f5002f.releaseOutputBuffer(this.f5004p, false);
                this.f5007s.mo6308c(null);
            } catch (IllegalStateException e) {
                this.f5007s.mo6310f(e);
            }
        }
    }

    /* renamed from: g */
    public ByteBuffer mo5850g() {
        m7163h();
        this.f5005q.position(this.f5003o.offset);
        ByteBuffer byteBuffer = this.f5005q;
        MediaCodec.BufferInfo bufferInfo = this.f5003o;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f5005q;
    }

    public long size() {
        return (long) this.f5003o.size;
    }
}
