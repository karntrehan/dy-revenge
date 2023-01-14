package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C1252s;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.datepicker.C4208a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9017d;
import p174e.p319f.p320a.p363d.C9018e;
import p174e.p319f.p320a.p363d.C9019f;
import p174e.p319f.p320a.p363d.C9021h;
import p174e.p319f.p320a.p363d.C9022i;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p373r.C9053a;
import p174e.p319f.p320a.p363d.p379x.C9061b;

public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: x0 */
    static final Object f11841x0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: y0 */
    static final Object f11842y0 = "CANCEL_BUTTON_TAG";

    /* renamed from: z0 */
    static final Object f11843z0 = "TOGGLE_BUTTON_TAG";
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public final LinkedHashSet<C4219h<? super S>> f11844A0 = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public final LinkedHashSet<View.OnClickListener> f11845B0 = new LinkedHashSet<>();

    /* renamed from: C0 */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f11846C0 = new LinkedHashSet<>();

    /* renamed from: D0 */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f11847D0 = new LinkedHashSet<>();

    /* renamed from: E0 */
    private int f11848E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public C4214d<S> f11849F0;

    /* renamed from: G0 */
    private C4227m<S> f11850G0;

    /* renamed from: H0 */
    private C4208a f11851H0;

    /* renamed from: I0 */
    private MaterialCalendar<S> f11852I0;

    /* renamed from: J0 */
    private int f11853J0;

    /* renamed from: K0 */
    private CharSequence f11854K0;

    /* renamed from: L0 */
    private boolean f11855L0;

    /* renamed from: M0 */
    private TextView f11856M0;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public CheckableImageButton f11857N0;

    /* renamed from: O0 */
    private C8990g f11858O0;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public Button f11859P0;

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$a */
    class C4203a implements View.OnClickListener {
        C4203a() {
        }

        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f11844A0.iterator();
            while (it.hasNext()) {
                ((C4219h) it.next()).mo13201a(MaterialDatePicker.this.mo13155S1());
            }
            MaterialDatePicker.this.mo3831w1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$b */
    class C4204b implements View.OnClickListener {
        C4204b() {
        }

        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f11845B0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.mo3831w1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$c */
    class C4205c implements C4226l<S> {
        C4205c() {
        }

        /* renamed from: a */
        public void mo13158a(S s) {
            Button button;
            boolean z;
            MaterialDatePicker.this.m16060Y1();
            if (MaterialDatePicker.this.f11849F0.mo13180B()) {
                button = MaterialDatePicker.this.f11859P0;
                z = true;
            } else {
                button = MaterialDatePicker.this.f11859P0;
                z = false;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$d */
    class C4206d implements View.OnClickListener {
        C4206d() {
        }

        public void onClick(View view) {
            MaterialDatePicker.this.f11857N0.toggle();
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.m16061Z1(materialDatePicker.f11857N0);
            MaterialDatePicker.this.m16058W1();
        }
    }

    /* renamed from: O1 */
    private static Drawable m16052O1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C1445a.m6446d(context, C9018e.ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C1445a.m6446d(context, C9018e.ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: P1 */
    private static int m16053P1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C9017d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C9017d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C9017d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C9017d.mtrl_calendar_days_of_week_height);
        int i = C4222j.f11905f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C9017d.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(C9017d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C9017d.mtrl_calendar_bottom_padding);
    }

    /* renamed from: R1 */
    private static int m16054R1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C9017d.mtrl_calendar_content_padding);
        int i = C4220i.m16116V().f11902r;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C9017d.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C9017d.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: T1 */
    private int m16055T1(Context context) {
        int i = this.f11848E0;
        return i != 0 ? i : this.f11849F0.mo13187z(context);
    }

    /* renamed from: U1 */
    private void m16056U1(Context context) {
        this.f11857N0.setTag(f11843z0);
        this.f11857N0.setImageDrawable(m16052O1(context));
        C1988t.m8394m0(this.f11857N0, (C1904a) null);
        m16061Z1(this.f11857N0);
        this.f11857N0.setOnClickListener(new C4206d());
    }

    /* renamed from: V1 */
    static boolean m16057V1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C9061b.m30195c(context, C9013b.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public void m16058W1() {
        this.f11852I0 = MaterialCalendar.m16016N1(this.f11849F0, m16055T1(mo3900h1()), this.f11851H0);
        this.f11850G0 = this.f11857N0.isChecked() ? MaterialTextInputPicker.m16071y1(this.f11849F0, this.f11851H0) : this.f11852I0;
        m16060Y1();
        C1252s i = mo3927r().mo4142i();
        i.mo4248n(C9019f.mtrl_calendar_frame, this.f11850G0);
        i.mo3973i();
        this.f11850G0.mo13238w1(new C4205c());
    }

    /* renamed from: X1 */
    public static long m16059X1() {
        return C4220i.m16116V().f11904t;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public void m16060Y1() {
        String Q1 = mo13154Q1();
        this.f11856M0.setContentDescription(String.format(mo3857L(C9022i.mtrl_picker_announce_current_selection), new Object[]{Q1}));
        this.f11856M0.setText(Q1);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public void m16061Z1(CheckableImageButton checkableImageButton) {
        this.f11857N0.setContentDescription(checkableImageButton.getContext().getString(this.f11857N0.isChecked() ? C9022i.mtrl_picker_toggle_to_calendar_input_mode : C9022i.mtrl_picker_toggle_to_text_input_mode));
    }

    /* renamed from: A1 */
    public final Dialog mo180A1(Bundle bundle) {
        Dialog dialog = new Dialog(mo3900h1(), m16055T1(mo3900h1()));
        Context context = dialog.getContext();
        this.f11855L0 = m16057V1(context);
        int c = C9061b.m30195c(context, C9013b.colorSurface, MaterialDatePicker.class.getCanonicalName());
        C8990g gVar = new C8990g(context, (AttributeSet) null, C9013b.materialCalendarStyle, C9023j.Widget_MaterialComponents_MaterialCalendar);
        this.f11858O0 = gVar;
        gVar.mo22815L(context);
        this.f11858O0.mo22819T(ColorStateList.valueOf(c));
        this.f11858O0.mo22818S(C1988t.m8407t(dialog.getWindow().getDecorView()));
        return dialog;
    }

    /* renamed from: D0 */
    public final void mo3818D0(Bundle bundle) {
        super.mo3818D0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f11848E0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f11849F0);
        C4208a.C4210b bVar = new C4208a.C4210b(this.f11851H0);
        if (this.f11852I0.mo13134J1() != null) {
            bVar.mo13175b(this.f11852I0.mo13134J1().f11904t);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.mo13174a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f11853J0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f11854K0);
    }

    /* renamed from: E0 */
    public void mo3820E0() {
        super.mo3820E0();
        Window window = mo3816B1().getWindow();
        if (this.f11855L0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f11858O0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = mo3846F().getDimensionPixelOffset(C9017d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f11858O0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C9053a(mo3816B1(), rect));
        }
        m16058W1();
    }

    /* renamed from: F0 */
    public void mo3821F0() {
        this.f11850G0.mo13239x1();
        super.mo3821F0();
    }

    /* renamed from: Q1 */
    public String mo13154Q1() {
        return this.f11849F0.mo13184g(mo3930s());
    }

    /* renamed from: S1 */
    public final S mo13155S1() {
        return this.f11849F0.mo13182F();
    }

    /* renamed from: h0 */
    public final void mo3825h0(Bundle bundle) {
        super.mo3825h0(bundle);
        if (bundle == null) {
            bundle = mo3925q();
        }
        this.f11848E0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f11849F0 = (C4214d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f11851H0 = (C4208a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f11853J0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f11854K0 = bundle.getCharSequence("TITLE_TEXT_KEY");
    }

    /* renamed from: l0 */
    public final View mo3910l0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f11855L0 ? C9021h.mtrl_picker_fullscreen : C9021h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f11855L0) {
            inflate.findViewById(C9019f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m16054R1(context), -2));
        } else {
            View findViewById = inflate.findViewById(C9019f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(C9019f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m16054R1(context), -1));
            findViewById2.setMinimumHeight(m16053P1(mo3900h1()));
        }
        TextView textView = (TextView) inflate.findViewById(C9019f.mtrl_picker_header_selection_text);
        this.f11856M0 = textView;
        C1988t.m8398o0(textView, 1);
        this.f11857N0 = (CheckableImageButton) inflate.findViewById(C9019f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C9019f.mtrl_picker_title_text);
        CharSequence charSequence = this.f11854K0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f11853J0);
        }
        m16056U1(context);
        this.f11859P0 = (Button) inflate.findViewById(C9019f.confirm_button);
        if (this.f11849F0.mo13180B()) {
            this.f11859P0.setEnabled(true);
        } else {
            this.f11859P0.setEnabled(false);
        }
        this.f11859P0.setTag(f11841x0);
        this.f11859P0.setOnClickListener(new C4203a());
        Button button = (Button) inflate.findViewById(C9019f.cancel_button);
        button.setTag(f11842y0);
        button.setOnClickListener(new C4204b());
        return inflate;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f11846C0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f11847D0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) mo3861N();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
