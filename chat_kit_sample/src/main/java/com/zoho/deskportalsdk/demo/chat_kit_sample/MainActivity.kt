package com.zoho.deskportalsdk.demo.chat_kit_sample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.zoho.desk.asap.livechat.ZDPortalLiveChat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showGC(view: View) {
        ZDPortalLiveChat.showGC(this)
    }
    fun showAnswerBot(view: View) {
        ZDPortalLiveChat.showAnswerBot(this)
    }
    fun showBM(view: View) {
        ZDPortalLiveChat.showBusinessMessenger(this)
    }

    fun setGCSessionVariable(view: View) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZDPortalLiveChat.setGCSessionVariable(this, sessionVariables)
    }

    fun updateGCSessionVariable(view: View) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZDPortalLiveChat.updateGCSessionVariable(this, sessionVariables)
    }

    fun setBMSessionVariable(view: View) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZDPortalLiveChat.setBMSessionVariable(this, sessionVariables)
    }

    fun updateBMSessionVariable(view: View) {
        val sessionVariables = arrayListOf(
            hashMapOf<String, Any>("name" to "YOUR VARIABLE NAME", "value" to "YOUR VARIABLE VALUE"),
            hashMapOf<String, Any>("name" to "YOUR SECOND VARIABLE NAME", "value" to "YOUR VARIABLE VALUE")
        )
        ZDPortalLiveChat.updateBMSessionVariable(this, sessionVariables)
    }

}
