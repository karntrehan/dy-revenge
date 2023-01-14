package okhttp3.internal.connection;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import p455g.p470y.p472d.C10457l;

public final class ConnectInterceptor implements Interceptor {
    public static final ConnectInterceptor INSTANCE = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    public Response intercept(Interceptor.Chain chain) {
        C10457l.m35320e(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        return RealInterceptorChain.copy$okhttp$default(realInterceptorChain, 0, realInterceptorChain.getCall$okhttp().initExchange$okhttp(realInterceptorChain), (Request) null, 0, 0, 0, 61, (Object) null).proceed(realInterceptorChain.getRequest$okhttp());
    }
}
