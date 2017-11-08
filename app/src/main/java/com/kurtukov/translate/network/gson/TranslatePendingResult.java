package com.kurtukov.translate.network.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kurtukov.translate.network.IPendingResult;

import java.util.List;
import java.util.Objects;

public class TranslatePendingResult  implements IPendingResult {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("detected")
    @Expose
    private Detected detected;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("text")
    @Expose
    private List<String> text = null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Detected getDetected() {
        return detected;
    }

    public void setDetected(Detected detected) {
        this.detected = detected;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TranslatePendingResult translatePendingResult = (TranslatePendingResult) o;
        return Objects.equals(code, translatePendingResult.code) &&
                Objects.equals(detected, translatePendingResult.detected) &&
                Objects.equals(lang, translatePendingResult.lang) &&
                Objects.equals(text, translatePendingResult.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, detected, lang, text);
    }

    @Override
    public String toString() {
        return "TranslatePendingResult{" +
                "code=" + code +
                ", detected=" + detected +
                ", lang='" + lang + '\'' +
                ", text=" + text +
                '}';
    }
}