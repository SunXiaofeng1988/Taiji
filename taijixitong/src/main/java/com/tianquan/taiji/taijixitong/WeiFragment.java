package com.tianquan.taiji.taijixitong;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class WeiFragment extends Fragment {


    public WeiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wei, container, false);
        WebView weiWebView = (WebView) view.findViewById(R.id.weiWebView);
        weiWebView.loadUrl(TaijiConstants.WEI_URL);
        weiWebView.setWebViewClient(new MyWebViewClient());
        weiWebView.getSettings().setJavaScriptEnabled(true);
        return view;
    }


}
