package com.thewins.webview;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText _urlEditText;
    private WebView _webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _urlEditText = findViewById(R.id.urlEditText);
        _webView1 = findViewById(R.id.webView1);
    }

    public void tampilkanButton_onClick(View view) {
        String url = _urlEditText.getText().toString();
        if (!url.contains("https://")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("URL INVALID")
                    .setMessage("URL tidak dimulai dengan https://")
                    .setPositiveButton("Oke", null)
                    .show();
        } else {
            _webView1.setWebViewClient(new WebViewClient());
            _webView1.loadUrl(url);
        }
    }
}
