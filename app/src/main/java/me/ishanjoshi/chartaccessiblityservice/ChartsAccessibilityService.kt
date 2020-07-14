package me.ishanjoshi.chartaccessiblityservice

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent

class ChartsAccessibilityService : AccessibilityService() {

    val TAG = "ChartsAccessibilityService"

    override fun onInterrupt() {

    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {

        event?.toString()?.let { Log.d(TAG, it) }

        // Try and log it
        event?.text?.let {
            val recordCount = it.size
            if (recordCount > 0) {
                Log.d(TAG, "Record count is $recordCount")
                for (item in event.text) {
                    Log.d(TAG, item.toString())
                }
                Log.d(TAG, "---Line--Break--\n")
            }
        }

    }

}