package com.kurtukov.translate.parser;

import android.app.Instrumentation;
import android.support.annotation.RawRes;
import android.test.InstrumentationTestCase;

import com.google.gson.Gson;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public abstract class BaseParserTest extends InstrumentationTestCase {

    protected Instrumentation mInstrumentation;
    Gson mGson = new Gson();

    @Override
    public void setUp() {
        mInstrumentation = getInstrumentation();
        mGson = new Gson();
    }

    protected <T> void testParse(String string, T expected, Class<T> clazz) throws Exception {
        InputStream source = null;
        try {
            T actual = mGson.fromJson(string, clazz);
            assertThat(actual, is(expected));
        } finally {
            if (source != null) {
                try {
                    source.close();
                } catch (IOException ex) {
                }
            }
        }
    }


    public static InputStream openRawResource(Instrumentation instrumentation, @RawRes int rawResId) {
        return instrumentation.getContext().getResources().openRawResource(rawResId);
    }
}
