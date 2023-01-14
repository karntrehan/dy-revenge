package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.camera2.p003e.p004j3.C0386a0;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.camera2.p003e.p004j3.C0418m0;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0455g;
import androidx.camera.camera2.p008f.C0597i;
import androidx.camera.core.C0640d3;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0974t1;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0823i2;
import androidx.camera.core.impl.C0888u0;
import androidx.camera.core.impl.C0919z;
import androidx.camera.core.impl.p014a3.C0716b;
import androidx.core.util.C1177h;
import androidx.lifecycle.C1297k;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.x1 */
public final class C0569x1 implements C0888u0 {

    /* renamed from: a */
    private final String f1874a;

    /* renamed from: b */
    private final C0402g0 f1875b;

    /* renamed from: c */
    private final C0597i f1876c;

    /* renamed from: d */
    private final Object f1877d = new Object();

    /* renamed from: e */
    private C0542u1 f1878e;

    /* renamed from: f */
    private C0570a<Integer> f1879f = null;

    /* renamed from: g */
    private C0570a<C0640d3> f1880g = null;

    /* renamed from: h */
    private final C0570a<C0974t1> f1881h;

    /* renamed from: i */
    private List<Pair<C0783b0, Executor>> f1882i = null;

    /* renamed from: j */
    private final C0823i2 f1883j;

    /* renamed from: k */
    private final C0919z f1884k;

    /* renamed from: l */
    private final C0418m0 f1885l;

    /* renamed from: androidx.camera.camera2.e.x1$a */
    static class C0570a<T> extends C1297k<T> {

        /* renamed from: l */
        private LiveData<T> f1886l;

        /* renamed from: m */
        private T f1887m;

        C0570a(T t) {
            this.f1887m = t;
        }

        /* renamed from: e */
        public T mo2469e() {
            LiveData<T> liveData = this.f1886l;
            return liveData == null ? this.f1887m : liveData.mo2469e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo2470q(LiveData<T> liveData) {
            LiveData<T> liveData2 = this.f1886l;
            if (liveData2 != null) {
                super.mo4347p(liveData2);
            }
            this.f1886l = liveData;
            super.mo4346o(liveData, new C0552w0(this));
        }
    }

    C0569x1(String str, C0418m0 m0Var) {
        String str2 = (String) C1177h.m4583e(str);
        this.f1874a = str2;
        this.f1885l = m0Var;
        C0402g0 c = m0Var.mo2139c(str2);
        this.f1875b = c;
        this.f1876c = new C0597i(this);
        this.f1883j = C0455g.m1978a(str, c);
        this.f1884k = new C0534s1(str, c);
        this.f1881h = new C0570a<>(C0974t1.m3786a(C0974t1.C0976b.CLOSED));
    }

    /* renamed from: p */
    private void m2369p() {
        m2370q();
    }

    /* renamed from: q */
    private void m2370q() {
        String str;
        int n = mo2466n();
        if (n == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (n == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (n == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (n == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (n != 4) {
            str = "Unknown value: " + n;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        C0949o2.m3692e("Camera2CameraInfo", "Device Level: " + str);
    }

    /* renamed from: a */
    public String mo2453a() {
        return this.f1874a;
    }

    /* renamed from: b */
    public void mo2454b(Executor executor, C0783b0 b0Var) {
        synchronized (this.f1877d) {
            C0542u1 u1Var = this.f1878e;
            if (u1Var == null) {
                if (this.f1882i == null) {
                    this.f1882i = new ArrayList();
                }
                this.f1882i.add(new Pair(b0Var, executor));
                return;
            }
            u1Var.mo2337k(executor, b0Var);
        }
    }

    /* renamed from: c */
    public Integer mo2455c() {
        Integer num = (Integer) this.f1875b.mo2119a(CameraCharacteristics.LENS_FACING);
        C1177h.m4583e(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            return intValue != 1 ? null : 1;
        }
        return 0;
    }

    /* renamed from: d */
    public String mo2456d() {
        return mo2466n() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    /* renamed from: e */
    public int mo2457e(int i) {
        Integer valueOf = Integer.valueOf(mo2465m());
        int b = C0716b.m2966b(i);
        Integer c = mo2455c();
        boolean z = true;
        if (c == null || 1 != c.intValue()) {
            z = false;
        }
        return C0716b.m2965a(b, valueOf.intValue(), z);
    }

    /* renamed from: f */
    public C0919z mo2458f() {
        return this.f1884k;
    }

    /* renamed from: g */
    public C0823i2 mo2459g() {
        return this.f1883j;
    }

    /* renamed from: h */
    public LiveData<C0640d3> mo2460h() {
        synchronized (this.f1877d) {
            C0542u1 u1Var = this.f1878e;
            if (u1Var == null) {
                if (this.f1880g == null) {
                    this.f1880g = new C0570a<>(C0371h3.m1756d(this.f1875b));
                }
                C0570a<C0640d3> aVar = this.f1880g;
                return aVar;
            }
            C0570a<C0640d3> aVar2 = this.f1880g;
            if (aVar2 != null) {
                return aVar2;
            }
            LiveData<C0640d3> e = u1Var.mo2307A().mo2046e();
            return e;
        }
    }

    /* renamed from: i */
    public void mo2461i(C0783b0 b0Var) {
        synchronized (this.f1877d) {
            C0542u1 u1Var = this.f1878e;
            if (u1Var == null) {
                List<Pair<C0783b0, Executor>> list = this.f1882i;
                if (list != null) {
                    Iterator<Pair<C0783b0, Executor>> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().first == b0Var) {
                            it.remove();
                        }
                    }
                    return;
                }
                return;
            }
            u1Var.mo2318Y(b0Var);
        }
    }

    /* renamed from: j */
    public C0597i mo2462j() {
        return this.f1876c;
    }

    /* renamed from: k */
    public C0402g0 mo2463k() {
        return this.f1875b;
    }

    /* renamed from: l */
    public Map<String, CameraCharacteristics> mo2464l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.f1874a, this.f1875b.mo2121d());
        for (String next : this.f1875b.mo2120b()) {
            if (!Objects.equals(next, this.f1874a)) {
                try {
                    linkedHashMap.put(next, this.f1885l.mo2139c(next).mo2121d());
                } catch (C0386a0 e) {
                    C0949o2.m3691d("Camera2CameraInfo", "Failed to get CameraCharacteristics for cameraId " + next, e);
                }
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo2465m() {
        Integer num = (Integer) this.f1875b.mo2119a(CameraCharacteristics.SENSOR_ORIENTATION);
        C1177h.m4583e(num);
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo2466n() {
        Integer num = (Integer) this.f1875b.mo2119a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        C1177h.m4583e(num);
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2467o(C0542u1 u1Var) {
        synchronized (this.f1877d) {
            this.f1878e = u1Var;
            C0570a<C0640d3> aVar = this.f1880g;
            if (aVar != null) {
                aVar.mo2470q(u1Var.mo2307A().mo2046e());
            }
            C0570a<Integer> aVar2 = this.f1879f;
            if (aVar2 != null) {
                aVar2.mo2470q(this.f1878e.mo2350y().mo2024c());
            }
            List<Pair<C0783b0, Executor>> list = this.f1882i;
            if (list != null) {
                for (Pair next : list) {
                    this.f1878e.mo2337k((Executor) next.second, (C0783b0) next.first);
                }
                this.f1882i = null;
            }
        }
        m2369p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2468r(LiveData<C0974t1> liveData) {
        this.f1881h.mo2470q(liveData);
    }
}
