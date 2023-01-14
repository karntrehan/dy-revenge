package com.reactnativecommunity.picker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.reactnativecommunity.picker.C5277h;
import java.util.Map;
import p174e.p247e.p315l.p316a.C6409a;

public abstract class ReactPickerManager extends BaseViewManager<C5277h, C5283j> {
    private static final int BLUR_PICKER = 2;
    private static final ReadableArray EMPTY_ARRAY = Arguments.createArray();
    private static final int FOCUS_PICKER = 1;

    /* renamed from: com.reactnativecommunity.picker.ReactPickerManager$a */
    private static class C5268a implements C5277h.C5281d, C5277h.C5280c {

        /* renamed from: a */
        private final C5277h f14821a;

        /* renamed from: b */
        private final C2945d f14822b;

        public C5268a(C5277h hVar, C2945d dVar) {
            this.f14821a = hVar;
            this.f14822b = dVar;
        }

        /* renamed from: a */
        public void mo15917a(int i) {
            this.f14822b.mo9651c(new C5272c(this.f14821a.getId(), i));
        }

        /* renamed from: b */
        public void mo15918b() {
            this.f14822b.mo9651c(new C5270a(this.f14821a.getId()));
        }

        /* renamed from: c */
        public void mo15919c() {
            this.f14822b.mo9651c(new C5271b(this.f14821a.getId()));
        }
    }

    /* renamed from: com.reactnativecommunity.picker.ReactPickerManager$b */
    private static class C5269b extends BaseAdapter {

        /* renamed from: f */
        private final LayoutInflater f14823f;

        /* renamed from: o */
        private int f14824o = 1;

        /* renamed from: p */
        private Integer f14825p;

        /* renamed from: q */
        private ReadableArray f14826q;

        public C5269b(Context context, ReadableArray readableArray) {
            this.f14826q = readableArray;
            this.f14823f = (LayoutInflater) C6409a.m24521c(context.getSystemService("layout_inflater"));
        }

        /* JADX WARNING: Removed duplicated region for block: B:54:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00f1  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.view.View m19647b(int r8, android.view.View r9, android.view.ViewGroup r10, boolean r11) {
            /*
                r7 = this;
                com.facebook.react.bridge.ReadableMap r8 = r7.getItem(r8)
                java.lang.String r0 = "style"
                boolean r1 = r8.hasKey(r0)
                if (r1 == 0) goto L_0x0011
                com.facebook.react.bridge.ReadableMap r0 = r8.getMap(r0)
                goto L_0x0012
            L_0x0011:
                r0 = 0
            L_0x0012:
                r1 = 0
                if (r9 != 0) goto L_0x0022
                if (r11 == 0) goto L_0x001a
                int r9 = com.reactnativecommunity.picker.C5275f.simple_spinner_dropdown_item
                goto L_0x001c
            L_0x001a:
                int r9 = com.reactnativecommunity.picker.C5275f.simple_spinner_item
            L_0x001c:
                android.view.LayoutInflater r2 = r7.f14823f
                android.view.View r9 = r2.inflate(r9, r10, r1)
            L_0x0022:
                java.lang.String r10 = "enabled"
                boolean r2 = r8.hasKey(r10)
                r3 = 1
                if (r2 == 0) goto L_0x0030
                boolean r10 = r8.getBoolean(r10)
                goto L_0x0031
            L_0x0030:
                r10 = 1
            L_0x0031:
                r9.setEnabled(r10)
                r10 = r10 ^ r3
                r9.setClickable(r10)
                r10 = r9
                android.widget.TextView r10 = (android.widget.TextView) r10
                java.lang.String r2 = "label"
                java.lang.String r2 = r8.getString(r2)
                r10.setText(r2)
                int r2 = r7.f14824o
                r10.setMaxLines(r2)
                java.lang.String r2 = "fontFamily"
                java.lang.String r4 = "color"
                if (r0 == 0) goto L_0x00a8
                java.lang.String r5 = "backgroundColor"
                boolean r6 = r0.hasKey(r5)
                if (r6 == 0) goto L_0x0065
                boolean r6 = r0.isNull(r5)
                if (r6 != 0) goto L_0x0065
                int r5 = r0.getInt(r5)
                r9.setBackgroundColor(r5)
                goto L_0x0068
            L_0x0065:
                r9.setBackgroundColor(r1)
            L_0x0068:
                boolean r5 = r0.hasKey(r4)
                if (r5 == 0) goto L_0x007b
                boolean r5 = r0.isNull(r4)
                if (r5 != 0) goto L_0x007b
                int r5 = r0.getInt(r4)
                r10.setTextColor(r5)
            L_0x007b:
                java.lang.String r5 = "fontSize"
                boolean r6 = r0.hasKey(r5)
                if (r6 == 0) goto L_0x0091
                boolean r6 = r0.isNull(r5)
                if (r6 != 0) goto L_0x0091
                double r5 = r0.getDouble(r5)
                float r5 = (float) r5
                r10.setTextSize(r5)
            L_0x0091:
                boolean r5 = r0.hasKey(r2)
                if (r5 == 0) goto L_0x00a8
                boolean r5 = r0.isNull(r2)
                if (r5 != 0) goto L_0x00a8
                java.lang.String r0 = r0.getString(r2)
                android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
                r10.setTypeface(r0)
            L_0x00a8:
                if (r11 != 0) goto L_0x00b6
                java.lang.Integer r11 = r7.f14825p
                if (r11 == 0) goto L_0x00b6
                int r11 = r11.intValue()
            L_0x00b2:
                r10.setTextColor(r11)
                goto L_0x00c7
            L_0x00b6:
                boolean r11 = r8.hasKey(r4)
                if (r11 == 0) goto L_0x00c7
                boolean r11 = r8.isNull(r4)
                if (r11 != 0) goto L_0x00c7
                int r11 = r8.getInt(r4)
                goto L_0x00b2
            L_0x00c7:
                boolean r11 = r8.hasKey(r2)
                if (r11 == 0) goto L_0x00de
                boolean r11 = r8.isNull(r2)
                if (r11 != 0) goto L_0x00de
                java.lang.String r8 = r8.getString(r2)
                android.graphics.Typeface r8 = android.graphics.Typeface.create(r8, r1)
                r10.setTypeface(r8)
            L_0x00de:
                com.facebook.react.modules.i18nmanager.a r8 = com.facebook.react.modules.i18nmanager.C2822a.m11246d()
                android.content.Context r10 = r9.getContext()
                boolean r8 = r8.mo9192g(r10)
                if (r8 == 0) goto L_0x00f1
                r9.setLayoutDirection(r3)
                r8 = 4
                goto L_0x00f5
            L_0x00f1:
                r9.setLayoutDirection(r1)
                r8 = 3
            L_0x00f5:
                r9.setTextDirection(r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.picker.ReactPickerManager.C5269b.m19647b(int, android.view.View, android.view.ViewGroup, boolean):android.view.View");
        }

        /* renamed from: a */
        public ReadableMap getItem(int i) {
            ReadableArray readableArray = this.f14826q;
            if (readableArray == null) {
                return null;
            }
            return readableArray.getMap(i);
        }

