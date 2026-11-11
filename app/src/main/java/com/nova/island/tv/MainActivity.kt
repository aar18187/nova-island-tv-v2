package com.nova.island.tv
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebSettings
import android.view.View
class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
    val web = WebView(this)
    web.settings.javaScriptEnabled = true
    web.settings.domStorageEnabled = true
    web.settings.loadWithOverviewMode = true
    web.settings.useWideViewPort = true
    web.settings.setSupportZoom(false)
    web.setInitialScale(100)
    web.loadUrl("file:///android_asset/index.html")
    setContentView(web)
  }
  override fun onBackPressed() {}
}
