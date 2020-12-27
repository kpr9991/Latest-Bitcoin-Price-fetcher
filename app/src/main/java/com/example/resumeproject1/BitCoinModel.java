package com.example.resumeproject1;

import android.util.Log;

import org.json.JSONObject;

public class BitCoinModel {
    static double price=0;
    static String TAG="BitCoinModel";
    public static void getBitcoinAskingPrice(JSONObject jsonObject){
        try{
        price=jsonObject.getDouble("ask");
        Log.d(TAG,"JSon object decoding suceeded");
        }
        catch (Exception e){
            Log.d(TAG,"Could not decode Json Object");
        }

    }
}
