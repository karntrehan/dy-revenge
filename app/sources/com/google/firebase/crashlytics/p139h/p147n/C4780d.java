package com.google.firebase.crashlytics.p139h.p147n;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.firebase.crashlytics.h.n.d */
public final /* synthetic */ class C4780d implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ C4780d f13458a = new C4780d();

    private /* synthetic */ C4780d() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("event");
    }
}
