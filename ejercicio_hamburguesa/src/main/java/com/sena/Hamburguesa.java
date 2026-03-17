package com.sena;
public class Hamburguesa {

    private String pan;
    private String carne1;
    private String carne2;
    private String queso;
    private String tomate;
    private String lechuga;
    private String salsa;

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        if (pan.equalsIgnoreCase("Brioche") || pan.equalsIgnoreCase("Ajonjoli")) {
            this.pan = pan;
        } else {
            System.out.println("Solo hay pan Brioche o Ajonjoli");
        }
    }

    public String getCarne1() {
        return carne1;
    }

    public void setCarne1(String carne1) {
        this.carne1 = carne1;
    }

    public String getCarne2() {
        return carne2;
    }

    public void setCarne2(String carne2) {
        this.carne2 = carne2;
    }

    public String getQueso() {
        return queso;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public String getTomate() {
        return tomate;
    }

    public void setTomate(String tomate) {
        this.tomate = tomate;
    }

    public String getLechuga() {
        return lechuga;
    }

    public void setLechuga(String lechuga) {
        this.lechuga = lechuga;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
    
}