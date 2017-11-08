package com.kurtukov.translate.main;

import android.util.Log;

import com.kurtukov.translate.LanguageUtils;
import com.kurtukov.translate.network.INetworkManager;
import com.kurtukov.translate.network.IPendingResult;
import com.kurtukov.translate.network.NetworkManager;
import com.kurtukov.translate.network.gson.DetectPendingResult;
import com.kurtukov.translate.network.gson.LanguagesPendingResult;
import com.kurtukov.translate.network.gson.TranslatePendingResult;


public class Interactor implements IInteractor, INetworkManager.OnPendingResultListener {

    private OnFinishedListener mListener;
    private INetworkManager mTranslateManager;
    private LanguagesPendingResult mLanguagesPendingResult;

    public Interactor() {
        mTranslateManager = new NetworkManager(this);
    }

    @Override
    public void getAllLanguage(OnFinishedListener listener, String ui) {
        mListener = listener;
        mTranslateManager.getLanguages(ui);
    }

    @Override
    public void identifylanguages(OnFinishedListener listener) {

    }

    @Override
    public void changeLanguage(String changeLanguageName) {
        if (mLanguagesPendingResult != null && mLanguagesPendingResult.getDirs() != null) {
            mListener.onFillTranslateLanguageSpinner(
                    LanguageUtils.getLanguagesFromLanguageCodes(mLanguagesPendingResult.getLanguageGroup(),
                            LanguageUtils.getLanguagesOfTranslation(
                                    mLanguagesPendingResult.getDirs(),
                                    mLanguagesPendingResult.getLanguageGroup().getLanguageCode(changeLanguageName))
                    ));
        }
    }

    @Override
    public void translate(OnFinishedListener listener, String text, String fromLanguageName, String toLanguageName) {
        mListener = listener;
        mTranslateManager.translate(text,
                LanguageUtils.get(mLanguagesPendingResult.getLanguageGroup(), fromLanguageName, toLanguageName),
                "plain", "1");
    }

    @Override
    public void onResult(IPendingResult pendingResult) {
        if (mListener != null) {
            if (pendingResult instanceof TranslatePendingResult) {
                TranslatePendingResult translatePendingResult = (TranslatePendingResult) pendingResult;
                String detectedLanguage = translatePendingResult.getDetected().getLanguage();
                if (!LanguageUtils.getFromLanguageCode(translatePendingResult.getLang()).equals(detectedLanguage)) {


                    mListener.onSelectionLanguages(LanguageUtils.getLanguages(mLanguagesPendingResult),
                            LanguageUtils.getLanguages(mLanguagesPendingResult, detectedLanguage),
                            mLanguagesPendingResult.getLanguageGroup().getLanguageName(detectedLanguage),
                            LanguageUtils.getToLanguageName(mLanguagesPendingResult.getLanguageGroup(), translatePendingResult.getLang()));



                }
                mListener.onShowResultTranslate(translatePendingResult.getText().get(0));
            }
            if (pendingResult instanceof LanguagesPendingResult) {
                mLanguagesPendingResult = (LanguagesPendingResult) pendingResult;

                //Выбор языка при старте
                mListener.onSelectionLanguages(LanguageUtils.getLanguages(mLanguagesPendingResult),
                        LanguageUtils.getLanguages(mLanguagesPendingResult, "en"),
                        mLanguagesPendingResult.getLanguageGroup().getLanguageName("en"),
                        LanguageUtils.getToLanguageName(mLanguagesPendingResult.getLanguageGroup(), "ru"));

            }
            if (pendingResult instanceof DetectPendingResult) {
                //  mLanguagesPendingResult = (DetectPendingResult) pendingResult;
            }


            if (mLanguagesPendingResult != null) {

            }
        }

    }

    @Override
    public void onError(Throwable throwable) {
//TODO Написать обработку ошибок
    }
}
