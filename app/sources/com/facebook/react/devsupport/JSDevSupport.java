package com.facebook.react.devsupport;

import android.view.View;
import com.facebook.fbreact.specs.NativeJSDevSupportSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p109b0.p110a.C2639a;
import java.util.HashMap;
import java.util.Map;

@C2639a(name = "JSDevSupport")
public class JSDevSupport extends NativeJSDevSupportSpec {
    public static final int ERROR_CODE_EXCEPTION = 0;
    public static final int ERROR_CODE_VIEW_NOT_FOUND = 1;
    public static final String MODULE_NAME = "JSDevSupport";
    private volatile C2712a mCurrentCallback = null;

    public interface JSDevSupportModule extends JavaScriptModule {
        void getJSHierarchy(int i);
    }

    /* renamed from: com.facebook.react.devsupport.JSDevSupport$a */
    public interface C2712a {
        /* renamed from: a */
        void mo8871a(int i, Exception exc);

        /* renamed from: b */
        void mo8872b(String str);
    }

    public JSDevSupport(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public synchronized void computeDeepestJSHierarchy(View view, C2712a aVar) {
        getJSHierarchy(Integer.valueOf(((View) C2726i.m11017a(view).first).getId()).intValue(), aVar);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.facebook.react.bridge.JavaScriptModule] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void getJSHierarchy(int r3, com.facebook.react.devsupport.JSDevSupport.C2712a r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.facebook.react.bridge.ReactApplicationContext r0 = r2.getReactApplicationContextIfActiveOrWarn()     // Catch:{ all -> 0x0027 }
            r1 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.Class<com.facebook.react.devsupport.JSDevSupport$JSDevSupportModule> r1 = com.facebook.react.devsupport.JSDevSupport.JSDevSupportModule.class
            com.facebook.react.bridge.JavaScriptModule r0 = r0.getJSModule(r1)     // Catch:{ all -> 0x0027 }
            r1 = r0
            com.facebook.react.devsupport.JSDevSupport$JSDevSupportModule r1 = (com.facebook.react.devsupport.JSDevSupport.JSDevSupportModule) r1     // Catch:{ all -> 0x0027 }
        L_0x0011:
            if (r1 != 0) goto L_0x0020
            r3 = 0
            com.facebook.react.devsupport.JSCHeapCapture$b r0 = new com.facebook.react.devsupport.JSCHeapCapture$b     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = "JSDevSupport module not registered."
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            r4.mo8871a(r3, r0)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0020:
            r2.mCurrentCallback = r4     // Catch:{ all -> 0x0027 }
            r1.getJSHierarchy(r3)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.JSDevSupport.getJSHierarchy(int, com.facebook.react.devsupport.JSDevSupport$a):void");
    }

    public String getName() {
        return MODULE_NAME;
    }

    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("ERROR_CODE_EXCEPTION", 0);
        hashMap.put("ERROR_CODE_VIEW_NOT_FOUND", 1);
        return hashMap;
    }

    public synchronized void onFailure(double d, String str) {
        int i = (int) d;
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.mo8871a(i, new RuntimeException(str));
        }
    }

    public synchronized void onSuccess(String str) {
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.mo8872b(str);
        }
    }
}
