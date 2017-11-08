package com.kurtukov.translate.parser;

import com.kurtukov.alexander.translate.R;
import com.kurtukov.translate.network.gson.Detected;
import com.kurtukov.translate.network.gson.TranslatePendingResult;

import java.util.ArrayList;
import java.util.List;

/**
 * @author A.Kurtukov
 */

public class RussianNameTest extends BaseParserTest {

    static TranslatePendingResult createRussianName() {
        TranslatePendingResult translatePendingResult = new TranslatePendingResult();
        translatePendingResult.setCode(123);
        translatePendingResult.setLang("en-ru");
        List<String> text = new ArrayList<>();
        text.add("Здравствуй, Мир!");
        translatePendingResult.setText(text);
        return translatePendingResult;
    }

    public void testParsePayment() throws Exception {
        String stringPOJO = "{\n" +
                "    \"code\": 123,\n" +
                "    \"lang\": \"en-ru\",\n" +
                "    \"text\": [\n" +
                "        \"Здравствуй, Мир!\"\n" +
                "    ]\n" +
                "}";

        testParse(stringPOJO, createRussianName(), TranslatePendingResult.class);
    }
}