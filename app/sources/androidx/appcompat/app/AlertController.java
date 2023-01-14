package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0229i0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p027c.p028a.C1435a;
import p027c.p028a.C1440f;
import p027c.p028a.C1444j;
import p027c.p064i.p072j.C1988t;

class AlertController {

    /* renamed from: A */
    NestedScrollView f100A;

    /* renamed from: B */
    private int f101B = 0;

    /* renamed from: C */
    private Drawable f102C;

    /* renamed from: D */
    private ImageView f103D;

    /* renamed from: E */
    private TextView f104E;

    /* renamed from: F */
    private TextView f105F;

    /* renamed from: G */
    private View f106G;

    /* renamed from: H */
    ListAdapter f107H;

    /* renamed from: I */
    int f108I = -1;

    /* renamed from: J */
    private int f109J;

    /* renamed from: K */
    private int f110K;

    /* renamed from: L */
    int f111L;

    /* renamed from: M */
    int f112M;

    /* renamed from: N */
    int f113N;

    /* renamed from: O */
    int f114O;

    /* renamed from: P */
    private boolean f115P;

    /* renamed from: Q */
    private int f116Q = 0;

    /* renamed from: R */
    Handler f117R;

    /* renamed from: S */
    private final View.OnClickListener f118S = new C0045a();

    /* renamed from: a */
    private final Context f119a;

    /* renamed from: b */
    final C0091g f120b;

    /* renamed from: c */
    private final Window f121c;

    /* renamed from: d */
    private final int f122d;

    /* renamed from: e */
    private CharSequence f123e;

    /* renamed from: f */
    private CharSequence f124f;

    /* renamed from: g */
    ListView f125g;

    /* renamed from: h */
    private View f126h;

    /* renamed from: i */
    private int f127i;

    /* renamed from: j */
    private int f128j;

    /* renamed from: k */
    private int f129k;

    /* renamed from: l */
    private int f130l;

    /* renamed from: m */
    private int f131m;

    /* renamed from: n */
    private boolean f132n = false;

    /* renamed from: o */
    Button f133o;

    /* renamed from: p */
    private CharSequence f134p;

    /* renamed from: q */
    Message f135q;

    /* renamed from: r */
    private Drawable f136r;

    /* renamed from: s */
    Button f137s;

    /* renamed from: t */
    private CharSequence f138t;

    /* renamed from: u */
    Message f139u;

    /* renamed from: v */
    private Drawable f140v;

    /* renamed from: w */
    Button f141w;

    /* renamed from: x */
    private CharSequence f142x;

    /* renamed from: y */
    Message f143y;

    /* renamed from: z */
    private Drawable f144z;

    public static class RecycleListView extends ListView {

        /* renamed from: f */
        private final int f145f;

