package com.kurtukov.translate.network;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/**
 * Класс следитель результата асинхронной операции на UI (активити)
 */

public class TranslateContentObserver extends ContentObserver {
    private ITranslateContentListener mListener;

    public TranslateContentObserver(ITranslateContentListener listener) {
        super(new Handler());
        mListener = listener;
    }

    @Override
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override
    public void onChange(boolean selfChange) {
        this.onChange(selfChange, null);
    }

    @Override
    public void onChange(boolean selfChange, Uri uri) {
        if(mListener!= null)
            mListener.onChange(uri);
    }
}
