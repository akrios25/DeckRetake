package com.example.c4q.final_retake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.c4q.final_retake.data.CardApiResponse;
import com.example.c4q.final_retake.data.CardApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CardActivity extends AppCompatActivity {
    private Button shuffleDeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        String image = "image";

        shuffleDeck = findViewById(R.id.shuffle_button);
        shuffleDeck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(CardApiService.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                CardApiService cardApiService = retrofit.create(CardApiService.class);
                Call<CardApiResponse> call = cardApiService.getCardImages() // image urls needed
                call.enqueue(new Callback<CardApiResponse>() {
                    @Override
                    public void onResponse(Call<CardApiResponse> call, Response<CardApiResponse> response) {

                    }

                    @Override
                    public void onFailure(Call<CardApiResponse> call, Throwable t) {

                    }
                });
            }
        });




    }
}
