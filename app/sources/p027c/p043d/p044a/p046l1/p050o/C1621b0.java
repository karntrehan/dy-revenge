package p027c.p043d.p044a.p046l1.p050o;

import android.media.MediaCodec;
import p027c.p043d.p044a.p046l1.p050o.C1675x0;

/* renamed from: c.d.a.l1.o.b0 */
public final /* synthetic */ class C1621b0 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C1675x0.C1682f f4931f;

    /* renamed from: o */
    public final /* synthetic */ MediaCodec.BufferInfo f4932o;

    /* renamed from: p */
    public final /* synthetic */ MediaCodec f4933p;

    /* renamed from: q */
    public final /* synthetic */ int f4934q;

    public /* synthetic */ C1621b0(C1675x0.C1682f fVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.f4931f = fVar;
        this.f4932o = bufferInfo;
        this.f4933p = mediaCodec;
        this.f4934q = i;
    }

    public final void run() {
        this.f4931f.mo5902h(this.f4932o, this.f4933p, this.f4934q);
    }
}
