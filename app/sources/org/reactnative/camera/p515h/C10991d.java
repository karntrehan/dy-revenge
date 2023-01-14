package org.reactnative.camera.p515h;

import android.content.Context;
import java.io.File;

/* renamed from: org.reactnative.camera.h.d */
public class C10991d {

    /* renamed from: a */
    private File f28811a = null;

    public C10991d(Context context) {
        mo29003a(context);
    }

    /* renamed from: a */
    public void mo29003a(Context context) {
        this.f28811a = new File(context.getCacheDir() + "/Camera/");
    }

    /* renamed from: b */
    public File mo29004b() {
        return this.f28811a;
    }
}
