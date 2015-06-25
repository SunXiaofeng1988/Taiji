package com.tianquan.taiji.taijixitong;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;


public class MainActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener {

    private TaijiFragment taijiFragment;
    private TrFragment trFragment;
    private FragmentManager fragmentManager;
    private WechatFragment wechatFragment;
    private WeiFragment weiFragment;

    private RadioGroup radioGroup;

    private Fragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.tabRadioGroup);
        taijiFragment = new TaijiFragment();
        trFragment = new TrFragment();
        wechatFragment = new WechatFragment();
        weiFragment = new WeiFragment();
        initView();
        initEvent();
    }

    private void initEvent() {
        radioGroup.setOnCheckedChangeListener(this);
    }

    private void initView() {
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.mainFrame, taijiFragment).commit();
        mFragment = taijiFragment;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case R.id.taijiRadioBtn:
                if(mFragment != taijiFragment) {
                    FragmentTransaction transaction = fragmentManager.beginTransaction()
                            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                    if(taijiFragment.isAdded()){
                        transaction.hide(mFragment).show(taijiFragment);
                    } else {
                        transaction.hide(mFragment).add(R.id.mainFrame, taijiFragment);
                    }
                    transaction.commit();
                    mFragment = taijiFragment;
                }
                break;
            case R.id.trRadioBtn:
                if(mFragment != trFragment) {
                    FragmentTransaction transaction = fragmentManager.beginTransaction()
                            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                    if(trFragment.isAdded()){
                        transaction.hide(mFragment).show(trFragment);
                    } else {
                        transaction.hide(mFragment).add(R.id.mainFrame, trFragment);
                    }
                    transaction.commit();
                    mFragment = trFragment;
                }
                break;
            case R.id.wechatRadioBtn:
                if(mFragment != wechatFragment) {
                    FragmentTransaction transaction = fragmentManager.beginTransaction()
                            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                    if(wechatFragment.isAdded()){
                        transaction.hide(mFragment).show(wechatFragment);
                    } else {
                        transaction.hide(mFragment).add(R.id.mainFrame, wechatFragment);
                    }
                    transaction.commit();
                    mFragment = wechatFragment;
                }
                break;
            case R.id.weiRadioBtn:
                if(mFragment != weiFragment) {
                    FragmentTransaction transaction = fragmentManager.beginTransaction()
                            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                    if(weiFragment.isAdded()){
                        transaction.hide(mFragment).show(weiFragment);
                    } else {
                        transaction.hide(mFragment).add(R.id.mainFrame, weiFragment);
                    }
                    transaction.commit();
                    mFragment = weiFragment;
                }
                break;
        }
    }
}
