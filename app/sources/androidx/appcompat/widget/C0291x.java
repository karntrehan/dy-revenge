package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C1177h;

/* renamed from: androidx.appcompat.widget.x */
final class C0291x {

    /* renamed from: a */
    private TextView f1242a;

    /* renamed from: b */
    private TextClassifier f1243b;

    C0291x(TextView textView) {
        this.f1242a = (TextView) C1177h.m4583e(textView);
    }

    /* renamed from: a */
    public TextClassifier mo1782a() {
        TextClassifier textClassifier = this.f1243b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1242a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    /* renamed from: b */
    public void mo1783b(TextClassifier textClassifier) {
        this.f1243b = textClassifier;
    }
}
