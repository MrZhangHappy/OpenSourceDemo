package com.zkk.opensourcelibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * 描述类的功能、用途、现存BUG，以及其它别人可能感兴趣的介绍.
 * created by: KaiKaiZhang.
 * version: 2017/08/03 16:38.
 */

public class ToastUtils {
    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {

        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

}
