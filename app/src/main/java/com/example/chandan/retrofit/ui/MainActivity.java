package com.example.chandan.retrofit.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.chandan.retrofit.R;
import com.example.chandan.retrofit.intefaces.ApiInterface;
import com.example.chandan.retrofit.model.UserInput;
import com.example.chandan.retrofit.model.UserResponse;
import com.example.chandan.retrofit.utils.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView tvName,tvAge,tvPhoneNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        apiCall();


    }

    private void initialize() {
        tvName = (TextView)findViewById(R.id.tvName);
        tvAge = (TextView)findViewById(R.id.tvAge);
        tvPhoneNo = (TextView)findViewById(R.id.tvPhoneNo);
    }

    public void apiCall(){
         UserInput.DataBean dataBean = new UserInput.DataBean();
         dataBean.setId(1234);
         UserInput userInput = new UserInput();
         userInput.setData(dataBean);
         ApiInterface apiService =
                 ApiClient.getClient().create(ApiInterface.class);

         Call<UserResponse> call = apiService.getallDetailsUser(userInput);
         call.enqueue(new Callback<UserResponse>() {
             @Override
             public void onResponse(Call<UserResponse>call, Response<UserResponse> response) {
                 UserResponse.DataBean name = response.body().getData();
                 //Log.e("response ",name.getName() + String.valueOf(name.getAge()) + String.valueOf(name.getPhone_no()));
                 tvName.setText(name.getName());
                 tvAge.setText(String.valueOf(name.getAge()));
                 tvPhoneNo.setText(String.valueOf(name.getPhone_no()));
             }

             @Override
             public void onFailure(Call<UserResponse> call, Throwable t) {
                 Log.e("error", t.toString());
             }

         });

     }

}
