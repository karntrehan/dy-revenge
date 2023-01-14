package p174e.p247e.p294k.p295a.p296a;

import java.util.concurrent.ExecutorService;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p255b.C6039d;
import p174e.p247e.p294k.p299c.C6270f;
import p174e.p247e.p294k.p300d.C6287i;
import p174e.p247e.p294k.p302f.C6325f;
import p174e.p247e.p294k.p307k.C6367b;

/* renamed from: e.e.k.a.a.b */
public class C6258b {

    /* renamed from: a */
    private static boolean f17337a;

    /* renamed from: b */
    private static C6257a f17338b;

    /* renamed from: a */
    public static C6257a m23725a(C6270f fVar, C6325f fVar2, C6287i<C5999d, C6367b> iVar, boolean z, ExecutorService executorService) {
        if (!f17337a) {
            try {
                f17338b = (C6257a) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(new Class[]{C6270f.class, C6325f.class, C6287i.class, Boolean.TYPE, C6039d.class}).newInstance(new Object[]{fVar, fVar2, iVar, Boolean.valueOf(z), executorService});
            } catch (Throwable unused) {
            }
            if (f17338b != null) {
                f17337a = true;
            }
        }
        return f17338b;
    }
}
