package com.reactnativecommunity.toolbarandroid;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.reactnativecommunity.toolbarandroid.p170d.C5296a;
import java.util.Map;
import p027c.p064i.p072j.C1988t;

public class ReactToolbarManager extends ViewGroupManager<C5287b> {
    private static final int COMMAND_DISMISS_POPUP_MENUS = 1;
    private static final String REACT_CLASS = "ToolbarAndroid";

    /* renamed from: com.reactnativecommunity.toolbarandroid.ReactToolbarManager$a */
    class C5284a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C2945d f14840f;

        /* renamed from: o */
        final /* synthetic */ C5287b f14841o;

        C5284a(C2945d dVar, C5287b bVar) {
            this.f14840f = dVar;
            this.f14841o = bVar;
        }

        public void onClick(View view) {
            this.f14840f.mo9651c(new C5296a(this.f14841o.getId(), -1));
        }
    }

    /* renamed from: com.reactnativecommunity.toolbarandroid.ReactToolbarManager$b */
    class C5285b implements Toolbar.C0185f {

        /* renamed from: a */
        final /* synthetic */ C2945d f14843a;

        /* renamed from: b */
        final /* synthetic */ C5287b f14844b;

        C5285b(C2945d dVar, C5287b bVar) {
            this.f14843a = dVar;
            this.f14844b = bVar;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            this.f14843a.mo9651c(new C5296a(this.f14844b.getId(), menuItem.getOrder()));
            return true;
        }
    }

    private static int[] getDefaultColors(Context context) {
        TypedArray typedArray;
        TypedArray typedArray2;
        TypedArray typedArray3;
        Resources.Theme theme = context.getTheme();
        TypedArray typedArray4 = null;
        try {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{getIdentifier(context, "toolbarStyle")});
            try {
                typedArray = theme.obtainStyledAttributes(obtainStyledAttributes.getResourceId(0, 0), new int[]{getIdentifier(context, "titleTextAppearance"), getIdentifier(context, "subtitleTextAppearance")});
            } catch (Throwable th) {
                th = th;
                typedArray = null;
                typedArray3 = null;
                typedArray2 = typedArray3;
                typedArray4 = obtainStyledAttributes;
                recycleQuietly(typedArray4);
                recycleQuietly(typedArray);
                recycleQuietly(typedArray2);
                recycleQuietly(typedArray3);
                throw th;
            }
            try {
                int resourceId = typedArray.getResourceId(0, 0);
                int resourceId2 = typedArray.getResourceId(1, 0);
                typedArray2 = theme.obtainStyledAttributes(resourceId, new int[]{16842904});
                try {
                    typedArray4 = theme.obtainStyledAttributes(resourceId2, new int[]{16842904});
                    int[] iArr = {typedArray2.getColor(0, -16777216), typedArray4.getColor(0, -16777216)};
                    recycleQuietly(obtainStyledAttributes);
                    recycleQuietly(typedArray);
                    recycleQuietly(typedArray2);
                    recycleQuietly(typedArray4);
                    return iArr;
                } catch (Throwable th2) {
                    th = th2;
                    typedArray3 = typedArray4;
                    typedArray4 = obtainStyledAttributes;
                    recycleQuietly(typedArray4);
                    recycleQuietly(typedArray);
                    recycleQuietly(typedArray2);
                    recycleQuietly(typedArray3);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                typedArray3 = null;
                typedArray2 = typedArray3;
                typedArray4 = obtainStyledAttributes;
                recycleQuietly(typedArray4);
                recycleQuietly(typedArray);
                recycleQuietly(typedArray2);
                recycleQuietly(typedArray3);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            typedArray = null;
            typedArray3 = null;
            typedArray2 = null;
            recycleQuietly(typedArray4);
            recycleQuietly(typedArray);
            recycleQuietly(typedArray2);
            recycleQuietly(typedArray3);
            throw th;
        }
    }

    private int[] getDefaultContentInsets(Context context) {
        TypedArray typedArray;
        Resources.Theme theme = context.getTheme();
        TypedArray typedArray2 = null;
        try {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{getIdentifier(context, "toolbarStyle")});
            try {
                typedArray2 = theme.obtainStyledAttributes(obtainStyledAttributes.getResourceId(0, 0), new int[]{getIdentifier(context, "contentInsetStart"), getIdentifier(context, "contentInsetEnd")});
                int[] iArr = {typedArray2.getDimensionPixelSize(0, 0), typedArray2.getDimensionPixelSize(1, 0)};
                recycleQuietly(obtainStyledAttributes);
                recycleQuietly(typedArray2);
                return iArr;
            } catch (Throwable th) {
                th = th;
                typedArray = typedArray2;
                typedArray2 = obtainStyledAttributes;
                recycleQuietly(typedArray2);
                recycleQuietly(typedArray);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
            recycleQuietly(typedArray2);
            recycleQuietly(typedArray);
            throw th;
        }
    }

    private static int getIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    private static void recycleQuietly(TypedArray typedArray) {
        if (typedArray != null) {
            typedArray.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, C5287b bVar) {
        C2945d eventDispatcher = ((UIManagerModule) o0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        bVar.setNavigationOnClickListener(new C5284a(eventDispatcher, bVar));
        bVar.setOnMenuItemClickListener(new C5285b(eventDispatcher, bVar));
    }

    /* access modifiers changed from: protected */
    public C5287b createViewInstance(C3031o0 o0Var) {
        return new C5287b(o0Var);
    }

    public Map<String, Integer> getCommandsMap() {
        return C2693e.m10914d("dismissPopupMenus", 1);
    }

    public Map<String, Object> getExportedViewConstants() {
        return C2693e.m10914d("ShowAsAction", C2693e.m10916f("never", 0, "always", 2, "ifRoom", 1));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void receiveCommand(C5287b bVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            bVar.mo1118f();
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), getClass().getSimpleName()}));
        }
    }

    @C2991a(name = "nativeActions")
    public void setActions(C5287b bVar, ReadableArray readableArray) {
        bVar.setActions(readableArray);
    }

    @C2991a(defaultFloat = Float.NaN, name = "contentInsetEnd")
    public void setContentInsetEnd(C5287b bVar, float f) {
        bVar.mo1108H(bVar.getContentInsetStart(), Float.isNaN(f) ? getDefaultContentInsets(bVar.getContext())[1] : Math.round(C3038r.m12006c(f)));
    }

    @C2991a(defaultFloat = Float.NaN, name = "contentInsetStart")
    public void setContentInsetStart(C5287b bVar, float f) {
        bVar.mo1108H(Float.isNaN(f) ? getDefaultContentInsets(bVar.getContext())[0] : Math.round(C3038r.m12006c(f)), bVar.getContentInsetEnd());
    }

    @C2991a(name = "logo")
    public void setLogo(C5287b bVar, ReadableMap readableMap) {
        bVar.setLogoSource(readableMap);
    }

    @C2991a(name = "navIcon")
    public void setNavIcon(C5287b bVar, ReadableMap readableMap) {
        bVar.setNavIconSource(readableMap);
    }

    @C2991a(name = "overflowIcon")
    public void setOverflowIcon(C5287b bVar, ReadableMap readableMap) {
        bVar.setOverflowIconSource(readableMap);
    }

    @C2991a(name = "rtl")
    public void setRtl(C5287b bVar, boolean z) {
        C1988t.m8418y0(bVar, z ? 1 : 0);
    }

    @C2991a(name = "subtitle")
    public void setSubtitle(C5287b bVar, String str) {
        bVar.setSubtitle((CharSequence) str);
    }

    @C2991a(customType = "Color", name = "subtitleColor")
    public void setSubtitleColor(C5287b bVar, Integer num) {
        bVar.setSubtitleTextColor(num != null ? num.intValue() : getDefaultColors(bVar.getContext())[1]);
    }

    @C2991a(name = "title")
    public void setTitle(C5287b bVar, String str) {
        bVar.setTitle((CharSequence) str);
    }

    @C2991a(customType = "Color", name = "titleColor")
    public void setTitleColor(C5287b bVar, Integer num) {
        bVar.setTitleTextColor(num != null ? num.intValue() : getDefaultColors(bVar.getContext())[0]);
    }
}
