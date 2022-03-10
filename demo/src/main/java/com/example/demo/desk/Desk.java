package com.example.demo.desk;

public class Desk {
    Long DeskId;
    String DeskOffice;
    boolean DeskVacancy;

    public Desk(Long deskId, String deskOffice, boolean deskVacancy) {
        DeskId = deskId;
        DeskOffice = deskOffice;
        DeskVacancy = deskVacancy;
    }

    public Desk() {
    }

    public Desk(String deskOffice, boolean deskVacancy) {
        DeskOffice = deskOffice;
        DeskVacancy = deskVacancy;
    }

    public Long getDeskId() {
        return DeskId;
    }

    public void setDeskId(Long deskId) {
        DeskId = deskId;
    }

    public String getDeskOffice() {
        return DeskOffice;
    }

    public void setDeskOffice(String deskOffice) {
        DeskOffice = deskOffice;
    }

    public boolean isDeskVacancy() {
        return DeskVacancy;
    }

    public void setDeskVacancy(boolean deskVacancy) {
        DeskVacancy = deskVacancy;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "DeskId=" + DeskId +
                ", DeskOffice='" + DeskOffice + '\'' +
                ", DeskVacancy=" + DeskVacancy +
                '}';
    }
}
