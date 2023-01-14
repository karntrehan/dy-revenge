package p477h.p478a.p479a.p492i;

/* renamed from: h.a.a.i.c */
public class C10580c {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        throw r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m35879a(java.io.File r5, p477h.p478a.p479a.p490g.C10558a r6) {
        /*
            if (r5 == 0) goto L_0x0057
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0057
            boolean r0 = r5.canRead()
            if (r0 == 0) goto L_0x0057
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r5)
        L_0x001c:
            int r5 = r2.read(r0)     // Catch:{ all -> 0x004b }
            r3 = -1
            if (r5 == r3) goto L_0x0043
            r3 = 0
            r1.update(r0, r3, r5)     // Catch:{ all -> 0x004b }
            if (r6 == 0) goto L_0x001c
            long r3 = (long) r5     // Catch:{ all -> 0x004b }
            r6.mo26210l(r3)     // Catch:{ all -> 0x004b }
            boolean r5 = r6.mo26204e()     // Catch:{ all -> 0x004b }
            if (r5 == 0) goto L_0x001c
            h.a.a.g.a$a r5 = p477h.p478a.p479a.p490g.C10558a.C10559a.CANCELLED     // Catch:{ all -> 0x004b }
            r6.mo26207i(r5)     // Catch:{ all -> 0x004b }
            h.a.a.g.a$b r5 = p477h.p478a.p479a.p490g.C10558a.C10560b.READY     // Catch:{ all -> 0x004b }
            r6.mo26208j(r5)     // Catch:{ all -> 0x004b }
            r5 = 0
            r2.close()
            return r5
        L_0x0043:
            long r5 = r1.getValue()     // Catch:{ all -> 0x004b }
            r2.close()
            return r5
        L_0x004b:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x004d }
        L_0x004d:
            r6 = move-exception
            r2.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            r5.addSuppressed(r0)
        L_0x0056:
            throw r6
        L_0x0057:
            h.a.a.c.a r5 = new h.a.a.c.a
            java.lang.String r6 = "input file is null or does not exist or cannot read. Cannot calculate CRC for the file"
            r5.<init>((java.lang.String) r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p477h.p478a.p479a.p492i.C10580c.m35879a(java.io.File, h.a.a.g.a):long");
    }
}
