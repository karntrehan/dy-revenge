package org.reactnative.camera.p515h;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: org.reactnative.camera.h.c */
public class C10990c {
    /* renamed from: a */
    public static File m37292a(File file) {
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        throw new IOException("Couldn't create directory '" + file + "'");
    }

    /* renamed from: b */
    public static String m37293b(File file, String str) {
        m37292a(file);
        String uuid = UUID.randomUUID().toString();
        return file + File.separator + uuid + str;
    }

    /* renamed from: c */
    public static Uri m37294c(File file) {
        return Uri.fromFile(file);
    }
}
