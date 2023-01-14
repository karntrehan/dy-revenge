package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0210c1;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p027c.p060f.C1790b;

/* renamed from: androidx.appcompat.app.e */
public abstract class C0066e {

    /* renamed from: f */
    private static int f221f = -100;

    /* renamed from: o */
    private static final C1790b<WeakReference<C0066e>> f222o = new C1790b<>();

    /* renamed from: p */
    private static final Object f223p = new Object();

    C0066e() {
    }

    /* renamed from: A */
    public static void m254A(boolean z) {
        C0210c1.m1076b(z);
    }

    /* renamed from: c */
    static void m255c(C0066e eVar) {
        synchronized (f223p) {
            m260y(eVar);
            f222o.add(new WeakReference(eVar));
        }
    }

    /* renamed from: g */
    public static C0066e m256g(Activity activity, C0065d dVar) {
        return new C0067f(activity, dVar);
    }

    /* renamed from: h */
    public static C0066e m257h(Dialog dialog, C0065d dVar) {
        return new C0067f(dialog, dVar);
    }

    /* renamed from: j */
    public static int m258j() {
        return f221f;
    }

    /* renamed from: x */
    static void m259x(C0066e eVar) {
        synchronized (f223p) {
            m260y(eVar);
        }
    }

    /* renamed from: y */
    private static void m260y(C0066e eVar) {
        synchronized (f223p) {
            Iterator<WeakReference<C0066e>> it = f222o.iterator();
            while (it.hasNext()) {
                C0066e eVar2 = (C0066e) it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: B */
    public abstract void mo260B(int i);

    /* renamed from: C */
    public abstract void mo261C(View view);

    /* renamed from: D */
    public abstract void mo262D(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: E */
    public abstract void mo263E(Toolbar toolbar);

    /* renamed from: F */
    public void mo264F(int i) {
    }

    /* renamed from: G */
    public abstract void mo265G(CharSequence charSequence);

    /* renamed from: d */
    public abstract void mo266d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void mo267e(Context context) {
    }

    /* renamed from: f */
    public Context mo268f(Context context) {
        mo267e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo269i(int i);

    /* renamed from: k */
    public int mo270k() {
        return -100;
    }

    /* renamed from: l */
    public abstract MenuInflater mo271l();

    /* renamed from: m */
    public abstract C0058a mo272m();

    /* renamed from: n */
    public abstract void mo273n();

    /* renamed from: o */
    public abstract void mo274o();

    /* renamed from: p */
    public abstract void mo275p(Configuration configuration);

    /* renamed from: q */
    public abstract void mo276q(Bundle bundle);

    /* renamed from: r */
    public abstract void mo277r();

    /* renamed from: s */
    public abstract void mo278s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo279t();

    /* renamed from: u */
    public abstract void mo280u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo281v();

    /* renamed from: w */
    public abstract void mo282w();

    /* renamed from: z */
    public abstract boolean mo283z(int i);
}
