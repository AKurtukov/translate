package com.kurtukov.translate.network.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kurtukov.translate.network.IPendingResult;

import java.util.List;
import java.util.Objects;

public class LanguagesPendingResult implements IPendingResult {

    @SerializedName("dirs")
    @Expose
    private List<String> dirs = null; // Список поддерживаемых направлений перевода
    @SerializedName("langs")
    @Expose
    private LanguageGroup languageGroup; // Сущность группы поддерживаемых языков

    public List<String> getDirs() {
        return dirs;
    }

    public void setDirs(List<String> dirs) {
        this.dirs = dirs;
    }

    public LanguageGroup getLanguageGroup() {
        return languageGroup;
    }

    public void setLanguageGroup(LanguageGroup languageGroup) {
        this.languageGroup = languageGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguagesPendingResult that = (LanguagesPendingResult) o;
        return Objects.equals(dirs, that.dirs) &&
                Objects.equals(languageGroup, that.languageGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dirs, languageGroup);
    }

    @Override
    public String toString() {
        return "LanguagesPendingResult{" +
                "dirs=" + dirs +
                ", languageGroup=" + languageGroup +
                '}';
    }
}
