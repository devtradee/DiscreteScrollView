package com.yarolegovich.discretescrollview.transform;

import android.view.View;

/**
 * Created by yarolegovich on 02.03.2017.
 */

public interface DiscreteScrollItemTransformer {
    void transformItem(View item, float position);
    void measureItemWidth(View item, float position);
    void measureItemHeight(View item, float position);
}
