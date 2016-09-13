package com.example.echozhou.materialdesigntest.Util;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public class ToastUtil {

    private static Toast mToast;

    public static void show(Context context, String text) {
        if (!TextUtils.isEmpty(text)) {
            if (mToast == null) {
                mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
            } else {
                mToast.setText(text);
                mToast.setDuration(Toast.LENGTH_SHORT);
            }

            mToast.show();

        }
    }

}