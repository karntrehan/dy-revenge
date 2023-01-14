package androidx.camera.camera2.p003e;

import androidx.camera.camera2.p003e.C0517p2;
import androidx.camera.core.impl.C0836l2;
import androidx.camera.core.impl.C0855o2;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.d2 */
public class C0342d2 implements C0836l2 {

    /* renamed from: a */
    private final C0517p2 f1401a;

    /* renamed from: b */
    private final List<C0855o2> f1402b;

    /* renamed from: c */
    private volatile boolean f1403c = false;

    public C0342d2(C0517p2 p2Var, List<C0855o2> list) {
        boolean z = false;
        z = p2Var.f1676l == C0517p2.C0521d.OPENED ? true : z;
        C1177h.m4580b(z, "CaptureSession state must be OPENED. Current state:" + p2Var.f1676l);
        this.f1401a = p2Var;
        this.f1402b = Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public void mo1990a() {
        this.f1403c = true;
    }
}
