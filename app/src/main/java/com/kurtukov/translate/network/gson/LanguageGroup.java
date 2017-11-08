package com.kurtukov.translate.network.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Сущность группы поддерживаемых языков
 */
public class LanguageGroup {
    @SerializedName("af")
    @Expose
    private String af;
    @SerializedName("am")
    @Expose
    private String am;
    @SerializedName("ar")
    @Expose
    private String ar;
    @SerializedName("az")
    @Expose
    private String az;
    @SerializedName("ba")
    @Expose
    private String ba;
    @SerializedName("be")
    @Expose
    private String be;
    @SerializedName("bg")
    @Expose
    private String bg;
    @SerializedName("bn")
    @Expose
    private String bn;
    @SerializedName("bs")
    @Expose
    private String bs;
    @SerializedName("ca")
    @Expose
    private String ca;
    @SerializedName("ceb")
    @Expose
    private String ceb;
    @SerializedName("cs")
    @Expose
    private String cs;
    @SerializedName("cy")
    @Expose
    private String cy;
    @SerializedName("da")
    @Expose
    private String da;
    @SerializedName("de")
    @Expose
    private String de;
    @SerializedName("el")
    @Expose
    private String el;
    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("eo")
    @Expose
    private String eo;
    @SerializedName("es")
    @Expose
    private String es;
    @SerializedName("et")
    @Expose
    private String et;
    @SerializedName("eu")
    @Expose
    private String eu;
    @SerializedName("fa")
    @Expose
    private String fa;
    @SerializedName("fi")
    @Expose
    private String fi;
    @SerializedName("fr")
    @Expose
    private String fr;
    @SerializedName("ga")
    @Expose
    private String ga;
    @SerializedName("gd")
    @Expose
    private String gd;
    @SerializedName("gl")
    @Expose
    private String gl;
    @SerializedName("gu")
    @Expose
    private String gu;
    @SerializedName("he")
    @Expose
    private String he;
    @SerializedName("hi")
    @Expose
    private String hi;
    @SerializedName("hr")
    @Expose
    private String hr;
    @SerializedName("ht")
    @Expose
    private String ht;
    @SerializedName("hu")
    @Expose
    private String hu;
    @SerializedName("hy")
    @Expose
    private String hy;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is")
    @Expose
    private String is;
    @SerializedName("it")
    @Expose
    private String it;
    @SerializedName("ja")
    @Expose
    private String ja;
    @SerializedName("jv")
    @Expose
    private String jv;
    @SerializedName("ka")
    @Expose
    private String ka;
    @SerializedName("kk")
    @Expose
    private String kk;
    @SerializedName("km")
    @Expose
    private String km;
    @SerializedName("kn")
    @Expose
    private String kn;
    @SerializedName("ko")
    @Expose
    private String ko;
    @SerializedName("ky")
    @Expose
    private String ky;
    @SerializedName("la")
    @Expose
    private String la;
    @SerializedName("lb")
    @Expose
    private String lb;
    @SerializedName("lo")
    @Expose
    private String lo;
    @SerializedName("lt")
    @Expose
    private String lt;
    @SerializedName("lv")
    @Expose
    private String lv;
    @SerializedName("mg")
    @Expose
    private String mg;
    @SerializedName("mhr")
    @Expose
    private String mhr;
    @SerializedName("mi")
    @Expose
    private String mi;
    @SerializedName("mk")
    @Expose
    private String mk;
    @SerializedName("ml")
    @Expose
    private String ml;
    @SerializedName("mn")
    @Expose
    private String mn;
    @SerializedName("mr")
    @Expose
    private String mr;
    @SerializedName("mrj")
    @Expose
    private String mrj;
    @SerializedName("ms")
    @Expose
    private String ms;
    @SerializedName("mt")
    @Expose
    private String mt;
    @SerializedName("my")
    @Expose
    private String my;
    @SerializedName("ne")
    @Expose
    private String ne;
    @SerializedName("nl")
    @Expose
    private String nl;
    @SerializedName("no")
    @Expose
    private String no;
    @SerializedName("pa")
    @Expose
    private String pa;
    @SerializedName("pap")
    @Expose
    private String pap;
    @SerializedName("pl")
    @Expose
    private String pl;
    @SerializedName("pt")
    @Expose
    private String pt;
    @SerializedName("ro")
    @Expose
    private String ro;
    @SerializedName("ru")
    @Expose
    private String ru;
    @SerializedName("si")
    @Expose
    private String si;
    @SerializedName("sk")
    @Expose
    private String sk;
    @SerializedName("sl")
    @Expose
    private String sl;
    @SerializedName("sq")
    @Expose
    private String sq;
    @SerializedName("sr")
    @Expose
    private String sr;
    @SerializedName("su")
    @Expose
    private String su;
    @SerializedName("sv")
    @Expose
    private String sv;
    @SerializedName("sw")
    @Expose
    private String sw;
    @SerializedName("ta")
    @Expose
    private String ta;
    @SerializedName("te")
    @Expose
    private String te;
    @SerializedName("tg")
    @Expose
    private String tg;
    @SerializedName("th")
    @Expose
    private String th;
    @SerializedName("tl")
    @Expose
    private String tl;
    @SerializedName("tr")
    @Expose
    private String tr;
    @SerializedName("tt")
    @Expose
    private String tt;
    @SerializedName("udm")
    @Expose
    private String udm;
    @SerializedName("uk")
    @Expose
    private String uk;
    @SerializedName("ur")
    @Expose
    private String ur;
    @SerializedName("uz")
    @Expose
    private String uz;
    @SerializedName("vi")
    @Expose
    private String vi;
    @SerializedName("xh")
    @Expose
    private String xh;
    @SerializedName("yi")
    @Expose
    private String yi;
    @SerializedName("zh")
    @Expose
    private String zh;

