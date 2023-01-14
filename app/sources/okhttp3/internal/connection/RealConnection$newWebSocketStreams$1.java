package okhttp3.internal.connection;

import okhttp3.internal.p510ws.RealWebSocket;
import p493i.C10608g;
import p493i.C10615h;

public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    final /* synthetic */ Exchange $exchange;
    final /* synthetic */ C10608g $sink;
    final /* synthetic */ C10615h $source;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealConnection$newWebSocketStreams$1(Exchange exchange, C10615h hVar, C10608g gVar, boolean z, C10615h hVar2, C10608g gVar2) {
        super(z, hVar2, gVar2);
        this.$exchange = exchange;
        this.$source = hVar;
        this.$sink = gVar;
    }

    public void close() {
        this.$exchange.bodyComplete(-1, true, true, null);
    }
}
