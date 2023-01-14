package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p174e.p319f.p320a.p382e.p383a.p385b.C9146y;

/* renamed from: com.google.android.play.core.assetpacks.a2 */
final class C4358a2 {

    /* renamed from: a */
    private static final Pattern f12387a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* renamed from: a */
    static List<File> m16776a(File file, File file2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(C4454z1.f12730a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[r2];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new C4396k0("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    C4370d2 a = new C4368d0(fileInputStream).mo13831a();
                    if (a.mo13840d() != null) {
                        File file5 = new File(file, a.mo13840d());
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new C4396k0(String.format("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                        }
                    } else {
                        throw new C4396k0("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    C9146y.m30436a(th, th);
                }
            }
        }
        return arrayList;
        throw th;
    }
}
