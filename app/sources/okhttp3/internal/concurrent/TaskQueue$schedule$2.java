package okhttp3.internal.concurrent;

import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10452g;

public final class TaskQueue$schedule$2 extends Task {
    final /* synthetic */ C10419a $block;
    final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskQueue$schedule$2(C10419a aVar, String str, String str2) {
        super(str2, false, 2, (C10452g) null);
        this.$block = aVar;
        this.$name = str;
    }

    public long runOnce() {
        return ((Number) this.$block.invoke()).longValue();
    }
}
