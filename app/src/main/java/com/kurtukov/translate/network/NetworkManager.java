package com.kurtukov.translate.network;

import android.support.annotation.NonNull;

/**
 * Менеджер работы с сетью
 */
public class NetworkManager implements INetworkManager {
    private ITranslateApiMapper mTranslateApiMapper;

    public NetworkManager(INetworkManager.OnPendingResultListener pendingResultListener) {
        mTranslateApiMapper = new TranslateApiMapper(pendingResultListener);
    }

    /**
     * Получение списка поддерживаемых языков
     *
     * @param ui Обязательный параметр. В ответе список поддерживаемых языков будет перечислен в поле langs вместе с расшифровкой кодов языков. Названия языков будут выведены на языке, код которого соответствует этому параметру.
     *           Все коды языков перечислены в списке поддерживаемых языков.
     */
    @Override
    public void getLanguages(@NonNull final String ui) {
        mTranslateApiMapper.getLangs(ui);
    }

    /**
     * Определение языка
     *
     * @param text Обязательный параметр.  Текст, язык которого требуется определить.
     *             Внимание! Для исходного текста обязательно используйте URL-кодировние.
     * @param hint Список наиболее вероятных языков (им будет отдаваться предпочтение при определении языка текста). Разделитель списка — запятая.
     */
    @Override
    public void detect(@NonNull final String text, final String hint) {
        mTranslateApiMapper.detect(text, hint);

    }

    /**
     * Перевод текста
     *
     * @param text    Текст, который необходимо перевести.
     *                Для POST-запросов максимальный размер передаваемого текста составляет 10 000 символов.
     * @param lang    Направление перевода.
     *                В виде пары кодов языков («с какого»-«на какой»), разделенных дефисом. Например, en-ru обозначает перевод с английского на русский.
     *                В виде кода конечного языка (например ru). В этом случае сервис пытается определить исходный язык автоматически.
     * @param format  Формат текста.
     *                Возможные значения:
     *                plain — текст без разметки (значение по умолчанию);
     *                html — текст в формате HTML.
     * @param options В настоящее время доступна единственная опция — признак включения в ответ автоматически определенного языка переводимого текста. Этому соответствует значение 1 этого параметра.
     */
    @Override
    public void translate(@NonNull final String text, final String lang, final String format, final String options) {
        mTranslateApiMapper.translate(text, lang, format, options);
    }

}
