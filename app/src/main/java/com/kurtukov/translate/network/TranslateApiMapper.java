package com.kurtukov.translate.network;

import android.support.annotation.NonNull;

import com.kurtukov.translate.network.gson.DetectPendingResult;
import com.kurtukov.translate.network.gson.IDetectRequest;
import com.kurtukov.translate.network.gson.ILanguagesRequest;
import com.kurtukov.translate.network.gson.ITranslateRequest;
import com.kurtukov.translate.network.gson.LanguagesPendingResult;
import com.kurtukov.translate.network.gson.TranslatePendingResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * API Яндекс.Переводчика.
 */

public class TranslateApiMapper implements ITranslateApiMapper {

    TranslateApiMapper(@NonNull INetworkManager.OnPendingResultListener pendingResultListener) {
        mPendingResultListener = pendingResultListener;
        mRetrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }

    private static final String API_KEY = "trnsl.1.1.20170617T101005Z.0101d6807ba38893.055f10382a0a84f75128c8f48f5b77e50ea78070";
    private static final String BASE_URL = "https://translate.yandex.net/";
    private Retrofit mRetrofit;
    INetworkManager.OnPendingResultListener mPendingResultListener;

    /**
     * Получение списка поддерживаемых языков
     *
     * @param ui Обязательный параметр. В ответе список поддерживаемых языков будет перечислен в поле langs вместе с расшифровкой кодов языков. Названия языков будут выведены на языке, код которого соответствует этому параметру.
     *           Все коды языков перечислены в списке поддерживаемых языков.
     */
    @Override
    public void getLangs(String ui) {
        mRetrofit.create(ILanguagesRequest.class).getData(API_KEY, ui).enqueue(new Callback<LanguagesPendingResult>() {
            @Override
            public void onResponse(Call<LanguagesPendingResult> call, Response<LanguagesPendingResult> response) {
                mPendingResultListener.onResult(response.body());
            }

            @Override
            public void onFailure(Call<LanguagesPendingResult> call, Throwable throwable) {
                mPendingResultListener.onError(throwable);
            }
        });
    }

    /**
     * Определение языка
     *
     * @param text Обязательный параметр.  Текст, язык которого требуется определить.
     *             Внимание! Для исходного текста обязательно используйте URL-кодировние.
     * @param hint Список наиболее вероятных языков (им будет отдаваться предпочтение при определении языка текста). Разделитель списка — запятая.
     */
    @Override
    public void detect(String text, String hint) {
        mRetrofit.create(IDetectRequest.class).getData(API_KEY, text, hint).enqueue(new Callback<DetectPendingResult>() {
            @Override
            public void onResponse(Call<DetectPendingResult> call, Response<DetectPendingResult> response) {
                mPendingResultListener.onResult(response.body());
            }

            @Override
            public void onFailure(Call<DetectPendingResult> call, Throwable throwable) {
                mPendingResultListener.onError(throwable);
            }
        });
    }

    /**
     * Перевод текста
     *
     * @param text    Текст, который необходимо перевести.
     *                Для POST-запросов максимальный размер передаваемого текста составляет 10 000 символов.
     * @param lang    Направление перевода.
     *                В виде пары кодов языков («с какого»-«на какой»), разделенных дефисом. Например, en-ru обозначает перевод с английского на русский.
     *                В виде кода конечного языка (например ru). В этом случае сервис пытается определить исходный язык автоматически.
     * @param format  Формат текста.
     *                Возможные значения:
     *                plain — текст без разметки (значение по умолчанию);
     *                html — текст в формате HTML.
     * @param options В настоящее время доступна единственная опция — признак включения в ответ автоматически определенного языка переводимого текста. Этому соответствует значение 1 этого параметра.
     */
    @Override
    public void translate(String text, String lang, String format, String options) {
        mRetrofit.create(ITranslateRequest.class).getData(API_KEY, text, lang, format, options).enqueue(new Callback<TranslatePendingResult>() {
            @Override
            public void onResponse(Call<TranslatePendingResult> call, Response<TranslatePendingResult> response) {
                mPendingResultListener.onResult(response.body());
            }

            @Override
            public void onFailure(Call<TranslatePendingResult> call, Throwable throwable) {
                mPendingResultListener.onError(throwable);
            }
        });
    }


}
