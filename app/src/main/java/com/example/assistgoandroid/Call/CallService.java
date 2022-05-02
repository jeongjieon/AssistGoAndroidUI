package com.example.assistgoandroid.Call;

import android.content.Intent;
import android.os.Build;
import android.telecom.Call;
import android.telecom.InCallService;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.M)
//https://github.com/Abror96/CustomPhoneDialer/blob/master/app/src/main/java/customphonedialer/abror96/customphonedialer/CallService.java
//https://github.com/arekolek/simple-phone/blob/master/app/src/main/java/com/github/arekolek/phone/CallService.kt
public class CallService extends InCallService {

    @Override
    public void onCallAdded(Call call) {
        super.onCallAdded(call);
        new OngoingCall().setCall(call);
        CallActivity.start(this,call);
    }

    @Override
    public void onCallRemoved(Call call) {
        super.onCallRemoved(call);
        new OngoingCall().setCall(call);
    }
}
