package okhttp3.internal.cache;

import okhttp3.internal.concurrent.Task;
import p455g.p470y.p472d.C10452g;

public final class DiskLruCache$cleanupTask$1 extends Task {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiskLruCache$cleanupTask$1(DiskLruCache diskLruCache, String str) {
        super(str, false, 2, (C10452g) null);
        this.this$0 = diskLruCache;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.this$0.mostRecentRebuildFailed = true;
        r6.this$0.journalWriter = p493i.C10625q.m36155c(p493i.C10625q.m36154b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long runOnce() {
        /*
            r6 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r6.this$0
            monitor-enter(r0)
            okhttp3.internal.cache.DiskLruCache r1 = r6.this$0     // Catch:{ all -> 0x004c }
            boolean r1 = r1.initialized     // Catch:{ all -> 0x004c }
            r2 = -1
            if (r1 == 0) goto L_0x004a
            okhttp3.internal.cache.DiskLruCache r1 = r6.this$0     // Catch:{ all -> 0x004c }
            boolean r1 = r1.getClosed$okhttp()     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0016
            goto L_0x004a
        L_0x0016:
            r1 = 1
            okhttp3.internal.cache.DiskLruCache r4 = r6.this$0     // Catch:{ IOException -> 0x001d }
            r4.trimToSize()     // Catch:{ IOException -> 0x001d }
            goto L_0x0022
        L_0x001d:
            okhttp3.internal.cache.DiskLruCache r4 = r6.this$0     // Catch:{ all -> 0x004c }
            r4.mostRecentTrimFailed = r1     // Catch:{ all -> 0x004c }
        L_0x0022:
            okhttp3.internal.cache.DiskLruCache r4 = r6.this$0     // Catch:{ IOException -> 0x0036 }
            boolean r4 = r4.journalRebuildRequired()     // Catch:{ IOException -> 0x0036 }
            if (r4 == 0) goto L_0x0048
            okhttp3.internal.cache.DiskLruCache r4 = r6.this$0     // Catch:{ IOException -> 0x0036 }
            r4.rebuildJournal$okhttp()     // Catch:{ IOException -> 0x0036 }
            okhttp3.internal.cache.DiskLruCache r4 = r6.this$0     // Catch:{ IOException -> 0x0036 }
            r5 = 0
            r4.redundantOpCount = r5     // Catch:{ IOException -> 0x0036 }
            goto L_0x0048
        L_0x0036:
            okhttp3.internal.cache.DiskLruCache r4 = r6.this$0     // Catch:{ all -> 0x004c }
            r4.mostRecentRebuildFailed = r1     // Catch:{ all -> 0x004c }
            okhttp3.internal.cache.DiskLruCache r1 = r6.this$0     // Catch:{ all -> 0x004c }
            i.b0 r4 = p493i.C10625q.m36154b()     // Catch:{ all -> 0x004c }
            i.g r4 = p493i.C10625q.m36155c(r4)     // Catch:{ all -> 0x004c }
            r1.journalWriter = r4     // Catch:{ all -> 0x004c }
        L_0x0048:
            monitor-exit(r0)
            return r2
        L_0x004a:
            monitor-exit(r0)
            return r2
        L_0x004c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache$cleanupTask$1.runOnce():long");
    }
}
