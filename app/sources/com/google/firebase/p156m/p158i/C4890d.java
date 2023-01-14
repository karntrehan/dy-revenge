package com.google.firebase.p156m.p158i;

import com.google.firebase.p156m.C4876a;
import com.google.firebase.p156m.C4877b;
import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4882e;
import com.google.firebase.p156m.C4883f;
import com.google.firebase.p156m.C4884g;
import com.google.firebase.p156m.p157h.C4885a;
import com.google.firebase.p156m.p157h.C4886b;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.firebase.m.i.d */
public final class C4890d implements C4886b<C4890d> {

    /* renamed from: a */
    private static final C4881d<Object> f13715a = C4887a.f13712a;

    /* renamed from: b */
    private static final C4883f<String> f13716b = C4888b.f13713a;

    /* renamed from: c */
    private static final C4883f<Boolean> f13717c = C4889c.f13714a;

    /* renamed from: d */
    private static final C4892b f13718d = new C4892b((C4891a) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Map<Class<?>, C4881d<?>> f13719e = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map<Class<?>, C4883f<?>> f13720f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4881d<Object> f13721g = f13715a;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f13722h = false;

    /* renamed from: com.google.firebase.m.i.d$a */
    class C4891a implements C4876a {
        C4891a() {
        }

        /* renamed from: a */
        public void mo14845a(Object obj, Writer writer) {
            C4893e eVar = new C4893e(writer, C4890d.this.f13719e, C4890d.this.f13720f, C4890d.this.f13721g, C4890d.this.f13722h);
            eVar.mo14870i(obj, false);
            eVar.mo14878r();
        }

        /* renamed from: b */
        public String mo14846b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo14845a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: com.google.firebase.m.i.d$b */
    private static final class C4892b implements C4883f<Date> {

        /* renamed from: a */
        private static final DateFormat f13724a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f13724a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private C4892b() {
        }

        /* synthetic */ C4892b(C4891a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo14858a(Date date, C4884g gVar) {
            gVar.mo14859d(f13724a.format(date));
        }
    }

    public C4890d() {
        mo14866m(String.class, f13716b);
        mo14866m(Boolean.class, f13717c);
        mo14866m(Date.class, f13718d);
    }

    /* renamed from: i */
    static /* synthetic */ void m18677i(Object obj, C4882e eVar) {
        throw new C4877b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: f */
    public C4876a mo14862f() {
        return new C4891a();
    }

    /* renamed from: g */
    public C4890d mo14863g(C4885a aVar) {
        aVar.mo10874a(this);
        return this;
    }

    /* renamed from: h */
    public C4890d mo14864h(boolean z) {
        this.f13722h = z;
        return this;
    }

    /* renamed from: l */
    public <T> C4890d mo14861a(Class<T> cls, C4881d<? super T> dVar) {
        this.f13719e.put(cls, dVar);
        this.f13720f.remove(cls);
        return this;
    }

    /* renamed from: m */
    public <T> C4890d mo14866m(Class<T> cls, C4883f<? super T> fVar) {
        this.f13720f.put(cls, fVar);
        this.f13719e.remove(cls);
        return this;
    }
}
