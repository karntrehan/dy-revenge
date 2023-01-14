package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.facebook.react.modules.dialog.DialogModule;

public class AlertFragment extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: x0 */
    private final DialogModule.C2817b f7957x0;

    public AlertFragment() {
        this.f7957x0 = null;
    }

    @SuppressLint({"ValidFragment"})
    public AlertFragment(DialogModule.C2817b bVar, Bundle bundle) {
        this.f7957x0 = bVar;
        mo3917n1(bundle);
    }

    /* renamed from: G1 */
    public static Dialog m11226G1(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(bundle.getString("title"));
        if (bundle.containsKey("button_positive")) {
            title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            title.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            title.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return title.create();
    }

    /* renamed from: A1 */
    public Dialog mo180A1(Bundle bundle) {
        return m11226G1(mo3909l(), mo3925q(), this);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        DialogModule.C2817b bVar = this.f7957x0;
        if (bVar != null) {
            bVar.onClick(dialogInterface, i);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.C2817b bVar = this.f7957x0;
        if (bVar != null) {
            bVar.onDismiss(dialogInterface);
        }
    }
}
