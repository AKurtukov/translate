package com.kurtukov.translate.network;

import android.net.Uri;

/**
 * Uri менеджер
 */
public class UriManager {
    private static final String LANGS = "langs";
    private static final String DETECT = "detect";
    private static final String TRANS = "trans";
    private static final String UI = "ui";
    private static final String TEXT = "text";
    private static final String LANG = "lang";

    /**
     * Генератор Uri с параметрами для - Получение списка поддерживаемых языков
     *
     * @param ui код языка
     * @return Uri
     */
    public static Uri getLangsUri(String ui) {
        return new UriConstructor().path(LANGS).path(UI, ui).build();
    }

    /**
     * Генератор Uri без параметров (общий) для - Получение списка поддерживаемых языков
     *
     * @return Uri
     */
    public static Uri getLangsUri() {
        return new UriConstructor().path(LANGS).build();
    }

    /**
     * Генератор Uri с параметрами для - Определение языка
     * Используя хэш для уменьшения длины ссылки (возможна коллизия)
     *
     * @param text Текст, язык которого требуется определить.
     * @return Uri
     */
    public static Uri getDetectUri(String text) {
        return new UriConstructor().path(DETECT).path(String.valueOf(text.hashCode())).build();
    }

    /**
     * Генератор Uri без параметров (общий) для - Определение языка
     *
     * @return Uri
     */
    public static Uri getDetectUri() {
        return new UriConstructor().path(DETECT).build();
    }

    /**
     * Генератор Uri с параметрами для - Перевод текста
     * Используя хэш для уменьшения длины ссылки (возможна коллизия)
     *
     * @param text Текст, который необходимо перевести.
     * @param lang Направление перевода.
     * @return Uri
     */
    public static Uri getTranslateUri(String text, String lang) {
        return new UriConstructor().path(TRANS).path(TEXT, String.valueOf(text.hashCode())).path(LANG, lang).build();
    }

    /**
     * Генератор Uri с параметрами для - Перевод текста
     *
     * @return Uri
     */
    public static Uri getTranslateUri() {
        return new UriConstructor().path(TRANS).build();
    }


    private static class UriConstructor {
        private static final String CONTENT = "content://";
        private static final String APP = "translate";
        private static final String EQUALLY = "=";
        private static final String SLASH = "/";
        StringBuilder mUri;

        UriConstructor() {
            mUri = new StringBuilder(CONTENT + APP);
        }

        UriConstructor path(String value) {
            mUri.append(SLASH + value);
            return this;
        }

        UriConstructor path(String key, String value) {
            mUri.append(SLASH + key + EQUALLY + value);
            return this;
        }


        Uri build() {
            return Uri.parse(mUri.toString());
        }
    }

}
