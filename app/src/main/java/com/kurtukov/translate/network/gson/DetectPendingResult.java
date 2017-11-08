package com.kurtukov.translate.network.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kurtukov.translate.network.IPendingResult;

import java.util.Objects;

public class DetectPendingResult implements IPendingResult {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("lang")
    @Expose
    private String language;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetectPendingResult that = (DetectPendingResult) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, language);
    }

    @Override
    public String toString() {
        return "DetectPendingResult{" +
                "code=" + code +
                ", language='" + language + '\'' +
                '}';
    }
}
