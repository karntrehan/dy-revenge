package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1135a;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import p027c.p028a.C1435a;
import p027c.p028a.C1440f;
import p027c.p075j.p076a.C2018c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.q0 */
class C0265q0 extends C2018c implements View.OnClickListener {

    /* renamed from: A */
    private final Context f1120A;

    /* renamed from: B */
    private final WeakHashMap<String, Drawable.ConstantState> f1121B;

    /* renamed from: C */
    private final int f1122C;

    /* renamed from: D */
    private boolean f1123D = false;

    /* renamed from: E */
    private int f1124E = 1;

    /* renamed from: F */
    private ColorStateList f1125F;

    /* renamed from: G */
    private int f1126G = -1;

    /* renamed from: H */
    private int f1127H = -1;

    /* renamed from: I */
    private int f1128I = -1;

    /* renamed from: J */
    private int f1129J = -1;

    /* renamed from: K */
    private int f1130K = -1;

    /* renamed from: L */
    private int f1131L = -1;

    /* renamed from: y */
    private final SearchView f1132y;

    /* renamed from: z */
    private final SearchableInfo f1133z;

    /* renamed from: androidx.appcompat.widget.q0$a */
    private static final class C0266a {

        /* renamed from: a */
        public final TextView f1134a;

        /* renamed from: b */
        public final TextView f1135b;

        /* renamed from: c */
        public final ImageView f1136c;

        /* renamed from: d */
        public final ImageView f1137d;

        /* renamed from: e */
        public final ImageView f1138e;

        public C0266a(View view) {
            this.f1134a = (TextView) view.findViewById(16908308);
            this.f1135b = (TextView) view.findViewById(16908309);
            this.f1136c = (ImageView) view.findViewById(16908295);
            this.f1137d = (ImageView) view.findViewById(16908296);
            this.f1138e = (ImageView) view.findViewById(C1440f.edit_query);
        }
    }

