package com.zoho.deskportalsdk.demo.chat_kit_sample;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zoho.desk.asap.chatkit.ZohoDeskPortalChatKit;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showGC(View view) {
        ZohoDeskPortalChatKit.showGC(this);
    }
    public void showAnswerBot(View view) {
        ZohoDeskPortalChatKit.showAnswerBot(this);
    }
    public void showBM(View view) {
        ZohoDeskPortalChatKit.showBM(this);
    }

    public void setGCSessionVariable(View view) {
        ArrayList<HashMap<String, Object>> sessionVariables = new ArrayList<>();

        HashMap<String, Object> firstVariable = new HashMap<>();
        firstVariable.put("name", "YOUR VARIABLE NAME");
        firstVariable.put("value", "YOUR VARIABLE VALUE");

        HashMap<String, Object> secondVariable = new HashMap<>();
        secondVariable.put("name", "YOUR SECOND VARIABLE NAME");
        secondVariable.put("value", "YOUR SECOND VARIABLE VALUE");

        sessionVariables.add(firstVariable);
        sessionVariables.add(secondVariable);

        ZohoDeskPortalChatKit.setGCSessionVariable(this, sessionVariables);
    }

    public void updateGCSessionVariable(View view) {
        ArrayList<HashMap<String, Object>> sessionVariables = new ArrayList<>();

        HashMap<String, Object> firstVariable = new HashMap<>();
        firstVariable.put("name", "YOUR VARIABLE NAME");
        firstVariable.put("value", "YOUR VARIABLE VALUE");

        HashMap<String, Object> secondVariable = new HashMap<>();
        secondVariable.put("name", "YOUR SECOND VARIABLE NAME");
        secondVariable.put("value", "YOUR SECOND VARIABLE VALUE");

        sessionVariables.add(firstVariable);
        sessionVariables.add(secondVariable);

        ZohoDeskPortalChatKit.updateGCSessionVariable(this, sessionVariables);
    }

    public void setBMSessionVariable(View view) {
        ArrayList<HashMap<String, Object>> sessionVariables = new ArrayList<>();

        HashMap<String, Object> firstVariable = new HashMap<>();
        firstVariable.put("name", "YOUR VARIABLE NAME");
        firstVariable.put("value", "YOUR VARIABLE VALUE");

        HashMap<String, Object> secondVariable = new HashMap<>();
        secondVariable.put("name", "YOUR SECOND VARIABLE NAME");
        secondVariable.put("value", "YOUR SECOND VARIABLE VALUE");

        sessionVariables.add(firstVariable);
        sessionVariables.add(secondVariable);

        ZohoDeskPortalChatKit.setBMSessionVariable(this, sessionVariables);
    }

    public void updateBMSessionVariable(View view) {
        ArrayList<HashMap<String, Object>> sessionVariables = new ArrayList<>();

        HashMap<String, Object> firstVariable = new HashMap<>();
        firstVariable.put("name", "YOUR VARIABLE NAME");
        firstVariable.put("value", "YOUR VARIABLE VALUE");

        HashMap<String, Object> secondVariable = new HashMap<>();
        secondVariable.put("name", "YOUR SECOND VARIABLE NAME");
        secondVariable.put("value", "YOUR SECOND VARIABLE VALUE");

        sessionVariables.add(firstVariable);
        sessionVariables.add(secondVariable);

        ZohoDeskPortalChatKit.updateBMSessionVariable(this, sessionVariables);
    }

}
