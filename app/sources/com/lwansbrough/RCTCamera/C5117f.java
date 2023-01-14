package com.lwansbrough.RCTCamera;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: com.lwansbrough.RCTCamera.f */
public class C5117f {

    /* renamed from: a */
    int f14512a = 0;

    /* renamed from: b */
    private SensorEventListener f14513b = new C5119b();

    /* renamed from: c */
    private SensorManager f14514c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5120g f14515d = null;

    /* renamed from: com.lwansbrough.RCTCamera.f$b */
    private class C5119b implements SensorEventListener {
        private C5119b() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSensorChanged(android.hardware.SensorEvent r8) {
            /*
                r7 = this;
                float[] r8 = r8.values
                r0 = 0
                r1 = r8[r0]
                r2 = 1
                r8 = r8[r2]
                r3 = 1084227584(0x40a00000, float:5.0)
                r4 = -1063256064(0xffffffffc0a00000, float:-5.0)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x001d
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x001d
                int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r6 <= 0) goto L_0x001d
                com.lwansbrough.RCTCamera.f r8 = com.lwansbrough.RCTCamera.C5117f.this
            L_0x001a:
                r8.f14512a = r0
                goto L_0x004b
            L_0x001d:
                int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r0 >= 0) goto L_0x002d
                int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r0 >= 0) goto L_0x002d
                int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
                com.lwansbrough.RCTCamera.f r8 = com.lwansbrough.RCTCamera.C5117f.this
                r0 = 3
                goto L_0x001a
            L_0x002d:
                if (r5 >= 0) goto L_0x003b
                int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003b
                int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r0 >= 0) goto L_0x003b
                com.lwansbrough.RCTCamera.f r8 = com.lwansbrough.RCTCamera.C5117f.this
                r0 = 2
                goto L_0x001a
            L_0x003b:
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 <= 0) goto L_0x004b
                int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r0 >= 0) goto L_0x004b
                int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r8 <= 0) goto L_0x004b
                com.lwansbrough.RCTCamera.f r8 = com.lwansbrough.RCTCamera.C5117f.this
                r8.f14512a = r2
            L_0x004b:
                com.lwansbrough.RCTCamera.f r8 = com.lwansbrough.RCTCamera.C5117f.this
                com.lwansbrough.RCTCamera.g r8 = r8.f14515d
                if (r8 == 0) goto L_0x005c
                com.lwansbrough.RCTCamera.f r8 = com.lwansbrough.RCTCamera.C5117f.this
                com.lwansbrough.RCTCamera.g r8 = r8.f14515d
                r8.mo15554a()
            L_0x005c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lwansbrough.RCTCamera.C5117f.C5119b.onSensorChanged(android.hardware.SensorEvent):void");
        }
    }

    public C5117f(ReactApplicationContext reactApplicationContext) {
        this.f14514c = (SensorManager) reactApplicationContext.getSystemService("sensor");
    }

    /* renamed from: b */
    public int mo15643b() {
        return this.f14512a;
    }

    /* renamed from: c */
    public void mo15644c() {
        this.f14514c.unregisterListener(this.f14513b);
    }

    /* renamed from: d */
    public void mo15645d() {
        SensorManager sensorManager = this.f14514c;
        sensorManager.registerListener(this.f14513b, sensorManager.getDefaultSensor(1), 3);
    }

    /* renamed from: e */
    public void mo15646e(C5120g gVar) {
        this.f14515d = gVar;
    }

    /* renamed from: f */
    public void mo15647f() {
        this.f14515d = null;
    }
}
