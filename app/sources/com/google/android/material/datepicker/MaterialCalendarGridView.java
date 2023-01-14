package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C1174e;
import java.util.Calendar;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p174e.p319f.p320a.p363d.C9019f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: f */
    private final Calendar f11839f;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C4202a extends C1904a {
        C4202a() {
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            super.mo3776g(view, cVar);
            cVar.mo6582c0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11839f = C4230o.m16161k();
        if (MaterialDatePicker.m16057V1(getContext())) {
            setNextFocusLeftId(C9019f.cancel_button);
            setNextFocusRightId(C9019f.confirm_button);
        }
        C1988t.m8394m0(this, new C4202a());
    }

    /* renamed from: a */
    private void m16039a(int i, Rect rect) {
        int b;
        if (i == 33) {
            b = getAdapter().mo13228h();
        } else if (i == 130) {
            b = getAdapter().mo13219b();
        } else {
            super.onFocusChanged(true, i, rect);
            return;
        }
        setSelection(b);
    }

    /* renamed from: c */
    private static int m16040c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    private static boolean m16041d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: b */
    public C4222j getAdapter() {
        return (C4222j) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C4222j b = getAdapter();
        C4214d<?> dVar = b.f11907p;
        C4213c cVar = b.f11908q;
        Long c = b.getItem(b.mo13219b());
        Long c2 = b.getItem(b.mo13228h());
        for (C1174e next : dVar.mo13185h()) {
            F f = next.f3262a;
            if (f != null) {
                if (next.f3263b == null) {
                    continue;
                } else {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) next.f3263b).longValue();
                    if (!m16041d(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < c.longValue()) {
                            i2 = b.mo13219b();
                            i = b.mo13222f(i2) ? 0 : materialCalendarGridView.getChildAt(i2 - 1).getRight();
                        } else {
                            materialCalendarGridView.f11839f.setTimeInMillis(longValue);
                            i2 = b.mo13218a(materialCalendarGridView.f11839f.get(5));
                            i = m16040c(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > c2.longValue()) {
                            i4 = b.mo13228h();
                            i3 = b.mo13223g(i4) ? getWidth() : materialCalendarGridView.getChildAt(i4).getRight();
                        } else {
                            materialCalendarGridView.f11839f.setTimeInMillis(longValue2);
                            i4 = b.mo13218a(materialCalendarGridView.f11839f.get(5));
                            i3 = m16040c(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) b.getItemId(i2);
                        int itemId2 = (int) b.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt.getTop() + cVar.f11885a.mo13178c()), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt.getBottom() - cVar.f11885a.mo13177b()), cVar.f11892h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m16039a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo13219b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo13219b());
        return true;
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C4222j) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C4222j.class.getCanonicalName()}));
        }
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo13219b()) {
            i = getAdapter().mo13219b();
        }
        super.setSelection(i);
    }
}
