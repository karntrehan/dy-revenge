package p476go;

import android.content.Context;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.logging.Logger;

/* renamed from: go.Seq */
public class Seq {
    private static final int NULL_REFNUM = 41;
    private static final GoRefQueue goRefQueue = new GoRefQueue();
    /* access modifiers changed from: private */
    public static Logger log = Logger.getLogger("GoSeq");
    public static final Ref nullRef = new Ref(41, (Object) null);
    static final RefTracker tracker = new RefTracker();

    /* renamed from: go.Seq$GoObject */
    public interface GoObject {
        int incRefnum();
    }

    /* renamed from: go.Seq$GoRef */
    static class GoRef extends PhantomReference<GoObject> {
        final int refnum;

        GoRef(int i, GoObject goObject, GoRefQueue goRefQueue) {
            super(goObject, goRefQueue);
            if (i <= 0) {
                this.refnum = i;
                return;
            }
            throw new RuntimeException("GoRef instantiated with a Java refnum " + i);
        }
    }

    /* renamed from: go.Seq$GoRefQueue */
    static class GoRefQueue extends ReferenceQueue<GoObject> {
        /* access modifiers changed from: private */
        public final Collection<GoRef> refs = Collections.synchronizedCollection(new HashSet());

        GoRefQueue() {
            Thread thread = new Thread(new Runnable() {
                /* JADX WARNING: Can't wrap try/catch for region: R(2:0|1) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
                /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:1:?, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r2 = this;
                    L_0x0000:
                        go.Seq$GoRefQueue r0 = p476go.Seq.GoRefQueue.this     // Catch:{ InterruptedException -> 0x0000 }
                        java.lang.ref.Reference r0 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
                        go.Seq$GoRef r0 = (p476go.Seq.GoRef) r0     // Catch:{ InterruptedException -> 0x0000 }
                        go.Seq$GoRefQueue r1 = p476go.Seq.GoRefQueue.this     // Catch:{ InterruptedException -> 0x0000 }
                        java.util.Collection r1 = r1.refs     // Catch:{ InterruptedException -> 0x0000 }
                        r1.remove(r0)     // Catch:{ InterruptedException -> 0x0000 }
                        int r1 = r0.refnum     // Catch:{ InterruptedException -> 0x0000 }
                        p476go.Seq.destroyRef(r1)     // Catch:{ InterruptedException -> 0x0000 }
                        r0.clear()     // Catch:{ InterruptedException -> 0x0000 }
                        goto L_0x0000
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p476go.Seq.GoRefQueue.C104781.run():void");
                }
            });
            thread.setDaemon(true);
            thread.setName("GoRefQueue Finalizer Thread");
            thread.start();
        }

        /* access modifiers changed from: package-private */
        public void track(int i, GoObject goObject) {
            this.refs.add(new GoRef(i, goObject, this));
        }
    }

    /* renamed from: go.Seq$Proxy */
    public interface Proxy extends GoObject {
    }

    /* renamed from: go.Seq$Ref */
    public static final class Ref {
        public final Object obj;
        /* access modifiers changed from: private */
        public int refcnt;
        public final int refnum;

        Ref(int i, Object obj2) {
            if (i >= 0) {
                this.refnum = i;
                this.refcnt = 0;
                this.obj = obj2;
                return;
            }
            throw new RuntimeException("Ref instantiated with a Go refnum " + i);
        }

        static /* synthetic */ int access$110(Ref ref) {
            int i = ref.refcnt;
            ref.refcnt = i - 1;
            return i;
        }

        /* access modifiers changed from: package-private */
        public void inc() {
            int i = this.refcnt;
            if (i != Integer.MAX_VALUE) {
                this.refcnt = i + 1;
                return;
            }
            throw new RuntimeException("refnum " + this.refnum + " overflow");
        }
    }

    /* renamed from: go.Seq$RefMap */
    static final class RefMap {
        private int[] keys = new int[16];
        private int live = 0;
        private int next = 0;
        private Ref[] objs = new Ref[16];

        RefMap() {
        }

        private void grow() {
            Ref[] refArr;
            int roundPow2 = roundPow2(this.live) * 2;
            int[] iArr = this.keys;
            if (roundPow2 > iArr.length) {
                iArr = new int[(iArr.length * 2)];
                refArr = new Ref[(this.objs.length * 2)];
            } else {
                refArr = this.objs;
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.keys;
                if (i >= iArr2.length) {
                    break;
                }
                Ref[] refArr2 = this.objs;
                if (refArr2[i] != null) {
                    iArr[i2] = iArr2[i];
                    refArr[i2] = refArr2[i];
                    i2++;
                }
                i++;
            }
            for (int i3 = i2; i3 < iArr.length; i3++) {
                iArr[i3] = 0;
                refArr[i3] = null;
            }
            this.keys = iArr;
            this.objs = refArr;
            this.next = i2;
            if (this.live != i2) {
                throw new RuntimeException("bad state: live=" + this.live + ", next=" + this.next);
            }
        }

        private static int roundPow2(int i) {
            int i2 = 1;
            while (i2 < i) {
                i2 *= 2;
            }
            return i2;
        }

        /* access modifiers changed from: package-private */
        public Ref get(int i) {
            int binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
            if (binarySearch >= 0) {
                return this.objs[binarySearch];
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void put(int i, Ref ref) {
            if (ref != null) {
                int binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
                if (binarySearch >= 0) {
                    Ref[] refArr = this.objs;
                    if (refArr[binarySearch] == null) {
                        refArr[binarySearch] = ref;
                        this.live++;
                    }
                    if (refArr[binarySearch] != ref) {
                        throw new RuntimeException("replacing an existing ref (with key " + i + ")");
                    }
                    return;
                }
                if (this.next >= this.keys.length) {
                    grow();
                    binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
                }
                int i2 = ~binarySearch;
                int i3 = this.next;
                if (i2 < i3) {
                    int[] iArr = this.keys;
                    int i4 = i2 + 1;
                    System.arraycopy(iArr, i2, iArr, i4, i3 - i2);
                    Ref[] refArr2 = this.objs;
                    System.arraycopy(refArr2, i2, refArr2, i4, this.next - i2);
                }
                this.keys[i2] = i;
                this.objs[i2] = ref;
                this.live++;
                this.next++;
                return;
            }
            throw new RuntimeException("put a null ref (with key " + i + ")");
        }

        /* access modifiers changed from: package-private */
        public void remove(int i) {
            int binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
            if (binarySearch >= 0) {
                Ref[] refArr = this.objs;
                if (refArr[binarySearch] != null) {
                    refArr[binarySearch] = null;
                    this.live--;
                }
            }
        }
    }

    /* renamed from: go.Seq$RefTracker */
    static final class RefTracker {
        private static final int REF_OFFSET = 42;
        private final RefMap javaObjs = new RefMap();
        private final IdentityHashMap<Object, Integer> javaRefs = new IdentityHashMap<>();
        private int next = 42;

        RefTracker() {
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void dec(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                if (r4 > 0) goto L_0x001d
                java.util.logging.Logger r0 = p476go.Seq.log     // Catch:{ all -> 0x005b }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
                r1.<init>()     // Catch:{ all -> 0x005b }
                java.lang.String r2 = "dec request for Go object "
                r1.append(r2)     // Catch:{ all -> 0x005b }
                r1.append(r4)     // Catch:{ all -> 0x005b }
                java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x005b }
                r0.severe(r4)     // Catch:{ all -> 0x005b }
                monitor-exit(r3)
                return
            L_0x001d:
                go.Seq$Ref r0 = p476go.Seq.nullRef     // Catch:{ all -> 0x005b }
                int r0 = r0.refnum     // Catch:{ all -> 0x005b }
                if (r4 != r0) goto L_0x0025
                monitor-exit(r3)
                return
            L_0x0025:
                go.Seq$RefMap r0 = r3.javaObjs     // Catch:{ all -> 0x005b }
                go.Seq$Ref r0 = r0.get(r4)     // Catch:{ all -> 0x005b }
                if (r0 == 0) goto L_0x0044
                p476go.Seq.Ref.access$110(r0)     // Catch:{ all -> 0x005b }
                int r1 = r0.refcnt     // Catch:{ all -> 0x005b }
                if (r1 > 0) goto L_0x0042
                go.Seq$RefMap r1 = r3.javaObjs     // Catch:{ all -> 0x005b }
                r1.remove(r4)     // Catch:{ all -> 0x005b }
                java.util.IdentityHashMap<java.lang.Object, java.lang.Integer> r4 = r3.javaRefs     // Catch:{ all -> 0x005b }
                java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x005b }
                r4.remove(r0)     // Catch:{ all -> 0x005b }
            L_0x0042:
                monitor-exit(r3)
                return
            L_0x0044:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x005b }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
                r1.<init>()     // Catch:{ all -> 0x005b }
                java.lang.String r2 = "referenced Java object is not found: refnum="
                r1.append(r2)     // Catch:{ all -> 0x005b }
                r1.append(r4)     // Catch:{ all -> 0x005b }
                java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x005b }
                r0.<init>(r4)     // Catch:{ all -> 0x005b }
                throw r0     // Catch:{ all -> 0x005b }
            L_0x005b:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p476go.Seq.RefTracker.dec(int):void");
        }

        /* access modifiers changed from: package-private */
        public synchronized Ref get(int i) {
            if (i < 0) {
                throw new RuntimeException("ref called with Go refnum " + i);
            } else if (i == 41) {
                return Seq.nullRef;
            } else {
                Ref ref = this.javaObjs.get(i);
                if (ref != null) {
                    return ref;
                }
                throw new RuntimeException("unknown java Ref: " + i);
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized int inc(Object obj) {
            if (obj == null) {
                return 41;
            }
            if (obj instanceof Proxy) {
                return ((Proxy) obj).incRefnum();
            }
            Integer num = this.javaRefs.get(obj);
            if (num == null) {
                int i = this.next;
                if (i != Integer.MAX_VALUE) {
                    this.next = i + 1;
                    num = Integer.valueOf(i);
                    this.javaRefs.put(obj, num);
                } else {
                    throw new RuntimeException("createRef overflow for " + obj);
                }
            }
            int intValue = num.intValue();
            Ref ref = this.javaObjs.get(intValue);
            if (ref == null) {
                ref = new Ref(intValue, obj);
                this.javaObjs.put(intValue, ref);
            }
            ref.inc();
            return intValue;
        }

        /* access modifiers changed from: package-private */
        public synchronized void incRefnum(int i) {
            Ref ref = this.javaObjs.get(i);
            if (ref != null) {
                ref.inc();
            } else {
                throw new RuntimeException("referenced Java object is not found: refnum=" + i);
            }
        }
    }

    static {
        System.loadLibrary("gojni");
        init();
        Universe.touch();
    }

    private Seq() {
    }

    static void decRef(int i) {
        tracker.dec(i);
    }

    static native void destroyRef(int i);

    public static Ref getRef(int i) {
        return tracker.get(i);
    }

    public static int incGoObjectRef(GoObject goObject) {
        return goObject.incRefnum();
    }

    public static native void incGoRef(int i, GoObject goObject);

    public static int incRef(Object obj) {
        return tracker.inc(obj);
    }

    public static void incRefnum(int i) {
        tracker.incRefnum(i);
    }

    private static native void init();

    public static void setContext(Context context) {
        setContext((Object) context);
    }

    static native void setContext(Object obj);

    public static void touch() {
    }

    public static void trackGoRef(int i, GoObject goObject) {
        if (i <= 0) {
            goRefQueue.track(i, goObject);
            return;
        }
        throw new RuntimeException("trackGoRef called with Java refnum " + i);
    }
}
