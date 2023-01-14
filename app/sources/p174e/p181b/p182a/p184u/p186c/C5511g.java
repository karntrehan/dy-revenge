package p174e.p181b.p182a.p184u.p186c;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.p188w.p190k.C5553g;
import p174e.p181b.p182a.p188w.p190k.C5561l;

/* renamed from: e.b.a.u.c.g */
public class C5511g {

    /* renamed from: a */
    private final List<C5499a<C5561l, Path>> f15541a;

    /* renamed from: b */
    private final List<C5499a<Integer, Integer>> f15542b;

    /* renamed from: c */
    private final List<C5553g> f15543c;

    public C5511g(List<C5553g> list) {
        this.f15543c = list;
        this.f15541a = new ArrayList(list.size());
        this.f15542b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f15541a.add(list.get(i).mo16740b().mo16693a());
            this.f15542b.add(list.get(i).mo16741c().mo16693a());
        }
    }

    /* renamed from: a */
    public List<C5499a<C5561l, Path>> mo16635a() {
        return this.f15541a;
    }

    /* renamed from: b */
    public List<C5553g> mo16636b() {
        return this.f15543c;
    }

    /* renamed from: c */
    public List<C5499a<Integer, Integer>> mo16637c() {
        return this.f15542b;
    }
}
