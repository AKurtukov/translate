package com.kurtukov.translate.main;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.kurtukov.alexander.translate.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IMainActivity, View.OnClickListener, AdapterView.OnItemSelectedListener {

    private static final String EMPTY = "";
    private static final String LABEL = "Translate";
    private ProgressBar mProgressBar;
    private IPresenter mPresenter;
    private ImageButton mSwapButton;
    private ImageButton mEnterButton;
    private ImageButton mClearButton;
    private ImageButton mCopyButton;
    private ImageButton mPasteButton;
    private ImageButton mShareButton;
    private Spinner mInputLanguageSpinner;
    private Spinner mTranslateLanguageSpinner;
    private EditText mInputEditText;
    private EditText mTranslateEditText;
    private String mInputLanguageName;
    private String mTranslateLanguageName;
    private boolean mLockChangeLanguage;
    private ClipboardManager mClipboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        mClipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.onResume();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void fillInputLanguageSpinner(List<String> spinnerElements) {
        fillSpinner(mInputLanguageSpinner, spinnerElements);
    }

    @Override
    public void fillTranslateLanguageSpinner(List<String> spinnerElements) {
        fillSpinner(mTranslateLanguageSpinner, spinnerElements);
    }

    @Override
    public void setSelectionLanguages(List<String> inputLanguageElements, int inputLanguagePosition, List<String> translateLanguageelements, int translateLanguageePosition) {
        mLockChangeLanguage = true;
        fillSpinner(mInputLanguageSpinner, inputLanguageElements);
        mInputLanguageSpinner.setSelection(inputLanguagePosition);
        fillSpinner(mTranslateLanguageSpinner, translateLanguageelements);
        mTranslateLanguageSpinner.setSelection(translateLanguageePosition);
    }

    @Override
    public void setTranslateText(String text) {
        mTranslateEditText.setText(text);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.swap_button:

                break;
            case R.id.enter_button:
                mPresenter.onTranslate(mInputEditText.getText().toString(), mInputLanguageName, mTranslateLanguageName);
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                if (getCurrentFocus() != null) {
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                }
                mEnterButton.setVisibility(View.GONE);
                break;
            case R.id.clear_button:
                mInputEditText.setText(EMPTY);
                mTranslateEditText.setText(EMPTY);
                break;
            case R.id.copy_button:
                if (!mTranslateEditText.getText().toString().isEmpty()) {

                    ClipData clip = ClipData.newPlainText(LABEL, mTranslateEditText.getText().toString());
                    mClipboard.setPrimaryClip(clip);

                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Скопировано", Toast.LENGTH_SHORT);
                    toast.show();

                }
                break;
            case R.id.paste_button:
                ClipData.Item item = mClipboard.getPrimaryClip().getItemAt(0);
                mInputEditText.setText(item.getText());

                break;
            case R.id.share_button:


                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, mTranslateEditText.getText());
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.input_language_spinner:
                mInputLanguageName = parent.getItemAtPosition(position).toString();
                if (!mLockChangeLanguage) {
                    mPresenter.onChangeLanguage(parent.getItemAtPosition(position).toString());
                }
                mLockChangeLanguage = false;
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
                ((TextView) view).setGravity(Gravity.CENTER);
                break;
            case R.id.translate_language_spinner:
                mTranslateLanguageName = parent.getItemAtPosition(position).toString();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
                ((TextView) view).setGravity(Gravity.CENTER);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }

    private void initialization() {
        mPresenter = new Presenter(this, new Interactor());
        mProgressBar = (ProgressBar) findViewById(R.id.progress);
        mInputLanguageSpinner = (Spinner) findViewById(R.id.input_language_spinner);
        mInputLanguageSpinner.setOnItemSelectedListener(this);
        mTranslateLanguageSpinner = (Spinner) findViewById(R.id.translate_language_spinner);
        mTranslateLanguageSpinner.setOnItemSelectedListener(this);
        mInputEditText = (EditText) findViewById(R.id.input_edit_text);
        mTranslateEditText = (EditText) findViewById(R.id.translate_edit_text);
        mSwapButton = (ImageButton) findViewById(R.id.swap_button);
        mSwapButton.setOnClickListener(this);
        mEnterButton = (ImageButton) findViewById(R.id.enter_button);
        mEnterButton.setOnClickListener(this);
        mClearButton = (ImageButton) findViewById(R.id.clear_button);
        mClearButton.setOnClickListener(this);
        mCopyButton = (ImageButton) findViewById(R.id.copy_button);
        mCopyButton.setOnClickListener(this);
        mPasteButton = (ImageButton) findViewById(R.id.paste_button);
        mPasteButton.setOnClickListener(this);
        mShareButton = (ImageButton) findViewById(R.id.share_button);
        mShareButton.setOnClickListener(this);
        setTextWatchers();
    }

    private void setTextWatchers() {
        mInputEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().isEmpty()) {
                    mEnterButton.setVisibility(View.GONE);
                    mClearButton.setVisibility(View.GONE);
                    mPasteButton.setVisibility(View.VISIBLE);
                } else {
                    mEnterButton.setVisibility(View.VISIBLE);
                    mClearButton.setVisibility(View.VISIBLE);
                    mPasteButton.setVisibility(View.GONE);
                }
            }
        });

        mTranslateEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().isEmpty()) {
                    mCopyButton.setVisibility(View.GONE);
                    mShareButton.setVisibility(View.GONE);
                } else {
                    mCopyButton.setVisibility(View.VISIBLE);
                    mShareButton.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private boolean isLandscapeMode() {
        int width = getWindowManager().getDefaultDisplay().getWidth();
        int height = getWindowManager().getDefaultDisplay().getHeight();

        boolean isLandscape = width > height;
//        if(isLandscape)
//            //mOrientation = "Альбомная";
//        else
//            //mOrientation = "Портретная";
        return isLandscape;
    }

    private void fillSpinner(Spinner spinner, List<String> elements) {
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, elements);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }
}
