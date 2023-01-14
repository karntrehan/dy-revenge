package p174e.p319f.p393c.p394a.p404z.p405a;

/* renamed from: e.f.c.a.z.a.m1 */
final class C9514m1 {

    /* renamed from: e.f.c.a.z.a.m1$a */
    class C9515a implements C9516b {

        /* renamed from: a */
        final /* synthetic */ C9468i f25449a;

        C9515a(C9468i iVar) {
            this.f25449a = iVar;
        }

        /* renamed from: a */
        public byte mo23872a(int i) {
            return this.f25449a.mo23650g(i);
        }

        public int size() {
            return this.f25449a.size();
        }
    }

    /* renamed from: e.f.c.a.z.a.m1$b */
    private interface C9516b {
        /* renamed from: a */
        byte mo23872a(int i);

        int size();
    }

    /* renamed from: a */
    static String m32138a(C9468i iVar) {
        return m32139b(new C9515a(iVar));
    }

    /* renamed from: b */
    static String m32139b(C9516b bVar) {
        String str;
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            int a = bVar.mo23872a(i);
            if (a == 34) {
                str = "\\\"";
            } else if (a == 39) {
                str = "\\'";
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            a = (a & 7) + 48;
                        }
                        sb.append((char) a);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: c */
    static String m32140c(String str) {
        return m32138a(C9468i.m31676p(str));
    }
}
