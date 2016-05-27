package com.lingyfh.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.lingyfh.lib.util.ToastUtil;

/**
 * Created by lingyfh on 5/27/16.
 */
public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.toast_btn).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ToastUtil.showToast(v.getContext(), "Toast1");
				ToastUtil.showToast(v.getContext(), "Toast2");
			}
		});
	}
}
