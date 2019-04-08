package com.dstudiosoft.lib;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    public static void setToast(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}
