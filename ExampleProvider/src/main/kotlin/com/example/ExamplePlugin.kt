package com.example

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import com.lagradost.cloudstream3.APIHolder
import android.content.Context
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.lagradost.cloudstream3.animeproviders.KrunchyProvider

@CloudstreamPlugin
class TestPlugin: Plugin() {
    var activity: AppCompatActivity? = null

        override fun load(context: Context) {
            // All providers should be added in this manner. Please don't edit the providers list directly.
            registerMainAPI(KrunchyProvider())

        openSettings = { ctx ->
            val frag = BlankFragment(this)
            frag.show(activity!!.supportFragmentManager, "sexFrag")
        }
    }
}