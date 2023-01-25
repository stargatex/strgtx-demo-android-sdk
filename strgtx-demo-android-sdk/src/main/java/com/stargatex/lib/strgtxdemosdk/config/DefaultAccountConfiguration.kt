package com.stargatex.lib.strgtxdemosdk.config


import android.content.Context
import com.google.gson.Gson
import okio.Buffer
import okio.buffer
import okio.source
import java.nio.charset.Charset

/**
 * @author Lahiru J (lahirujay)
 * @version 1.0
 */
class DefaultAccountConfiguration(private val context: Context) : AccountConfiguration {
    override fun retrieveConfig(resourceId: Int): AccountConfig {
        val configBuffer = Buffer()
        val rawResourceBufferedSource =
            context.resources.openRawResource(resourceId).source().buffer()
        rawResourceBufferedSource.readAll(configBuffer)
        val jsonString = configBuffer.readString(Charset.forName("UTF-8"))
        return Gson().fromJson(jsonString, AccountConfig::class.java)
    }

}


