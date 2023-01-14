package com.google.android.gms.vision.face.mlkit;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p343d.C6636b;
import p174e.p319f.p320a.p335c.p345f.p357l.C8195eb;
import p174e.p319f.p320a.p335c.p345f.p357l.C8233gb;
import p174e.p319f.p320a.p335c.p345f.p357l.C8579za;

@DynamiteApi
public class FaceDetectorCreator extends C8233gb {
    public C8195eb newFaceDetector(C6634a aVar, C8579za zaVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Context context = (Context) C6636b.m25277m(aVar);
        C4131b bVar = new C4131b(context);
        try {
            System.loadLibrary("face_detector_v2_jni");
            bVar.mo12567b(zaVar, (String) null, SystemClock.elapsedRealtime() - elapsedRealtime);
            return new C4130a(context, zaVar, new FaceDetectorV2Jni(), bVar);
        } catch (UnsatisfiedLinkError e) {
            Log.e("FaceDetectorCreator", "Failed to load library face_detector_v2_jni");
            bVar.mo12567b(zaVar, "Failed to load library face_detector_v2_jni", SystemClock.elapsedRealtime() - elapsedRealtime);
            throw ((RemoteException) C4134e.m15502a("Failed to load library face_detector_v2_jni").initCause(e));
        }
    }
}
