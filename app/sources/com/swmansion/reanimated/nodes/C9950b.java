package com.swmansion.reanimated.nodes;

import android.graphics.PointF;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9909b;
import com.swmansion.reanimated.C9911d;

/* renamed from: com.swmansion.reanimated.nodes.b */
public class C9950b extends C9965m {

    /* renamed from: a */
    private final int f26647a;

    /* renamed from: b */
    private final C9951a f26648b;

    /* renamed from: com.swmansion.reanimated.nodes.b$a */
    private static class C9951a {

        /* renamed from: a */
        protected PointF f26649a;

        /* renamed from: b */
        protected PointF f26650b;

        /* renamed from: c */
        protected PointF f26651c;

        /* renamed from: d */
        protected PointF f26652d;

        /* renamed from: e */
        protected PointF f26653e;

        public C9951a(float f, float f2, float f3, float f4) {
            this(new PointF(f, f2), new PointF(f3, f4));
        }

        public C9951a(PointF pointF, PointF pointF2) {
            this.f26651c = new PointF();
            this.f26652d = new PointF();
            this.f26653e = new PointF();
            this.f26649a = pointF;
            this.f26650b = pointF2;
        }

        /* renamed from: a */
        private float m33888a(float f) {
            PointF pointF = this.f26653e;
            PointF pointF2 = this.f26649a;
            float f2 = pointF2.x * 3.0f;
            pointF.x = f2;
            PointF pointF3 = this.f26652d;
            float f3 = ((this.f26650b.x - pointF2.x) * 3.0f) - f2;
            pointF3.x = f3;
            PointF pointF4 = this.f26651c;
            float f4 = (1.0f - pointF.x) - f3;
            pointF4.x = f4;
            return f * (pointF.x + ((pointF3.x + (f4 * f)) * f));
        }

        /* renamed from: d */
        private float m33889d(float f) {
            return this.f26653e.x + (f * ((this.f26652d.x * 2.0f) + (this.f26651c.x * 3.0f * f)));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public float mo24855b(float f) {
            PointF pointF = this.f26653e;
            PointF pointF2 = this.f26649a;
            float f2 = pointF2.y * 3.0f;
            pointF.y = f2;
            PointF pointF3 = this.f26652d;
            float f3 = ((this.f26650b.y - pointF2.y) * 3.0f) - f2;
            pointF3.y = f3;
            PointF pointF4 = this.f26651c;
            float f4 = (1.0f - pointF.y) - f3;
            pointF4.y = f4;
            return f * (pointF.y + ((pointF3.y + (f4 * f)) * f));
        }

        /* renamed from: c */
        public float mo24856c(float f) {
            return mo24855b(mo24857e(f));
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public float mo24857e(float f) {
            float f2 = f;
            for (int i = 1; i < 14; i++) {
                float a = m33888a(f2) - f;
                if (((double) Math.abs(a)) < 0.001d) {
                    break;
                }
                f2 -= a / m33889d(f2);
            }
            return f2;
        }
    }

    public C9950b(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26647a = C9909b.m33754a(readableMap, "input", "Reanimated: Argument passed to bezier node is either of wrong type or is missing.");
        this.f26648b = new C9951a((float) readableMap.getDouble("mX1"), (float) readableMap.getDouble("mY1"), (float) readableMap.getDouble("mX2"), (float) readableMap.getDouble("mY2"));
    }

    /* access modifiers changed from: protected */
    public Double evaluate() {
        return Double.valueOf((double) this.f26648b.mo24856c(((Double) this.mNodesManager.mo24813v(this.f26647a)).floatValue()));
    }
}
