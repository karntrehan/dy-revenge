package okhttp3.internal.cache;

import okhttp3.internal.cache.DiskLruCache;
import p455g.C10323s;
import p493i.C10598d0;
import p493i.C10620l;

public final class DiskLruCache$Entry$newSource$1 extends C10620l {
    final /* synthetic */ C10598d0 $fileSource;
    private boolean closed;
    final /* synthetic */ DiskLruCache.Entry this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiskLruCache$Entry$newSource$1(DiskLruCache.Entry entry, C10598d0 d0Var, C10598d0 d0Var2) {
        super(d0Var2);
        this.this$0 = entry;
        this.$fileSource = d0Var;
    }

    public void close() {
        super.close();
        if (!this.closed) {
            this.closed = true;
            synchronized (this.this$0.this$0) {
                DiskLruCache.Entry entry = this.this$0;
                entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                if (this.this$0.getLockingSourceCount$okhttp() == 0 && this.this$0.getZombie$okhttp()) {
                    DiskLruCache.Entry entry2 = this.this$0;
                    entry2.this$0.removeEntry$okhttp(entry2);
                }
                C10323s sVar = C10323s.f27547a;
            }
        }
    }
}
