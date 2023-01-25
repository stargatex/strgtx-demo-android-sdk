package com.stargatex.lib.strgtxdemosdk.config

/**
 * @author Lahiru J (lahirujay)
 * @version 1.0
 */
object AccountConfigurationStore {

    fun loadAccountConfiguration(
        accountConfiguration: AccountConfiguration,
        resourceId: Int
    ): AccountConfig =
        accountConfiguration.retrieveConfig(resourceId)
}