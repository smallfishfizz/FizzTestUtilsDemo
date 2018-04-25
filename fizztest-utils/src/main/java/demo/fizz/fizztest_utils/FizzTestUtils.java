package demo.fizz.fizztest_utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class FizzTestUtils {

    private static final String TAG = FizzTestUtils.class.getName();

    public static void testLog(String msg) {
        Log.i(TAG, "msg = " + msg);
    }

    public static void testToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}
