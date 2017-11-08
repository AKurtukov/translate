package com.kurtukov.translate.main;

import java.util.List;

public interface IInteractor {

    interface OnFinishedListener {

        void onFillInputLanguageSpinner(List<String> spinnerElements);

        void onFillTranslateLanguageSpinner(List<String> spinnerElements);

        void onShowResultTranslate(String text);

        void onSelectionLanguages(List<String> inputLanguageElements, List<String> translateLanguageelements,  String inputLanguagePosition, String translateLanguageePosition);
    }

    void getAllLanguage(OnFinishedListener listener, String ui);

    void identifylanguages(OnFinishedListener listener);

    void changeLanguage(String changeLanguage);

    void translate(OnFinishedListener listener, String text,  String fromLanguageName, String toLanguageName);
}
