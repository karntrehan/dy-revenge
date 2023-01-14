package p174e.p319f.p320a.p335c.p345f.p358m;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* renamed from: e.f.a.c.f.m.w0 */
abstract class C8873w0<K, V> extends C8653f1<Map.Entry<K, V>> {
    C8873w0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Map<K, V> mo22398b();

    public final void clear() {
        mo22398b().clear();
    }

    public abstract boolean contains(Object obj);

    public final boolean isEmpty() {
        return mo22398b().isEmpty();
    }

    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return C8666g1.m29470a(this, collection);
        } catch (UnsupportedOperationException unused) {
            return C8666g1.m29471b(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        int i;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size >= 3) {
                i = size < 1073741824 ? (int) ((((float) size) / 0.75f) + 1.0f) : RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            } else if (size >= 0) {
                i = size + 1;
            } else {
                StringBuilder sb = new StringBuilder(52);
                sb.append("expectedSize cannot be negative but was: ");
                sb.append(size);
                throw new IllegalArgumentException(sb.toString());
            }
            HashSet hashSet = new HashSet(i);
            for (Object next : collection) {
                if (contains(next)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return ((C8677h) mo22398b()).f23751q.mo22325e().retainAll(hashSet);
        }
    }

    public final int size() {
        return mo22398b().size();
    }
}
