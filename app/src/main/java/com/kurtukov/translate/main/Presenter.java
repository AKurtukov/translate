package com.kurtukov.translate.main;

import java.util.List;

public class Presenter implements IPresenter, IInteractor.OnFinishedListener {

    private IMainActivity IMainActivity;
    private IInteractor mInteractor;

    public Presenter(IMainActivity IMainActivity, IInteractor interactor) {
        this.IMainActivity = IMainActivity;
        mInteractor = interactor;
    }

    @Override
    public void onResume() {
        if (IMainActivity != null) {
            IMainActivity.showProgress();
            mInteractor.getAllLanguage(this, "ru");
        }
    }

    @Override
    public void onDestroy() {
        IMainActivity = null;
    }

    @Override
    public void onChangeLanguage(String changeLanguageName) {
        mInteractor.changeLanguage(changeLanguageName);
        //showProgress()
    }

    @Override
    public void onTranslate(String text, String fromLanguageName, String toLanguageName) {
        mInteractor.translate(this, text, fromLanguageName, toLanguageName);
        IMainActivity.showProgress();
    }

    @Override
    public void onFillInputLanguageSpinner(List<String> spinnerElements) {
        if (IMainActivity != null) {
            IMainActivity.fillInputLanguageSpinner(spinnerElements);
            IMainActivity.hideProgress();
        }
    }

    @Override
    public void onFillTranslateLanguageSpinner(List<String> spinnerElements) {
        if (IMainActivity != null) {
            IMainActivity.fillTranslateLanguageSpinner(spinnerElements);
            IMainActivity.hideProgress();
        }
    }

    @Override
    public void onShowResultTranslate(String text) {
        if (IMainActivity != null) {
            IMainActivity.setTranslateText(text);
            IMainActivity.hideProgress();
        }
    }

    @Override
    public void onSelectionLanguages(List<String> inputLanguageElements, List<String> translateLanguageelements, String inputLanguagePosition, String translateLanguageePosition) {
        if (IMainActivity != null) {
            IMainActivity.setSelectionLanguages(inputLanguageElements, inputLanguageElements.indexOf(inputLanguagePosition),
                    translateLanguageelements, translateLanguageelements.indexOf(translateLanguageePosition));
            IMainActivity.hideProgress();
        }
    }
}
