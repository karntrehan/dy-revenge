package com.facebook.react.views.swiperefresh;

import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p115e0.C2737e;
import com.facebook.react.p115e0.C2738f;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.util.Map;
import p027c.p098u.p099b.C2110c;

@C2639a(name = "AndroidSwipeRefreshLayout")
public class SwipeRefreshLayoutManager extends ViewGroupManager<C3157a> implements C2738f<C3157a> {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final C2928c1<C3157a> mDelegate = new C2737e(this);

    /* renamed from: com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager$a */
    class C3156a implements C2110c.C2120j {

        /* renamed from: a */
        final /* synthetic */ C3031o0 f8837a;

        /* renamed from: b */
        final /* synthetic */ C3157a f8838b;

        C3156a(C3031o0 o0Var, C3157a aVar) {
            this.f8837a = o0Var;
            this.f8838b = aVar;
        }

        /* renamed from: a */
        public void mo7165a() {
            C2945d b = C3051u0.m12085b(this.f8837a, this.f8838b.getId());
            if (b != null) {
                b.mo9651c(new C3158b(C3051u0.m12088e(this.f8838b), this.f8838b.getId()));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, C3157a aVar) {
        aVar.setOnRefreshListener(new C3156a(o0Var, aVar));
    }

    /* access modifiers changed from: protected */
    public C3157a createViewInstance(C3031o0 o0Var) {
        return new C3157a(o0Var);
    }

    /* access modifiers changed from: protected */
    public C2928c1<C3157a> getDelegate() {
        return this.mDelegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return C2693e.m10911a().mo8815b("topRefresh", C2693e.m10914d("registrationName", "onRefresh")).mo8814a();
    }

    public Map<String, Object> getExportedViewConstants() {
        return C2693e.m10914d("SIZE", C2693e.m10915e("DEFAULT", 1, "LARGE", 0));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void receiveCommand(C3157a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing") && readableArray != null) {
            setRefreshing(aVar, readableArray.getBoolean(0));
        }
    }

    @C2991a(customType = "ColorArray", name = "colors")
    public void setColors(C3157a aVar, ReadableArray readableArray) {
        if (readableArray != null) {
            int[] iArr = new int[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                if (readableArray.getType(i) == ReadableType.Map) {
                    iArr[i] = ColorPropConverter.getColor(readableArray.getMap(i), aVar.getContext()).intValue();
                } else {
                    iArr[i] = readableArray.getInt(i);
                }
            }
            aVar.setColorSchemeColors(iArr);
            return;
        }
        aVar.setColorSchemeColors(new int[0]);
    }

    @C2991a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C3157a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    public void setNativeRefreshing(C3157a aVar, boolean z) {
        setRefreshing(aVar, z);
    }

    @C2991a(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(C3157a aVar, Integer num) {
        aVar.setProgressBackgroundColorSchemeColor(num == null ? 0 : num.intValue());
    }

    @C2991a(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(C3157a aVar, float f) {
        aVar.setProgressViewOffset(f);
    }

    @C2991a(name = "refreshing")
    public void setRefreshing(C3157a aVar, boolean z) {
        aVar.setRefreshing(z);
    }

    public void setSize(C3157a aVar, int i) {
        aVar.setSize(i);
    }

    @C2991a(name = "size")
    public void setSize(C3157a aVar, Dynamic dynamic) {
        int asInt;
        if (dynamic.isNull()) {
            asInt = 1;
        } else if (dynamic.getType() == ReadableType.Number) {
            asInt = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            setSize(aVar, dynamic.asString());
            return;
        } else {
            throw new IllegalArgumentException("Size must be 'default' or 'large'");
        }
        aVar.setSize(asInt);
    }

    public void setSize(C3157a aVar, String str) {
        int i;
        if (str == null || str.equals("default")) {
            i = 1;
        } else if (str.equals("large")) {
            i = 0;
        } else {
            throw new IllegalArgumentException("Size must be 'default' or 'large', received: " + str);
        }
        aVar.setSize(i);
    }
}
