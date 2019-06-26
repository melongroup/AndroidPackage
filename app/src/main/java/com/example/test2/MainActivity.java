package com.example.test2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        WebView.setWebContentsDebuggingEnabled(true);

        int x = ViewGroup.LayoutParams.MATCH_PARENT;
        int y = ViewGroup.LayoutParams.MATCH_PARENT;
        ViewGroup.LayoutParams params=new ViewGroup.LayoutParams(x,y);

        WebView webview = new TWebView(this);
        this.addContentView(webview,params);
//        webview.layout(0,0,200,200);

//        WebView webview = findViewById(R.id.webview);
//        webview.setWebViewClient(new WebViewClient());
//        webview.setWebChromeClient(new WebChromeClient());
//
//
//        WebSettings settings = webview.getSettings();
//        settings.setAllowFileAccess(true);
//        settings.setAllowContentAccess(true);
//        settings.setJavaScriptEnabled(true);
//
//
//        webview.loadUrl("http://192.168.2.215/ts/");
//
//        webview.setEnabled(true);
//
//        webview.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        System.out.println("Hello world!");
//                    }
//                }
//        );

//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("点击了按钮");
//            }
//        });
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
    public void onClick(View view) {
        System.out.println("Hello world!");
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
