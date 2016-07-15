package com.itcast.togglebutton79;

import com.itcast.togglebutton79.ToggleButton.OnToggleStateChangeListener;
import com.itcast.togglebutton79.ToggleButton.ToggleState;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {
	private ToggleButton toggle;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		toggle = (ToggleButton) findViewById(R.id.toggle);
		
		//1.设置背景图片
		toggle.setToggleBackgroundResource(R.drawable.switch_background);
		//2.设置滑动图片
		toggle.setSlideImage(R.drawable.slide_image);
		//3.设置默认状态是开
		toggle.setToggleState(ToggleState.Close);
		
		//设置状态改变的监听器
		toggle.setOnToggleStateChangeListener(new OnToggleStateChangeListener() {
			@Override
			public void onToggleStateChange(ToggleState mState) {
				//实现真正的逻辑操作
				Toast.makeText(MainActivity.this, mState==ToggleState.Close?"关闭":"打开", Toast.LENGTH_LONG).show();
			}
		}); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
