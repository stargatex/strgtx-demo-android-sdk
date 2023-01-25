package com.stargatex.lib.strgtxdemosdk.config


import android.content.Context
import android.util.Log
import com.google.gson.Gson
import okio.buffer
import okio.source

/**
 * @author Lahiru J (lahirujay)
 * @version 1.0
 */
class DefaultAccountConfiguration(private val context: Context) : AccountConfiguration {
    override fun retrieveConfig(resourceId: Int): AccountConfig {

        val jsonString = context.resources.openRawResource(resourceId).source().buffer().use {
            it.readUtf8()
        }

        Log.d(
            DefaultAccountConfiguration::class.java.simpleName, "jsonString $jsonString"
        )
        return Gson().fromJson(jsonString, AccountConfig::class.java)
    }

}


