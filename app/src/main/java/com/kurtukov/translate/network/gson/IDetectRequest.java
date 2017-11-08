package com.kurtukov.translate.network.gson;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IDetectRequest{
    @GET("api/v1.5/tr.json/detect")
    Call<DetectPendingResult> getData(@Query("key") String key, @Query("text") String text, @Query("hint") String hint);
}