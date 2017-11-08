package com.kurtukov.translate.main;

public interface IPresenter {

    void onResume();

    void onDestroy();

    void onChangeLanguage(String changeLanguageName);

    void onTranslate(String text, String fromLanguageName, String toLanguageName);
}
