package org.reactnative.facedetector;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.reactnative.facedetector.p516c.C10998a;

public class FaceDetectorModule extends ReactContextBaseJavaModule {
    private static final String TAG = "RNFaceDetector";
    private static ReactApplicationContext mScopedContext;

    /* renamed from: org.reactnative.facedetector.FaceDetectorModule$a */
    class C10992a extends HashMap<String, Object> {

        /* renamed from: org.reactnative.facedetector.FaceDetectorModule$a$a */
        class C10993a extends HashMap<String, Object> {
            C10993a() {
                put("fast", Integer.valueOf(C10997b.f28822f));
                put("accurate", Integer.valueOf(C10997b.f28821e));
            }
        }

        /* renamed from: org.reactnative.facedetector.FaceDetectorModule$a$b */
        class C10994b extends HashMap<String, Object> {
            C10994b() {
                put("all", Integer.valueOf(C10997b.f28817a));
                put("none", Integer.valueOf(C10997b.f28818b));
            }
        }

        /* renamed from: org.reactnative.facedetector.FaceDetectorModule$a$c */
        class C10995c extends HashMap<String, Object> {
            C10995c() {
                put("all", Integer.valueOf(C10997b.f28819c));
                put("none", Integer.valueOf(C10997b.f28820d));
            }
        }

        C10992a() {
            put("Mode", m37299e());
            put("Landmarks", m37298d());
            put("Classifications", m37297c());
        }

        /* renamed from: c */
        private Map<String, Object> m37297c() {
            return Collections.unmodifiableMap(new C10994b());
        }

        /* renamed from: d */
        private Map<String, Object> m37298d() {
            return Collections.unmodifiableMap(new C10995c());
        }

        /* renamed from: e */
        private Map<String, Object> m37299e() {
            return Collections.unmodifiableMap(new C10993a());
        }
    }

    public FaceDetectorModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        mScopedContext = reactApplicationContext;
    }

    @ReactMethod
    public void detectFaces(ReadableMap readableMap, Promise promise) {
        new C10998a(mScopedContext, readableMap, promise).execute(new Void[0]);
    }

    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new C10992a());
    }

    public String getName() {
        return TAG;
    }
}
