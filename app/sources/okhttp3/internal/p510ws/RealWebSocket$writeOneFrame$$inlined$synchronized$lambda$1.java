package okhttp3.internal.p510ws;

import okhttp3.internal.concurrent.Task;
import p455g.p470y.p472d.C10465t;
import p455g.p470y.p472d.C10467v;
import p493i.C10616i;

/* renamed from: okhttp3.internal.ws.RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1 */
public final class RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ C10467v $messageOrClose$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ C10616i $pong$inlined;
    final /* synthetic */ C10467v $readerToClose$inlined;
    final /* synthetic */ C10465t $receivedCloseCode$inlined;
    final /* synthetic */ C10467v $receivedCloseReason$inlined;
    final /* synthetic */ C10467v $streamsToClose$inlined;
    final /* synthetic */ WebSocketWriter $writer$inlined;
    final /* synthetic */ C10467v $writerToClose$inlined;
    final /* synthetic */ RealWebSocket this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1(String str, boolean z, String str2, boolean z2, RealWebSocket realWebSocket, WebSocketWriter webSocketWriter, C10616i iVar, C10467v vVar, C10465t tVar, C10467v vVar2, C10467v vVar3, C10467v vVar4, C10467v vVar5) {
        super(str2, z2);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = realWebSocket;
        this.$writer$inlined = webSocketWriter;
        this.$pong$inlined = iVar;
        this.$messageOrClose$inlined = vVar;
        this.$receivedCloseCode$inlined = tVar;
        this.$receivedCloseReason$inlined = vVar2;
        this.$streamsToClose$inlined = vVar3;
        this.$readerToClose$inlined = vVar4;
        this.$writerToClose$inlined = vVar5;
    }

    public long runOnce() {
        this.this$0.cancel();
        return -1;
    }
}
