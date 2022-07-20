package ir.tafreshiali.whygooglemultilanguage

import android.os.Bundle
import ir.tafreshiali.locale_helper.LocaleAwareCompatActivity

class MainActivity : LocaleAwareCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}