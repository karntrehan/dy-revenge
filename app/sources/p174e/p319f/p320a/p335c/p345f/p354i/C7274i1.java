package p174e.p319f.p320a.p335c.p345f.p354i;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* renamed from: e.f.a.c.f.i.i1 */
abstract class C7274i1<K, V> extends C7386q1<Map.Entry<K, V>> {
    C7274i1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Map<K, V> mo20763b();

    public final void clear() {
        mo20763b().clear();
    }

    public abstract boolean contains(Object obj);

    public final boolean isEmpty() {
        return mo20763b().isEmpty();
    }

    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return C7400r1.m27429a(this, collection);
        } catch (UnsupportedOperationException unused) {
            return C7400r1.m27430b(this, collection.iterator());
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
            return ((C7482x) mo20763b()).f20105q.mo20758e().retainAll(hashSet);
        }
    }

    public final int size() {
        return mo20763b().size();
    }
}
