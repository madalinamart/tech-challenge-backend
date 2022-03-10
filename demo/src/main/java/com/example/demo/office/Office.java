package com.example.demo.office;

public class Office {
    String OfficeBuilding;
    Long OfficeId;
    int OfficeFloorNr;
    String OfficeName;
    Boolean OfficeVacancy;


    public Office() {
    }

    public Office(String officeBuilding, int officeFloorNr, String officeName, Boolean officeVacancy) {
        OfficeBuilding = officeBuilding;
        OfficeFloorNr = officeFloorNr;
        OfficeName = officeName;
        OfficeVacancy = officeVacancy;
    }

    public Office(String officeBuilding, Long officeId, int officeFloorNr, String officeName, Boolean officeVacancy) {
        OfficeBuilding = officeBuilding;
        OfficeId = officeId;
        OfficeFloorNr = officeFloorNr;
        OfficeName = officeName;
        OfficeVacancy = officeVacancy;
    }

    @Override
    public String toString() {
        return "Office{" +
                "OfficeBuilding='" + OfficeBuilding + '\'' +
                ", OfficeId=" + OfficeId +
                ", OfficeFloorNr=" + OfficeFloorNr +
                ", OfficeName='" + OfficeName + '\'' +
                ", OfficeVacancy=" + OfficeVacancy +
                '}';
    }

    public String getOfficeBuilding() {
        return OfficeBuilding;
    }

    public void setOfficeBuilding(String officeBuilding) {
        OfficeBuilding = officeBuilding;
    }

    public Long getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Long officeId) {
        OfficeId = officeId;
    }

    public int getOfficeFloorNr() {
        return OfficeFloorNr;
    }

    public void setOfficeFloorNr(int officeFloorNr) {
        OfficeFloorNr = officeFloorNr;
    }

    public String getOfficeName() {
        return OfficeName;
    }

    public void setOfficeName(String officeName) {
        OfficeName = officeName;
    }

    public Boolean getOfficeVacancy() {
        return OfficeVacancy;
    }

    public void setOfficeVacancy(Boolean officeVacancy) {
        OfficeVacancy = officeVacancy;
    }
}
