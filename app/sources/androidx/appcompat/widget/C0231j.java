package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0247m0;
import p027c.p028a.C1435a;
import p027c.p028a.C1437c;
import p027c.p028a.C1439e;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p065d.C1827a;

/* renamed from: androidx.appcompat.widget.j */
public final class C0231j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final PorterDuff.Mode f1008a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0231j f1009b;

    /* renamed from: c */
    private C0247m0 f1010c;

    /* renamed from: androidx.appcompat.widget.j$a */
    class C0232a implements C0247m0.C0252e {

        /* renamed from: a */
        private final int[] f1011a = {C1439e.abc_textfield_search_default_mtrl_alpha, C1439e.abc_textfield_default_mtrl_alpha, C1439e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f1012b = {C1439e.abc_ic_commit_search_api_mtrl_alpha, C1439e.abc_seekbar_tick_mark_material, C1439e.abc_ic_menu_share_mtrl_alpha, C1439e.abc_ic_menu_copy_mtrl_am_alpha, C1439e.abc_ic_menu_cut_mtrl_alpha, C1439e.abc_ic_menu_selectall_mtrl_alpha, C1439e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f1013c = {C1439e.abc_textfield_activated_mtrl_alpha, C1439e.abc_textfield_search_activated_mtrl_alpha, C1439e.f4198k, C1439e.abc_text_cursor_material, C1439e.f4192J, C1439e.f4194L, C1439e.f4196N, C1439e.f4193K, C1439e.f4195M, C1439e.f4197O};

        /* renamed from: d */
        private final int[] f1014d = {C1439e.f4199w, C1439e.abc_cab_background_internal_bg, C1439e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f1015e = {C1439e.abc_tab_indicator_material, C1439e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f1016f = {C1439e.abc_btn_check_material, C1439e.abc_btn_radio_material, C1439e.abc_btn_check_material_anim, C1439e.abc_btn_radio_material_anim};

        C0232a() {
        }

        /* renamed from: f */
        private boolean m1186f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m1187g(Context context) {
            return m1188h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m1188h(Context context, int i) {
            int c = C0271s0.m1351c(context, C1435a.f4190v);
            int b = C0271s0.m1350b(context, C1435a.colorButtonNormal);
            return new ColorStateList(new int[][]{C0271s0.f1187b, C0271s0.f1190e, C0271s0.f1188c, C0271s0.f1194i}, new int[]{b, C1827a.m7756e(c, i), C1827a.m7756e(c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m1189i(Context context) {
            return m1188h(context, C0271s0.m1351c(context, C1435a.colorAccent));
        }

        /* renamed from: j */
        private ColorStateList m1190j(Context context) {
            return m1188h(context, C0271s0.m1351c(context, C1435a.colorButtonNormal));
        }

        /* renamed from: k */
        private ColorStateList m1191k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = C1435a.colorSwitchThumbNormal;
            ColorStateList e = C0271s0.m1353e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = C0271s0.f1187b;
                iArr2[0] = C0271s0.m1350b(context, i);
                iArr[1] = C0271s0.f1191f;
                iArr2[1] = C0271s0.m1351c(context, C1435a.f4189u);
                iArr[2] = C0271s0.f1194i;
                iArr2[2] = C0271s0.m1351c(context, i);
            } else {
                iArr[0] = C0271s0.f1187b;
                iArr2[0] = e.getColorForState(iArr[0], 0);
                iArr[1] = C0271s0.f1191f;
                iArr2[1] = C0271s0.m1351c(context, C1435a.f4189u);
                iArr[2] = C0271s0.f1194i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private void m1192l(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0215e0.m1117a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0231j.f1008a;
            }
            drawable.setColorFilter(C0231j.m1179e(i, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1446a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0231j.f1008a
                int[] r1 = r6.f1011a
                boolean r1 = r6.m1186f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p027c.p028a.C1435a.colorControlNormal
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1013c
                boolean r1 = r6.m1186f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p027c.p028a.C1435a.f4189u
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1014d
                boolean r1 = r6.m1186f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p027c.p028a.C1439e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p027c.p028a.C1439e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.C0215e0.m1117a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.C0271s0.m1351c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0231j.m1179e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0231j.C0232a.mo1446a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public PorterDuff.Mode mo1447b(int i) {
            if (i == C1439e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: c */
        public Drawable mo1448c(C0247m0 m0Var, Context context, int i) {
            if (i != C1439e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{m0Var.mo1514j(context, C1439e.abc_cab_background_internal_bg), m0Var.mo1514j(context, C1439e.f4198k)});
        }

        /* renamed from: d */
        public ColorStateList mo1449d(Context context, int i) {
            if (i == C1439e.abc_edit_text_material) {
                return C1445a.m6445c(context, C1437c.abc_tint_edittext);
            }
            if (i == C1439e.abc_switch_track_mtrl_alpha) {
                return C1445a.m6445c(context, C1437c.abc_tint_switch_track);
            }
            if (i == C1439e.abc_switch_thumb_material) {
                return m1191k(context);
            }
            if (i == C1439e.abc_btn_default_mtrl_shape) {
                return m1190j(context);
            }
            if (i == C1439e.abc_btn_borderless_material) {
                return m1187g(context);
            }
            if (i == C1439e.abc_btn_colored_material) {
                return m1189i(context);
            }
            if (i == C1439e.f4191D || i == C1439e.abc_spinner_textfield_background_material) {
                return C1445a.m6445c(context, C1437c.abc_tint_spinner);
            }
            if (m1186f(this.f1012b, i)) {
                return C0271s0.m1353e(context, C1435a.colorControlNormal);
            }
            if (m1186f(this.f1015e, i)) {
                return C1445a.m6445c(context, C1437c.abc_tint_default);
            }
            if (m1186f(this.f1016f, i)) {
                return C1445a.m6445c(context, C1437c.abc_tint_btn_checkable);
            }
            if (i == C1439e.abc_seekbar_thumb_material) {
                return C1445a.m6445c(context, C1437c.abc_tint_seek_thumb);
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo1450e(Context context, int i, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c;
            if (i == C1439e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C1435a.colorControlNormal;
                m1192l(findDrawableByLayerId2, C0271s0.m1351c(context, i2), C0231j.f1008a);
                m1192l(layerDrawable.findDrawableByLayerId(16908303), C0271s0.m1351c(context, i2), C0231j.f1008a);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                c = C0271s0.m1351c(context, C1435a.f4189u);
            } else if (i != C1439e.abc_ratingbar_material && i != C1439e.abc_ratingbar_indicator_material && i != C1439e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1192l(layerDrawable2.findDrawableByLayerId(16908288), C0271s0.m1350b(context, C1435a.colorControlNormal), C0231j.f1008a);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C1435a.f4189u;
                m1192l(findDrawableByLayerId3, C0271s0.m1351c(context, i3), C0231j.f1008a);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                c = C0271s0.m1351c(context, i3);
            }
            m1192l(findDrawableByLayerId, c, C0231j.f1008a);
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized C0231j m1178b() {
        C0231j jVar;
        synchronized (C0231j.class) {
            if (f1009b == null) {
                m1180h();
            }
            jVar = f1009b;
        }
        return jVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m1179e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C0231j.class) {
            l = C0247m0.m1252l(i, mode);
        }
        return l;
    }

    /* renamed from: h */
    public static synchronized void m1180h() {
        synchronized (C0231j.class) {
            if (f1009b == null) {
                C0231j jVar = new C0231j();
                f1009b = jVar;
                jVar.f1010c = C0247m0.m1250h();
                f1009b.f1010c.mo1520u(new C0232a());
            }
        }
    }

    /* renamed from: i */
    static void m1181i(Drawable drawable, C0277v0 v0Var, int[] iArr) {
        C0247m0.m1258w(drawable, v0Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo1442c(Context context, int i) {
        return this.f1010c.mo1514j(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable mo1443d(Context context, int i, boolean z) {
        return this.f1010c.mo1515k(context, i, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList mo1444f(Context context, int i) {
        return this.f1010c.mo1516m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo1445g(Context context) {
        this.f1010c.mo1518s(context);
    }
}