    public C0265q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1132y = searchView;
        this.f1133z = searchableInfo;
        this.f1122C = searchView.getSuggestionCommitIconResId();
        this.f1120A = context;
        this.f1121B = weakHashMap;
    }

    /* renamed from: A */
    private void m1307A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1121B.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m1308B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: k */
    private Drawable m1309k(String str) {
        Drawable.ConstantState constantState = this.f1121B.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m1310l(CharSequence charSequence) {
        if (this.f1125F == null) {
            TypedValue typedValue = new TypedValue();
            this.f5795q.getTheme().resolveAttribute(C1435a.textColorSearchUrl, typedValue, true);
            this.f1125F = this.f5795q.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1125F, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m1311m(ComponentName componentName) {
        String nameNotFoundException;
        PackageManager packageManager = this.f5795q.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w("SuggestionsAdapter", nameNotFoundException);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            nameNotFoundException = e.toString();
        }
    }

    /* renamed from: n */
    private Drawable m1312n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1121B.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1121B.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1120A.getResources());
        }
        Drawable m = m1311m(componentName);
        if (m != null) {
            constantState = m.getConstantState();
        }
        this.f1121B.put(flattenToShortString, constantState);
        return m;
    }

    /* renamed from: o */
    public static String m1313o(Cursor cursor, String str) {
        return m1319w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m1314p() {
        Drawable n = m1312n(this.f1133z.getSearchActivity());
        return n != null ? n : this.f5795q.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1315q(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo1636r(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f1120A     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0265q0.m1315q(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: s */
    private Drawable m1316s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1120A.getPackageName() + "/" + parseInt;
            Drawable k = m1309k(str2);
            if (k != null) {
                return k;
            }
            Drawable e = C1135a.m4419e(this.f1120A, parseInt);
            m1307A(str2, e);
            return e;
        } catch (NumberFormatException unused) {
            Drawable k2 = m1309k(str);
            if (k2 != null) {
                return k2;
            }
            Drawable q = m1315q(Uri.parse(str));
            m1307A(str, q);
            return q;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: t */
    private Drawable m1317t(Cursor cursor) {
        int i = this.f1129J;
        if (i == -1) {
            return null;
        }
        Drawable s = m1316s(cursor.getString(i));
        return s != null ? s : m1314p();
    }

    /* renamed from: u */
    private Drawable m1318u(Cursor cursor) {
        int i = this.f1130K;
        if (i == -1) {
            return null;
        }
        return m1316s(cursor.getString(i));
    }

    /* renamed from: w */
    private static String m1319w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: y */
    private void m1320y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m1321z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    public void mo1625a(Cursor cursor) {
        if (this.f1123D) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1625a(cursor);
            if (cursor != null) {
                this.f1126G = cursor.getColumnIndex("suggest_text_1");
                this.f1127H = cursor.getColumnIndex("suggest_text_2");
                this.f1128I = cursor.getColumnIndex("suggest_text_2_url");
                this.f1129J = cursor.getColumnIndex("suggest_icon_1");
                this.f1130K = cursor.getColumnIndex("suggest_icon_2");
                this.f1131L = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: c */
    public CharSequence mo1626c(Cursor cursor) {
        String o;
        String o2;
        if (cursor == null) {
            return null;
        }
        String o3 = m1313o(cursor, "suggest_intent_query");
        if (o3 != null) {
            return o3;
        }
        if (this.f1133z.shouldRewriteQueryFromData() && (o2 = m1313o(cursor, "suggest_intent_data")) != null) {
            return o2;
        }
        if (!this.f1133z.shouldRewriteQueryFromText() || (o = m1313o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o;
    }

    /* renamed from: d */
    public Cursor mo1627d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? HttpUrl.FRAGMENT_ENCODE_SET : charSequence.toString();
        if (this.f1132y.getVisibility() == 0 && this.f1132y.getWindowVisibility() == 0) {
            try {
                Cursor v = mo1637v(this.f1133z, charSequence2, 50);
                if (v != null) {
                    v.getCount();
                    return v;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo1628e(View view, Context context, Cursor cursor) {
        C0266a aVar = (C0266a) view.getTag();
        int i = this.f1131L;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1134a != null) {
            m1321z(aVar.f1134a, m1319w(cursor, this.f1126G));
        }
        if (aVar.f1135b != null) {
            String w = m1319w(cursor, this.f1128I);
            CharSequence l = w != null ? m1310l(w) : m1319w(cursor, this.f1127H);
            if (TextUtils.isEmpty(l)) {
                TextView textView = aVar.f1134a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1134a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1134a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1134a.setMaxLines(1);
                }
            }
            m1321z(aVar.f1135b, l);
        }
        ImageView imageView = aVar.f1136c;
        if (imageView != null) {
            m1320y(imageView, m1317t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1137d;
        if (imageView2 != null) {
            m1320y(imageView2, m1318u(cursor), 8);
        }
        int i3 = this.f1124E;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1138e.setVisibility(0);
            aVar.f1138e.setTag(aVar.f1134a.getText());
            aVar.f1138e.setOnClickListener(this);
            return;
        }
        aVar.f1138e.setVisibility(8);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View g = mo6712g(this.f5795q, this.f5794p, viewGroup);
            if (g != null) {
                ((C0266a) g.getTag()).f1134a.setText(e.toString());
            }
            return g;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View h = mo1631h(this.f5795q, this.f5794p, viewGroup);
            if (h != null) {
                ((C0266a) h.getTag()).f1134a.setText(e.toString());
            }
            return h;
        }
    }

    /* renamed from: h */
    public View mo1631h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h = super.mo1631h(context, cursor, viewGroup);
        h.setTag(new C0266a(h));
        ((ImageView) h.findViewById(C1440f.edit_query)).setImageResource(this.f1122C);
        return h;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1308B(mo6710b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1308B(mo6710b());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1132y.mo1021U((CharSequence) tag);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Drawable mo1636r(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f5795q.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Cursor mo1637v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(HttpUrl.FRAGMENT_ENCODE_SET).fragment(HttpUrl.FRAGMENT_ENCODE_SET);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f5795q.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: x */
    public void mo1638x(int i) {
        this.f1124E = i;
    }
}
