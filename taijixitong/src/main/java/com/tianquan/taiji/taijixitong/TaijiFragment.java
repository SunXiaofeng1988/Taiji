package com.tianquan.taiji.taijixitong;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.HashMap;
import java.util.Map;


public class TaijiFragment extends Fragment {

    private WebView taijiWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_taiji, container, false);
        taijiWebView = (WebView) view.findViewById(R.id.taijiWebView);
        taijiWebView.loadUrl(TaijiConstants.TAIJI_URL);
        taijiWebView.setWebViewClient(new MyWebViewClient());
        taijiWebView.getSettings().setJavaScriptEnabled(true);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
