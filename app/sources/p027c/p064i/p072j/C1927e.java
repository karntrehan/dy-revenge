package p027c.p064i.p072j;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c.i.j.e */
public class C1927e {

    /* renamed from: a */
    private static boolean f5635a = false;

    /* renamed from: b */
    private static Method f5636b = null;

    /* renamed from: c */
    private static boolean f5637c = false;

    /* renamed from: d */
    private static Field f5638d;

    /* renamed from: c.i.j.e$a */
    public interface C1928a {
        /* renamed from: k */
        boolean mo369k(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m8049a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f5635a) {
            try {
                f5636b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f5635a = true;
        }
        Method method = f5636b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m8050b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m8049a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1988t.m8383h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m8051c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f = m8054f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1988t.m8383h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m8052d(View view, KeyEvent keyEvent) {
        return C1988t.m8385i(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m8053e(C1928a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo369k(keyEvent) : callback instanceof Activity ? m8050b((Activity) callback, keyEvent) : callback instanceof Dialog ? m8051c((Dialog) callback, keyEvent) : (view != null && C1988t.m8383h(view, keyEvent)) || aVar.mo369k(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m8054f(Dialog dialog) {
        if (!f5637c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f5638d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5637c = true;
        }
        Field field = f5638d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
