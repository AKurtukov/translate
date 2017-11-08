package com.kurtukov.translate.network;


import android.net.Uri;

/**
 * Интерфейс слушателя результата асинхронной операции
 * Передается в качестве параметра для TranslateContentObserver
 */
public interface ITranslateContentListener {
    void onChange(Uri uri);
}

