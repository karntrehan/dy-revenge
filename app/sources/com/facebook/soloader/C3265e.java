package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C3284n;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.facebook.soloader.e */
public final class C3265e extends C3284n {

    /* renamed from: com.facebook.soloader.e$b */
    private final class C3267b extends C3284n.C3290f {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C3269c[] f9261f;

        /* renamed from: o */
        final /* synthetic */ C3265e f9262o;

        /* renamed from: com.facebook.soloader.e$b$a */
        private final class C3268a extends C3284n.C3289e {

            /* renamed from: f */
            private int f9263f;

            private C3268a() {
            }

            /* renamed from: a */
            public boolean mo10735a() {
                return this.f9263f < C3267b.this.f9261f.length;
            }

            /* renamed from: b */
            public C3284n.C3288d mo10736b() {
                C3269c[] h = C3267b.this.f9261f;
                int i = this.f9263f;
                this.f9263f = i + 1;
                C3269c cVar = h[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.f9265p);
                try {
                    return new C3284n.C3288d(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r8.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e8, code lost:
            r10.close();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C3267b(com.facebook.soloader.C3265e r18, com.facebook.soloader.C3284n r19) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r1.f9262o = r0
                r17.<init>()
                android.content.Context r0 = r0.f9286c
                java.io.File r2 = new java.io.File
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "/data/local/tmp/exopackage/"
                r3.append(r4)
                java.lang.String r0 = r0.getPackageName()
                r3.append(r0)
                java.lang.String r0 = "/native-libs/"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
                r3.<init>()
                java.lang.String[] r4 = com.facebook.soloader.SysUtil.m12801h()
                int r5 = r4.length
                r6 = 0
                r7 = 0
            L_0x003b:
                if (r7 >= r5) goto L_0x010e
                r8 = r4[r7]
                java.io.File r9 = new java.io.File
                r9.<init>(r2, r8)
                boolean r10 = r9.isDirectory()
                if (r10 != 0) goto L_0x004c
                goto L_0x00eb
            L_0x004c:
                r3.add(r8)
                java.io.File r8 = new java.io.File
                java.lang.String r10 = "metadata.txt"
                r8.<init>(r9, r10)
                boolean r10 = r8.isFile()
                if (r10 != 0) goto L_0x005e
                goto L_0x00eb
            L_0x005e:
                java.io.FileReader r10 = new java.io.FileReader
                r10.<init>(r8)
                java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ all -> 0x00ff }
                r8.<init>(r10)     // Catch:{ all -> 0x00ff }
            L_0x0068:
                java.lang.String r11 = r8.readLine()     // Catch:{ all -> 0x00f0 }
                if (r11 == 0) goto L_0x00e5
                int r12 = r11.length()     // Catch:{ all -> 0x00f0 }
                if (r12 != 0) goto L_0x0075
                goto L_0x0068
            L_0x0075:
                r12 = 32
                int r12 = r11.indexOf(r12)     // Catch:{ all -> 0x00f0 }
                r13 = -1
                if (r12 == r13) goto L_0x00c9
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
                r13.<init>()     // Catch:{ all -> 0x00f0 }
                java.lang.String r14 = r11.substring(r6, r12)     // Catch:{ all -> 0x00f0 }
                r13.append(r14)     // Catch:{ all -> 0x00f0 }
                java.lang.String r14 = ".so"
                r13.append(r14)     // Catch:{ all -> 0x00f0 }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00f0 }
                int r14 = r0.size()     // Catch:{ all -> 0x00f0 }
                r15 = 0
            L_0x0098:
                if (r15 >= r14) goto L_0x00b0
                java.lang.Object r16 = r0.get(r15)     // Catch:{ all -> 0x00f0 }
                r6 = r16
                com.facebook.soloader.e$c r6 = (com.facebook.soloader.C3265e.C3269c) r6     // Catch:{ all -> 0x00f0 }
                java.lang.String r6 = r6.f9296f     // Catch:{ all -> 0x00f0 }
                boolean r6 = r6.equals(r13)     // Catch:{ all -> 0x00f0 }
                if (r6 == 0) goto L_0x00ac
                r6 = 1
                goto L_0x00b1
            L_0x00ac:
                int r15 = r15 + 1
                r6 = 0
                goto L_0x0098
            L_0x00b0:
                r6 = 0
            L_0x00b1:
                if (r6 == 0) goto L_0x00b5
            L_0x00b3:
                r6 = 0
                goto L_0x0068
            L_0x00b5:
                int r12 = r12 + 1
                java.lang.String r6 = r11.substring(r12)     // Catch:{ all -> 0x00f0 }
                com.facebook.soloader.e$c r11 = new com.facebook.soloader.e$c     // Catch:{ all -> 0x00f0 }
                java.io.File r12 = new java.io.File     // Catch:{ all -> 0x00f0 }
                r12.<init>(r9, r6)     // Catch:{ all -> 0x00f0 }
                r11.<init>(r13, r6, r12)     // Catch:{ all -> 0x00f0 }
                r0.add(r11)     // Catch:{ all -> 0x00f0 }
                goto L_0x00b3
            L_0x00c9:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00f0 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
                r2.<init>()     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = "illegal line in exopackage metadata: ["
                r2.append(r3)     // Catch:{ all -> 0x00f0 }
                r2.append(r11)     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = "]"
                r2.append(r3)     // Catch:{ all -> 0x00f0 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00f0 }
                r0.<init>(r2)     // Catch:{ all -> 0x00f0 }
                throw r0     // Catch:{ all -> 0x00f0 }
            L_0x00e5:
                r8.close()     // Catch:{ all -> 0x00ff }
                r10.close()
            L_0x00eb:
                int r7 = r7 + 1
                r6 = 0
                goto L_0x003b
            L_0x00f0:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch:{ all -> 0x00f3 }
            L_0x00f3:
                r0 = move-exception
                r3 = r0
                r8.close()     // Catch:{ all -> 0x00f9 }
                goto L_0x00fe
            L_0x00f9:
                r0 = move-exception
                r4 = r0
                r2.addSuppressed(r4)     // Catch:{ all -> 0x00ff }
            L_0x00fe:
                throw r3     // Catch:{ all -> 0x00ff }
            L_0x00ff:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch:{ all -> 0x0102 }
            L_0x0102:
                r0 = move-exception
                r3 = r0
                r10.close()     // Catch:{ all -> 0x0108 }
                goto L_0x010d
            L_0x0108:
                r0 = move-exception
                r4 = r0
                r2.addSuppressed(r4)
            L_0x010d:
                throw r3
            L_0x010e:
                int r2 = r3.size()
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.Object[] r2 = r3.toArray(r2)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r3 = r19
                r3.mo10745r(r2)
                int r2 = r0.size()
                com.facebook.soloader.e$c[] r2 = new com.facebook.soloader.C3265e.C3269c[r2]
                java.lang.Object[] r0 = r0.toArray(r2)
                com.facebook.soloader.e$c[] r0 = (com.facebook.soloader.C3265e.C3269c[]) r0
                r1.f9261f = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C3265e.C3267b.<init>(com.facebook.soloader.e, com.facebook.soloader.n):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C3284n.C3287c mo10733a() {
            return new C3284n.C3287c(this.f9261f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C3284n.C3289e mo10734b() {
            return new C3268a();
        }
    }

    /* renamed from: com.facebook.soloader.e$c */
    private static final class C3269c extends C3284n.C3286b {

        /* renamed from: p */
        final File f9265p;

        C3269c(String str, String str2, File file) {
            super(str, str2);
            this.f9265p = file;
        }
    }

    public C3265e(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C3284n.C3290f mo10724n() {
        return new C3267b(this, this);
    }
}
