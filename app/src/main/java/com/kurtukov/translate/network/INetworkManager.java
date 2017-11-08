package com.kurtukov.translate.network;

import android.support.annotation.NonNull;

/**
 * Интерфейс Менеджер работы с сетью
 */
public interface INetworkManager {

    /**
     * Получение списка поддерживаемых языков
     *
     * @param ui    Обязательный параметр. В ответе список поддерживаемых языков будет перечислен в поле langs вместе с расшифровкой кодов языков. Названия языков будут выведены на языке, код которого соответствует этому параметру.
     *              Все коды языков перечислены в списке поддерживаемых языков.
     */
    void getLanguages(@NonNull String ui);

    /**
     * Определение языка
     *
     * @param text  Обязательный параметр.  Текст, язык которого требуется определить.
     *              Внимание! Для исходного текста обязательно используйте URL-кодировние.
     * @param hint  Список наиболее вероятных языков (им будет отдаваться предпочтение при определении языка текста). Разделитель списка — запятая.
     */
    void detect(@NonNull String text, String hint);

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
    void translate(String text, String lang, String format, String options);

//    /**
//     * Запрос данных из кэша
//     *
//     * @param uri Обязательный параметр. Нужен для  возврата результата
//     * @return IPendingResult
//     */
//    IPendingResult findResult(@NonNull Uri uri);

    interface OnPendingResultListener {

        void onResult(IPendingResult pendingResult);

        void onError(Throwable throwable);
    }
}
