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
public class TrFragment extends Fragment {


    public TrFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tr, container, false);
        WebView trWebView = (WebView) view.findViewById(R.id.trWebView);
        trWebView.loadUrl(TaijiConstants.TR_URL);
        trWebView.setWebViewClient(new MyWebViewClient());
        trWebView.getSettings().setJavaScriptEnabled(true);
        return view;
    }


}
