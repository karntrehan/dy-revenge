package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0246m;
import p027c.p028a.C1435a;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p027c.p077k.p078a.C2019a;

public class CheckableImageButton extends C0246m implements Checkable {

    /* renamed from: p */
    private static final int[] f12024p = {16842912};

    /* renamed from: q */
    private boolean f12025q;

    /* renamed from: r */
    private boolean f12026r;

    /* renamed from: s */
    private boolean f12027s;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C4258a extends C1904a {
        C4258a() {
        }

        /* renamed from: f */
        public void mo3775f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3775f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            super.mo3776g(view, cVar);
            cVar.mo6575Y(CheckableImageButton.this.mo13426a());
            cVar.mo6576Z(CheckableImageButton.this.isChecked());
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    static class C4259b extends C2019a {
        public static final Parcelable.Creator<C4259b> CREATOR = new C4260a();

        /* renamed from: p */
        boolean f12029p;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        static class C4260a implements Parcelable.ClassLoaderCreator<C4259b> {
            C4260a() {
            }

            /* renamed from: a */
            public C4259b createFromParcel(Parcel parcel) {
                return new C4259b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C4259b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4259b(parcel, classLoader);
            }

            /* renamed from: c */
            public C4259b[] newArray(int i) {
                return new C4259b[i];
            }
        }

        public C4259b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m16336b(parcel);
        }

        public C4259b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m16336b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f12029p = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12029p ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12026r = true;
        this.f12027s = true;
        C1988t.m8394m0(this, new C4258a());
    }

    /* renamed from: a */
    public boolean mo13426a() {
        return this.f12026r;
    }

    public boolean isChecked() {
        return this.f12025q;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f12025q) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f12024p;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4259b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4259b bVar = (C4259b) parcelable;
        super.onRestoreInstanceState(bVar.mo6726a());
        setChecked(bVar.f12029p);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C4259b bVar = new C4259b(super.onSaveInstanceState());
        bVar.f12029p = this.f12025q;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f12026r != z) {
            this.f12026r = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f12026r && this.f12025q != z) {
            this.f12025q = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f12027s = z;
    }

    public void setPressed(boolean z) {
        if (this.f12027s) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f12025q);
    }
}
