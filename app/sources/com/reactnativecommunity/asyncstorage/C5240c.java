package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.reactnativecommunity.asyncstorage.c */
public class C5240c {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d A[SYNTHETIC, Splitter:B:18:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m19570a(java.io.FileInputStream r8, java.io.FileOutputStream r9) {
        /*
            r0 = 0
            java.nio.channels.FileChannel r8 = r8.getChannel()     // Catch:{ all -> 0x0029 }
            java.nio.channels.FileChannel r0 = r9.getChannel()     // Catch:{ all -> 0x0024 }
            r2 = 0
            long r4 = r8.size()     // Catch:{ all -> 0x0024 }
            r1 = r8
            r6 = r0
            r1.transferTo(r2, r4, r6)     // Catch:{ all -> 0x0024 }
            r8.close()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001c
            r0.close()
        L_0x001c:
            return
        L_0x001d:
            r8 = move-exception
            if (r0 == 0) goto L_0x0023
            r0.close()
        L_0x0023:
            throw r8
        L_0x0024:
            r9 = move-exception
            r7 = r0
            r0 = r8
            r8 = r7
            goto L_0x002b
        L_0x0029:
            r9 = move-exception
            r8 = r0
        L_0x002b:
            if (r0 == 0) goto L_0x0038
            r0.close()     // Catch:{ all -> 0x0031 }
            goto L_0x0038
        L_0x0031:
            r9 = move-exception
            if (r8 == 0) goto L_0x0037
            r8.close()
        L_0x0037:
            throw r9
        L_0x0038:
            if (r8 == 0) goto L_0x003d
            r8.close()
        L_0x003d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.asyncstorage.C5240c.m19570a(java.io.FileInputStream, java.io.FileOutputStream):void");
    }

    /* renamed from: b */
    private static ArrayList<File> m19571b(Context context) {
        ArrayList<File> arrayList = new ArrayList<>();
        try {
            File[] listFiles = context.getDatabasePath("noop").getParentFile().listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().startsWith("RKStorage-scoped-experience-") && !file.getName().endsWith("-journal")) {
                        arrayList.add(file);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: c */
    private static File m19572c(ArrayList<File> arrayList) {
        File file = null;
        if (arrayList.size() == 0) {
            return null;
        }
        long j = -1;
        Iterator<File> it = arrayList.iterator();
        while (it.hasNext()) {
            File next = it.next();
            long e = m19574e(next);
            if (e > j) {
                file = next;
                j = e;
            }
        }
        return file != null ? file : arrayList.get(0);
    }

    /* renamed from: d */
    private static long m19573d(File file) {
        try {
            return Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: e */
    private static long m19574e(File file) {
        try {
            return Build.VERSION.SDK_INT >= 26 ? m19573d(file) : file.lastModified();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: f */
    private static boolean m19575f(Context context) {
        return context.getDatabasePath("RKStorage").exists();
    }

    /* renamed from: g */
    public static void m19576g(Context context) {
        String str;
        if (!m19575f(context)) {
            ArrayList<File> b = m19571b(context);
            File c = m19572c(b);
            if (c == null) {
                Log.v("AsyncStorageExpoMigration", "No scoped database found");
                return;
            }
            try {
                C5243f.m19579E(context).mo15851A();
                m19570a(new FileInputStream(c), new FileOutputStream(context.getDatabasePath("RKStorage")));
                Log.v("AsyncStorageExpoMigration", "Migrated most recently modified database " + c.getName() + " to RKStorage");
                try {
                    Iterator<File> it = b.iterator();
                    while (it.hasNext()) {
                        File next = it.next();
                        if (next.delete()) {
                            str = "Deleted scoped database " + next.getName();
                        } else {
                            str = "Failed to delete scoped database " + next.getName();
                        }
                        Log.v("AsyncStorageExpoMigration", str);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Log.v("AsyncStorageExpoMigration", "Completed the scoped AsyncStorage migration");
            } catch (Exception e2) {
                Log.v("AsyncStorageExpoMigration", "Failed to migrate scoped database " + c.getName());
                e2.printStackTrace();
            }
        }
    }
}
