package org.example;

public class VatPham {
    private String name;

    private int chiSoSM;

    private float heSoSM;

    private int vang;

    public VatPham() {
    }

    public VatPham(String name, int vang, float heSoSM, int chiSoSM) {
        this.name = name;
        this.vang = vang;
        this.heSoSM = heSoSM;
        this.chiSoSM = chiSoSM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChiSoSM() {
        return chiSoSM;
    }

    public void setChiSoSM(int chiSoSM) {
        this.chiSoSM = chiSoSM;
    }

    public float getHeSoSM() {
        return heSoSM;
    }

    public void setHeSoSM(float heSoSM) {
        this.heSoSM = heSoSM;
    }

    public int getVang() {
        return vang;
    }

    public void setVang(int vang) {
        this.vang = vang;
    }

    @Override
    public String toString() {
        return "VatPham{" +
                "name='" + name + '\'' +
                ", chiSoSM=" + chiSoSM +
                ", heSoSM=" + heSoSM +
                ", vang=" + vang +
                '}';
    }

    public float SucCongPha(){
        return this.chiSoSM*heSoSM;
    }


}
