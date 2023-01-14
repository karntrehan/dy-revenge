package okhttp3.internal;

import okhttp3.Call;
import okhttp3.EventListener;
import p455g.p470y.p472d.C10457l;

final class Util$asFactory$1 implements EventListener.Factory {
    final /* synthetic */ EventListener $this_asFactory;

    Util$asFactory$1(EventListener eventListener) {
        this.$this_asFactory = eventListener;
    }

    public final EventListener create(Call call) {
        C10457l.m35320e(call, "it");
        return this.$this_asFactory;
    }
}
