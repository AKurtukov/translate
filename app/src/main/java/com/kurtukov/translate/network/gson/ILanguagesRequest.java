package com.kurtukov.translate.network.gson;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ILanguagesRequest {
    @GET("api/v1.5/tr.json/getLangs")
    Call<LanguagesPendingResult> getData(@Query("key") String key, @Query("ui") String ui);
}