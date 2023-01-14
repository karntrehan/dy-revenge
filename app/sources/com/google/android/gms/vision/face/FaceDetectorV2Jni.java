package com.google.android.gms.vision.face;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.Keep;
import java.nio.ByteBuffer;
import p174e.p319f.p320a.p335c.p345f.p357l.C8146c0;
import p174e.p319f.p320a.p335c.p345f.p357l.C8184e0;
import p174e.p319f.p320a.p335c.p345f.p357l.C8278j;
import p174e.p319f.p320a.p335c.p345f.p357l.C8366nd;
import p174e.p319f.p320a.p335c.p345f.p357l.C8419qc;
import p174e.p319f.p320a.p335c.p345f.p357l.C8425r0;

public class FaceDetectorV2Jni {

    /* renamed from: a */
    private final C8419qc f11475a;

    public FaceDetectorV2Jni() {
        C8419qc b = C8419qc.m28963b();
        this.f11475a = b;
        b.mo22102d(C8425r0.f22967a);
    }

    @Keep
    private native void closeDetectorJni(long j);

    @Keep
    private native byte[] detectFacesImageByteArrayJni(long j, byte[] bArr, byte[] bArr2);

    @Keep
    private native byte[] detectFacesImageByteArrayMultiPlanesJni(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr4);

    @Keep
    private native byte[] detectFacesImageByteBufferJni(long j, ByteBuffer byteBuffer, byte[] bArr);

    @Keep
    private native byte[] detectFacesImageByteBufferMultiPlanesJni(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr);

    @Keep
    private native long initDetectorJni(byte[] bArr, AssetManager assetManager);

    /* renamed from: a */
    public final long mo12556a(C8184e0 e0Var, AssetManager assetManager) {
        Log.v("FaceDetectorV2Jni", "initialize.start()");
        long initDetectorJni = initDetectorJni(e0Var.mo22003b(), assetManager);
        Log.v("FaceDetectorV2Jni", "initialize.end()");
        return initDetectorJni;
    }

