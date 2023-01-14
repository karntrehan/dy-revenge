package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0141n;
import androidx.appcompat.widget.C0292x0;
import p027c.p028a.C1435a;
import p027c.p028a.C1440f;
import p027c.p028a.C1441g;
import p027c.p028a.C1444j;
import p027c.p064i.p072j.C1988t;

public class ListMenuItemView extends LinearLayout implements C0141n.C0142a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A */
    private Drawable f418A;

    /* renamed from: B */
    private boolean f419B;

    /* renamed from: C */
    private LayoutInflater f420C;

    /* renamed from: D */
    private boolean f421D;

    /* renamed from: f */
    private C0128i f422f;

    /* renamed from: o */
    private ImageView f423o;

    /* renamed from: p */
    private RadioButton f424p;

    /* renamed from: q */
    private TextView f425q;

    /* renamed from: r */
    private CheckBox f426r;

    /* renamed from: s */
    private TextView f427s;

    /* renamed from: t */
    private ImageView f428t;

    /* renamed from: u */
    private ImageView f429u;

    /* renamed from: v */
    private LinearLayout f430v;

    /* renamed from: w */
    private Drawable f431w;

    /* renamed from: x */
    private int f432x;

    /* renamed from: y */
    private Context f433y;

    /* renamed from: z */
    private boolean f434z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0292x0 v = C0292x0.m1407v(getContext(), attributeSet, C1444j.f4312W1, i, 0);
        this.f431w = v.mo1790g(C1444j.f4322Y1);
        this.f432x = v.mo1797n(C1444j.f4317X1, -1);
        this.f434z = v.mo1784a(C1444j.f4327Z1, false);
        this.f433y = context;
        this.f418A = v.mo1790g(C1444j.f4332a2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C1435a.dropDownListViewStyle, 0);
        this.f419B = obtainStyledAttributes.hasValue(0);
        v.mo1803w();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m525a(View view) {
        m526b(view, -1);
    }

    /* renamed from: b */
    private void m526b(View view, int i) {
        LinearLayout linearLayout = this.f430v;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m527c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C1441g.abc_list_menu_item_checkbox, this, false);
        this.f426r = checkBox;
        m525a(checkBox);
    }

    /* renamed from: f */
    private void m528f() {
        ImageView imageView = (ImageView) getInflater().inflate(C1441g.abc_list_menu_item_icon, this, false);
        this.f423o = imageView;
        m526b(imageView, 0);
    }

    /* renamed from: g */
    private void m529g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C1441g.abc_list_menu_item_radio, this, false);
        this.f424p = radioButton;
        m525a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f420C == null) {
            this.f420C = LayoutInflater.from(getContext());
        }
        return this.f420C;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f428t;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f429u;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f429u.getLayoutParams();
            rect.top += this.f429u.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: d */
    public boolean mo428d() {
        return false;
    }

    /* renamed from: e */
    public void mo429e(C0128i iVar, int i) {
        this.f422f = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.mo683i(this));
        setCheckable(iVar.isCheckable());
        mo454h(iVar.mo664A(), iVar.mo668g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public C0128i getItemData() {
        return this.f422f;
    }

    /* renamed from: h */
    public void mo454h(boolean z, char c) {
        int i = (!z || !this.f422f.mo664A()) ? 8 : 0;
        if (i == 0) {
            this.f427s.setText(this.f422f.mo681h());
        }
        if (this.f427s.getVisibility() != i) {
            this.f427s.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C1988t.m8400p0(this, this.f431w);
        TextView textView = (TextView) findViewById(C1440f.title);
        this.f425q = textView;
        int i = this.f432x;
        if (i != -1) {
            textView.setTextAppearance(this.f433y, i);
        }
        this.f427s = (TextView) findViewById(C1440f.shortcut);
        ImageView imageView = (ImageView) findViewById(C1440f.submenuarrow);
        this.f428t = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f418A);
        }
        this.f429u = (ImageView) findViewById(C1440f.group_divider);
        this.f430v = (LinearLayout) findViewById(C1440f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f423o != null && this.f434z) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f423o.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f424p != null || this.f426r != null) {
            if (this.f422f.mo691m()) {
                if (this.f424p == null) {
                    m529g();
                }
                compoundButton2 = this.f424p;
                compoundButton = this.f426r;
            } else {
                if (this.f426r == null) {
                    m527c();
                }
                compoundButton2 = this.f426r;
                compoundButton = this.f424p;
            }
            if (z) {
                compoundButton2.setChecked(this.f422f.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f426r;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f424p;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f422f.mo691m()) {
            if (this.f424p == null) {
                m529g();
            }
            compoundButton = this.f424p;
        } else {
            if (this.f426r == null) {
                m527c();
            }
            compoundButton = this.f426r;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f421D = z;
        this.f434z = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f429u;
        if (imageView != null) {
            imageView.setVisibility((this.f419B || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f422f.mo721z() || this.f421D;
        if (z || this.f434z) {
            ImageView imageView = this.f423o;
            if (imageView != null || drawable != null || this.f434z) {
                if (imageView == null) {
                    m528f();
                }
                if (drawable != null || this.f434z) {
                    ImageView imageView2 = this.f423o;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f423o.getVisibility() != 0) {
                        this.f423o.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f423o.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f425q.setText(charSequence);
            if (this.f425q.getVisibility() != 0) {
                textView = this.f425q;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f425q.getVisibility() != 8) {
                textView = this.f425q;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
