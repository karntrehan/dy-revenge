package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ListFragment extends Fragment {

    /* renamed from: k0 */
    private final Handler f3427k0 = new Handler();

    /* renamed from: l0 */
    private final Runnable f3428l0 = new C1209a();

    /* renamed from: m0 */
    private final AdapterView.OnItemClickListener f3429m0 = new C1210b();

    /* renamed from: n0 */
    ListAdapter f3430n0;

    /* renamed from: o0 */
    ListView f3431o0;

    /* renamed from: p0 */
    View f3432p0;

    /* renamed from: q0 */
    TextView f3433q0;

    /* renamed from: r0 */
    View f3434r0;

    /* renamed from: s0 */
    View f3435s0;

    /* renamed from: t0 */
    CharSequence f3436t0;

    /* renamed from: u0 */
    boolean f3437u0;

    /* renamed from: androidx.fragment.app.ListFragment$a */
    class C1209a implements Runnable {
        C1209a() {
        }

        public void run() {
            ListView listView = ListFragment.this.f3431o0;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: androidx.fragment.app.ListFragment$b */
    class C1210b implements AdapterView.OnItemClickListener {
        C1210b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ListFragment.this.mo3959x1((ListView) adapterView, view, i, j);
        }
    }

    /* renamed from: w1 */
    private void m4861w1() {
        if (this.f3431o0 == null) {
            View N = mo3861N();
            if (N != null) {
                if (N instanceof ListView) {
                    this.f3431o0 = (ListView) N;
                } else {
                    TextView textView = (TextView) N.findViewById(16711681);
                    this.f3433q0 = textView;
                    if (textView == null) {
                        this.f3432p0 = N.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f3434r0 = N.findViewById(16711682);
                    this.f3435s0 = N.findViewById(16711683);
                    View findViewById = N.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.f3431o0 = listView;
                        View view = this.f3432p0;
                        if (view == null) {
                            CharSequence charSequence = this.f3436t0;
                            if (charSequence != null) {
                                this.f3433q0.setText(charSequence);
                                listView = this.f3431o0;
                                view = this.f3433q0;
                            }
                        }
                        listView.setEmptyView(view);
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f3437u0 = true;
                this.f3431o0.setOnItemClickListener(this.f3429m0);
                ListAdapter listAdapter = this.f3430n0;
                if (listAdapter != null) {
                    this.f3430n0 = null;
                    mo3960y1(listAdapter);
                } else if (this.f3434r0 != null) {
                    m4862z1(false, false);
                }
                this.f3427k0.post(this.f3428l0);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    /* renamed from: z1 */
    private void m4862z1(boolean z, boolean z2) {
        m4861w1();
        View view = this.f3434r0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f3437u0 != z) {
            this.f3437u0 = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(mo3930s(), 17432577));
                    this.f3435s0.startAnimation(AnimationUtils.loadAnimation(mo3930s(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f3435s0.clearAnimation();
                }
                this.f3434r0.setVisibility(8);
                this.f3435s0.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(mo3930s(), 17432576));
                this.f3435s0.startAnimation(AnimationUtils.loadAnimation(mo3930s(), 17432577));
            } else {
                view.clearAnimation();
                this.f3435s0.clearAnimation();
            }
            this.f3434r0.setVisibility(0);
            this.f3435s0.setVisibility(8);
        }
    }

    /* renamed from: G0 */
    public void mo3848G0(View view, Bundle bundle) {
        super.mo3848G0(view, bundle);
        m4861w1();
    }

    /* renamed from: l0 */
    public View mo3910l0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context h1 = mo3900h1();
        FrameLayout frameLayout = new FrameLayout(h1);
        LinearLayout linearLayout = new LinearLayout(h1);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(h1, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(h1);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(h1);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(h1);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* renamed from: o0 */
    public void mo3826o0() {
        this.f3427k0.removeCallbacks(this.f3428l0);
        this.f3431o0 = null;
        this.f3437u0 = false;
        this.f3435s0 = null;
        this.f3434r0 = null;
        this.f3432p0 = null;
        this.f3433q0 = null;
        super.mo3826o0();
    }

    /* renamed from: x1 */
    public void mo3959x1(ListView listView, View view, int i, long j) {
    }

    /* renamed from: y1 */
    public void mo3960y1(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.f3430n0 != null;
        this.f3430n0 = listAdapter;
        ListView listView = this.f3431o0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f3437u0 && !z2) {
                if (mo3903i1().getWindowToken() != null) {
                    z = true;
                }
                m4862z1(true, z);
            }
        }
    }
}
