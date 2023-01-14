package p174e.p175a.p176a.p177i;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import p174e.p175a.p176a.C5376a;

/* renamed from: e.a.a.i.i */
public class C5392i implements C5376a {

    /* renamed from: f */
    private int f15042f = 0;

    /* renamed from: o */
    private int f15043o = 0;

    /* renamed from: p */
    private int f15044p = 0;

    /* renamed from: q */
    private int f15045q = 0;

    /* renamed from: r */
    private int f15046r = 0;

    /* renamed from: s */
    private int f15047s = 0;

    /* renamed from: t */
    private TimeZone f15048t = null;

    /* renamed from: u */
    private int f15049u;

    /* renamed from: v */
    private boolean f15050v = false;

    /* renamed from: w */
    private boolean f15051w = false;

    /* renamed from: x */
    private boolean f15052x = false;

    public C5392i() {
    }

    public C5392i(Calendar calendar) {
        Date time = calendar.getTime();
        TimeZone timeZone = calendar.getTimeZone();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.f15042f = gregorianCalendar.get(1);
        this.f15043o = gregorianCalendar.get(2) + 1;
        this.f15044p = gregorianCalendar.get(5);
        this.f15045q = gregorianCalendar.get(11);
        this.f15046r = gregorianCalendar.get(12);
        this.f15047s = gregorianCalendar.get(13);
        this.f15049u = gregorianCalendar.get(14) * 1000000;
        this.f15048t = gregorianCalendar.getTimeZone();
        this.f15052x = true;
        this.f15051w = true;
        this.f15050v = true;
    }

    /* renamed from: C */
    public void mo16186C(TimeZone timeZone) {
        this.f15048t = timeZone;
        this.f15051w = true;
        this.f15052x = true;
    }

    /* renamed from: E */
    public int mo16187E() {
        return this.f15045q;
    }

    /* renamed from: G */
    public void mo16188G(int i) {
        this.f15047s = Math.min(Math.abs(i), 59);
        this.f15051w = true;
    }

    /* renamed from: H */
    public int mo16189H() {
        return this.f15047s;
    }

    /* renamed from: L */
    public void mo16190L(int i) {
        if (i < 1) {
            this.f15043o = 1;
        } else if (i > 12) {
            this.f15043o = 12;
        } else {
            this.f15043o = i;
        }
        this.f15050v = true;
    }

    /* renamed from: M */
    public boolean mo16191M() {
        return this.f15050v;
    }

    public int compareTo(Object obj) {
        C5376a aVar = (C5376a) obj;
        long timeInMillis = mo16197o().getTimeInMillis() - aVar.mo16197o().getTimeInMillis();
        if (timeInMillis == 0) {
            timeInMillis = (long) (this.f15049u - aVar.mo16194l());
        }
        return (int) Math.signum((float) timeInMillis);
    }

    /* renamed from: e */
    public String mo16229e() {
        return C5386c.m19915c(this);
    }

    /* renamed from: j */
    public void mo16192j(int i) {
        this.f15045q = Math.min(Math.abs(i), 23);
        this.f15051w = true;
    }

    /* renamed from: k */
    public void mo16193k(int i) {
        this.f15046r = Math.min(Math.abs(i), 59);
        this.f15051w = true;
    }

    /* renamed from: l */
    public int mo16194l() {
        return this.f15049u;
    }

    /* renamed from: m */
    public boolean mo16195m() {
        return this.f15052x;
    }

    /* renamed from: n */
    public void mo16196n(int i) {
        this.f15042f = Math.min(Math.abs(i), 9999);
        this.f15050v = true;
    }

    /* renamed from: o */
    public Calendar mo16197o() {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        if (this.f15052x) {
            gregorianCalendar.setTimeZone(this.f15048t);
        }
        gregorianCalendar.set(1, this.f15042f);
        gregorianCalendar.set(2, this.f15043o - 1);
        gregorianCalendar.set(5, this.f15044p);
        gregorianCalendar.set(11, this.f15045q);
        gregorianCalendar.set(12, this.f15046r);
        gregorianCalendar.set(13, this.f15047s);
        gregorianCalendar.set(14, this.f15049u / 1000000);
        return gregorianCalendar;
    }

    /* renamed from: p */
    public int mo16198p() {
        return this.f15046r;
    }

    /* renamed from: q */
    public boolean mo16199q() {
        return this.f15051w;
    }

    /* renamed from: r */
    public void mo16200r(int i) {
        if (i < 1) {
            this.f15044p = 1;
        } else if (i > 31) {
            this.f15044p = 31;
        } else {
            this.f15044p = i;
        }
        this.f15050v = true;
    }

    /* renamed from: s */
    public void mo16201s(int i) {
        this.f15049u = i;
        this.f15051w = true;
    }

    /* renamed from: t */
    public int mo16202t() {
        return this.f15042f;
    }

    public String toString() {
        return mo16229e();
    }

    /* renamed from: u */
    public int mo16203u() {
        return this.f15043o;
    }

    /* renamed from: x */
    public int mo16204x() {
        return this.f15044p;
    }

    /* renamed from: y */
    public TimeZone mo16205y() {
        return this.f15048t;
    }
}
