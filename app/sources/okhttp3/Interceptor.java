package okhttp3;

import java.util.concurrent.TimeUnit;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;

public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request);

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(C10430l<? super Chain, Response> lVar) {
            C10457l.m35320e(lVar, "block");
            return new Interceptor$Companion$invoke$1(lVar);
        }
    }

    Response intercept(Chain chain);
}
