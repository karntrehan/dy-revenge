package p174e.p247e.p294k.p297b.p298a;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.C2465c;
import com.facebook.imagepipeline.producers.C2472e;
import com.facebook.imagepipeline.producers.C2503k0;
import com.facebook.imagepipeline.producers.C2505l;
import com.facebook.imagepipeline.producers.C2531p0;
import com.facebook.imagepipeline.producers.C2553w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p174e.p247e.p294k.p301e.C6312a;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: e.e.k.b.a.b */
public class C6260b extends C2465c<C6264c> {

    /* renamed from: a */
    private final Call.Factory f17339a;

    /* renamed from: b */
    private final CacheControl f17340b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Executor f17341c;

    /* renamed from: e.e.k.b.a.b$a */
    class C6261a extends C2472e {

        /* renamed from: a */
        final /* synthetic */ Call f17342a;

        /* renamed from: e.e.k.b.a.b$a$a */
        class C6262a implements Runnable {
            C6262a() {
            }

            public void run() {
                C6261a.this.f17342a.cancel();
            }
        }

        C6261a(Call call) {
            this.f17342a = call;
        }

        /* renamed from: a */
        public void mo8208a() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f17342a.cancel();
            } else {
                C6260b.this.f17341c.execute(new C6262a());
            }
        }
    }

    /* renamed from: e.e.k.b.a.b$b */
    class C6263b implements Callback {

        /* renamed from: a */
        final /* synthetic */ C6264c f17345a;

        /* renamed from: b */
        final /* synthetic */ C2503k0.C2504a f17346b;

        C6263b(C6264c cVar, C2503k0.C2504a aVar) {
            this.f17345a = cVar;
            this.f17346b = aVar;
        }

        public void onFailure(Call call, IOException iOException) {
            C6260b.this.m23729l(call, iOException, this.f17346b);
        }

        public void onResponse(Call call, Response response) {
            this.f17345a.f17349g = SystemClock.elapsedRealtime();
            ResponseBody body = response.body();
            if (body == null) {
                C6260b.this.m23729l(call, new IOException("Response body null: " + response), this.f17346b);
                return;
            }
            try {
                if (!response.isSuccessful()) {
                    C6260b.this.m23729l(call, new IOException("Unexpected HTTP code " + response), this.f17346b);
                    body.close();
                    return;
                }
                C6312a c = C6312a.m23905c(response.header("Content-Range"));
                if (!(c == null || (c.f17439b == 0 && c.f17440c == Integer.MAX_VALUE))) {
                    this.f17345a.mo8352j(c);
                    this.f17345a.mo8351i(8);
                }
                long contentLength = body.contentLength();
                if (contentLength < 0) {
                    contentLength = 0;
                }
                this.f17346b.mo8300c(body.byteStream(), (int) contentLength);
                body.close();
            } catch (Exception e) {
                C6260b.this.m23729l(call, e, this.f17346b);
            } catch (Throwable th) {
                body.close();
                throw th;
            }
        }
    }

    /* renamed from: e.e.k.b.a.b$c */
    public static class C6264c extends C2553w {

        /* renamed from: f */
        public long f17348f;

        /* renamed from: g */
        public long f17349g;

        /* renamed from: h */
        public long f17350h;

        public C6264c(C2505l<C6369d> lVar, C2531p0 p0Var) {
            super(lVar, p0Var);
        }
    }

    public C6260b(Call.Factory factory, Executor executor) {
        this(factory, executor, true);
    }

    public C6260b(Call.Factory factory, Executor executor, boolean z) {
        this.f17339a = factory;
        this.f17341c = executor;
        this.f17340b = z ? new CacheControl.Builder().noStore().build() : null;
    }

    public C6260b(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.dispatcher().executorService());
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m23729l(Call call, Exception exc, C2503k0.C2504a aVar) {
        if (call.isCanceled()) {
            aVar.mo8298a();
        } else {
            aVar.mo8299b(exc);
        }
    }

    /* renamed from: h */
    public C6264c mo8305e(C2505l<C6369d> lVar, C2531p0 p0Var) {
        return new C6264c(lVar, p0Var);
    }

    /* renamed from: i */
    public void mo8304d(C6264c cVar, C2503k0.C2504a aVar) {
        cVar.f17348f = SystemClock.elapsedRealtime();
        try {
            Request.Builder builder = new Request.Builder().url(cVar.mo8349g().toString()).get();
            CacheControl cacheControl = this.f17340b;
            if (cacheControl != null) {
                builder.cacheControl(cacheControl);
            }
            C6312a b = cVar.mo8344b().mo8240f().mo18920b();
            if (b != null) {
                builder.addHeader("Range", b.mo18666d());
            }
            mo18577j(cVar, aVar, builder.build());
        } catch (Exception e) {
            aVar.mo8299b(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo18577j(C6264c cVar, C2503k0.C2504a aVar, Request request) {
        Call newCall = this.f17339a.newCall(request);
        cVar.mo8344b().mo8241g(new C6261a(newCall));
        newCall.enqueue(new C6263b(cVar, aVar));
    }

    /* renamed from: k */
    public Map<String, String> mo8303c(C6264c cVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f17349g - cVar.f17348f));
        hashMap.put("fetch_time", Long.toString(cVar.f17350h - cVar.f17349g));
        hashMap.put("total_time", Long.toString(cVar.f17350h - cVar.f17348f));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    /* renamed from: m */
    public void mo8302a(C6264c cVar, int i) {
        cVar.f17350h = SystemClock.elapsedRealtime();
    }
}
