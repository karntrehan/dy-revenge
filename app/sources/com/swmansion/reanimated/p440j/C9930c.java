package com.swmansion.reanimated.p440j;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.swmansion.reanimated.NativeProxy;

/* renamed from: com.swmansion.reanimated.j.c */
public class C9930c implements SensorEventListener {

    /* renamed from: a */
    private NativeProxy.SensorSetter f26569a;

    /* renamed from: b */
    private double f26570b = ((double) System.currentTimeMillis());

    /* renamed from: c */
    private final double f26571c;

    /* renamed from: d */
    private float[] f26572d = new float[9];

    /* renamed from: e */
    private float[] f26573e = new float[3];

    /* renamed from: f */
    private float[] f26574f = new float[4];

    C9930c(NativeProxy.SensorSetter sensorSetter, double d) {
        this.f26569a = sensorSetter;
        this.f26571c = d;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        double currentTimeMillis = (double) System.currentTimeMillis();
        if (currentTimeMillis - this.f26570b >= this.f26571c) {
            int type = sensorEvent.sensor.getType();
            this.f26570b = currentTimeMillis;
            if (type == 11) {
                SensorManager.getQuaternionFromVector(this.f26574f, sensorEvent.values);
                SensorManager.getRotationMatrixFromVector(this.f26572d, sensorEvent.values);
                SensorManager.getOrientation(this.f26572d, this.f26573e);
                float[] fArr = this.f26574f;
                float[] fArr2 = this.f26573e;
                this.f26569a.sensorSetter(new float[]{fArr[1], fArr[2], fArr[3], fArr[0], fArr2[0], fArr2[1], fArr2[2]});
                return;
            }
            this.f26569a.sensorSetter(sensorEvent.values);
        }
    }
}