    /* renamed from: b */
    public final C8146c0 mo12557b(long j, byte[] bArr, C8278j jVar) {
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteArray.start()");
        C8146c0 c0Var = null;
        try {
            byte[] detectFacesImageByteArrayJni = detectFacesImageByteArrayJni(j, bArr, jVar.mo22003b());
            if (detectFacesImageByteArrayJni != null && detectFacesImageByteArrayJni.length > 0) {
                c0Var = C8146c0.m28375x(detectFacesImageByteArrayJni, this.f11475a);
            }
        } catch (C8366nd e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FaceDetectorV2Jni", valueOf.length() != 0 ? "detectFacesImageByteArray failed to parse result: ".concat(valueOf) : new String("detectFacesImageByteArray failed to parse result: "));
        }
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteArray.end()");
        return c0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p174e.p319f.p320a.p335c.p345f.p357l.C8146c0 mo12558c(long r17, byte[] r19, byte[] r20, byte[] r21, int r22, int r23, int r24, int r25, int r26, int r27, p174e.p319f.p320a.p335c.p345f.p357l.C8278j r28) {
        /*
            r16 = this;
            java.lang.String r1 = "FaceDetectorV2Jni"
            java.lang.String r0 = "detectFacesImageByteArrayMultiPlanes.start()"
            android.util.Log.v(r1, r0)
            r2 = 0
            byte[] r15 = r28.mo22003b()     // Catch:{ nd -> 0x0039 }
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            byte[] r0 = r3.detectFacesImageByteArrayMultiPlanesJni(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ nd -> 0x0039 }
            if (r0 == 0) goto L_0x0036
            int r3 = r0.length     // Catch:{ nd -> 0x0039 }
            if (r3 <= 0) goto L_0x0036
            r3 = r16
            e.f.a.c.f.l.qc r4 = r3.f11475a     // Catch:{ nd -> 0x0034 }
            e.f.a.c.f.l.c0 r2 = p174e.p319f.p320a.p335c.p345f.p357l.C8146c0.m28375x(r0, r4)     // Catch:{ nd -> 0x0034 }
            goto L_0x0059
        L_0x0034:
            r0 = move-exception
            goto L_0x003c
        L_0x0036:
            r3 = r16
            goto L_0x0059
        L_0x0039:
            r0 = move-exception
            r3 = r16
        L_0x003c:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "detectFacesImageByteArrayMultiPlanes failed to parse result: "
            int r5 = r0.length()
            if (r5 == 0) goto L_0x0051
            java.lang.String r0 = r4.concat(r0)
            goto L_0x0056
        L_0x0051:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
        L_0x0056:
            android.util.Log.e(r1, r0)
        L_0x0059:
            java.lang.String r0 = "%s detectFacesImageByteArrayMultiPlanes.end()"
            android.util.Log.v(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.face.FaceDetectorV2Jni.mo12558c(long, byte[], byte[], byte[], int, int, int, int, int, int, e.f.a.c.f.l.j):e.f.a.c.f.l.c0");
    }

    /* renamed from: d */
    public final C8146c0 mo12559d(long j, ByteBuffer byteBuffer, C8278j jVar) {
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteBuffer.start()");
        C8146c0 c0Var = null;
        try {
            byte[] detectFacesImageByteBufferJni = detectFacesImageByteBufferJni(j, byteBuffer, jVar.mo22003b());
            if (detectFacesImageByteBufferJni != null && detectFacesImageByteBufferJni.length > 0) {
                c0Var = C8146c0.m28375x(detectFacesImageByteBufferJni, this.f11475a);
            }
        } catch (C8366nd e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FaceDetectorV2Jni", valueOf.length() != 0 ? "detectFacesImageByteBuffer failed to parse result: ".concat(valueOf) : new String("detectFacesImageByteBuffer failed to parse result: "));
        }
        Log.v("FaceDetectorV2Jni", "%s detectFacesImageByteBuffer.end()");
        return c0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p174e.p319f.p320a.p335c.p345f.p357l.C8146c0 mo12560e(long r17, java.nio.ByteBuffer r19, java.nio.ByteBuffer r20, java.nio.ByteBuffer r21, int r22, int r23, int r24, int r25, int r26, int r27, p174e.p319f.p320a.p335c.p345f.p357l.C8278j r28) {
        /*
            r16 = this;
            java.lang.String r1 = "FaceDetectorV2Jni"
            java.lang.String r0 = "detectFacesImageByteBufferMultiPlanes.start()"
            android.util.Log.v(r1, r0)
            r2 = 0
            byte[] r15 = r28.mo22003b()     // Catch:{ nd -> 0x0039 }
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            byte[] r0 = r3.detectFacesImageByteBufferMultiPlanesJni(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ nd -> 0x0039 }
            if (r0 == 0) goto L_0x0036
            int r3 = r0.length     // Catch:{ nd -> 0x0039 }
            if (r3 <= 0) goto L_0x0036
            r3 = r16
            e.f.a.c.f.l.qc r4 = r3.f11475a     // Catch:{ nd -> 0x0034 }
            e.f.a.c.f.l.c0 r2 = p174e.p319f.p320a.p335c.p345f.p357l.C8146c0.m28375x(r0, r4)     // Catch:{ nd -> 0x0034 }
            goto L_0x0059
        L_0x0034:
            r0 = move-exception
            goto L_0x003c
        L_0x0036:
            r3 = r16
            goto L_0x0059
        L_0x0039:
            r0 = move-exception
            r3 = r16
        L_0x003c:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "detectFacesImageByteBufferMultiPlanes failed to parse result: "
            int r5 = r0.length()
            if (r5 == 0) goto L_0x0051
            java.lang.String r0 = r4.concat(r0)
            goto L_0x0056
        L_0x0051:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
        L_0x0056:
            android.util.Log.e(r1, r0)
        L_0x0059:
            java.lang.String r0 = "detectFacesImageByteBuffer.end()"
            android.util.Log.v(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.face.FaceDetectorV2Jni.mo12560e(long, java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer, int, int, int, int, int, int, e.f.a.c.f.l.j):e.f.a.c.f.l.c0");
    }

    /* renamed from: f */
    public final void mo12561f(long j) {
        Log.v("FaceDetectorV2Jni", "closeDetector.start()");
        closeDetectorJni(j);
        Log.v("FaceDetectorV2Jni", "closeDetector.end()");
    }
}
