package p174e.p247e.p274h.p280b;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: e.e.h.b.c */
public class C6167c {

    /* renamed from: a */
    private static final C6167c f16955a = new C6167c();

    /* renamed from: b */
    private static boolean f16956b = true;

    /* renamed from: c */
    private final Queue<C6168a> f16957c = new ArrayBlockingQueue(20);

    /* renamed from: e.e.h.b.c$a */
    public enum C6168a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private C6167c() {
    }

    /* renamed from: a */
    public static C6167c m23263a() {
        return f16956b ? new C6167c() : f16955a;
    }

    /* renamed from: b */
    public void mo18255b(C6168a aVar) {
        if (f16956b) {
            if (this.f16957c.size() + 1 > 20) {
                this.f16957c.poll();
            }
            this.f16957c.add(aVar);
        }
    }

    public String toString() {
        return this.f16957c.toString();
    }
}
