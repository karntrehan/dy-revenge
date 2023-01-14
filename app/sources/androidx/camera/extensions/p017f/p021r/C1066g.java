package androidx.camera.extensions.p017f.p021r;

import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.extensions.f.r.g */
class C1066g {

    /* renamed from: a */
    private static AtomicInteger f2962a = new AtomicInteger(0);

    /* renamed from: b */
    private C1069c f2963b;

    /* renamed from: c */
    private int f2964c;

    /* renamed from: d */
    private String f2965d;

    /* renamed from: e */
    private List<C1065f> f2966e;

    /* renamed from: androidx.camera.extensions.f.r.g$a */
    static abstract class C1067a extends C1069c implements C1074j {
        C1067a() {
        }

        /* renamed from: j */
        static C1067a m4096j(Size size, int i, int i2) {
            return new C1062c(size, i, i2);
        }

        /* renamed from: d */
        public abstract int mo3353d();

        /* renamed from: f */
        public abstract int mo3355f();

        /* renamed from: h */
        public abstract Size mo3356h();
    }

    /* renamed from: androidx.camera.extensions.f.r.g$b */
    static abstract class C1068b extends C1069c implements C1075k {
        C1068b() {
        }

        /* renamed from: j */
        static C1068b m4100j(int i, int i2) {
            return new C1063d(i, i2);
        }

        /* renamed from: d */
        public abstract int mo3359d();

        /* renamed from: f */
        public abstract int mo3361f();
    }

    /* renamed from: androidx.camera.extensions.f.r.g$c */
    private static class C1069c implements C1065f {

        /* renamed from: a */
        private int f2967a = -1;

        /* renamed from: b */
        private int f2968b = 0;

        /* renamed from: c */
        private String f2969c = null;

        /* renamed from: d */
        private List<C1065f> f2970d = Collections.emptyList();

        C1069c() {
        }

        /* renamed from: a */
        public int mo3368a() {
            return this.f2967a;
        }

        /* renamed from: c */
        public void mo3370c(int i) {
            this.f2967a = i;
        }

        /* renamed from: e */
        public void mo3371e(String str) {
            this.f2969c = str;
        }

        /* renamed from: g */
        public void mo3372g(int i) {
            this.f2968b = i;
        }

        /* renamed from: i */
        public void mo3373i(List<C1065f> list) {
            this.f2970d = list;
        }
    }

    /* renamed from: androidx.camera.extensions.f.r.g$d */
    static abstract class C1070d extends C1069c implements C1077m {
        C1070d() {
        }

        /* renamed from: j */
        static C1070d m4108j(Surface surface) {
            return new C1064e(surface);
        }

        /* renamed from: b */
        public abstract Surface mo3364b();
    }

    private C1066g(C1069c cVar) {
        this.f2963b = cVar;
    }

    /* renamed from: b */
    static C1066g m4093b(Camera2OutputConfigImpl camera2OutputConfigImpl) {
        C1069c cVar;
        if (camera2OutputConfigImpl instanceof SurfaceOutputConfigImpl) {
            cVar = C1070d.m4108j(((SurfaceOutputConfigImpl) camera2OutputConfigImpl).getSurface());
        } else if (camera2OutputConfigImpl instanceof ImageReaderOutputConfigImpl) {
            ImageReaderOutputConfigImpl imageReaderOutputConfigImpl = (ImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            cVar = C1067a.m4096j(imageReaderOutputConfigImpl.getSize(), imageReaderOutputConfigImpl.getImageFormat(), imageReaderOutputConfigImpl.getMaxImages());
        } else if (camera2OutputConfigImpl instanceof MultiResolutionImageReaderOutputConfigImpl) {
            MultiResolutionImageReaderOutputConfigImpl multiResolutionImageReaderOutputConfigImpl = (MultiResolutionImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            cVar = C1068b.m4100j(multiResolutionImageReaderOutputConfigImpl.getImageFormat(), multiResolutionImageReaderOutputConfigImpl.getMaxImages());
        } else {
            cVar = null;
        }
        cVar.mo3371e(camera2OutputConfigImpl.getPhysicalCameraId());
        cVar.mo3372g(camera2OutputConfigImpl.getSurfaceGroupId());
        if (camera2OutputConfigImpl.getSurfaceSharingOutputConfigs() != null) {
            ArrayList arrayList = new ArrayList();
            for (Camera2OutputConfigImpl b : camera2OutputConfigImpl.getSurfaceSharingOutputConfigs()) {
                arrayList.add(m4093b(b).mo3369a());
            }
            cVar.mo3373i(arrayList);
        }
        return new C1066g(cVar);
    }

    /* renamed from: c */
    private int m4094c() {
        return f2962a.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1065f mo3369a() {
        this.f2963b.mo3370c(m4094c());
        this.f2963b.mo3371e(this.f2965d);
        this.f2963b.mo3372g(this.f2964c);
        List<C1065f> list = this.f2966e;
        if (list != null) {
            this.f2963b.mo3373i(list);
        }
        return this.f2963b;
    }
}
