package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.C1231l;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.common.internal.C3705r;

public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: x0 */
    private Dialog f9804x0;

    /* renamed from: y0 */
    private DialogInterface.OnCancelListener f9805y0;

    /* renamed from: z0 */
    private Dialog f9806z0;

    /* renamed from: G1 */
    public static SupportErrorDialogFragment m13485G1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) C3705r.m14347l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.f9804x0 = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f9805y0 = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    /* renamed from: A1 */
    public Dialog mo180A1(Bundle bundle) {
        Dialog dialog = this.f9804x0;
        if (dialog != null) {
            return dialog;
        }
        mo3819D1(false);
        if (this.f9806z0 == null) {
            this.f9806z0 = new AlertDialog.Builder((Context) C3705r.m14346k(mo3930s())).create();
        }
        return this.f9806z0;
    }

    /* renamed from: F1 */
    public void mo3822F1(C1231l lVar, String str) {
        super.mo3822F1(lVar, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f9805y0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
