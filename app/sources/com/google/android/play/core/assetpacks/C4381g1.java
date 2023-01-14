package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.play.core.assetpacks.g1 */
final /* synthetic */ class C4381g1 implements FilenameFilter {

    /* renamed from: a */
    private final String f12448a;

    C4381g1(String str) {
        this.f12448a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f12448a).concat("-")) && str.endsWith(".apk");
    }
}