        /* renamed from: o */
        private final int f146o;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1444j.f4357f2);
            this.f146o = obtainStyledAttributes.getDimensionPixelOffset(C1444j.f4362g2, -1);
            this.f145f = obtainStyledAttributes.getDimensionPixelOffset(C1444j.f4367h2, -1);
        }

        /* renamed from: a */
        public void mo163a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f145f, getPaddingRight(), z2 ? getPaddingBottom() : this.f146o);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0045a implements View.OnClickListener {
        C0045a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.f143y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f133o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f135q
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.f137s
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f139u
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.f141w
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.f143y
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f117R
                r1 = 1
                androidx.appcompat.app.g r3 = r3.f120b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0045a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0046b implements NestedScrollView.C1181b {

        /* renamed from: a */
        final /* synthetic */ View f148a;

        /* renamed from: b */
        final /* synthetic */ View f149b;

        C0046b(View view, View view2) {
            this.f148a = view;
            this.f149b = view2;
        }

        /* renamed from: a */
        public void mo165a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m169f(nestedScrollView, this.f148a, this.f149b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0047c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f151f;

        /* renamed from: o */
        final /* synthetic */ View f152o;

        C0047c(View view, View view2) {
            this.f151f = view;
            this.f152o = view2;
        }

        public void run() {
            AlertController.m169f(AlertController.this.f100A, this.f151f, this.f152o);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0048d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f154a;

        /* renamed from: b */
        final /* synthetic */ View f155b;

        C0048d(View view, View view2) {
            this.f154a = view;
            this.f155b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m169f(absListView, this.f154a, this.f155b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0049e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f157f;

        /* renamed from: o */
        final /* synthetic */ View f158o;

        C0049e(View view, View view2) {
            this.f157f = view;
            this.f158o = view2;
        }

        public void run() {
            AlertController.m169f(AlertController.this.f125g, this.f157f, this.f158o);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0050f {

        /* renamed from: A */
        public int f160A;

        /* renamed from: B */
        public int f161B;

        /* renamed from: C */
        public int f162C;

        /* renamed from: D */
        public int f163D;

        /* renamed from: E */
        public boolean f164E = false;

        /* renamed from: F */
        public boolean[] f165F;

        /* renamed from: G */
        public boolean f166G;

        /* renamed from: H */
        public boolean f167H;

        /* renamed from: I */
        public int f168I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f169J;

        /* renamed from: K */
        public Cursor f170K;

        /* renamed from: L */
        public String f171L;

        /* renamed from: M */
        public String f172M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f173N;

        /* renamed from: O */
        public C0055e f174O;

        /* renamed from: P */
        public boolean f175P = true;

        /* renamed from: a */
        public final Context f176a;

        /* renamed from: b */
        public final LayoutInflater f177b;

        /* renamed from: c */
        public int f178c = 0;

        /* renamed from: d */
        public Drawable f179d;

        /* renamed from: e */
        public int f180e = 0;

        /* renamed from: f */
        public CharSequence f181f;

        /* renamed from: g */
        public View f182g;

        /* renamed from: h */
        public CharSequence f183h;

        /* renamed from: i */
        public CharSequence f184i;

        /* renamed from: j */
        public Drawable f185j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f186k;

        /* renamed from: l */
        public CharSequence f187l;

        /* renamed from: m */
        public Drawable f188m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f189n;

        /* renamed from: o */
        public CharSequence f190o;

        /* renamed from: p */
        public Drawable f191p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f192q;

        /* renamed from: r */
        public boolean f193r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f194s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f195t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f196u;

        /* renamed from: v */
        public CharSequence[] f197v;

        /* renamed from: w */
        public ListAdapter f198w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f199x;

        /* renamed from: y */
        public int f200y;

        /* renamed from: z */
        public View f201z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0051a extends ArrayAdapter<CharSequence> {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f202f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0051a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f202f = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0050f.this.f165F;
                if (zArr != null && zArr[i]) {
                    this.f202f.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0052b extends CursorAdapter {

            /* renamed from: f */
            private final int f204f;

            /* renamed from: o */
            private final int f205o;

            /* renamed from: p */
            final /* synthetic */ RecycleListView f206p;

            /* renamed from: q */
            final /* synthetic */ AlertController f207q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0052b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f206p = recycleListView;
                this.f207q = alertController;
                Cursor cursor2 = getCursor();
                this.f204f = cursor2.getColumnIndexOrThrow(C0050f.this.f171L);
                this.f205o = cursor2.getColumnIndexOrThrow(C0050f.this.f172M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f204f));
                RecycleListView recycleListView = this.f206p;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f205o) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0050f.this.f177b.inflate(this.f207q.f112M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0053c implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ AlertController f209f;

            C0053c(AlertController alertController) {
                this.f209f = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0050f.this.f199x.onClick(this.f209f.f120b, i);
                if (!C0050f.this.f167H) {
                    this.f209f.f120b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0054d implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f211f;

            /* renamed from: o */
            final /* synthetic */ AlertController f212o;

            C0054d(RecycleListView recycleListView, AlertController alertController) {
                this.f211f = recycleListView;
                this.f212o = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0050f.this.f165F;
                if (zArr != null) {
                    zArr[i] = this.f211f.isItemChecked(i);
                }
                C0050f.this.f169J.onClick(this.f212o.f120b, i, this.f211f.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0055e {
            /* renamed from: a */
            void mo176a(ListView listView);
        }

        public C0050f(Context context) {
            this.f176a = context;
            this.f193r = true;
            this.f177b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v25, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m195b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f177b
                int r1 = r11.f111L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f166G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f170K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f176a
                int r4 = r11.f112M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f197v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f176a
                android.database.Cursor r4 = r10.f170K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f167H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f113N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f114O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f170K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f176a
                android.database.Cursor r5 = r10.f170K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f171L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f198w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f176a
                java.lang.CharSequence[] r3 = r10.f197v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f174O
                if (r1 == 0) goto L_0x0072
                r1.mo176a(r0)
            L_0x0072:
                r11.f107H = r9
                int r1 = r10.f168I
                r11.f108I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f199x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L_0x0081:
                r0.setOnItemClickListener(r1)
                goto L_0x008f
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f169J
                if (r1 == 0) goto L_0x008f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L_0x0081
            L_0x008f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f173N
                if (r1 == 0) goto L_0x0096
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r10.f167H
                if (r1 == 0) goto L_0x009e
                r0.setChoiceMode(r8)
                goto L_0x00a6
            L_0x009e:
                boolean r1 = r10.f166G
                if (r1 == 0) goto L_0x00a6
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a6:
                r11.f125g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0050f.m195b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo170a(AlertController alertController) {
            View view = this.f182g;
            if (view != null) {
                alertController.mo155l(view);
            } else {
                CharSequence charSequence = this.f181f;
                if (charSequence != null) {
                    alertController.mo159q(charSequence);
                }
                Drawable drawable = this.f179d;
                if (drawable != null) {
                    alertController.mo157n(drawable);
                }
                int i = this.f178c;
                if (i != 0) {
                    alertController.mo156m(i);
                }
                int i2 = this.f180e;
                if (i2 != 0) {
                    alertController.mo156m(alertController.mo149c(i2));
                }
            }
            CharSequence charSequence2 = this.f183h;
            if (charSequence2 != null) {
                alertController.mo158o(charSequence2);
            }
            CharSequence charSequence3 = this.f184i;
            if (!(charSequence3 == null && this.f185j == null)) {
                alertController.mo154k(-1, charSequence3, this.f186k, (Message) null, this.f185j);
            }
            CharSequence charSequence4 = this.f187l;
            if (!(charSequence4 == null && this.f188m == null)) {
                alertController.mo154k(-2, charSequence4, this.f189n, (Message) null, this.f188m);
            }
            CharSequence charSequence5 = this.f190o;
            if (!(charSequence5 == null && this.f191p == null)) {
                alertController.mo154k(-3, charSequence5, this.f192q, (Message) null, this.f191p);
            }
            if (!(this.f197v == null && this.f170K == null && this.f198w == null)) {
                m195b(alertController);
            }
            View view2 = this.f201z;
            if (view2 == null) {
                int i3 = this.f200y;
                if (i3 != 0) {
                    alertController.mo160r(i3);
                }
            } else if (this.f164E) {
                alertController.mo162t(view2, this.f160A, this.f161B, this.f162C, this.f163D);
            } else {
                alertController.mo161s(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0056g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f214a;

        public C0056g(DialogInterface dialogInterface) {
            this.f214a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f214a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0057h extends ArrayAdapter<CharSequence> {
        public C0057h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0091g gVar, Window window) {
        this.f119a = context;
        this.f120b = gVar;
        this.f121c = window;
        this.f117R = new C0056g(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C1444j.f4225F, C1435a.alertDialogStyle, 0);
        this.f109J = obtainStyledAttributes.getResourceId(C1444j.f4230G, 0);
        this.f110K = obtainStyledAttributes.getResourceId(C1444j.f4240I, 0);
        this.f111L = obtainStyledAttributes.getResourceId(C1444j.f4250K, 0);
        this.f112M = obtainStyledAttributes.getResourceId(C1444j.f4255L, 0);
        this.f113N = obtainStyledAttributes.getResourceId(C1444j.f4265N, 0);
        this.f114O = obtainStyledAttributes.getResourceId(C1444j.f4245J, 0);
        this.f115P = obtainStyledAttributes.getBoolean(C1444j.f4260M, true);
        this.f122d = obtainStyledAttributes.getDimensionPixelSize(C1444j.f4235H, 0);
        obtainStyledAttributes.recycle();
        gVar.mo361f(1);
    }

    /* renamed from: a */
    static boolean m167a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m167a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m168b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    static void m169f(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: i */
    private ViewGroup m170i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    private int m171j() {
        int i = this.f110K;
        return i == 0 ? this.f109J : this.f116Q == 1 ? i : this.f109J;
    }

    /* renamed from: p */
    private void m172p(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f121c.findViewById(C1440f.scrollIndicatorUp);
        View findViewById2 = this.f121c.findViewById(C1440f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C1988t.m8338C0(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById != null || findViewById2 != null) {
                if (this.f124f != null) {
                    this.f100A.setOnScrollChangeListener(new C0046b(findViewById, findViewById2));
                    this.f100A.post(new C0047c(findViewById, findViewById2));
                    return;
                }
                ListView listView = this.f125g;
                if (listView != null) {
                    listView.setOnScrollListener(new C0048d(findViewById, findViewById2));
                    this.f125g.post(new C0049e(findViewById, findViewById2));
                    return;
                }
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    /* renamed from: u */
    private void m173u(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f133o = button2;
        button2.setOnClickListener(this.f118S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f134p) || this.f136r != null) {
            this.f133o.setText(this.f134p);
            Drawable drawable = this.f136r;
            if (drawable != null) {
                int i = this.f122d;
                drawable.setBounds(0, 0, i, i);
                this.f133o.setCompoundDrawables(this.f136r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f133o.setVisibility(0);
            z = true;
        } else {
            this.f133o.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f137s = button3;
        button3.setOnClickListener(this.f118S);
        if (!TextUtils.isEmpty(this.f138t) || this.f140v != null) {
            this.f137s.setText(this.f138t);
            Drawable drawable2 = this.f140v;
            if (drawable2 != null) {
                int i2 = this.f122d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f137s.setCompoundDrawables(this.f140v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f137s.setVisibility(0);
            z |= true;
        } else {
            this.f137s.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f141w = button4;
        button4.setOnClickListener(this.f118S);
        if (!TextUtils.isEmpty(this.f142x) || this.f144z != null) {
            this.f141w.setText(this.f142x);
            Drawable drawable3 = this.f144z;
            if (drawable3 != null) {
                int i3 = this.f122d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f141w.setCompoundDrawables(this.f144z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f141w.setVisibility(0);
            z |= true;
        } else {
            this.f141w.setVisibility(8);
        }
        if (m178z(this.f119a)) {
            if (z) {
                button = this.f133o;
            } else if (z) {
                button = this.f137s;
            } else if (z) {
                button = this.f141w;
            }
            m168b(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m174v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f121c.findViewById(C1440f.scrollView);
        this.f100A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f100A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f105F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f124f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f100A.removeView(this.f105F);
            if (this.f125g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f100A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f100A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f125g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: w */
    private void m175w(ViewGroup viewGroup) {
        View view = this.f126h;
        boolean z = false;
        if (view == null) {
            view = this.f127i != 0 ? LayoutInflater.from(this.f119a).inflate(this.f127i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m167a(view)) {
            this.f121c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f121c.findViewById(C1440f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f132n) {
                frameLayout.setPadding(this.f128j, this.f129k, this.f130l, this.f131m);
            }
            if (this.f125g != null) {
                ((C0229i0.C0230a) viewGroup.getLayoutParams()).f1006a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m176x(ViewGroup viewGroup) {
        if (this.f106G != null) {
            viewGroup.addView(this.f106G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f121c.findViewById(C1440f.title_template).setVisibility(8);
            return;
        }
        this.f103D = (ImageView) this.f121c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f123e)) || !this.f115P) {
            this.f121c.findViewById(C1440f.title_template).setVisibility(8);
            this.f103D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f121c.findViewById(C1440f.alertTitle);
        this.f104E = textView;
        textView.setText(this.f123e);
        int i = this.f101B;
        if (i != 0) {
            this.f103D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f102C;
        if (drawable != null) {
            this.f103D.setImageDrawable(drawable);
            return;
        }
        this.f104E.setPadding(this.f103D.getPaddingLeft(), this.f103D.getPaddingTop(), this.f103D.getPaddingRight(), this.f103D.getPaddingBottom());
        this.f103D.setVisibility(8);
    }

    /* renamed from: y */
    private void m177y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f121c.findViewById(C1440f.parentPanel);
        int i = C1440f.topPanel;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C1440f.contentPanel;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C1440f.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C1440f.customPanel);
        m175w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup i4 = m170i(findViewById7, findViewById4);
        ViewGroup i5 = m170i(findViewById8, findViewById5);
        ViewGroup i6 = m170i(findViewById9, findViewById6);
        m174v(i5);
        m173u(i6);
        m176x(i4);
        char c = 0;
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (i4 == null || i4.getVisibility() == 8) ? false : true;
        boolean z3 = (i6 == null || i6.getVisibility() == 8) ? false : true;
        if (!(z3 || i5 == null || (findViewById2 = i5.findViewById(C1440f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f100A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f124f == null && this.f125g == null)) {
                view = i4.findViewById(C1440f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i5 == null || (findViewById = i5.findViewById(C1440f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f125g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo163a(z2, z3);
        }
        if (!z) {
            View view2 = this.f125g;
            if (view2 == null) {
                view2 = this.f100A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m172p(i5, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f125g;
        if (listView2 != null && (listAdapter = this.f107H) != null) {
            listView2.setAdapter(listAdapter);
            int i7 = this.f108I;
            if (i7 > -1) {
                listView2.setItemChecked(i7, true);
                listView2.setSelection(i7);
            }
        }
    }

    /* renamed from: z */
    private static boolean m178z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1435a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: c */
    public int mo149c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f119a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView mo150d() {
        return this.f125g;
    }

    /* renamed from: e */
    public void mo151e() {
        this.f120b.setContentView(m171j());
        m177y();
    }

    /* renamed from: g */
    public boolean mo152g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f100A;
        return nestedScrollView != null && nestedScrollView.mo3759q(keyEvent);
    }

    /* renamed from: h */
    public boolean mo153h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f100A;
        return nestedScrollView != null && nestedScrollView.mo3759q(keyEvent);
    }

    /* renamed from: k */
    public void mo154k(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f117R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f142x = charSequence;
            this.f143y = message;
            this.f144z = drawable;
        } else if (i == -2) {
            this.f138t = charSequence;
            this.f139u = message;
            this.f140v = drawable;
        } else if (i == -1) {
            this.f134p = charSequence;
            this.f135q = message;
            this.f136r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: l */
    public void mo155l(View view) {
        this.f106G = view;
    }

    /* renamed from: m */
    public void mo156m(int i) {
        this.f102C = null;
        this.f101B = i;
        ImageView imageView = this.f103D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f103D.setImageResource(this.f101B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: n */
    public void mo157n(Drawable drawable) {
        this.f102C = drawable;
        this.f101B = 0;
        ImageView imageView = this.f103D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f103D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: o */
    public void mo158o(CharSequence charSequence) {
        this.f124f = charSequence;
        TextView textView = this.f105F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void mo159q(CharSequence charSequence) {
        this.f123e = charSequence;
        TextView textView = this.f104E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void mo160r(int i) {
        this.f126h = null;
        this.f127i = i;
        this.f132n = false;
    }

    /* renamed from: s */
    public void mo161s(View view) {
        this.f126h = view;
        this.f127i = 0;
        this.f132n = false;
    }

    /* renamed from: t */
    public void mo162t(View view, int i, int i2, int i3, int i4) {
        this.f126h = view;
        this.f127i = 0;
        this.f132n = true;
        this.f128j = i;
        this.f129k = i2;
        this.f130l = i3;
        this.f131m = i4;
    }
}
