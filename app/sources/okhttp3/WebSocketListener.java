package okhttp3;

import p455g.p470y.p472d.C10457l;
import p493i.C10616i;

public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
        C10457l.m35320e(webSocket, "webSocket");
        C10457l.m35320e(str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        C10457l.m35320e(webSocket, "webSocket");
        C10457l.m35320e(str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        C10457l.m35320e(webSocket, "webSocket");
        C10457l.m35320e(th, "t");
    }

    public void onMessage(WebSocket webSocket, C10616i iVar) {
        C10457l.m35320e(webSocket, "webSocket");
        C10457l.m35320e(iVar, "bytes");
    }

    public void onMessage(WebSocket webSocket, String str) {
        C10457l.m35320e(webSocket, "webSocket");
        C10457l.m35320e(str, "text");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        C10457l.m35320e(webSocket, "webSocket");
        C10457l.m35320e(response, "response");
    }
}
