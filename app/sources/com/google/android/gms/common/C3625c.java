package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.common.c */
public class C3625c extends DialogFragment {

    /* renamed from: f */
    private Dialog f10195f;

    /* renamed from: o */
    private DialogInterface.OnCancelListener f10196o;

    /* renamed from: p */
    private Dialog f10197p;

    /* renamed from: a */
    public static C3625c m14082a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C3625c cVar = new C3625c();
        Dialog dialog2 = (Dialog) C3705r.m14347l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f10195f = dialog2;
        if (onCancelListener != null) {
            cVar.f10196o = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10196o;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f10195f;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f10197p == null) {
            this.f10197p = new AlertDialog.Builder((Context) C3705r.m14346k(getActivity())).create();
        }
        return this.f10197p;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
