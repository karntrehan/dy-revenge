package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.URI;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10458m;

final class RouteSelector$resetNextProxy$1 extends C10458m implements C10419a<List<? extends Proxy>> {
    final /* synthetic */ Proxy $proxy;
    final /* synthetic */ HttpUrl $url;
    final /* synthetic */ RouteSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteSelector$resetNextProxy$1(RouteSelector routeSelector, Proxy proxy, HttpUrl httpUrl) {
        super(0);
        this.this$0 = routeSelector;
        this.$proxy = proxy;
        this.$url = httpUrl;
    }

    public final List<Proxy> invoke() {
        Proxy proxy = this.$proxy;
        if (proxy != null) {
            return C10349k.m35133b(proxy);
        }
        URI uri = this.$url.uri();
        if (uri.getHost() == null) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        List<Proxy> select = this.this$0.address.proxySelector().select(uri);
        if (!(select == null || select.isEmpty())) {
            return Util.toImmutableList(select);
        }
        return Util.immutableListOf(Proxy.NO_PROXY);
    }
}
