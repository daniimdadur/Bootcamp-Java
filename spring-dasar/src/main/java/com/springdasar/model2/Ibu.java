package com.springdasar.model2;

public class Ibu {
    private String name;
    private String tl;
    private String alamat;
    private String pekerjaan;
    private Integer penghasilan;
    private String namaAyah;
    private String namaIbu;
    private Integer anakke;

    public Ibu(String name, String tl, String alamat, String pekerjaan, Integer penghasilan, String namaAyah, String namaIbu, Integer anakke) {
        this.name = name;
        this.tl = tl;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.penghasilan = penghasilan;
        this.namaAyah = namaAyah;
        this.namaIbu = namaIbu;
        this.anakke = anakke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getTl() {
        return tl;
    }

    public void setTl(String tl) {
        this.tl = tl;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public Integer getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(Integer penghasilan) {
        this.penghasilan = penghasilan;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }

    public Integer getAnakke() {
        return anakke;
    }

    public void setAnakke(Integer anakke) {
        this.anakke = anakke;
    }
}