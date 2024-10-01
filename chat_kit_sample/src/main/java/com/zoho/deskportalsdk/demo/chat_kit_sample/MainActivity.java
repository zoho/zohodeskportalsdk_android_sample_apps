package com.zoho.deskportalsdk.demo.chat_kit_sample;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.zoho.desk.asap.livechat.ZDPortalLiveChat;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showGC(View view) {
        ZDPortalLiveChat.showGC(this);
    }
    public void showAnswerBot(View view) {
        ZDPortalLiveChat.showAnswerBot(this);
    }
    public void showBM(View view) {
        ZDPortalLiveChat.showBusinessMessenger(this);
    }

    public void setGCSessionVariable(View view) {
        ArrayList<HashMap<String, Object>> sessionVariables = CollectionsKt.arrayListOf(new HashMap[] {
                MapsKt.hashMapOf(new Pair[] { TuplesKt.to("name", "YOUR VARIABLE NAME"), TuplesKt.to("value", "YOUR VARIABLE VALUE") }),
                MapsKt.hashMapOf(new Pair[] { TuplesKt.to("name", "YOUR SECOND VARIABLE NAME"), TuplesKt.to("value", "YOUR SECOND VARIABLE VALUE") }) });

        ZDPortalLiveChat.setGCSessionVariable(this, sessionVariables);
    }

    public void updateGCSessionVariable(View view) {
        ArrayList<HashMap<String, Object>> sessionVariables = CollectionsKt.arrayListOf(new HashMap[] {
                MapsKt.hashMapOf(new Pair[] { TuplesKt.to("name", "YOUR VARIABLE NAME"), TuplesKt.to("value", "YOUR VARIABLE VALUE") }),
                MapsKt.hashMapOf(new Pair[] { TuplesKt.to("name", "YOUR SECOND VARIABLE NAME"), TuplesKt.to("value", "YOUR SECOND VARIABLE VALUE") }) });

        ZDPortalLiveChat.updateGCSessionVariable(this, sessionVariables);
    }

    public void setBMSessionVariable(View view) {
        ArrayList<HashMap<String, Object>> sessionVariables = CollectionsKt.arrayListOf(new HashMap[] {
                MapsKt.hashMapOf(new Pair[] { TuplesKt.to("name", "YOUR VARIABLE NAME"), TuplesKt.to("value", "YOUR VARIABLE VALUE") }),
                MapsKt.hashMapOf(new Pair[] { TuplesKt.to("name", "YOUR SECOND VARIABLE NAME"), TuplesKt.to("value", "YOUR SECOND VARIABLE VALUE") }) });

        ZDPortalLiveChat.setBMSessionVariable(this, sessionVariables);
    }

    public void updateBMSessionVariable(View view) {
        ArrayList<HashMap<String, Object>> sessionVariables = CollectionsKt.arrayListOf(new HashMap[] {
                MapsKt.hashMapOf(new Pair[] { TuplesKt.to("name", "YOUR VARIABLE NAME"), TuplesKt.to("value", "YOUR VARIABLE VALUE") }),
                MapsKt.hashMapOf(new Pair[] { TuplesKt.to("name", "YOUR SECOND VARIABLE NAME"), TuplesKt.to("value", "YOUR SECOND VARIABLE VALUE") }) });

        ZDPortalLiveChat.updateBMSessionVariable(this, sessionVariables);
    }

}
