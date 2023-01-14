package com.lwansbrough.RCTCamera;

import android.hardware.Camera;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.lwansbrough.RCTCamera.b */
public class C5107b {

    /* renamed from: a */
    private static C5107b f14461a;

    /* renamed from: b */
    private static final C5109b f14462b = new C5109b(853, 480);

    /* renamed from: c */
    private static final C5109b f14463c = new C5109b(1280, 720);

    /* renamed from: d */
    private static final C5109b f14464d = new C5109b(1920, 1080);

    /* renamed from: e */
    private final HashMap<Integer, C5108a> f14465e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<Integer, Integer> f14466f = new HashMap<>();

    /* renamed from: g */
    private final Map<Number, Camera> f14467g = new HashMap();

    /* renamed from: h */
    private boolean f14468h = false;

    /* renamed from: i */
    private List<String> f14469i = null;

    /* renamed from: j */
    private int f14470j = -1;

    /* renamed from: k */
    private int f14471k = 0;

    /* renamed from: l */
    private int f14472l = 0;

    /* renamed from: com.lwansbrough.RCTCamera.b$a */
    private class C5108a {

        /* renamed from: a */
        public final Camera.CameraInfo f14473a;

        /* renamed from: b */
        public int f14474b = 0;

        /* renamed from: c */
        public int f14475c = -1;

        /* renamed from: d */
        public int f14476d = -1;

        /* renamed from: e */
        public int f14477e = -1;

        /* renamed from: f */
        public int f14478f = -1;

        public C5108a(Camera.CameraInfo cameraInfo) {
            this.f14473a = cameraInfo;
        }
    }

    /* renamed from: com.lwansbrough.RCTCamera.b$b */
    private static class C5109b {

        /* renamed from: a */
        public int f14480a;

        /* renamed from: b */
        public int f14481b;

        public C5109b(int i, int i2) {
            this.f14480a = i;
            this.f14481b = i2;
        }
    }

