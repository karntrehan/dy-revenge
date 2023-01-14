package p174e.p247e.p294k.p307k;

import java.io.Closeable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: e.e.k.k.b */
public abstract class C6367b implements Closeable, C6372g {

    /* renamed from: f */
    private static final Set<String> f17747f = new HashSet(Arrays.asList(new String[]{"encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded"}));

    /* renamed from: o */
    private Map<String, Object> f17748o = new HashMap();

    /* renamed from: A */
    public void mo18869A(Map<String, Object> map) {
        if (map != null) {
            for (String next : f17747f) {
                Object obj = map.get(next);
                if (obj != null) {
                    this.f17748o.put(next, obj);
                }
            }
        }
    }

    /* renamed from: a */
    public C6374i mo18870a() {
        return C6373h.f17773a;
    }

    /* renamed from: b */
    public Map<String, Object> mo15980b() {
        return this.f17748o;
    }

    public abstract void close();

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!isClosed()) {
            C6071a.m22861I("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    /* renamed from: h */
    public abstract int mo18873h();

    public abstract boolean isClosed();

    /* renamed from: o */
    public boolean mo18875o() {
        return false;
    }

    /* renamed from: r */
    public void mo18876r(String str, Object obj) {
        if (f17747f.contains(str)) {
            this.f17748o.put(str, obj);
        }
    }
}
