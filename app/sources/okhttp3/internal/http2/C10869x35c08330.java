package okhttp3.internal.http2;

import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;
import p455g.p470y.p472d.C10466u;
import p455g.p470y.p472d.C10467v;

/* renamed from: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1 */
public final class C10869x35c08330 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ boolean $clearPrevious$inlined;
    final /* synthetic */ C10466u $delta$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ C10467v $newPeerSettings$inlined;
    final /* synthetic */ Settings $settings$inlined;
    final /* synthetic */ C10467v $streamsToNotify$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10869x35c08330(String str, boolean z, String str2, boolean z2, Http2Connection.ReaderRunnable readerRunnable, C10467v vVar, boolean z3, Settings settings, C10466u uVar, C10467v vVar2) {
        super(str2, z2);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = readerRunnable;
        this.$newPeerSettings$inlined = vVar;
        this.$clearPrevious$inlined = z3;
        this.$settings$inlined = settings;
        this.$delta$inlined = uVar;
        this.$streamsToNotify$inlined = vVar2;
    }

    public long runOnce() {
        this.this$0.this$0.getListener$okhttp().onSettings(this.this$0.this$0, (Settings) this.$newPeerSettings$inlined.f27625f);
        return -1;
    }
}