    private C5107b(int i) {
        HashMap<Integer, C5108a> hashMap;
        int i2;
        C5108a aVar;
        this.f14471k = i;
        for (int i3 = 0; i3 < Camera.getNumberOfCameras(); i3++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i3, cameraInfo);
            int i4 = 1;
            if (cameraInfo.facing == 1 && this.f14465e.get(1) == null) {
                hashMap = this.f14465e;
                i2 = 1;
                aVar = new C5108a(cameraInfo);
            } else {
                if (cameraInfo.facing == 0) {
                    i4 = 2;
                    if (this.f14465e.get(2) == null) {
                        hashMap = this.f14465e;
                        i2 = 2;
                        aVar = new C5108a(cameraInfo);
                    }
                }
            }
            hashMap.put(i2, aVar);
            this.f14466f.put(Integer.valueOf(i4), Integer.valueOf(i3));
            mo15583a(i4);
            mo15595q(i4);
        }
    }

    /* renamed from: d */
    public static void m19268d(int i) {
        f14461a = new C5107b(i);
    }

    /* renamed from: g */
    private Camera.Size m19269g(List<Camera.Size> list, int i, int i2) {
        Camera.Size size = null;
        for (Camera.Size next : list) {
            if (size != null) {
                if (Math.sqrt(Math.pow((double) (next.width - i), 2.0d) + Math.pow((double) (next.height - i2), 2.0d)) >= Math.sqrt(Math.pow((double) (size.width - i), 2.0d) + Math.pow((double) (size.height - i2), 2.0d))) {
                }
            }
            size = next;
        }
        return size;
    }

    /* renamed from: h */
    public static C5107b m19270h() {
        return f14461a;
    }

    /* renamed from: n */
    private Camera.Size m19271n(List<Camera.Size> list) {
        Camera.Size size = null;
        for (Camera.Size next : list) {
            if (size == null || next.width * next.height < size.width * size.height) {
                size = next;
            }
        }
        return size;
    }

    /* renamed from: A */
    public void mo15580A(int i, int i2, int i3) {
        C5108a aVar = this.f14465e.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.f14477e = i2;
            aVar.f14478f = i3;
        }
    }

    /* renamed from: B */
    public void mo15581B(int i, int i2) {
        Camera a = mo15583a(i);
        if (a != null) {
            Camera.Parameters parameters = a.getParameters();
            String flashMode = parameters.getFlashMode();
            if (i2 == 0) {
                flashMode = "off";
            } else if (i2 == 1) {
                flashMode = "torch";
            }
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains(flashMode)) {
                parameters.setFlashMode(flashMode);
                try {
                    a.setParameters(parameters);
                } catch (RuntimeException e) {
                    Log.e("RCTCamera", "setParameters failed", e);
                }
            }
        }
    }

    /* renamed from: C */
    public void mo15582C(int i, int i2) {
        Camera a = mo15583a(i);
        if (a != null) {
            Camera.Parameters parameters = a.getParameters();
            int maxZoom = parameters.getMaxZoom();
            if (parameters.isZoomSupported() && i2 >= 0 && i2 < maxZoom) {
                parameters.setZoom(i2);
                try {
                    a.setParameters(parameters);
                } catch (RuntimeException e) {
                    Log.e("RCTCamera", "setParameters failed", e);
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized Camera mo15583a(int i) {
        if (this.f14467g.get(Integer.valueOf(i)) == null && this.f14466f.get(Integer.valueOf(i)) != null) {
            try {
                this.f14467g.put(Integer.valueOf(i), Camera.open(this.f14466f.get(Integer.valueOf(i)).intValue()));
                mo15585c(i);
            } catch (Exception e) {
                Log.e("RCTCamera", "acquireCameraInstance failed", e);
            }
        }
        return this.f14467g.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo15584b(int i, int i2) {
        Camera camera = this.f14467g.get(Integer.valueOf(i));
        if (camera != null) {
            C5108a aVar = this.f14465e.get(Integer.valueOf(i));
            Camera.CameraInfo cameraInfo = aVar.f14473a;
            int i3 = cameraInfo.orientation;
            int i4 = i2 * 90;
            aVar.f14474b = (cameraInfo.facing == 1 ? i3 + i4 : (i3 - i4) + 360) % 360;
            Camera.Parameters parameters = camera.getParameters();
            parameters.setRotation(aVar.f14474b);
            try {
                camera.setParameters(parameters);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void mo15585c(int i) {
        int i2;
        int i3;
        Camera camera = this.f14467g.get(Integer.valueOf(i));
        if (camera != null) {
            C5108a aVar = this.f14465e.get(Integer.valueOf(i));
            Camera.CameraInfo cameraInfo = aVar.f14473a;
            int i4 = cameraInfo.orientation;
            if (cameraInfo.facing == 1) {
                int i5 = this.f14471k;
                i2 = ((i5 * 90) + i4) % 360;
                i3 = ((720 - i4) - (i5 * 90)) % 360;
            } else {
                i2 = ((i4 - (this.f14471k * 90)) + 360) % 360;
                i3 = i2;
            }
            aVar.f14474b = i2;
            mo15597s(i2);
            camera.setDisplayOrientation(i3);
            Camera.Parameters parameters = camera.getParameters();
            parameters.setRotation(aVar.f14474b);
            Camera.Size f = mo15587f(parameters.getSupportedPreviewSizes(), RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
            int i6 = f.width;
            int i7 = f.height;
            parameters.setPreviewSize(i6, i7);
            try {
                camera.setParameters(parameters);
            } catch (Exception e) {
                e.printStackTrace();
            }
            int i8 = aVar.f14474b;
            if (i8 == 0 || i8 == 180) {
                aVar.f14475c = i6;
                aVar.f14476d = i7;
                return;
            }
            aVar.f14475c = i7;
            aVar.f14476d = i6;
        }
    }

    /* renamed from: e */
    public List<String> mo15586e() {
        return this.f14469i;
    }

    /* renamed from: f */
    public Camera.Size mo15587f(List<Camera.Size> list, int i, int i2) {
        int i3;
        Camera.Size size = null;
        for (Camera.Size next : list) {
            int i4 = next.width;
            if (i4 <= i && (i3 = next.height) <= i2) {
                if (size == null || i4 * i3 > size.width * size.height) {
                    size = next;
                }
            }
        }
        return size;
    }

    /* renamed from: i */
    public int mo15588i() {
        return this.f14470j;
    }

    /* renamed from: j */
    public int mo15589j(int i) {
        C5108a aVar = this.f14465e.get(Integer.valueOf(i));
        if (aVar == null) {
            return 0;
        }
        return aVar.f14476d;
    }

    /* renamed from: k */
    public int mo15590k(int i) {
        C5108a aVar = this.f14465e.get(Integer.valueOf(i));
        if (aVar == null) {
            return 0;
        }
        return aVar.f14478f;
    }

    /* renamed from: l */
    public int mo15591l(int i) {
        C5108a aVar = this.f14465e.get(Integer.valueOf(i));
        if (aVar == null) {
            return 0;
        }
        return aVar.f14477e;
    }

    /* renamed from: m */
    public int mo15592m(int i) {
        C5108a aVar = this.f14465e.get(Integer.valueOf(i));
        if (aVar == null) {
            return 0;
        }
        return aVar.f14475c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public List<Camera.Size> mo15593o(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        return supportedVideoSizes != null ? supportedVideoSizes : parameters.getSupportedPreviewSizes();
    }

    /* renamed from: p */
    public boolean mo15594p() {
        return this.f14468h;
    }

    /* renamed from: q */
    public void mo15595q(int i) {
        Camera camera = this.f14467g.get(Integer.valueOf(i));
        if (camera != null) {
            this.f14467g.remove(Integer.valueOf(i));
            camera.release();
        }
    }

    /* renamed from: r */
    public void mo15596r(int i) {
        this.f14471k = i;
        mo15585c(1);
        mo15585c(2);
    }

    /* renamed from: s */
    public void mo15597s(int i) {
        this.f14472l = i;
    }

    /* renamed from: t */
    public void mo15598t(List<String> list) {
        this.f14469i = list;
    }

    /* renamed from: u */
    public void mo15599u(boolean z) {
        this.f14468h = z;
    }

    /* renamed from: v */
    public void mo15600v(int i, int i2) {
        Camera camera = this.f14467g.get(Integer.valueOf(i));
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            boolean z = true;
            if (i2 != 1) {
                z = false;
            }
            parameters.setRecordingHint(z);
            try {
                camera.setParameters(parameters);
            } catch (RuntimeException e) {
                Log.e("RCTCamera", "setParameters failed", e);
            }
        }
    }

    /* renamed from: w */
    public void mo15601w(int i, String str) {
        C5109b bVar;
        Camera a = mo15583a(i);
        if (a != null) {
            Camera.Parameters parameters = a.getParameters();
            Camera.Size size = null;
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1078030475:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM)) {
                        c = 0;
                        break;
                    }
                    break;
                case -318184504:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                        c = 1;
                        break;
                    }
                    break;
                case 107348:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1604548:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P)) {
                        c = 3;
                        break;
                    }
                    break;
                case 1688155:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P)) {
                        c = 4;
                        break;
                    }
                    break;
                case 3202466:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH)) {
                        c = 5;
                        break;
                    }
                    break;
                case 46737913:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P)) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    size = supportedPictureSizes.get(supportedPictureSizes.size() / 2);
                    break;
                case 1:
                    Camera.Size f = mo15587f(parameters.getSupportedPreviewSizes(), RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
                    size = m19269g(parameters.getSupportedPictureSizes(), f.width, f.height);
                    break;
                case 2:
                    size = m19271n(supportedPictureSizes);
                    break;
                case 3:
                    bVar = f14462b;
                    break;
                case 4:
                    bVar = f14463c;
                    break;
                case 5:
                    size = mo15587f(parameters.getSupportedPictureSizes(), RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
                    break;
                case 6:
                    bVar = f14464d;
                    break;
            }
            size = mo15587f(supportedPictureSizes, bVar.f14480a, bVar.f14481b);
            if (size != null) {
                parameters.setPictureSize(size.width, size.height);
                try {
                    a.setParameters(parameters);
                } catch (RuntimeException e) {
                    Log.e("RCTCamera", "setParameters failed", e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        r9 = android.media.CamcorderProfile.get(r8.f14466f.get(java.lang.Integer.valueOf(r9)).intValue(), 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
        r9 = android.media.CamcorderProfile.get(r8.f14466f.get(java.lang.Integer.valueOf(r9)).intValue(), 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ee, code lost:
        if (r9 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        if (r10 == null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f3, code lost:
        r9.videoFrameHeight = r10.height;
        r9.videoFrameWidth = r10.width;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fb, code lost:
        return r9;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.CamcorderProfile mo15602x(int r9, java.lang.String r10) {
        /*
            r8 = this;
            android.hardware.Camera r0 = r8.mo15583a(r9)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.List r0 = r8.mo15593o(r0)
            r10.hashCode()
            r2 = -1
            int r3 = r10.hashCode()
            r4 = 2
            r5 = 1
            r6 = 5
            r7 = 4
            switch(r3) {
                case -1078030475: goto L_0x0053;
                case 107348: goto L_0x0048;
                case 1604548: goto L_0x003d;
                case 1688155: goto L_0x0032;
                case 3202466: goto L_0x0027;
                case 46737913: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x005d
        L_0x001c:
            java.lang.String r3 = "1080p"
            boolean r10 = r10.equals(r3)
            if (r10 != 0) goto L_0x0025
            goto L_0x005d
        L_0x0025:
            r2 = 5
            goto L_0x005d
        L_0x0027:
            java.lang.String r3 = "high"
            boolean r10 = r10.equals(r3)
            if (r10 != 0) goto L_0x0030
            goto L_0x005d
        L_0x0030:
            r2 = 4
            goto L_0x005d
        L_0x0032:
            java.lang.String r3 = "720p"
            boolean r10 = r10.equals(r3)
            if (r10 != 0) goto L_0x003b
            goto L_0x005d
        L_0x003b:
            r2 = 3
            goto L_0x005d
        L_0x003d:
            java.lang.String r3 = "480p"
            boolean r10 = r10.equals(r3)
            if (r10 != 0) goto L_0x0046
            goto L_0x005d
        L_0x0046:
            r2 = 2
            goto L_0x005d
        L_0x0048:
            java.lang.String r3 = "low"
            boolean r10 = r10.equals(r3)
            if (r10 != 0) goto L_0x0051
            goto L_0x005d
        L_0x0051:
            r2 = 1
            goto L_0x005d
        L_0x0053:
            java.lang.String r3 = "medium"
            boolean r10 = r10.equals(r3)
            if (r10 != 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            switch(r2) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00b6;
                case 2: goto L_0x00ab;
                case 3: goto L_0x00a0;
                case 4: goto L_0x0084;
                case 5: goto L_0x0064;
                default: goto L_0x0060;
            }
        L_0x0060:
            r9 = r1
            r10 = r9
            goto L_0x00ee
        L_0x0064:
            com.lwansbrough.RCTCamera.b$b r10 = f14464d
            int r2 = r10.f14480a
            int r10 = r10.f14481b
            android.hardware.Camera$Size r10 = r8.mo15587f(r0, r2, r10)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r8.f14466f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r0.get(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0 = 6
            android.media.CamcorderProfile r9 = android.media.CamcorderProfile.get(r9, r0)
            goto L_0x00ee
        L_0x0084:
            r10 = 2147483647(0x7fffffff, float:NaN)
            android.hardware.Camera$Size r10 = r8.mo15587f(r0, r10, r10)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r8.f14466f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r0.get(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            android.media.CamcorderProfile r9 = android.media.CamcorderProfile.get(r9, r5)
            goto L_0x00ee
        L_0x00a0:
            com.lwansbrough.RCTCamera.b$b r10 = f14463c
            int r2 = r10.f14480a
            int r10 = r10.f14481b
            android.hardware.Camera$Size r10 = r8.mo15587f(r0, r2, r10)
            goto L_0x00da
        L_0x00ab:
            com.lwansbrough.RCTCamera.b$b r10 = f14462b
            int r2 = r10.f14480a
            int r10 = r10.f14481b
            android.hardware.Camera$Size r10 = r8.mo15587f(r0, r2, r10)
            goto L_0x00ba
        L_0x00b6:
            android.hardware.Camera$Size r10 = r8.m19271n(r0)
        L_0x00ba:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r8.f14466f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r0.get(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            android.media.CamcorderProfile r9 = android.media.CamcorderProfile.get(r9, r7)
            goto L_0x00ee
        L_0x00cf:
            int r10 = r0.size()
            int r10 = r10 / r4
            java.lang.Object r10 = r0.get(r10)
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10
        L_0x00da:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r8.f14466f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r0.get(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            android.media.CamcorderProfile r9 = android.media.CamcorderProfile.get(r9, r6)
        L_0x00ee:
            if (r9 != 0) goto L_0x00f1
            return r1
        L_0x00f1:
            if (r10 == 0) goto L_0x00fb
            int r0 = r10.height
            r9.videoFrameHeight = r0
            int r10 = r10.width
            r9.videoFrameWidth = r10
        L_0x00fb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lwansbrough.RCTCamera.C5107b.mo15602x(int, java.lang.String):android.media.CamcorderProfile");
    }

    /* renamed from: y */
    public void mo15603y(int i, int i2) {
        Camera a = mo15583a(i);
        if (a != null) {
            Camera.Parameters parameters = a.getParameters();
            String flashMode = parameters.getFlashMode();
            if (i2 == 0) {
                flashMode = "off";
            } else if (i2 == 1) {
                flashMode = "on";
            } else if (i2 == 2) {
                flashMode = "auto";
            }
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains(flashMode)) {
                parameters.setFlashMode(flashMode);
                try {
                    a.setParameters(parameters);
                } catch (RuntimeException e) {
                    Log.e("RCTCamera", "setParameters failed", e);
                }
            }
        }
    }

    /* renamed from: z */
    public void mo15604z(int i) {
        if (this.f14470j != i) {
            this.f14470j = i;
            mo15585c(1);
            mo15585c(2);
        }
    }
}
