package p174e.p319f.p320a.p335c.p345f.p356k;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* renamed from: e.f.a.c.f.k.s0 */
abstract class C8004s0<K, V> extends C7771a1<Map.Entry<K, V>> {
    C8004s0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Map<K, V> mo21348b();

    public final void clear() {
        mo21348b().clear();
    }

    public abstract boolean contains(Object obj);

    public final boolean isEmpty() {
        return mo21348b().isEmpty();
    }

    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return C7797c1.m27874a(this, collection);
        } catch (UnsupportedOperationException unused) {
            return C7797c1.m27875b(this, collection.iterator());
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
            return ((C7873i) mo21348b()).f21479q.mo21564e().retainAll(hashSet);
        }
    }

    public final int size() {
        return mo21348b().size();
    }
}
