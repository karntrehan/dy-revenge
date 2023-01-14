package okhttp3;

import okhttp3.Interceptor;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;

public final class OkHttpClient$Builder$addNetworkInterceptor$2 implements Interceptor {
    final /* synthetic */ C10430l $block;

    public OkHttpClient$Builder$addNetworkInterceptor$2(C10430l lVar) {
        this.$block = lVar;
    }

    public final Response intercept(Interceptor.Chain chain) {
        C10457l.m35320e(chain, "chain");
        return (Response) this.$block.invoke(chain);
    }
}
