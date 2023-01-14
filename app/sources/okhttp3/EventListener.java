package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

public abstract class EventListener {
    public static final Companion Companion = new Companion((C10452g) null);
    public static final EventListener NONE = new EventListener$Companion$NONE$1();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response response) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(response, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(response, "response");
    }

    public void cacheMiss(Call call) {
        C10457l.m35320e(call, "call");
    }

    public void callEnd(Call call) {
        C10457l.m35320e(call, "call");
    }

    public void callFailed(Call call, IOException iOException) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(iOException, "ioe");
    }

    public void callStart(Call call) {
        C10457l.m35320e(call, "call");
    }

    public void canceled(Call call) {
        C10457l.m35320e(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(inetSocketAddress, "inetSocketAddress");
        C10457l.m35320e(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(inetSocketAddress, "inetSocketAddress");
        C10457l.m35320e(proxy, "proxy");
        C10457l.m35320e(iOException, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(inetSocketAddress, "inetSocketAddress");
        C10457l.m35320e(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(connection, "connection");
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(str, "domainName");
        C10457l.m35320e(list, "inetAddressList");
    }

    public void dnsStart(Call call, String str) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(str, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(httpUrl, "url");
        C10457l.m35320e(list, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(httpUrl, "url");
    }

    public void requestBodyEnd(Call call, long j) {
        C10457l.m35320e(call, "call");
    }

    public void requestBodyStart(Call call) {
        C10457l.m35320e(call, "call");
    }

    public void requestFailed(Call call, IOException iOException) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(iOException, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(request, "request");
    }

    public void requestHeadersStart(Call call) {
        C10457l.m35320e(call, "call");
    }

    public void responseBodyEnd(Call call, long j) {
        C10457l.m35320e(call, "call");
    }

    public void responseBodyStart(Call call) {
        C10457l.m35320e(call, "call");
    }

    public void responseFailed(Call call, IOException iOException) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(iOException, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(response, "response");
    }

    public void responseHeadersStart(Call call) {
        C10457l.m35320e(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        C10457l.m35320e(call, "call");
        C10457l.m35320e(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        C10457l.m35320e(call, "call");
    }

    public void secureConnectStart(Call call) {
        C10457l.m35320e(call, "call");
    }
}
