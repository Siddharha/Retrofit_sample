package com.example.chandan.retrofit.intefaces;

import com.example.chandan.retrofit.model.UserInput;
import com.example.chandan.retrofit.model.UserResponse;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by CHANDAN on 12/23/2016.
 */

public interface ApiInterface {
    @POST("getBio.php")
    Call<UserResponse> getallDetailsUser(@Body UserInput data);
}
