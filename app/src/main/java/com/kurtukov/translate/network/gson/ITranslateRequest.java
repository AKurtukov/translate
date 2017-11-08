package com.kurtukov.translate.network.gson;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ITranslateRequest {
    @GET("api/v1.5/tr.json/translate")
    Call<TranslatePendingResult> getData(@Query("key") String key, @Query("text") String text, @Query("lang") String lang, @Query("format") String format, @Query("options") String options);
}
