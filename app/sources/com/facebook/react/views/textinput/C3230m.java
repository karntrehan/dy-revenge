package com.facebook.react.views.textinput;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3029o;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3061z0;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.views.text.C3181h;
import com.facebook.react.views.text.C3196r;
import com.facebook.react.views.text.C3199t;
import com.facebook.react.views.view.C3238c;
import com.facebook.yoga.C3313m;
import com.facebook.yoga.C3314n;
import com.facebook.yoga.C3315o;
import com.facebook.yoga.C3316p;
import p027c.p064i.p072j.C1988t;
import p174e.p247e.p315l.p316a.C6409a;

@TargetApi(23)
/* renamed from: com.facebook.react.views.textinput.m */
public class C3230m extends C3181h implements C3313m {

    /* renamed from: a0 */
    private int f9111a0;

    /* renamed from: b0 */
    private EditText f9112b0;

    /* renamed from: c0 */
    private C3228k f9113c0;

    /* renamed from: d0 */
    private String f9114d0;

    /* renamed from: e0 */
    private String f9115e0;

    /* renamed from: f0 */
    private int f9116f0;

    /* renamed from: g0 */
    private int f9117g0;

    public C3230m() {
        this((C3199t) null);
    }

    public C3230m(C3199t tVar) {
        super(tVar);
        this.f9111a0 = -1;
        this.f9114d0 = null;
        this.f9115e0 = null;
        this.f9116f0 = -1;
        this.f9117g0 = -1;
        this.f8914I = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        m12642v1();
    }

    /* renamed from: v1 */
    private void m12642v1() {
        mo9577T0(this);
    }

    /* renamed from: C */
    public void mo9500C(C3031o0 o0Var) {
        super.mo9500C(o0Var);
        EditText s1 = mo10581s1();
        mo9565H0(4, (float) C1988t.m8339D(s1));
        mo9565H0(1, (float) s1.getPaddingTop());
        mo9565H0(5, (float) C1988t.m8337C(s1));
        mo9565H0(3, (float) s1.getPaddingBottom());
        this.f9112b0 = s1;
        s1.setPadding(0, 0, 0, 0);
        this.f9112b0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    /* renamed from: H */
    public void mo9505H(Object obj) {
        C6409a.m24519a(obj instanceof C3228k);
        this.f9113c0 = (C3228k) obj;
        mo9539k();
    }

    /* renamed from: V0 */
    public void mo9579V0(int i, float f) {
        super.mo9579V0(i, f);
        mo9621x0();
    }

    /* renamed from: c */
    public long mo10055c(C3316p pVar, float f, C3314n nVar, float f2, C3314n nVar2) {
        int i;
        EditText editText = (EditText) C6409a.m24521c(this.f9112b0);
        C3228k kVar = this.f9113c0;
        if (kVar != null) {
            kVar.mo10580a(editText);
        } else {
            editText.setTextSize(0, (float) this.f8907B.mo10420c());
            int i2 = this.f8912G;
            if (i2 != -1) {
                editText.setLines(i2);
            }
            if (Build.VERSION.SDK_INT >= 23 && editText.getBreakStrategy() != (i = this.f8914I)) {
                editText.setBreakStrategy(i);
            }
        }
        editText.setHint(mo10586t1());
        editText.measure(C3238c.m12662a(f, nVar), C3238c.m12662a(f2, nVar2));
        return C3315o.m12982b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    /* renamed from: s1 */
    public EditText mo10581s1() {
        return new EditText(mo9506I());
    }

    @C2991a(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.f9111a0 = i;
    }

    @C2991a(name = "placeholder")
    public void setPlaceholder(String str) {
        this.f9115e0 = str;
        mo9621x0();
    }

    @C2991a(name = "selection")
    public void setSelection(ReadableMap readableMap) {
        this.f9117g0 = -1;
        this.f9116f0 = -1;
        if (readableMap != null && readableMap.hasKey("start") && readableMap.hasKey("end")) {
            this.f9116f0 = readableMap.getInt("start");
            this.f9117g0 = readableMap.getInt("end");
            mo9621x0();
        }
    }

    @C2991a(name = "text")
    public void setText(String str) {
        int i;
        this.f9114d0 = str;
        if (str != null) {
            if (this.f9116f0 > str.length()) {
                this.f9116f0 = str.length();
            }
            if (this.f9117g0 > str.length()) {
                i = str.length();
            }
            mo9621x0();
        }
        i = -1;
        this.f9116f0 = -1;
        this.f9117g0 = i;
        mo9621x0();
    }

    public void setTextBreakStrategy(String str) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            if (str == null || "simple".equals(str)) {
                i = 0;
            } else if ("highQuality".equals(str)) {
                i = 1;
            } else if ("balanced".equals(str)) {
                i = 2;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
            this.f8914I = i;
        }
    }

    /* renamed from: t1 */
    public String mo10586t1() {
        return this.f9115e0;
    }

    /* renamed from: u0 */
    public boolean mo9618u0() {
        return true;
    }

    /* renamed from: u1 */
    public String mo10587u1() {
        return this.f9114d0;
    }

    /* renamed from: v0 */
    public boolean mo9619v0() {
        return true;
    }

    /* renamed from: z0 */
    public void mo9623z0(C3061z0 z0Var) {
        super.mo9623z0(z0Var);
        if (this.f9111a0 != -1) {
            C3061z0 z0Var2 = z0Var;
            z0Var2.mo9890R(mo9548t(), new C3196r(mo10341r1(this, mo10587u1(), false, (C3029o) null), this.f9111a0, this.f8930Y, mo9601k0(0), mo9601k0(1), mo9601k0(2), mo9601k0(3), this.f8913H, this.f8914I, this.f8916K, this.f9116f0, this.f9117g0));
        }
    }
}
