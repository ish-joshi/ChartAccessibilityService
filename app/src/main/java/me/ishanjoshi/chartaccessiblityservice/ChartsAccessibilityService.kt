package me.ishanjoshi.chartaccessiblityservice

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityEvent.TYPE_VIEW_CLICKED

class ChartsAccessibilityService : AccessibilityService() {

    val TAG = "ChartsAccessibilityService"

    override fun onInterrupt() {

    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        event?.toString()?.let { Log.d(TAG, it) }

        // Try and log it
        val recordCount = event?.text?.size
        if (recordCount != null) {
            if (recordCount > 0) {
                Log.d(TAG, "Record count is $recordCount")
                Log.d(TAG, "Message is ${event.text[0]}")
            }
        }

    }

}