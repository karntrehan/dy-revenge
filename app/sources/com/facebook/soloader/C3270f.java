package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C3284n;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.f */
public class C3270f extends C3284n {

    /* renamed from: g */
    protected final File f9266g;

    /* renamed from: h */
    protected final String f9267h;

    /* renamed from: com.facebook.soloader.f$b */
    private static final class C3272b extends C3284n.C3286b implements Comparable {

        /* renamed from: p */
        final ZipEntry f9268p;

        /* renamed from: q */
        final int f9269q;

        C3272b(String str, ZipEntry zipEntry, int i) {
            super(str, m12825e(zipEntry));
            this.f9268p = zipEntry;
            this.f9269q = i;
        }

        /* renamed from: e */
        private static String m12825e(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())});
        }

        public int compareTo(Object obj) {
            return this.f9296f.compareTo(((C3272b) obj).f9296f);
        }
    }

    /* renamed from: com.facebook.soloader.f$c */
    protected class C3273c extends C3284n.C3290f {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C3272b[] f9270f;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public final ZipFile f9271o;

        /* renamed from: p */
        private final C3284n f9272p;

        /* renamed from: com.facebook.soloader.f$c$a */
        private final class C3274a extends C3284n.C3289e {

            /* renamed from: f */
            private int f9274f;

            private C3274a() {
            }

            /* renamed from: a */
            public boolean mo10735a() {
                C3273c.this.mo10739r();
                return this.f9274f < C3273c.this.f9270f.length;
            }

            /* renamed from: b */
            public C3284n.C3288d mo10736b() {
                C3273c.this.mo10739r();
                C3272b[] h = C3273c.this.f9270f;
                int i = this.f9274f;
                this.f9274f = i + 1;
                C3272b bVar = h[i];
                InputStream inputStream = C3273c.this.f9271o.getInputStream(bVar.f9268p);
                try {
                    return new C3284n.C3288d(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        C3273c(C3284n nVar) {
            this.f9271o = new ZipFile(C3270f.this.f9266g);
            this.f9272p = nVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public boolean mo10725A(ZipEntry zipEntry, String str) {
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C3284n.C3287c mo10733a() {
            return new C3284n.C3287c(mo10739r());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final C3284n.C3289e mo10734b() {
            return new C3274a();
        }

        public void close() {
            this.f9271o.close();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public final C3272b[] mo10739r() {
            if (this.f9270f == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(C3270f.this.f9267h);
                String[] h = SysUtil.m12801h();
                Enumeration<? extends ZipEntry> entries = this.f9271o.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int e = SysUtil.m12798e(h, group);
                        if (e >= 0) {
                            linkedHashSet.add(group);
                            C3272b bVar = (C3272b) hashMap.get(group2);
                            if (bVar == null || e < bVar.f9269q) {
                                hashMap.put(group2, new C3272b(group2, zipEntry, e));
                            }
                        }
                    }
                }
                this.f9272p.mo10745r((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                C3272b[] bVarArr = (C3272b[]) hashMap.values().toArray(new C3272b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i = 0;
                for (int i2 = 0; i2 < bVarArr.length; i2++) {
                    C3272b bVar2 = bVarArr[i2];
                    if (mo10725A(bVar2.f9268p, bVar2.f9296f)) {
                        i++;
                    } else {
                        bVarArr[i2] = null;
                    }
                }
                C3272b[] bVarArr2 = new C3272b[i];
                int i3 = 0;
                for (C3272b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        bVarArr2[i3] = bVar3;
                        i3++;
                    }
                }
                this.f9270f = bVarArr2;
            }
            return this.f9270f;
        }
    }

    public C3270f(Context context, String str, File file, String str2) {
        super(context, str);
        this.f9266g = file;
        this.f9267h = str2;
    }
}
