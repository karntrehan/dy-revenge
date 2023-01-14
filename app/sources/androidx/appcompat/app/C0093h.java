package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.C0199b0;
import androidx.appcompat.widget.C0211d;
import androidx.appcompat.widget.C0217f;
import androidx.appcompat.widget.C0221g;
import androidx.appcompat.widget.C0224h;
import androidx.appcompat.widget.C0241k;
import androidx.appcompat.widget.C0246m;
import androidx.appcompat.widget.C0256o;
import androidx.appcompat.widget.C0258p;
import androidx.appcompat.widget.C0270s;
import androidx.appcompat.widget.C0272t;
import androidx.appcompat.widget.C0274u;
import androidx.appcompat.widget.C0275u0;
import androidx.appcompat.widget.C0278w;
import androidx.appcompat.widget.C0298z;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;
import p027c.p028a.C1444j;
import p027c.p028a.p035o.C1469d;
import p027c.p060f.C1801g;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.app.h */
public class C0093h {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final C1801g<String, Constructor<? extends View>> sConstructorMap = new C1801g<>();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private final Object[] mConstructorArgs = new Object[2];

    /* renamed from: androidx.appcompat.app.h$a */
    private static class C0094a implements View.OnClickListener {

        /* renamed from: f */
        private final View f323f;

        /* renamed from: o */
        private final String f324o;

        /* renamed from: p */
        private Method f325p;

        /* renamed from: q */
        private Context f326q;

        public C0094a(View view, String str) {
            this.f323f = view;
            this.f324o = str;
        }

        /* renamed from: a */
        private void m416a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f324o, new Class[]{View.class})) != null) {
                        this.f325p = method;
                        this.f326q = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f323f.getId();
            if (id == -1) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = " with id '" + this.f323f.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f324o + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f323f.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f325p == null) {
                m416a(this.f323f.getContext());
            }
            try {
                this.f325p.invoke(this.f326q, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C1988t.m8355M(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0094a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        C1801g<String, Constructor<? extends View>> gVar = sConstructorMap;
        Constructor<? extends U> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i < strArr.length) {
                        View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                        if (createViewByPrefix != null) {
                            return createViewByPrefix;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.mConstructorArgs;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View createViewByPrefix2 = createViewByPrefix(context, str, (String) null);
                Object[] objArr3 = this.mConstructorArgs;
                objArr3[0] = null;
                objArr3[1] = null;
                return createViewByPrefix2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.mConstructorArgs;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1444j.f4274O3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C1444j.f4279P3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C1444j.f4284Q3, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C1469d) || ((C1469d) context).mo5456c() != resourceId) ? new C1469d(context, resourceId) : context : context;
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    public C0211d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0211d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0217f createButton(Context context, AttributeSet attributeSet) {
        return new C0217f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0221g createCheckBox(Context context, AttributeSet attributeSet) {
        return new C0221g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0224h createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C0224h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0241k createEditText(Context context, AttributeSet attributeSet) {
        return new C0241k(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0246m createImageButton(Context context, AttributeSet attributeSet) {
        return new C0246m(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0256o createImageView(Context context, AttributeSet attributeSet) {
        return new C0256o(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0258p createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0258p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0270s createRadioButton(Context context, AttributeSet attributeSet) {
        return new C0270s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0272t createRatingBar(Context context, AttributeSet attributeSet) {
        return new C0272t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0274u createSeekBar(Context context, AttributeSet attributeSet) {
        return new C0274u(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0278w createSpinner(Context context, AttributeSet attributeSet) {
        return new C0278w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0298z createTextView(Context context, AttributeSet attributeSet) {
        return new C0298z(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0199b0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new C0199b0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0275u0.m1356b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = createRatingBar(context2, attributeSet);
                break;
            case 1:
                view2 = createCheckedTextView(context2, attributeSet);
                break;
            case 2:
                view2 = createMultiAutoCompleteTextView(context2, attributeSet);
                break;
            case 3:
                view2 = createTextView(context2, attributeSet);
                break;
            case 4:
                view2 = createImageButton(context2, attributeSet);
                break;
            case 5:
                view2 = createSeekBar(context2, attributeSet);
                break;
            case 6:
                view2 = createSpinner(context2, attributeSet);
                break;
            case 7:
                view2 = createRadioButton(context2, attributeSet);
                break;
            case 8:
                view2 = createToggleButton(context2, attributeSet);
                break;
            case 9:
                view2 = createImageView(context2, attributeSet);
                break;
            case 10:
                view2 = createAutoCompleteTextView(context2, attributeSet);
                break;
            case 11:
                view2 = createCheckBox(context2, attributeSet);
                break;
            case 12:
                view2 = createEditText(context2, attributeSet);
                break;
            case 13:
                view2 = createButton(context2, attributeSet);
                break;
            default:
                view2 = createView(context2, str, attributeSet);
                break;
        }
        verifyNotNull(view2, str);
        if (view2 == null && context != context2) {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
        }
        return view2;
    }
}
