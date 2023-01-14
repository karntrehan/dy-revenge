package com.swmansion.reanimated.p440j;

/* renamed from: com.swmansion.reanimated.j.d */
public enum C9931d {
    ACCELEROMETER(10),
    GYROSCOPE(4),
    GRAVITY(9),
    MAGNETIC_FIELD(2),
    ROTATION_VECTOR(11);
    

    /* renamed from: t */
    private final int f26581t;

    private C9931d(int i) {
        this.f26581t = i;
    }

    /* renamed from: e */
    public static C9931d m33833e(int i) {
        if (i == 1) {
            return ACCELEROMETER;
        }
        if (i == 2) {
            return GYROSCOPE;
        }
        if (i == 3) {
            return GRAVITY;
        }
        if (i == 4) {
            return MAGNETIC_FIELD;
        }
        if (i == 5) {
            return ROTATION_VECTOR;
        }
        throw new IllegalArgumentException("[Reanimated] Unknown sensor type");
    }

    /* renamed from: g */
    public int mo24828g() {
        return this.f26581t;
    }
}
