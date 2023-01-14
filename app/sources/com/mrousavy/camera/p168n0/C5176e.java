package com.mrousavy.camera.p168n0;

import android.annotation.SuppressLint;
import androidx.camera.camera2.p008f.C0597i;
import androidx.camera.core.C0957q1;
import androidx.camera.core.C0965s1;
import java.util.ArrayList;
import java.util.List;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n0.e */
public final class C5176e {
    @SuppressLint({"UnsafeOptInUsageError"})
    /* renamed from: a */
    public static final C0965s1.C0966a m19451a(C0965s1.C0966a aVar, String str) {
        C10457l.m35320e(aVar, "<this>");
        C10457l.m35320e(str, "cameraId");
        C0965s1.C0966a a = aVar.mo3217a(new C5172a(str));
        C10457l.m35319d(a, "this.addCameraFilter { c…r false\n      }\n    }\n  }");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final List m19452b(String str, List list) {
        boolean z;
        C10457l.m35320e(str, "$cameraId");
        C10457l.m35320e(list, "cameras");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            try {
                C0597i b = C0597i.m2471b((C0957q1) next);
                C10457l.m35319d(b, "from(cameraInfoX)");
                z = C10457l.m35316a(b.mo2533e(), str);
            } catch (IllegalArgumentException unused) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
