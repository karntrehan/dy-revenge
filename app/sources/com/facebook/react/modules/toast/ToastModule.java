package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import java.util.HashMap;
import java.util.Map;

@C2639a(name = "ToastAndroid")
public class ToastModule extends NativeToastAndroidSpec {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    /* renamed from: com.facebook.react.modules.toast.ToastModule$a */
    class C2880a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f8081f;

        /* renamed from: o */
        final /* synthetic */ int f8082o;

        C2880a(String str, int i) {
            this.f8081f = str;
            this.f8082o = i;
        }

        public void run() {
            Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f8081f, this.f8082o).show();
        }
    }

    /* renamed from: com.facebook.react.modules.toast.ToastModule$b */
    class C2881b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f8084f;

        /* renamed from: o */
        final /* synthetic */ int f8085o;

        /* renamed from: p */
        final /* synthetic */ int f8086p;

        C2881b(String str, int i, int i2) {
            this.f8084f = str;
            this.f8085o = i;
            this.f8086p = i2;
        }

        public void run() {
            Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f8084f, this.f8085o);
            makeText.setGravity(this.f8086p, 0, 0);
            makeText.show();
        }
    }

    /* renamed from: com.facebook.react.modules.toast.ToastModule$c */
    class C2882c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f8088f;

        /* renamed from: o */
        final /* synthetic */ int f8089o;

        /* renamed from: p */
        final /* synthetic */ int f8090p;

        /* renamed from: q */
        final /* synthetic */ int f8091q;

        /* renamed from: r */
        final /* synthetic */ int f8092r;

        C2882c(String str, int i, int i2, int i3, int i4) {
            this.f8088f = str;
            this.f8089o = i;
            this.f8090p = i2;
            this.f8091q = i3;
            this.f8092r = i4;
        }

        public void run() {
            Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f8088f, this.f8089o);
            makeText.setGravity(this.f8090p, this.f8091q, this.f8092r);
            makeText.show();
        }
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return NAME;
    }

    public Map<String, Object> getTypedExportedConstants() {
        HashMap b = C2693e.m10912b();
        b.put(DURATION_SHORT_KEY, 0);
        b.put(DURATION_LONG_KEY, 1);
        b.put(GRAVITY_TOP_KEY, 49);
        b.put(GRAVITY_BOTTOM_KEY, 81);
        b.put(GRAVITY_CENTER, 17);
        return b;
    }

    public void show(String str, double d) {
        UiThreadUtil.runOnUiThread(new C2880a(str, (int) d));
    }

    public void showWithGravity(String str, double d, double d2) {
        UiThreadUtil.runOnUiThread(new C2881b(str, (int) d, (int) d2));
    }

    public void showWithGravityAndOffset(String str, double d, double d2, double d3, double d4) {
        int i = (int) d2;
        UiThreadUtil.runOnUiThread(new C2882c(str, (int) d, i, (int) d3, (int) d4));
    }
}
