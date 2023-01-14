package okhttp3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.internal.cache.DiskLruCache;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.p473b0.C10445a;

public final class Cache$urls$1 implements Iterator<String>, C10445a {
    private boolean canRemove;
    private final Iterator<DiskLruCache.Snapshot> delegate;
    private String nextUrl;
    final /* synthetic */ Cache this$0;

    Cache$urls$1(Cache cache) {
        this.this$0 = cache;
        this.delegate = cache.getCache$okhttp().snapshots();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        p455g.p469x.C10416a.m35288a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
            r5 = this;
            java.lang.String r0 = r5.nextUrl
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 0
            r5.canRemove = r0
        L_0x0009:
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L_0x0038
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate     // Catch:{ IOException -> 0x0036 }
            java.lang.Object r2 = r2.next()     // Catch:{ IOException -> 0x0036 }
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ IOException -> 0x0036 }
            r3 = 0
            r4 = r2
            okhttp3.internal.cache.DiskLruCache$Snapshot r4 = (okhttp3.internal.cache.DiskLruCache.Snapshot) r4     // Catch:{ all -> 0x002f }
            i.d0 r4 = r4.getSource(r0)     // Catch:{ all -> 0x002f }
            i.h r4 = p493i.C10625q.m36156d(r4)     // Catch:{ all -> 0x002f }
            java.lang.String r4 = r4.mo26342Y()     // Catch:{ all -> 0x002f }
            r5.nextUrl = r4     // Catch:{ all -> 0x002f }
            p455g.p469x.C10416a.m35288a(r2, r3)     // Catch:{ IOException -> 0x0036 }
            return r1
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r4 = move-exception
            p455g.p469x.C10416a.m35288a(r2, r3)     // Catch:{ IOException -> 0x0036 }
            throw r4     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            goto L_0x0009
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache$urls$1.hasNext():boolean");
    }

    public String next() {
        if (hasNext()) {
            String str = this.nextUrl;
            C10457l.m35317b(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (this.canRemove) {
            this.delegate.remove();
            return;
        }
        throw new IllegalStateException("remove() before next()".toString());
    }
}
