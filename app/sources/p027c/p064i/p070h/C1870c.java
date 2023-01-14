package p027c.p064i.p070h;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.content.p022d.C1146c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p027c.p064i.p070h.C1879f;

/* renamed from: c.i.h.c */
class C1870c {

    /* renamed from: a */
    private static final Comparator<byte[]> f5513a = new C1871a();

    /* renamed from: c.i.h.c$a */
    class C1871a implements Comparator<byte[]> {
        C1871a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(byte[] r5, byte[] r6) {
            /*
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x0008
                int r5 = r5.length
                int r6 = r6.length
            L_0x0006:
                int r5 = r5 - r6
                return r5
            L_0x0008:
                r0 = 0
                r1 = 0
            L_0x000a:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001b
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x0018
                byte r5 = r5[r1]
                byte r6 = r6[r1]
                goto L_0x0006
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x001b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p064i.p070h.C1870c.C1871a.compare(byte[], byte[]):int");
        }
    }

    /* renamed from: a */
    private static List<byte[]> m7888a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m7889b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static List<List<byte[]>> m7890c(C1872d dVar, Resources resources) {
        return dVar.mo6377b() != null ? dVar.mo6377b() : C1146c.m4464c(resources, dVar.mo6378c());
    }

    /* renamed from: d */
    static C1879f.C1880a m7891d(Context context, C1872d dVar, CancellationSignal cancellationSignal) {
        ProviderInfo e = m7892e(context.getPackageManager(), dVar, context.getResources());
        return e == null ? C1879f.C1880a.m7915a(1, (C1879f.C1881b[]) null) : C1879f.C1880a.m7915a(0, m7893f(context, dVar, e.authority, cancellationSignal));
    }

    /* renamed from: e */
    static ProviderInfo m7892e(PackageManager packageManager, C1872d dVar, Resources resources) {
        String e = dVar.mo6380e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        } else if (resolveContentProvider.packageName.equals(dVar.mo6381f())) {
            List<byte[]> a = m7888a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f5513a);
            List<List<byte[]>> c = m7890c(dVar, resources);
            for (int i = 0; i < c.size(); i++) {
                ArrayList arrayList = new ArrayList(c.get(i));
                Collections.sort(arrayList, f5513a);
                if (m7889b(a, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + dVar.mo6381f());
        }
    }

    /* renamed from: f */
    static C1879f.C1881b[] m7893f(Context context, C1872d dVar, String str, CancellationSignal cancellationSignal) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.mo6382g()}, (String) null, cancellationSignal) : context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.mo6382g()}, (String) null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(C1879f.C1881b.m7918a(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C1879f.C1881b[]) arrayList.toArray(new C1879f.C1881b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
