package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment {
    /* renamed from: A1 */
    public Dialog mo180A1(Bundle bundle) {
        return new C0091g(mo3930s(), mo3834z1());
    }

    /* renamed from: E1 */
    public void mo181E1(Dialog dialog, int i) {
        if (dialog instanceof C0091g) {
            C0091g gVar = (C0091g) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            gVar.mo361f(1);
            return;
        }
        super.mo181E1(dialog, i);
    }
}
