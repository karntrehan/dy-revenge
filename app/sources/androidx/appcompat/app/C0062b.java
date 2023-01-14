package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p027c.p028a.C1435a;

/* renamed from: androidx.appcompat.app.b */
public class C0062b extends C0091g implements DialogInterface {

    /* renamed from: p */
    final AlertController f216p = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.b$a */
    public static class C0063a {

        /* renamed from: a */
        private final AlertController.C0050f f217a;

        /* renamed from: b */
        private final int f218b;

        public C0063a(Context context) {
            this(context, C0062b.m225i(context, 0));
        }

        public C0063a(Context context, int i) {
            this.f217a = new AlertController.C0050f(new ContextThemeWrapper(context, C0062b.m225i(context, i)));
            this.f218b = i;
        }

        /* renamed from: a */
        public C0062b mo212a() {
            C0062b bVar = new C0062b(this.f217a.f176a, this.f218b);
            this.f217a.mo170a(bVar.f216p);
            bVar.setCancelable(this.f217a.f193r);
            if (this.f217a.f193r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f217a.f194s);
            bVar.setOnDismissListener(this.f217a.f195t);
            DialogInterface.OnKeyListener onKeyListener = this.f217a.f196u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        /* renamed from: b */
        public Context mo213b() {
            return this.f217a.f176a;
        }

        /* renamed from: c */
        public C0063a mo214c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0050f fVar = this.f217a;
            fVar.f198w = listAdapter;
            fVar.f199x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0063a mo215d(View view) {
            this.f217a.f182g = view;
            return this;
        }

        /* renamed from: e */
        public C0063a mo216e(Drawable drawable) {
            this.f217a.f179d = drawable;
            return this;
        }

        /* renamed from: f */
        public C0063a mo217f(DialogInterface.OnKeyListener onKeyListener) {
            this.f217a.f196u = onKeyListener;
            return this;
        }

        /* renamed from: g */
        public C0063a mo218g(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0050f fVar = this.f217a;
            fVar.f198w = listAdapter;
            fVar.f199x = onClickListener;
            fVar.f168I = i;
            fVar.f167H = true;
            return this;
        }

        /* renamed from: h */
        public C0063a mo219h(CharSequence charSequence) {
            this.f217a.f181f = charSequence;
            return this;
        }
    }

    protected C0062b(Context context, int i) {
        super(context, m225i(context, i));
    }

    /* renamed from: i */
    static int m225i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1435a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: g */
    public ListView mo207g() {
        return this.f216p.mo150d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f216p.mo151e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f216p.mo152g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f216p.mo153h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f216p.mo159q(charSequence);
    }
}
