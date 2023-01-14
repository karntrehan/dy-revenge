package p174e.p319f.p320a.p363d.p366l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p027c.p060f.C1801g;

/* renamed from: e.f.a.d.l.h */
public class C9032h {

    /* renamed from: a */
    private final C1801g<String, C9033i> f24832a = new C1801g<>();

    /* renamed from: b */
    private final C1801g<String, PropertyValuesHolder[]> f24833b = new C1801g<>();

    /* renamed from: a */
    private static void m30131a(C9032h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo22926h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo22928i(objectAnimator.getPropertyName(), C9033i.m30140b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    public static C9032h m30132b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m30133c(context, resourceId);
    }

    /* renamed from: c */
    public static C9032h m30133c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m30134d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m30134d(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: d */
    private static C9032h m30134d(List<Animator> list) {
        C9032h hVar = new C9032h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m30131a(hVar, list.get(i));
        }
        return hVar;
    }

    /* renamed from: e */
    public C9033i mo22922e(String str) {
        if (mo22925g(str)) {
            return this.f24832a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9032h)) {
            return false;
        }
        return this.f24832a.equals(((C9032h) obj).f24832a);
    }

    /* renamed from: f */
    public long mo22924f() {
        int size = this.f24832a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C9033i m = this.f24832a.mo6263m(i);
            j = Math.max(j, m.mo22931c() + m.mo22932d());
        }
        return j;
    }

    /* renamed from: g */
    public boolean mo22925g(String str) {
        return this.f24832a.get(str) != null;
    }

    /* renamed from: h */
    public void mo22926h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f24833b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f24832a.hashCode();
    }

    /* renamed from: i */
    public void mo22928i(String str, C9033i iVar) {
        this.f24832a.put(str, iVar);
    }

    public String toString() {
        return 10 + C9032h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f24832a + "}\n";
    }
}
