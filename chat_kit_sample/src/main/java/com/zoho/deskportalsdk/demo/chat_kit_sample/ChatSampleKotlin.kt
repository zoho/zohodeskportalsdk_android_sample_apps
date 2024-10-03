package com.zoho.deskportalsdk.demo.chat_kit_sample

import android.app.Activity
import com.zoho.desk.asap.chatkit.ZohoDeskPortalChatKit

class ChatSampleKotlin {

    fun showGC(activity: Activity) {
        ZohoDeskPortalChatKit.showGC(activity)
    }
    fun showAnswerBot(activity: Activity) {
        ZohoDeskPortalChatKit.showAnswerBot(activity)
    }
    fun showBM(activity: Activity) {
        ZohoDeskPortalChatKit.showBM(activity)
    }

    fun setGCSessionVariable(activity: Activity) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZohoDeskPortalChatKit.setGCSessionVariable(activity, sessionVariables)
    }

    fun updateGCSessionVariable(activity: Activity) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZohoDeskPortalChatKit.updateGCSessionVariable(activity, sessionVariables)
    }

    fun setBMSessionVariable(activity: Activity) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZohoDeskPortalChatKit.setBMSessionVariable(activity, sessionVariables)
    }

    fun updateBMSessionVariable(activity: Activity) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZohoDeskPortalChatKit.updateBMSessionVariable(activity, sessionVariables)
    }

}
