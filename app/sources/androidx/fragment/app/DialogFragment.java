package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: k0 */
    private Handler f3340k0;

    /* renamed from: l0 */
    private Runnable f3341l0 = new C1199a();

    /* renamed from: m0 */
    DialogInterface.OnCancelListener f3342m0 = new C1200b();

    /* renamed from: n0 */
    DialogInterface.OnDismissListener f3343n0 = new C1201c();

    /* renamed from: o0 */
    int f3344o0 = 0;

    /* renamed from: p0 */
    int f3345p0 = 0;

    /* renamed from: q0 */
    boolean f3346q0 = true;

    /* renamed from: r0 */
    boolean f3347r0 = true;

    /* renamed from: s0 */
    int f3348s0 = -1;

    /* renamed from: t0 */
    Dialog f3349t0;

    /* renamed from: u0 */
    boolean f3350u0;

    /* renamed from: v0 */
    boolean f3351v0;

    /* renamed from: w0 */
    boolean f3352w0;

    /* renamed from: androidx.fragment.app.DialogFragment$a */
    class C1199a implements Runnable {
        C1199a() {
        }

        public void run() {
            DialogFragment dialogFragment = DialogFragment.this;
            dialogFragment.f3343n0.onDismiss(dialogFragment.f3349t0);
        }
    }

    /* renamed from: androidx.fragment.app.DialogFragment$b */
    class C1200b implements DialogInterface.OnCancelListener {
        C1200b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.f3349t0;
            if (dialog != null) {
                dialogFragment.onCancel(dialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.DialogFragment$c */
    class C1201c implements DialogInterface.OnDismissListener {
        C1201c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.f3349t0;
            if (dialog != null) {
                dialogFragment.onDismiss(dialog);
            }
        }
    }

    /* renamed from: A1 */
    public Dialog mo180A1(Bundle bundle) {
        return new Dialog(mo3900h1(), mo3834z1());
    }

    /* renamed from: B1 */
    public final Dialog mo3816B1() {
        Dialog y1 = mo3833y1();
        if (y1 != null) {
            return y1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: C1 */
    public void mo3817C1(boolean z) {
        this.f3346q0 = z;
        Dialog dialog = this.f3349t0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: D0 */
    public void mo3818D0(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.mo3818D0(bundle);
        Dialog dialog = this.f3349t0;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f3344o0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f3345p0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f3346q0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f3347r0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f3348s0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: D1 */
    public void mo3819D1(boolean z) {
        this.f3347r0 = z;
    }

    /* renamed from: E0 */
    public void mo3820E0() {
        super.mo3820E0();
        Dialog dialog = this.f3349t0;
        if (dialog != null) {
            this.f3350u0 = false;
            dialog.show();
        }
    }

    /* renamed from: E1 */
    public void mo181E1(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: F0 */
    public void mo3821F0() {
        super.mo3821F0();
        Dialog dialog = this.f3349t0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: F1 */
    public void mo3822F1(C1231l lVar, String str) {
        this.f3351v0 = false;
        this.f3352w0 = true;
        C1252s i = lVar.mo4142i();
        i.mo4245e(this, str);
        i.mo3971g();
    }

    /* renamed from: b0 */
    public void mo3823b0(Bundle bundle) {
        Bundle bundle2;
        super.mo3823b0(bundle);
        if (this.f3347r0) {
            View N = mo3861N();
            if (N != null) {
                if (N.getParent() == null) {
                    this.f3349t0.setContentView(N);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            C1214c l = mo3909l();
            if (l != null) {
                this.f3349t0.setOwnerActivity(l);
            }
            this.f3349t0.setCancelable(this.f3346q0);
            this.f3349t0.setOnCancelListener(this.f3342m0);
            this.f3349t0.setOnDismissListener(this.f3343n0);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.f3349t0.onRestoreInstanceState(bundle2);
            }
        }
    }

    /* renamed from: e0 */
    public void mo3824e0(Context context) {
        super.mo3824e0(context);
        if (!this.f3352w0) {
            this.f3351v0 = false;
        }
    }

    /* renamed from: h0 */
    public void mo3825h0(Bundle bundle) {
        super.mo3825h0(bundle);
        this.f3340k0 = new Handler();
        this.f3347r0 = this.f3367K == 0;
        if (bundle != null) {
            this.f3344o0 = bundle.getInt("android:style", 0);
            this.f3345p0 = bundle.getInt("android:theme", 0);
            this.f3346q0 = bundle.getBoolean("android:cancelable", true);
            this.f3347r0 = bundle.getBoolean("android:showsDialog", this.f3347r0);
            this.f3348s0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: o0 */
    public void mo3826o0() {
        super.mo3826o0();
        Dialog dialog = this.f3349t0;
        if (dialog != null) {
            this.f3350u0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f3349t0.dismiss();
            if (!this.f3351v0) {
                onDismiss(this.f3349t0);
            }
            this.f3349t0 = null;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f3350u0) {
            mo3832x1(true, true);
        }
    }

    /* renamed from: p0 */
    public void mo3829p0() {
        super.mo3829p0();
        if (!this.f3352w0 && !this.f3351v0) {
            this.f3351v0 = true;
        }
    }

    /* renamed from: q0 */
    public LayoutInflater mo3830q0(Bundle bundle) {
        Context f;
        if (!this.f3347r0) {
            return super.mo3830q0(bundle);
        }
        Dialog A1 = mo180A1(bundle);
        this.f3349t0 = A1;
        if (A1 != null) {
            mo181E1(A1, this.f3344o0);
            f = this.f3349t0.getContext();
        } else {
            f = this.f3363G.mo4078f();
        }
        return (LayoutInflater) f.getSystemService("layout_inflater");
    }

    /* renamed from: w1 */
    public void mo3831w1() {
        mo3832x1(false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public void mo3832x1(boolean z, boolean z2) {
        if (!this.f3351v0) {
            this.f3351v0 = true;
            this.f3352w0 = false;
            Dialog dialog = this.f3349t0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f3349t0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f3340k0.getLooper()) {
                        onDismiss(this.f3349t0);
                    } else {
                        this.f3340k0.post(this.f3341l0);
                    }
                }
            }
            this.f3350u0 = true;
            if (this.f3348s0 >= 0) {
                mo3844D().mo4108G0(this.f3348s0, 1);
                this.f3348s0 = -1;
                return;
            }
            C1252s i = mo3844D().mo4142i();
            i.mo3976m(this);
            if (z) {
                i.mo3972h();
            } else {
                i.mo3971g();
            }
        }
    }

    /* renamed from: y1 */
    public Dialog mo3833y1() {
        return this.f3349t0;
    }

    /* renamed from: z1 */
    public int mo3834z1() {
        return this.f3345p0;
    }
}
