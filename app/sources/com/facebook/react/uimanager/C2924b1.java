package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.facebook.react.uimanager.b1 */
public class C2924b1 {

    /* renamed from: a */
    private final ViewGroup f8201a;

    /* renamed from: b */
    private int f8202b = 0;

    /* renamed from: c */
    private int[] f8203c;

    /* renamed from: com.facebook.react.uimanager.b1$a */
    class C2925a implements Comparator<View> {
        C2925a() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
            Integer num = 0;
            if (viewZIndex == null) {
                viewZIndex = num;
            }
            Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
            if (viewZIndex2 != null) {
                num = viewZIndex2;
            }
            return viewZIndex.intValue() - num.intValue();
        }
    }

    public C2924b1(ViewGroup viewGroup) {
        this.f8201a = viewGroup;
    }

    /* renamed from: a */
    public int mo9486a(int i, int i2) {
        if (this.f8203c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.f8201a.getChildAt(i3));
            }
            Collections.sort(arrayList, new C2925a());
            this.f8203c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.f8203c[i4] = this.f8201a.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.f8203c[i2];
    }

    /* renamed from: b */
    public void mo9487b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f8202b++;
        }
        this.f8203c = null;
    }

    /* renamed from: c */
    public void mo9488c(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f8202b--;
        }
        this.f8203c = null;
    }

    /* renamed from: d */
    public boolean mo9489d() {
        return this.f8202b > 0;
    }

    /* renamed from: e */
    public void mo9490e() {
        this.f8202b = 0;
        for (int i = 0; i < this.f8201a.getChildCount(); i++) {
            if (ViewGroupManager.getViewZIndex(this.f8201a.getChildAt(i)) != null) {
                this.f8202b++;
            }
        }
        this.f8203c = null;
    }
}
