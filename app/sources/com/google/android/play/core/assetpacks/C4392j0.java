package com.google.android.play.core.assetpacks;

import java.io.File;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9147z;

/* renamed from: com.google.android.play.core.assetpacks.j0 */
final class C4392j0 {

    /* renamed from: a */
    private static final C9101a f12527a = new C9101a("ExtractChunkTaskHandler");

    /* renamed from: b */
    private final byte[] f12528b = new byte[8192];

    /* renamed from: c */
    private final C4439v f12529c;

    /* renamed from: d */
    private final C9147z<C4430s2> f12530d;

    /* renamed from: e */
    private final C9147z<C4427s> f12531e;

    /* renamed from: f */
    private final C4412o0 f12532f;

    C4392j0(C4439v vVar, C9147z<C4430s2> zVar, C9147z<C4427s> zVar2, C4412o0 o0Var) {
        this.f12529c = vVar;
        this.f12530d = zVar;
        this.f12531e = zVar2;
        this.f12532f = o0Var;
    }

    /* renamed from: b */
    private final File m16863b(C4388i0 i0Var) {
        File v = this.f12529c.mo13941v(i0Var.f12403b, i0Var.f12498c, i0Var.f12499d, i0Var.f12500e);
        if (!v.exists()) {
            v.mkdirs();
        }
        return v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017d A[Catch:{ all -> 0x032d, all -> 0x0333, IOException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a2 A[Catch:{ all -> 0x032d, all -> 0x0333, IOException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d6 A[Catch:{ all -> 0x032d, all -> 0x0333, IOException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0291 A[SYNTHETIC, Splitter:B:93:0x0291] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13885a(com.google.android.play.core.assetpacks.C4388i0 r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            com.google.android.play.core.assetpacks.y1 r0 = new com.google.android.play.core.assetpacks.y1
            com.google.android.play.core.assetpacks.v r4 = r1.f12529c
            java.lang.String r5 = r2.f12403b
            int r6 = r2.f12498c
            long r7 = r2.f12499d
            java.lang.String r9 = r2.f12500e
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r9)
            com.google.android.play.core.assetpacks.v r10 = r1.f12529c
            java.lang.String r11 = r2.f12403b
            int r12 = r2.f12498c
            long r13 = r2.f12499d
            java.lang.String r15 = r2.f12500e
            java.io.File r3 = r10.mo13923C(r11, r12, r13, r15)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x002b
            r3.mkdirs()
        L_0x002b:
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            java.io.InputStream r3 = r2.f12506k     // Catch:{ IOException -> 0x0339 }
            int r4 = r2.f12501f     // Catch:{ IOException -> 0x0339 }
            if (r4 == r13) goto L_0x0037
            r15 = r3
            goto L_0x003f
        L_0x0037:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0339 }
            r5 = 8192(0x2000, float:1.14794E-41)
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x0339 }
            r15 = r4
        L_0x003f:
            int r3 = r2.f12502g     // Catch:{ all -> 0x032d }
            r16 = 0
            if (r3 <= 0) goto L_0x017a
            com.google.android.play.core.assetpacks.x1 r3 = r0.mo13968e()     // Catch:{ all -> 0x032d }
            int r4 = r3.mo13957e()     // Catch:{ all -> 0x032d }
            int r5 = r2.f12502g     // Catch:{ all -> 0x032d }
            int r6 = r5 + -1
            if (r4 != r6) goto L_0x015a
            int r4 = r3.mo13953a()     // Catch:{ all -> 0x032d }
            if (r4 == r13) goto L_0x00d8
            if (r4 == r12) goto L_0x009b
            if (r4 != r11) goto L_0x0081
            e.f.a.e.a.b.a r4 = f12527a     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r4.mo23080a(r5, r6)     // Catch:{ all -> 0x032d }
            long r3 = r3.mo13955c()     // Catch:{ all -> 0x032d }
            r0.mo13969f(r15, r3)     // Catch:{ all -> 0x032d }
            boolean r3 = r23.mo13862a()     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x0077
        L_0x0073:
            r4 = r16
            goto L_0x017b
        L_0x0077:
            com.google.android.play.core.assetpacks.k0 r0 = new com.google.android.play.core.assetpacks.k0     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.f12402a     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x0081:
            com.google.android.play.core.assetpacks.k0 r0 = new com.google.android.play.core.assetpacks.k0     // Catch:{ all -> 0x032d }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x032d }
            int r3 = r3.mo13953a()     // Catch:{ all -> 0x032d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032d }
            r4[r14] = r3     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x032d }
            int r4 = r2.f12402a     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x009b:
            e.f.a.e.a.b.a r3 = f12527a     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo23080a(r4, r5)     // Catch:{ all -> 0x032d }
            com.google.android.play.core.assetpacks.v r3 = r1.f12529c     // Catch:{ all -> 0x032d }
            java.lang.String r4 = r2.f12403b     // Catch:{ all -> 0x032d }
            int r5 = r2.f12498c     // Catch:{ all -> 0x032d }
            long r6 = r2.f12499d     // Catch:{ all -> 0x032d }
            java.lang.String r8 = r2.f12500e     // Catch:{ all -> 0x032d }
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.io.File r3 = r16.mo13922B(r17, r18, r19, r21)     // Catch:{ all -> 0x032d }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x032d }
            if (r4 == 0) goto L_0x00ce
            java.io.SequenceInputStream r4 = new java.io.SequenceInputStream     // Catch:{ all -> 0x032d }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x032d }
            r5.<init>(r3)     // Catch:{ all -> 0x032d }
            r4.<init>(r5, r15)     // Catch:{ all -> 0x032d }
            goto L_0x017b
        L_0x00ce:
            com.google.android.play.core.assetpacks.k0 r0 = new com.google.android.play.core.assetpacks.k0     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.f12402a     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x00d8:
            e.f.a.e.a.b.a r4 = f12527a     // Catch:{ all -> 0x032d }
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x032d }
            java.lang.String r6 = r3.mo13954b()     // Catch:{ all -> 0x032d }
            r5[r14] = r6     // Catch:{ all -> 0x032d }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.mo23080a(r6, r5)     // Catch:{ all -> 0x032d }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032d }
            java.lang.String r5 = r3.mo13954b()     // Catch:{ all -> 0x032d }
            r4.<init>(r5)     // Catch:{ all -> 0x032d }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x0150
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x032d }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x032d }
            long r6 = r3.mo13955c()     // Catch:{ all -> 0x032d }
            r5.seek(r6)     // Catch:{ all -> 0x032d }
            long r6 = r3.mo13956d()     // Catch:{ all -> 0x032d }
        L_0x0108:
            r8 = 8192(0x2000, double:4.0474E-320)
            long r8 = java.lang.Math.min(r6, r8)     // Catch:{ all -> 0x032d }
            int r3 = (int) r8     // Catch:{ all -> 0x032d }
            byte[] r8 = r1.f12528b     // Catch:{ all -> 0x032d }
            int r8 = r15.read(r8, r14, r3)     // Catch:{ all -> 0x032d }
            int r8 = java.lang.Math.max(r8, r14)     // Catch:{ all -> 0x032d }
            if (r8 <= 0) goto L_0x0120
            byte[] r9 = r1.f12528b     // Catch:{ all -> 0x032d }
            r5.write(r9, r14, r8)     // Catch:{ all -> 0x032d }
        L_0x0120:
            long r10 = (long) r8     // Catch:{ all -> 0x032d }
            long r9 = r6 - r10
            r6 = 0
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x012f
            if (r8 > 0) goto L_0x012c
            goto L_0x012f
        L_0x012c:
            r6 = r9
            r11 = 3
            goto L_0x0108
        L_0x012f:
            long r6 = r5.length()     // Catch:{ all -> 0x032d }
            r5.close()     // Catch:{ all -> 0x032d }
            if (r8 == r3) goto L_0x017a
            e.f.a.e.a.b.a r3 = f12527a     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo23080a(r5, r8)     // Catch:{ all -> 0x032d }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032d }
            int r11 = r2.f12502g     // Catch:{ all -> 0x032d }
            r3 = r0
            r5 = r6
            r7 = r9
            r9 = r11
            r3.mo13964a(r4, r5, r7, r9)     // Catch:{ all -> 0x032d }
            goto L_0x0073
        L_0x0150:
            com.google.android.play.core.assetpacks.k0 r0 = new com.google.android.play.core.assetpacks.k0     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.f12402a     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x015a:
            com.google.android.play.core.assetpacks.k0 r0 = new com.google.android.play.core.assetpacks.k0     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x032d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x032d }
            r6[r14] = r5     // Catch:{ all -> 0x032d }
            int r3 = r3.mo13957e()     // Catch:{ all -> 0x032d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032d }
            r6[r13] = r3     // Catch:{ all -> 0x032d }
            java.lang.String r3 = java.lang.String.format(r4, r6)     // Catch:{ all -> 0x032d }
            int r4 = r2.f12402a     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x017a:
            r4 = r15
        L_0x017b:
            if (r4 == 0) goto L_0x0288
            com.google.android.play.core.assetpacks.d0 r3 = new com.google.android.play.core.assetpacks.d0     // Catch:{ all -> 0x032d }
            r3.<init>(r4)     // Catch:{ all -> 0x032d }
            java.io.File r5 = r22.m16863b(r23)     // Catch:{ all -> 0x032d }
        L_0x0186:
            com.google.android.play.core.assetpacks.d2 r6 = r3.mo13831a()     // Catch:{ all -> 0x032d }
            boolean r7 = r6.mo13844g()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01dd
            boolean r7 = r3.mo13833h()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01dd
            boolean r7 = r6.mo13839c()     // Catch:{ all -> 0x032d }
            if (r7 == 0) goto L_0x01d6
            boolean r7 = r6.mo13838b()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01d6
            byte[] r7 = r6.mo13847i()     // Catch:{ all -> 0x032d }
            r0.mo13970g(r7)     // Catch:{ all -> 0x032d }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x032d }
            java.lang.String r8 = r6.mo13840d()     // Catch:{ all -> 0x032d }
            r7.<init>(r5, r8)     // Catch:{ all -> 0x032d }
            java.io.File r8 = r7.getParentFile()     // Catch:{ all -> 0x032d }
            r8.mkdirs()     // Catch:{ all -> 0x032d }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x032d }
            r8.<init>(r7)     // Catch:{ all -> 0x032d }
            byte[] r7 = r1.f12528b     // Catch:{ all -> 0x032d }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032d }
        L_0x01c4:
            if (r7 <= 0) goto L_0x01d2
            byte[] r9 = r1.f12528b     // Catch:{ all -> 0x032d }
            r8.write(r9, r14, r7)     // Catch:{ all -> 0x032d }
            byte[] r7 = r1.f12528b     // Catch:{ all -> 0x032d }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032d }
            goto L_0x01c4
        L_0x01d2:
            r8.close()     // Catch:{ all -> 0x032d }
            goto L_0x01dd
        L_0x01d6:
            byte[] r7 = r6.mo13847i()     // Catch:{ all -> 0x032d }
            r0.mo13971h(r7, r3)     // Catch:{ all -> 0x032d }
        L_0x01dd:
            boolean r7 = r3.mo13832b()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01e9
            boolean r7 = r3.mo13833h()     // Catch:{ all -> 0x032d }
            if (r7 == 0) goto L_0x0186
        L_0x01e9:
            boolean r5 = r3.mo13833h()     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x01ff
            e.f.a.e.a.b.a r5 = f12527a     // Catch:{ all -> 0x032d }
            java.lang.String r7 = "Writing central directory metadata."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r5.mo23080a(r7, r8)     // Catch:{ all -> 0x032d }
            byte[] r5 = r6.mo13847i()     // Catch:{ all -> 0x032d }
            r0.mo13971h(r5, r4)     // Catch:{ all -> 0x032d }
        L_0x01ff:
            boolean r4 = r23.mo13862a()     // Catch:{ all -> 0x032d }
            if (r4 != 0) goto L_0x0288
            boolean r4 = r6.mo13844g()     // Catch:{ all -> 0x032d }
            if (r4 == 0) goto L_0x021e
            e.f.a.e.a.b.a r3 = f12527a     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo23080a(r4, r5)     // Catch:{ all -> 0x032d }
            byte[] r3 = r6.mo13847i()     // Catch:{ all -> 0x032d }
            int r4 = r2.f12502g     // Catch:{ all -> 0x032d }
            r0.mo13965b(r3, r4)     // Catch:{ all -> 0x032d }
            goto L_0x0288
        L_0x021e:
            boolean r4 = r3.mo13833h()     // Catch:{ all -> 0x032d }
            if (r4 == 0) goto L_0x0233
            e.f.a.e.a.b.a r3 = f12527a     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo23080a(r4, r5)     // Catch:{ all -> 0x032d }
            int r3 = r2.f12502g     // Catch:{ all -> 0x032d }
            r0.mo13966c(r3)     // Catch:{ all -> 0x032d }
            goto L_0x0288
        L_0x0233:
            int r4 = r6.mo13843f()     // Catch:{ all -> 0x032d }
            if (r4 != 0) goto L_0x0269
            e.f.a.e.a.b.a r4 = f12527a     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r4.mo23080a(r5, r7)     // Catch:{ all -> 0x032d }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032d }
            java.io.File r5 = r22.m16863b(r23)     // Catch:{ all -> 0x032d }
            java.lang.String r7 = r6.mo13840d()     // Catch:{ all -> 0x032d }
            r4.<init>(r5, r7)     // Catch:{ all -> 0x032d }
            long r5 = r6.mo13841e()     // Catch:{ all -> 0x032d }
            long r7 = r3.mo13834o()     // Catch:{ all -> 0x032d }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x032d }
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0261
            goto L_0x027a
        L_0x0261:
            com.google.android.play.core.assetpacks.k0 r0 = new com.google.android.play.core.assetpacks.k0     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x0269:
            e.f.a.e.a.b.a r4 = f12527a     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r4.mo23080a(r5, r6)     // Catch:{ all -> 0x032d }
            java.io.File r4 = r0.mo13973j()     // Catch:{ all -> 0x032d }
            long r5 = r4.length()     // Catch:{ all -> 0x032d }
        L_0x027a:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032d }
            long r7 = r3.mo13834o()     // Catch:{ all -> 0x032d }
            int r9 = r2.f12502g     // Catch:{ all -> 0x032d }
            r3 = r0
            r3.mo13964a(r4, r5, r7, r9)     // Catch:{ all -> 0x032d }
        L_0x0288:
            r15.close()     // Catch:{ IOException -> 0x0339 }
            boolean r3 = r23.mo13862a()
            if (r3 == 0) goto L_0x02b1
            int r3 = r2.f12502g     // Catch:{ IOException -> 0x0297 }
            r0.mo13967d(r3)     // Catch:{ IOException -> 0x0297 }
            goto L_0x02b1
        L_0x0297:
            r0 = move-exception
            e.f.a.e.a.b.a r3 = f12527a
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r3.mo23081b(r5, r4)
            com.google.android.play.core.assetpacks.k0 r3 = new com.google.android.play.core.assetpacks.k0
            int r2 = r2.f12402a
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x02b1:
            e.f.a.e.a.b.a r0 = f12527a
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.f12502g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            java.lang.String r4 = r2.f12500e
            r3[r13] = r4
            java.lang.String r4 = r2.f12403b
            r3[r12] = r4
            int r4 = r2.f12402a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.mo23083d(r4, r3)
            e.f.a.e.a.b.z<com.google.android.play.core.assetpacks.s2> r0 = r1.f12530d
            java.lang.Object r0 = r0.mo13826a()
            com.google.android.play.core.assetpacks.s2 r0 = (com.google.android.play.core.assetpacks.C4430s2) r0
            int r3 = r2.f12402a
            java.lang.String r4 = r2.f12403b
            java.lang.String r5 = r2.f12500e
            int r6 = r2.f12502g
            r0.mo13865c(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.f12506k     // Catch:{ IOException -> 0x02ed }
            r0.close()     // Catch:{ IOException -> 0x02ed }
            goto L_0x0307
        L_0x02ed:
            e.f.a.e.a.b.a r0 = f12527a
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.f12502g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r14] = r3
            java.lang.String r3 = r2.f12500e
            r4[r13] = r3
            java.lang.String r3 = r2.f12403b
            r4[r12] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.mo23084e(r3, r4)
        L_0x0307:
            int r0 = r2.f12505j
            r3 = 3
            if (r0 != r3) goto L_0x032c
            e.f.a.e.a.b.z<com.google.android.play.core.assetpacks.s> r0 = r1.f12531e
            java.lang.Object r0 = r0.mo13826a()
            com.google.android.play.core.assetpacks.s r0 = (com.google.android.play.core.assetpacks.C4427s) r0
            java.lang.String r3 = r2.f12403b
            long r7 = r2.f12504i
            r4 = 3
            r5 = 0
            com.google.android.play.core.assetpacks.o0 r6 = r1.f12532f
            double r9 = r6.mo13903c(r3, r2)
            r11 = 1
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.AssetPackState r2 = com.google.android.play.core.assetpacks.AssetPackState.m16742b(r2, r3, r4, r5, r7, r9, r11)
            r0.mo13912h(r2)
        L_0x032c:
            return
        L_0x032d:
            r0 = move-exception
            r3 = r0
            r15.close()     // Catch:{ all -> 0x0333 }
            goto L_0x0338
        L_0x0333:
            r0 = move-exception
            r4 = r0
            p174e.p319f.p320a.p382e.p383a.p385b.C9146y.m30436a(r3, r4)     // Catch:{ IOException -> 0x0339 }
        L_0x0338:
            throw r3     // Catch:{ IOException -> 0x0339 }
        L_0x0339:
            r0 = move-exception
            e.f.a.e.a.b.a r3 = f12527a
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r3.mo23081b(r5, r4)
            com.google.android.play.core.assetpacks.k0 r3 = new com.google.android.play.core.assetpacks.k0
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.f12502g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r14] = r5
            java.lang.String r5 = r2.f12500e
            r4[r13] = r5
            java.lang.String r5 = r2.f12403b
            r4[r12] = r5
            int r5 = r2.f12402a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.f12402a
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C4392j0.mo13885a(com.google.android.play.core.assetpacks.i0):void");
    }
}
