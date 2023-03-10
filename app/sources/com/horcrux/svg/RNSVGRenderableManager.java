package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.p106BV.LinearGradient.LinearGradientManager;

class RNSVGRenderableManager extends ReactContextBaseJavaModule {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int EOF = -1;

    RNSVGRenderableManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getBBox(int i, ReadableMap readableMap) {
        C5017b0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        boolean z = readableMap.getBoolean("fill");
        boolean z2 = readableMap.getBoolean("stroke");
        boolean z3 = readableMap.getBoolean("markers");
        boolean z4 = readableMap.getBoolean("clipped");
        try {
            renderableViewByTag.mo15183I((Canvas) null, (Paint) null);
            float f = renderableViewByTag.f14354b0;
            renderableViewByTag.mo15197U();
            RectF rectF = new RectF();
            RectF rectF2 = renderableViewByTag.f14373u0;
            RectF rectF3 = renderableViewByTag.f14374v0;
            RectF rectF4 = renderableViewByTag.f14375w0;
            RectF rectF5 = renderableViewByTag.f14376x0;
            if (z && rectF2 != null) {
                rectF.union(rectF2);
            }
            if (z2 && rectF3 != null) {
                rectF.union(rectF3);
            }
            if (z3 && rectF4 != null) {
                rectF.union(rectF4);
            }
            if (z4 && rectF5 != null) {
                rectF.intersect(rectF5);
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("x", (double) (rectF.left / f));
            createMap.putDouble("y", (double) (rectF.top / f));
            createMap.putDouble("width", (double) (rectF.width() / f));
            createMap.putDouble("height", (double) (rectF.height() / f));
            return createMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCTM(int i) {
        C5017b0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float f = renderableViewByTag.f14354b0;
        Matrix matrix = new Matrix(renderableViewByTag.f14338I);
        matrix.preConcat(renderableViewByTag.getSvgView().f14057a0);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("a", (double) fArr[0]);
        createMap.putDouble("b", (double) fArr[3]);
        createMap.putDouble("c", (double) fArr[1]);
        createMap.putDouble("d", (double) fArr[4]);
        createMap.putDouble("e", (double) (fArr[2] / f));
        createMap.putDouble("f", (double) (fArr[5] / f));
        return createMap;
    }

    public String getName() {
        return "RNSVGRenderableManager";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPointAtLength(int i, ReadableMap readableMap) {
        C5017b0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        try {
            PathMeasure pathMeasure = new PathMeasure(renderableViewByTag.mo15183I((Canvas) null, (Paint) null), false);
            float f = (float) readableMap.getDouble("length");
            float f2 = renderableViewByTag.f14354b0;
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            pathMeasure.getPosTan(Math.max(0.0f, Math.min(f, pathMeasure.getLength())), fArr, fArr2);
            double atan2 = Math.atan2((double) fArr2[1], (double) fArr2[0]);
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("x", (double) (fArr[0] / f2));
            createMap.putDouble("y", (double) (fArr[1] / f2));
            createMap.putDouble(LinearGradientManager.PROP_ANGLE, atan2);
            return createMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0041 */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getRawResource(java.lang.String r8, com.facebook.react.bridge.Promise r9) {
        /*
            r7 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r7.getReactApplicationContext()     // Catch:{ Exception -> 0x0042 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ Exception -> 0x0042 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = "raw"
            int r8 = r1.getIdentifier(r8, r2, r0)     // Catch:{ Exception -> 0x0042 }
            java.io.InputStream r8 = r1.openRawResource(r8)     // Catch:{ Exception -> 0x0042 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x003d }
            java.nio.charset.Charset r1 = com.facebook.react.common.C2697g.f7788a     // Catch:{ all -> 0x003d }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x003d }
            r1 = 4096(0x1000, float:5.74E-42)
            char[] r2 = new char[r1]     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
        L_0x0026:
            r4 = 0
            int r5 = r0.read(r2, r4, r1)     // Catch:{ all -> 0x003d }
            r6 = -1
            if (r5 == r6) goto L_0x0032
            r3.append(r2, r4, r5)     // Catch:{ all -> 0x003d }
            goto L_0x0026
        L_0x0032:
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x003d }
            r9.resolve(r0)     // Catch:{ all -> 0x003d }
            r8.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x0049
        L_0x003d:
            r0 = move-exception
            r8.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            r8 = move-exception
            r8.printStackTrace()
            r9.reject((java.lang.Throwable) r8)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.RNSVGRenderableManager.getRawResource(java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getScreenCTM(int i) {
        C5017b0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float[] fArr = new float[9];
        renderableViewByTag.f14338I.getValues(fArr);
        float f = renderableViewByTag.f14354b0;
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("a", (double) fArr[0]);
        createMap.putDouble("b", (double) fArr[3]);
        createMap.putDouble("c", (double) fArr[1]);
        createMap.putDouble("d", (double) fArr[4]);
        createMap.putDouble("e", (double) (fArr[2] / f));
        createMap.putDouble("f", (double) (fArr[5] / f));
        return createMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public float getTotalLength(int i) {
        C5017b0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return 0.0f;
        }
        try {
            return new PathMeasure(renderableViewByTag.mo15183I((Canvas) null, (Paint) null), false).getLength() / renderableViewByTag.f14354b0;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return -1.0f;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInFill(int i, ReadableMap readableMap) {
        C5017b0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return false;
        }
        float f = renderableViewByTag.f14354b0;
        return renderableViewByTag.mo15194J(new float[]{((float) readableMap.getDouble("x")) * f, ((float) readableMap.getDouble("y")) * f}) != -1;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInStroke(int i, ReadableMap readableMap) {
        C5017b0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return false;
        }
        try {
            renderableViewByTag.mo15183I((Canvas) null, (Paint) null);
            renderableViewByTag.mo15197U();
            double d = (double) renderableViewByTag.f14354b0;
            int i2 = (int) (readableMap.getDouble("x") * d);
            int i3 = (int) (readableMap.getDouble("y") * d);
            Region region = renderableViewByTag.f14332A0;
            return region != null && region.contains(i2, i3);
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return false;
        }
    }
}
