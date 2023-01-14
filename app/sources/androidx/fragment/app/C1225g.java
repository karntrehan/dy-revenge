package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C1177h;
import androidx.lifecycle.C1312t;

/* renamed from: androidx.fragment.app.g */
public class C1225g {

    /* renamed from: a */
    private final C1227i<?> f3489a;

    private C1225g(C1227i<?> iVar) {
        this.f3489a = iVar;
    }

    /* renamed from: b */
    public static C1225g m4928b(C1227i<?> iVar) {
        return new C1225g((C1227i) C1177h.m4584f(iVar, "callbacks == null"));
    }

    /* renamed from: a */
    public void mo4052a(Fragment fragment) {
        C1227i<?> iVar = this.f3489a;
        iVar.f3495r.mo4139g(iVar, iVar, fragment);
    }

    /* renamed from: c */
    public void mo4053c() {
        this.f3489a.f3495r.mo4154r();
    }

    /* renamed from: d */
    public void mo4054d(Configuration configuration) {
        this.f3489a.f3495r.mo4156s(configuration);
    }

    /* renamed from: e */
    public boolean mo4055e(MenuItem menuItem) {
        return this.f3489a.f3495r.mo4157t(menuItem);
    }

    /* renamed from: f */
    public void mo4056f() {
        this.f3489a.f3495r.mo4159u();
    }

    /* renamed from: g */
    public boolean mo4057g(Menu menu, MenuInflater menuInflater) {
        return this.f3489a.f3495r.mo4161v(menu, menuInflater);
    }

    /* renamed from: h */
    public void mo4058h() {
        this.f3489a.f3495r.mo4163w();
    }

    /* renamed from: i */
    public void mo4059i() {
        this.f3489a.f3495r.mo4167y();
    }

    /* renamed from: j */
    public void mo4060j(boolean z) {
        this.f3489a.f3495r.mo4168z(z);
    }

    /* renamed from: k */
    public boolean mo4061k(MenuItem menuItem) {
        return this.f3489a.f3495r.mo4096A(menuItem);
    }

    /* renamed from: l */
    public void mo4062l(Menu menu) {
        this.f3489a.f3495r.mo4098B(menu);
    }

    /* renamed from: m */
    public void mo4063m() {
        this.f3489a.f3495r.mo4101D();
    }

    /* renamed from: n */
    public void mo4064n(boolean z) {
        this.f3489a.f3495r.mo4103E(z);
    }

    /* renamed from: o */
    public boolean mo4065o(Menu menu) {
        return this.f3489a.f3495r.mo4105F(menu);
    }

    /* renamed from: p */
    public void mo4066p() {
        this.f3489a.f3495r.mo4109H();
    }

    /* renamed from: q */
    public void mo4067q() {
        this.f3489a.f3495r.mo4111I();
    }

    /* renamed from: r */
    public void mo4068r() {
        this.f3489a.f3495r.mo4113K();
    }

    /* renamed from: s */
    public boolean mo4069s() {
        return this.f3489a.f3495r.mo4119Q(true);
    }

    /* renamed from: t */
    public Fragment mo4070t(String str) {
        return this.f3489a.f3495r.mo4132a0(str);
    }

    /* renamed from: u */
    public C1231l mo4071u() {
        return this.f3489a.f3495r;
    }

    /* renamed from: v */
    public void mo4072v() {
        this.f3489a.f3495r.mo4104E0();
    }

    /* renamed from: w */
    public View mo4073w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3489a.f3495r.mo4144j0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: x */
    public void mo4074x(Parcelable parcelable) {
        C1227i<?> iVar = this.f3489a;
        if (iVar instanceof C1312t) {
            iVar.f3495r.mo4120Q0(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: y */
    public Parcelable mo4075y() {
        return this.f3489a.f3495r.mo4122S0();
    }
}