    private Map<String, String> mLanguageMap;

    private void generateLanguageMap() {
        mLanguageMap = new HashMap<>();
        mLanguageMap.put("af", af);
        mLanguageMap.put("am", am);
        mLanguageMap.put("ar", ar);
        mLanguageMap.put("az", az);
        mLanguageMap.put("ba", ba);
        mLanguageMap.put("be", be);
        mLanguageMap.put("bg", bg);
        mLanguageMap.put("bn", bn);
        mLanguageMap.put("bs", bs);
        mLanguageMap.put("ca", ca);
        mLanguageMap.put("ceb", ceb);
        mLanguageMap.put("cs", cs);
        mLanguageMap.put("cy", cy);
        mLanguageMap.put("da", da);
        mLanguageMap.put("de", de);
        mLanguageMap.put("el", el);
        mLanguageMap.put("en", en);
        mLanguageMap.put("eo", eo);
        mLanguageMap.put("es", es);
        mLanguageMap.put("et", et);
        mLanguageMap.put("eu", eu);
        mLanguageMap.put("fa", fa);
        mLanguageMap.put("fi", fi);
        mLanguageMap.put("fr", fr);
        mLanguageMap.put("ga", ga);
        mLanguageMap.put("gd", gd);
        mLanguageMap.put("gl", gl);
        mLanguageMap.put("gu", gu);
        mLanguageMap.put("he", he);
        mLanguageMap.put("hi", hi);
        mLanguageMap.put("hr", hr);
        mLanguageMap.put("ht", ht);
        mLanguageMap.put("hu", hu);
        mLanguageMap.put("hy", hy);
        mLanguageMap.put("id", id);
        mLanguageMap.put("is", is);
        mLanguageMap.put("it", it);
        mLanguageMap.put("ja", ja);
        mLanguageMap.put("jv", jv);
        mLanguageMap.put("ka", ka);
        mLanguageMap.put("kk", kk);
        mLanguageMap.put("km", km);
        mLanguageMap.put("kn", kn);
        mLanguageMap.put("ko", ko);
        mLanguageMap.put("ky", ky);
        mLanguageMap.put("la", la);
        mLanguageMap.put("lb", lb);
        mLanguageMap.put("lo", lo);
        mLanguageMap.put("lt", lt);
        mLanguageMap.put("lv", lv);
        mLanguageMap.put("mg", mg);
        mLanguageMap.put("mhr", mhr);
        mLanguageMap.put("mi", mi);
        mLanguageMap.put("mk", mk);
        mLanguageMap.put("ml", ml);
        mLanguageMap.put("mn", mn);
        mLanguageMap.put("mr", mr);
        mLanguageMap.put("mrj", mrj);
        mLanguageMap.put("ms", ms);
        mLanguageMap.put("mt", mt);
        mLanguageMap.put("my", my);
        mLanguageMap.put("ne", ne);
        mLanguageMap.put("nl", nl);
        mLanguageMap.put("no", no);
        mLanguageMap.put("pa", pa);
        mLanguageMap.put("pap", pap);
        mLanguageMap.put("pl", pl);
        mLanguageMap.put("pt", pt);
        mLanguageMap.put("ro", ro);
        mLanguageMap.put("ru", ru);
        mLanguageMap.put("si", si);
        mLanguageMap.put("sk", sk);
        mLanguageMap.put("sl", sl);
        mLanguageMap.put("sq", sq);
        mLanguageMap.put("sr", sr);
        mLanguageMap.put("su", su);
        mLanguageMap.put("sv", sv);
        mLanguageMap.put("sw", sw);
        mLanguageMap.put("ta", ta);
        mLanguageMap.put("te", te);
        mLanguageMap.put("tg", tg);
        mLanguageMap.put("th", th);
        mLanguageMap.put("tl", tl);
        mLanguageMap.put("tr", tr);
        mLanguageMap.put("tt", tt);
        mLanguageMap.put("udm", udm);
        mLanguageMap.put("uk", uk);
        mLanguageMap.put("ur", ur);
        mLanguageMap.put("uz", uz);
        mLanguageMap.put("vi", vi);
        mLanguageMap.put("xh", xh);
        mLanguageMap.put("yi", yi);
        mLanguageMap.put("zh", zh);
    }

