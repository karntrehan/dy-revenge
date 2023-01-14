package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.widget.C0292x0;

public final class ExpandedMenuView extends ListView implements C0124g.C0126b, C0141n, AdapterView.OnItemClickListener {

    /* renamed from: f */
    private static final int[] f415f = {16842964, 16843049};

    /* renamed from: o */
    private C0124g f416o;

    /* renamed from: p */
    private int f417p;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0292x0 v = C0292x0.m1407v(context, attributeSet, f415f, i, 0);
        if (v.mo1802s(0)) {
            setBackgroundDrawable(v.mo1790g(0));
        }
        if (v.mo1802s(1)) {
            setDivider(v.mo1790g(1));
        }
        v.mo1803w();
    }

    /* renamed from: a */
    public boolean mo448a(C0128i iVar) {
        return this.f416o.mo595L(iVar, 0);
    }

    /* renamed from: b */
    public void mo449b(C0124g gVar) {
        this.f416o = gVar;
    }

    public int getWindowAnimations() {
        return this.f417p;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo448a((C0128i) getAdapter().getItem(i));
    }
}
