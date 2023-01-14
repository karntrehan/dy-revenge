package p027c.p043d.p044a;

import android.media.MediaMuxer;
import android.os.ParcelFileDescriptor;
import androidx.core.util.C1170a;
import p027c.p043d.p044a.C1502a1;

/* renamed from: c.d.a.m */
public final /* synthetic */ class C1692m implements C1502a1.C1511i.C1512a {

    /* renamed from: a */
    public final /* synthetic */ C1721v0 f5090a;

    /* renamed from: b */
    public final /* synthetic */ ParcelFileDescriptor f5091b;

    public /* synthetic */ C1692m(C1721v0 v0Var, ParcelFileDescriptor parcelFileDescriptor) {
        this.f5090a = v0Var;
        this.f5091b = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final MediaMuxer mo5621a(int i, C1170a aVar) {
        return C1502a1.C1511i.m6768W(this.f5090a, this.f5091b, i, aVar);
    }
}
