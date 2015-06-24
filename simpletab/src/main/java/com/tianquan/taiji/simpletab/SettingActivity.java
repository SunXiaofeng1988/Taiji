package com.tianquan.taiji.simpletab;

import android.os.Bundle;
import android.view.View;

public class SettingActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setting);

		initHead();
		btn_leftTop.setVisibility(View.INVISIBLE);
		tv_head.setText("设置");
	}


}
