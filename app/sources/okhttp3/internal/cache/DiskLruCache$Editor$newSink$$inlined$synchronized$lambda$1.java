package okhttp3.internal.cache;

import java.io.IOException;
import okhttp3.internal.cache.DiskLruCache;
import p455g.C10323s;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10458m;

final class DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 extends C10458m implements C10430l<IOException, C10323s> {
    final /* synthetic */ int $index$inlined;
    final /* synthetic */ DiskLruCache.Editor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(DiskLruCache.Editor editor, int i) {
        super(1);
        this.this$0 = editor;
        this.$index$inlined = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return C10323s.f27547a;
    }

    public final void invoke(IOException iOException) {
        C10457l.m35320e(iOException, "it");
        synchronized (this.this$0.this$0) {
            this.this$0.detach$okhttp();
            C10323s sVar = C10323s.f27547a;
        }
    }
}
