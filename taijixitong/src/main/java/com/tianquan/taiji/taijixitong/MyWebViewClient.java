package com.tianquan.taiji.taijixitong;

import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by destiny on 2015/6/24.
 */
public class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // 重写此方法表明点击网页里面的链接还是在当前的webview里跳转，不跳到浏览器那边
        Map<String, String> extraHeaders = new HashMap<String, String>();
        if(view.getUrl() != null)extraHeaders.put("Referer", view.getUrl());
        view.loadUrl(url,extraHeaders);
        return true;
    }
}
