package com.google.firebase.crashlytics.ndk;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.firebase.crashlytics.ndk.c */
public final /* synthetic */ class C4811c implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ C4811c f13553a = new C4811c();

    private /* synthetic */ C4811c() {
    }

    public final boolean accept(File file, String str) {
        return str.toLowerCase().endsWith(".apk");
    }
}