        /* renamed from: c */
        public void mo15921c(ReadableArray readableArray) {
            this.f14826q = readableArray;
            notifyDataSetChanged();
        }

        /* renamed from: d */
        public void mo15922d(int i) {
            this.f14824o = i;
            notifyDataSetChanged();
        }

        /* renamed from: e */
        public void mo15923e(Integer num) {
            this.f14825p = num;
            notifyDataSetChanged();
        }

        public int getCount() {
            ReadableArray readableArray = this.f14826q;
            if (readableArray == null) {
                return 0;
            }
            return readableArray.size();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return m19647b(i, view, viewGroup, true);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return m19647b(i, view, viewGroup, false);
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, C5277h hVar) {
        C5268a aVar = new C5268a(hVar, ((UIManagerModule) o0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher());
        hVar.setOnSelectListener(aVar);
        hVar.setOnFocusListener(aVar);
    }

    public C5283j createShadowNodeInstance() {
        return new C5283j();
    }

    public Map<String, Integer> getCommandsMap() {
        return C2693e.m10915e("focus", 1, "blur", 2);
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return C2693e.m10911a().mo8815b("topSelect", C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onSelect", "captured", "onSelectCapture"))).mo8815b("topFocus", C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onFocus", "captured", "onFocusCapture"))).mo8815b("topBlur", C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onBlur", "captured", "onBlurCapture"))).mo8814a();
    }

    public Class<? extends C5283j> getShadowNodeClass() {
        return C5283j.class;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C5277h hVar) {
        super.onAfterUpdateTransaction(hVar);
        hVar.mo15930f();
    }

    public void receiveCommand(C5277h hVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            hVar.performClick();
        } else if (i == 2) {
            hVar.clearFocus();
        }
    }

    public void receiveCommand(C5277h hVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("blur")) {
            hVar.clearFocus();
        } else if (str.equals("focus")) {
            hVar.performClick();
        }
    }

    @C2991a(name = "backgroundColor")
    public void setBackgroundColor(C5277h hVar, int i) {
        hVar.setBackgroundColor(i);
    }

    @C2991a(customType = "Color", name = "color")
    public void setColor(C5277h hVar, Integer num) {
        hVar.setPrimaryColor(num);
        C5269b bVar = (C5269b) hVar.getAdapter();
        if (bVar != null) {
            bVar.mo15923e(num);
        }
    }

    @C2991a(name = "dropdownIconColor")
    public void setDropdownIconColor(C5277h hVar, int i) {
        hVar.setDropdownIconColor(i);
    }

    @C2991a(name = "dropdownIconRippleColor")
    public void setDropdownIconRippleColor(C5277h hVar, int i) {
        hVar.setDropdownIconRippleColor(i);
    }

    @C2991a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C5277h hVar, boolean z) {
        hVar.setEnabled(z);
    }

    @C2991a(name = "items")
    public void setItems(C5277h hVar, ReadableArray readableArray) {
        C5269b bVar = (C5269b) hVar.getAdapter();
        if (bVar == null) {
            C5269b bVar2 = new C5269b(hVar.getContext(), readableArray);
            bVar2.mo15923e(hVar.getPrimaryColor());
            hVar.setAdapter((SpinnerAdapter) bVar2);
            return;
        }
        bVar.mo15921c(readableArray);
    }

    @C2991a(defaultInt = 1, name = "numberOfLines")
    public void setNumberOfLines(C5277h hVar, int i) {
        C5269b bVar = (C5269b) hVar.getAdapter();
        if (bVar == null) {
            C5269b bVar2 = new C5269b(hVar.getContext(), EMPTY_ARRAY);
            bVar2.mo15923e(hVar.getPrimaryColor());
            bVar2.mo15922d(i);
            hVar.setAdapter((SpinnerAdapter) bVar2);
            return;
        }
        bVar.mo15922d(i);
    }

    @C2991a(name = "prompt")
    public void setPrompt(C5277h hVar, String str) {
        hVar.setPrompt(str);
    }

    @C2991a(name = "selected")
    public void setSelected(C5277h hVar, int i) {
        hVar.setStagedSelection(i);
    }

    public void updateExtraData(C5277h hVar, Object obj) {
    }
}
