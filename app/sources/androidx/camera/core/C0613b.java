package androidx.camera.core;

import android.media.ImageReader;
import androidx.camera.core.impl.C0889u1;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.b */
public final /* synthetic */ class C0613b implements ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ C0633d1 f1993a;

    /* renamed from: b */
    public final /* synthetic */ Executor f1994b;

    /* renamed from: c */
    public final /* synthetic */ C0889u1.C0890a f1995c;

    public /* synthetic */ C0613b(C0633d1 d1Var, Executor executor, C0889u1.C0890a aVar) {
        this.f1993a = d1Var;
        this.f1994b = executor;
        this.f1995c = aVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        this.f1993a.mo2645n(this.f1994b, this.f1995c, imageReader);
    }
}
