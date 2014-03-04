package com.blazeka.myanimeapp.data;

import android.content.Context;
import android.widget.Toast;

public class Utils {
	public static void doShortToast(Context c, String message)
    {
        if (c.equals(null))
            return;

        Toast toast = Toast.makeText(c, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
