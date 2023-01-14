package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.play.core.assetpacks.z1 */
final /* synthetic */ class C4454z1 implements FilenameFilter {

    /* renamed from: a */
    static final FilenameFilter f12730a = new C4454z1();

    private C4454z1() {
    }

    public final boolean accept(File file, String str) {
        return C4358a2.f12387a.matcher(str).matches();
    }
}
