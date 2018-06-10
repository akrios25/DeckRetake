package com.example.c4q.final_retake.data;

import com.example.c4q.final_retake.data.CardApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by c4q on 6/10/18.
 */

public interface CardApiService {
    String BASE_URL = "https://deckofcardsapi.com/api/";

    @GET("deck/new/shuffle")
    Call<CardApiResponse> getNewDeck(@Path("new") String image);
}