    public String getLanguageName(String code) {
        if (mLanguageMap != null) {
            return mLanguageMap.get(code);
        } else {
            generateLanguageMap();
            return mLanguageMap.get(code);
        }
    }

    public String getLanguageCode(String name){
        for (Map.Entry<String, String> entry : mLanguageMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                return entry.getKey();
            }
        }
        return null;
    }


    public List<String> getAllLanguage() {
        if (mLanguageMap == null) {
            generateLanguageMap();
        }
        return new ArrayList<>(mLanguageMap.values());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguageGroup languageGroup = (LanguageGroup) o;
        return Objects.equals(af, languageGroup.af) &&
                Objects.equals(am, languageGroup.am) &&
                Objects.equals(ar, languageGroup.ar) &&
                Objects.equals(az, languageGroup.az) &&
                Objects.equals(ba, languageGroup.ba) &&
                Objects.equals(be, languageGroup.be) &&
                Objects.equals(bg, languageGroup.bg) &&
                Objects.equals(bn, languageGroup.bn) &&
                Objects.equals(bs, languageGroup.bs) &&
                Objects.equals(ca, languageGroup.ca) &&
                Objects.equals(ceb, languageGroup.ceb) &&
                Objects.equals(cs, languageGroup.cs) &&
                Objects.equals(cy, languageGroup.cy) &&
                Objects.equals(da, languageGroup.da) &&
                Objects.equals(de, languageGroup.de) &&
                Objects.equals(el, languageGroup.el) &&
                Objects.equals(en, languageGroup.en) &&
                Objects.equals(eo, languageGroup.eo) &&
                Objects.equals(es, languageGroup.es) &&
                Objects.equals(et, languageGroup.et) &&
                Objects.equals(eu, languageGroup.eu) &&
                Objects.equals(fa, languageGroup.fa) &&
                Objects.equals(fi, languageGroup.fi) &&
                Objects.equals(fr, languageGroup.fr) &&
                Objects.equals(ga, languageGroup.ga) &&
                Objects.equals(gd, languageGroup.gd) &&
                Objects.equals(gl, languageGroup.gl) &&
                Objects.equals(gu, languageGroup.gu) &&
                Objects.equals(he, languageGroup.he) &&
                Objects.equals(hi, languageGroup.hi) &&
                Objects.equals(hr, languageGroup.hr) &&
                Objects.equals(ht, languageGroup.ht) &&
                Objects.equals(hu, languageGroup.hu) &&
                Objects.equals(hy, languageGroup.hy) &&
                Objects.equals(id, languageGroup.id) &&
                Objects.equals(is, languageGroup.is) &&
                Objects.equals(it, languageGroup.it) &&
                Objects.equals(ja, languageGroup.ja) &&
                Objects.equals(jv, languageGroup.jv) &&
                Objects.equals(ka, languageGroup.ka) &&
                Objects.equals(kk, languageGroup.kk) &&
                Objects.equals(km, languageGroup.km) &&
                Objects.equals(kn, languageGroup.kn) &&
                Objects.equals(ko, languageGroup.ko) &&
                Objects.equals(ky, languageGroup.ky) &&
                Objects.equals(la, languageGroup.la) &&
                Objects.equals(lb, languageGroup.lb) &&
                Objects.equals(lo, languageGroup.lo) &&
                Objects.equals(lt, languageGroup.lt) &&
                Objects.equals(lv, languageGroup.lv) &&
                Objects.equals(mg, languageGroup.mg) &&
                Objects.equals(mhr, languageGroup.mhr) &&
                Objects.equals(mi, languageGroup.mi) &&
                Objects.equals(mk, languageGroup.mk) &&
                Objects.equals(ml, languageGroup.ml) &&
                Objects.equals(mn, languageGroup.mn) &&
                Objects.equals(mr, languageGroup.mr) &&
                Objects.equals(mrj, languageGroup.mrj) &&
                Objects.equals(ms, languageGroup.ms) &&
                Objects.equals(mt, languageGroup.mt) &&
                Objects.equals(my, languageGroup.my) &&
                Objects.equals(ne, languageGroup.ne) &&
                Objects.equals(nl, languageGroup.nl) &&
                Objects.equals(no, languageGroup.no) &&
                Objects.equals(pa, languageGroup.pa) &&
                Objects.equals(pap, languageGroup.pap) &&
                Objects.equals(pl, languageGroup.pl) &&
                Objects.equals(pt, languageGroup.pt) &&
                Objects.equals(ro, languageGroup.ro) &&
                Objects.equals(ru, languageGroup.ru) &&
                Objects.equals(si, languageGroup.si) &&
                Objects.equals(sk, languageGroup.sk) &&
                Objects.equals(sl, languageGroup.sl) &&
                Objects.equals(sq, languageGroup.sq) &&
                Objects.equals(sr, languageGroup.sr) &&
                Objects.equals(su, languageGroup.su) &&
                Objects.equals(sv, languageGroup.sv) &&
                Objects.equals(sw, languageGroup.sw) &&
                Objects.equals(ta, languageGroup.ta) &&
                Objects.equals(te, languageGroup.te) &&
                Objects.equals(tg, languageGroup.tg) &&
                Objects.equals(th, languageGroup.th) &&
                Objects.equals(tl, languageGroup.tl) &&
                Objects.equals(tr, languageGroup.tr) &&
                Objects.equals(tt, languageGroup.tt) &&
                Objects.equals(udm, languageGroup.udm) &&
                Objects.equals(uk, languageGroup.uk) &&
                Objects.equals(ur, languageGroup.ur) &&
                Objects.equals(uz, languageGroup.uz) &&
                Objects.equals(vi, languageGroup.vi) &&
                Objects.equals(xh, languageGroup.xh) &&
                Objects.equals(yi, languageGroup.yi) &&
                Objects.equals(zh, languageGroup.zh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(af, am, ar, az, ba, be, bg, bn, bs, ca, ceb, cs, cy, da, de, el, en, eo, es, et, eu, fa, fi, fr, ga, gd, gl, gu, he, hi, hr, ht, hu, hy, id, is, it, ja, jv, ka, kk, km, kn, ko, ky, la, lb, lo, lt, lv, mg, mhr, mi, mk, ml, mn, mr, mrj, ms, mt, my, ne, nl, no, pa, pap, pl, pt, ro, ru, si, sk, sl, sq, sr, su, sv, sw, ta, te, tg, th, tl, tr, tt, udm, uk, ur, uz, vi, xh, yi, zh);
    }

    @Override
    public String toString() {
        return "LanguageGroup{" +
                "af='" + af + '\'' +
                ", am='" + am + '\'' +
                ", ar='" + ar + '\'' +
                ", az='" + az + '\'' +
                ", ba='" + ba + '\'' +
                ", be='" + be + '\'' +
                ", bg='" + bg + '\'' +
                ", bn='" + bn + '\'' +
                ", bs='" + bs + '\'' +
                ", ca='" + ca + '\'' +
                ", ceb='" + ceb + '\'' +
                ", cs='" + cs + '\'' +
                ", cy='" + cy + '\'' +
                ", da='" + da + '\'' +
                ", de='" + de + '\'' +
                ", el='" + el + '\'' +
                ", en='" + en + '\'' +
                ", eo='" + eo + '\'' +
                ", es='" + es + '\'' +
                ", et='" + et + '\'' +
                ", eu='" + eu + '\'' +
                ", fa='" + fa + '\'' +
                ", fi='" + fi + '\'' +
                ", fr='" + fr + '\'' +
                ", ga='" + ga + '\'' +
                ", gd='" + gd + '\'' +
                ", gl='" + gl + '\'' +
                ", gu='" + gu + '\'' +
                ", he='" + he + '\'' +
                ", hi='" + hi + '\'' +
                ", hr='" + hr + '\'' +
                ", ht='" + ht + '\'' +
                ", hu='" + hu + '\'' +
                ", hy='" + hy + '\'' +
                ", id='" + id + '\'' +
                ", is='" + is + '\'' +
                ", it='" + it + '\'' +
                ", ja='" + ja + '\'' +
                ", jv='" + jv + '\'' +
                ", ka='" + ka + '\'' +
                ", kk='" + kk + '\'' +
                ", km='" + km + '\'' +
                ", kn='" + kn + '\'' +
                ", ko='" + ko + '\'' +
                ", ky='" + ky + '\'' +
                ", la='" + la + '\'' +
                ", lb='" + lb + '\'' +
                ", lo='" + lo + '\'' +
                ", lt='" + lt + '\'' +
                ", lv='" + lv + '\'' +
                ", mg='" + mg + '\'' +
                ", mhr='" + mhr + '\'' +
                ", mi='" + mi + '\'' +
                ", mk='" + mk + '\'' +
                ", ml='" + ml + '\'' +
                ", mn='" + mn + '\'' +
                ", mr='" + mr + '\'' +
                ", mrj='" + mrj + '\'' +
                ", ms='" + ms + '\'' +
                ", mt='" + mt + '\'' +
                ", my='" + my + '\'' +
                ", ne='" + ne + '\'' +
                ", nl='" + nl + '\'' +
                ", no='" + no + '\'' +
                ", pa='" + pa + '\'' +
                ", pap='" + pap + '\'' +
                ", pl='" + pl + '\'' +
                ", pt='" + pt + '\'' +
                ", ro='" + ro + '\'' +
                ", ru='" + ru + '\'' +
                ", si='" + si + '\'' +
                ", sk='" + sk + '\'' +
                ", sl='" + sl + '\'' +
                ", sq='" + sq + '\'' +
                ", sr='" + sr + '\'' +
                ", su='" + su + '\'' +
                ", sv='" + sv + '\'' +
                ", sw='" + sw + '\'' +
                ", ta='" + ta + '\'' +
                ", te='" + te + '\'' +
                ", tg='" + tg + '\'' +
                ", th='" + th + '\'' +
                ", tl='" + tl + '\'' +
                ", tr='" + tr + '\'' +
                ", tt='" + tt + '\'' +
                ", udm='" + udm + '\'' +
                ", uk='" + uk + '\'' +
                ", ur='" + ur + '\'' +
                ", uz='" + uz + '\'' +
                ", vi='" + vi + '\'' +
                ", xh='" + xh + '\'' +
                ", yi='" + yi + '\'' +
                ", zh='" + zh + '\'' +
                '}';
    }
}
