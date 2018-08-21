package com.sofakingforever.analytics.events

import android.content.Context

interface AnalyticsInviteEvent : BaseEvent {

    val context: Context
    val packageName: String
    val shareVia: String

    fun getInviteMethod(): String? {
        val packageManager = context.packageManager
        return packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString()
    }

}