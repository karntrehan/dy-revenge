package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import p027c.p086o.C2062c;

/* renamed from: androidx.fragment.app.j */
class C1228j implements LayoutInflater.Factory2 {

    /* renamed from: f */
    private final C1231l f3496f;

    C1228j(C1231l lVar) {
        this.f3496f = lVar;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (C1224f.class.getName().equals(str)) {
            return new C1224f(context, attributeSet, this.f3496f);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2062c.f6011d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C2062c.f6012e);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C2062c.f6013f, -1);
        String string = obtainStyledAttributes.getString(C2062c.f6014g);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C1226h.m4953b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f3496f.mo4129Y(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f3496f.mo4131Z(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f3496f.mo4129Y(id);
        }
        if (C1231l.m5013s0(2)) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = this.f3496f.mo4141h0().mo4076a(context.getClassLoader(), attributeValue);
            fragment.f3357A = true;
            fragment.f3366J = resourceId != 0 ? resourceId : id;
            fragment.f3367K = id;
            fragment.f3368L = string;
            fragment.f3358B = true;
            C1231l lVar = this.f3496f;
            fragment.f3362F = lVar;
            C1227i<?> iVar = lVar.f3522p;
            fragment.f3363G = iVar;
            fragment.mo3936t0(iVar.mo4078f(), attributeSet, fragment.f3394p);
            this.f3496f.mo4135d(fragment);
            this.f3496f.mo4100C0(fragment);
        } else if (!fragment.f3358B) {
            fragment.f3358B = true;
            C1227i<?> iVar2 = this.f3496f.f3522p;
            fragment.f3363G = iVar2;
            fragment.mo3936t0(iVar2.mo4078f(), attributeSet, fragment.f3394p);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        C1231l lVar2 = this.f3496f;
        if (lVar2.f3521o >= 1 || !fragment.f3357A) {
            lVar2.mo4100C0(fragment);
        } else {
            lVar2.mo4102D0(fragment, 1);
        }
        View view2 = fragment.f3377U;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f3377U.getTag() == null) {
                fragment.f3377U.setTag(string);
            }
            return fragment.f3377U;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
