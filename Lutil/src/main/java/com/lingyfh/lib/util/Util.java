package com.lingyfh.lib.util;

import android.os.Looper;

/**
 * Created by lingyfh on 15/11/9.
 */
public class Util {

	/**
	 * 判断当前线程是否为主线程
	 * 
	 * @return
	 */
	public static boolean isOnMainThread() {
		return Looper.myLooper() == Looper.getMainLooper();
	}
}
