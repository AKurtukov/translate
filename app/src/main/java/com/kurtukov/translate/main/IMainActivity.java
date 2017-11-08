package com.kurtukov.translate.main;

import java.util.List;

public interface IMainActivity {

    void showProgress();

    void hideProgress();

    void fillInputLanguageSpinner(List<String> spinnerElements);

    void fillTranslateLanguageSpinner(List<String> spinnerElements);

    void setSelectionLanguages(List<String> inputLanguageElements, int inputLanguagePosition, List<String> translateLanguageelements, int translateLanguageePosition);

    void setTranslateText(String text);

    void showMessage(String message);
}
