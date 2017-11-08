package com.kurtukov.translate;

import com.kurtukov.translate.network.gson.LanguageGroup;
import com.kurtukov.translate.network.gson.LanguagesPendingResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Admin on 24.06.2017.
 */

public class LanguageUtils {

    private static final String DASH = "-";

    /**
     * Получение списка всех языков
     *
     * @param languageGroup Сущность группы поддерживаемых языков
     * @return Отсортированный список всех языков
     */
    public static List<String> getLanguageList(LanguageGroup languageGroup) {
        List<String> list = languageGroup.getAllLanguage();
        Collections.sort(list);
        return list;
    }

    /**
     * Получения списка кодов языков с которых возможен перевод
     *
     * @param dirs Список поддерживаемых направлений перевода
     * @return Список кодов языков с которых возможен перевод
     */
    public static List<String> getTranslateLanguageCodes(List<String> dirs) {
        List<String> languageCodes = new ArrayList<>();
        for (String codeToCode : dirs) {
            if (!languageCodes.contains(codeToCode.substring(0, codeToCode.indexOf(DASH)))) {
                languageCodes.add(codeToCode.substring(0, codeToCode.indexOf(DASH)));
            }
        }
        return languageCodes;
    }

    /**
     * Получения списка направлений переводов для указанного языка
     *
     * @param dirs         Список поддерживаемых направлений перевода
     * @param languageCode Код языка с которого будет осуществляться перевод
     * @return Список кодов языков на которые возможен перевод для указанного языка
     */
    public static List<String> getLanguagesOfTranslation(List<String> dirs, String languageCode) {
        List<String> languageCodes = new ArrayList<>();
        for (String codeToCode : dirs) {
            if (codeToCode.contains(DASH) && languageCode.equals(codeToCode.substring(0, codeToCode.indexOf(DASH)))) {
                languageCodes.add(codeToCode.substring(codeToCode.indexOf(DASH) + 1));
            }
        }
        return languageCodes;
    }

    /**
     * Преобразование списка кодов языков в отсортированный список имен языков
     *
     * @param languageGroup Сущность группы поддерживаемых языков
     * @param languageCodes Список из кодов языков
     * @return Отсортированный список имен языков
     */
    public static List<String> getLanguagesFromLanguageCodes(LanguageGroup languageGroup, List<String> languageCodes) {
        List<String> languages = new ArrayList<>();
        for (String code : languageCodes) {
            languages.add(languageGroup.getLanguageName(code));
        }
        Collections.sort(languages);
        return languages;
    }

    /**
     * Код языка с которого переводят
     *
     * @param codeToCode Направлений перевода
     * @return Код языка
     */
    public static String getFromLanguageCode(String codeToCode) {
        return codeToCode.substring(0, codeToCode.indexOf(DASH));
    }

    /**
     * Код языка на который переводят
     *
     * @param codeToCode Направлений перевода
     * @return Код языка
     */
    public static String getToLanguageCode(String codeToCode) {
        return codeToCode.substring(codeToCode.indexOf(DASH) + 1);
    }

    /**
     * Имя языка с которого переводят
     *
     * @param codeToCode    Направлений перевода
     * @param languageGroup Сущность группы поддерживаемых языков
     * @return Имя языка
     */
    public static String getFromLanguageName(LanguageGroup languageGroup, String codeToCode) {
        return languageGroup.getLanguageName(getFromLanguageCode(codeToCode));
    }

    /**
     * Имя языка на который переводят
     *
     * @param languageGroup Сущность группы поддерживаемых языков
     * @param codeToCode    Направлений перевода
     * @return Имя языка
     */
    public static String getToLanguageName(LanguageGroup languageGroup, String codeToCode) {
        return languageGroup.getLanguageName(getToLanguageCode(codeToCode));
    }

    /**
     * Получения списка имен языков с которых возможен перевод
     *
     * @param languagesPendingResult
     * @return Отсортированный список имен языков с которых возможен перевод
     */
    public static List<String> getLanguages(LanguagesPendingResult languagesPendingResult) {
        return getLanguagesFromLanguageCodes(languagesPendingResult.getLanguageGroup(), LanguageUtils.getTranslateLanguageCodes(languagesPendingResult.getDirs()));
    }

    /**
     * Получения списка имен языков с которых возможен перевод на указанный язык
     *
     * @param languagesPendingResult
     * @param languageCode           Код языка с которого будет осуществляться перевод
     * @return Отсортированный список имен языков с которых возможен перевод  на указанный язык
     */
    public static List<String> getLanguages(LanguagesPendingResult languagesPendingResult, String languageCode) {
        return getLanguagesFromLanguageCodes(languagesPendingResult.getLanguageGroup(), LanguageUtils.getLanguagesOfTranslation(languagesPendingResult.getDirs(), languageCode));
    }

    //соединяет 2 языка для перевода
    public static String get(LanguageGroup languageGroup, String fromLanguageName, String toLanguageName) {
        return languageGroup.getLanguageCode(fromLanguageName) + DASH + languageGroup.getLanguageCode(toLanguageName);
    }
}
