package com.zoho.deskportalsdk.demo.chat_kit_sample

import android.app.Activity
import com.zoho.desk.asap.livechat.ZDPortalLiveChat

class ChatSampleKotlin {

    fun showGC(activity: Activity) {
        ZDPortalLiveChat.showGC(activity)
    }
    fun showAnswerBot(activity: Activity) {
        ZDPortalLiveChat.showAnswerBot(activity)
    }
    fun showBM(activity: Activity) {
        ZDPortalLiveChat.showBusinessMessenger(activity)
    }

    fun setGCSessionVariable(activity: Activity) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZDPortalLiveChat.setGCSessionVariable(activity, sessionVariables)
    }

    fun updateGCSessionVariable(activity: Activity) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZDPortalLiveChat.updateGCSessionVariable(activity, sessionVariables)
    }

    fun setBMSessionVariable(activity: Activity) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZDPortalLiveChat.setBMSessionVariable(activity, sessionVariables)
    }

    fun updateBMSessionVariable(activity: Activity) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZDPortalLiveChat.updateBMSessionVariable(activity, sessionVariables)
    }

}
