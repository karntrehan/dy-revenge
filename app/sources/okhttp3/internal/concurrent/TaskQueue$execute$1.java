package okhttp3.internal.concurrent;

import p455g.p470y.p471c.C10419a;

public final class TaskQueue$execute$1 extends Task {
    final /* synthetic */ C10419a $block;
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(C10419a aVar, String str, boolean z, String str2, boolean z2) {
        super(str2, z2);
        this.$block = aVar;
        this.$name = str;
        this.$cancelable = z;
    }

    public long runOnce() {
        this.$block.invoke();
        return -1;
    }
}
