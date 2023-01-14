package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.fresco.C2819a;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p116f0.p118b.C2758a;
import com.facebook.react.views.image.C3102f;
import okhttp3.HttpUrl;
import p174e.p247e.p253d.p255b.C6036a;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p266e.C6121b;
import p174e.p247e.p266e.C6122c;
import p174e.p247e.p274h.p275a.p276a.C6142c;
import p174e.p247e.p294k.p302f.C6327h;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p311o.C6388c;

@C2639a(name = "ImageLoader")
public class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private final Object mCallerContext;
    private C3102f mCallerContextFactory;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<C6122c<Void>> mEnqueuedRequests;
    private C6327h mImagePipeline;

    /* renamed from: com.facebook.react.modules.image.ImageLoaderModule$a */
    class C2823a extends C6121b<C6088a<C6367b>> {

        /* renamed from: a */
        final /* synthetic */ Promise f7975a;

        C2823a(Promise promise) {
            this.f7975a = promise;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo9194e(C6122c<C6088a<C6367b>> cVar) {
            this.f7975a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.mo18119e());
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo9195f(C6122c<C6088a<C6367b>> cVar) {
            if (cVar.mo18118d()) {
                C6088a h = cVar.mo18122h();
                if (h != null) {
                    try {
                        C6367b bVar = (C6367b) h.mo18082w0();
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt("width", bVar.mo15982e());
                        createMap.putInt("height", bVar.mo15981c());
                        this.f7975a.resolve(createMap);
                    } catch (Exception e) {
                        this.f7975a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, (Throwable) e);
                    } catch (Throwable th) {
                        C6088a.m22949v0(h);
                        throw th;
                    }
                    C6088a.m22949v0(h);
                    return;
                }
                this.f7975a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
            }
        }
    }

    /* renamed from: com.facebook.react.modules.image.ImageLoaderModule$b */
    class C2824b extends C6121b<C6088a<C6367b>> {

        /* renamed from: a */
        final /* synthetic */ Promise f7977a;

        C2824b(Promise promise) {
            this.f7977a = promise;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo9194e(C6122c<C6088a<C6367b>> cVar) {
            this.f7977a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.mo18119e());
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo9195f(C6122c<C6088a<C6367b>> cVar) {
            if (cVar.mo18118d()) {
                C6088a h = cVar.mo18122h();
                if (h != null) {
                    try {
                        C6367b bVar = (C6367b) h.mo18082w0();
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt("width", bVar.mo15982e());
                        createMap.putInt("height", bVar.mo15981c());
                        this.f7977a.resolve(createMap);
                    } catch (Exception e) {
                        this.f7977a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, (Throwable) e);
                    } catch (Throwable th) {
                        C6088a.m22949v0(h);
                        throw th;
                    }
                    C6088a.m22949v0(h);
                    return;
                }
                this.f7977a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
            }
        }
    }

    /* renamed from: com.facebook.react.modules.image.ImageLoaderModule$c */
    class C2825c extends C6121b<Void> {

        /* renamed from: a */
        final /* synthetic */ int f7979a;

        /* renamed from: b */
        final /* synthetic */ Promise f7980b;

        C2825c(int i, Promise promise) {
            this.f7979a = i;
            this.f7980b = promise;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo9194e(C6122c<Void> cVar) {
            try {
                C6122c unused = ImageLoaderModule.this.removeRequest(this.f7979a);
                this.f7980b.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, cVar.mo18119e());
            } finally {
                cVar.close();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo9195f(C6122c<Void> cVar) {
            if (cVar.mo18118d()) {
                try {
                    C6122c unused = ImageLoaderModule.this.removeRequest(this.f7979a);
                    this.f7980b.resolve(Boolean.TRUE);
                } catch (Exception e) {
                    this.f7980b.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, (Throwable) e);
                } catch (Throwable th) {
                    cVar.close();
                    throw th;
                }
                cVar.close();
            }
        }
    }

    /* renamed from: com.facebook.react.modules.image.ImageLoaderModule$d */
    class C2826d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ ReadableArray f7982a;

        /* renamed from: b */
        final /* synthetic */ Promise f7983b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2826d(ReactContext reactContext, ReadableArray readableArray, Promise promise) {
            super(reactContext);
            this.f7982a = readableArray;
            this.f7983b = promise;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            String str;
            WritableMap createMap = Arguments.createMap();
            C6327h access$100 = ImageLoaderModule.this.getImagePipeline();
            for (int i = 0; i < this.f7982a.size(); i++) {
                String string = this.f7982a.getString(i);
                Uri parse = Uri.parse(string);
                if (access$100.mo18720m(parse)) {
                    str = "memory";
                } else if (access$100.mo18722o(parse)) {
                    str = "disk";
                }
                createMap.putString(string, str);
            }
            this.f7983b.resolve(createMap);
        }
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mImagePipeline = null;
        this.mCallerContext = this;
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, C6327h hVar, C3102f fVar) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mImagePipeline = null;
        this.mCallerContextFactory = fVar;
        this.mImagePipeline = hVar;
        this.mCallerContext = null;
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mImagePipeline = null;
        this.mCallerContext = obj;
    }

    private Object getCallerContext() {
        C3102f fVar = this.mCallerContextFactory;
        return fVar != null ? fVar.mo9955a(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET) : this.mCallerContext;
    }

    /* access modifiers changed from: private */
    public C6327h getImagePipeline() {
        C6327h hVar = this.mImagePipeline;
        return hVar != null ? hVar : C6142c.m23126a();
    }

    private void registerRequest(int i, C6122c<Void> cVar) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, cVar);
        }
    }

    /* access modifiers changed from: private */
    public C6122c<Void> removeRequest(int i) {
        C6122c<Void> cVar;
        synchronized (this.mEnqueuedRequestMonitor) {
            cVar = this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return cVar;
    }

    public void abortRequest(double d) {
        C6122c<Void> removeRequest = removeRequest((int) d);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getSize(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        getImagePipeline().mo18711d(C6388c.m24438s(new C2758a(getReactApplicationContext(), str).mo9021e()).mo18956a(), getCallerContext()).mo18123i(new C2823a(promise), C6036a.m22791a());
    }

    @ReactMethod
    public void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        getImagePipeline().mo18711d(C2819a.m11231x(C6388c.m24438s(new C2758a(getReactApplicationContext(), str).mo9021e()), readableMap), getCallerContext()).mo18123i(new C2824b(promise), C6036a.m22791a());
    }

    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                C6122c valueAt = this.mEnqueuedRequests.valueAt(i);
                if (valueAt != null) {
                    valueAt.close();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public void prefetchImage(String str, double d, Promise promise) {
        int i = (int) d;
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        C6122c<Void> s = getImagePipeline().mo18725s(C6388c.m24438s(Uri.parse(str)).mo18956a(), getCallerContext());
        C2825c cVar = new C2825c(i, promise);
        registerRequest(i, s);
        s.mo18123i(cVar, C6036a.m22791a());
    }

    @ReactMethod
    public void queryCache(ReadableArray readableArray, Promise promise) {
        new C2826d(getReactApplicationContext(), readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
