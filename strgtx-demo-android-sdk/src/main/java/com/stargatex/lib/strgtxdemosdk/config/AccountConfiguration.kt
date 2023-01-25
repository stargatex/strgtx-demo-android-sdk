package com.stargatex.lib.strgtxdemosdk.config

/**
 * @author Lahiru J (lahirujay)
 * @version 1.0
 */
interface AccountConfiguration {
    fun retrieveConfig(resourceId: Int): AccountConfig
}