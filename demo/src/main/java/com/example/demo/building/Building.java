package com.example.demo.building;

public class Building {
    private Long IdBuilding;
    private String BuildingName;
    private String BuildingAdress;
    private int NumberOfFloors;
    private int NumberOfOffices;

    public Building(Long idBuilding, String buildingName, String buildingAdress, int numberOfFloors, int numberOfOffices) {
        IdBuilding = idBuilding;
        BuildingName = buildingName;
        BuildingAdress = buildingAdress;
        NumberOfFloors = numberOfFloors;
        NumberOfOffices = numberOfOffices;
    }

    public Building() {
    }

    public Building(String buildingName, String buildingAdress, int numberOfFloors, int numberOfOffices) {
        BuildingName = buildingName;
        BuildingAdress = buildingAdress;
        NumberOfFloors = numberOfFloors;
        NumberOfOffices = numberOfOffices;
    }

    public Long getIdBuilding() {
        return IdBuilding;
    }

    public void setIdBuilding(Long idBuilding) {
        IdBuilding = idBuilding;
    }

    public String getBuildingName() {
        return BuildingName;
    }

    public void setBuildingName(String buildingName) {
        BuildingName = buildingName;
    }

    public String getBuildingAdress() {
        return BuildingAdress;
    }

    public void setBuildingAdress(String buildingAdress) {
        BuildingAdress = buildingAdress;
    }

    public int getNumberOfFloors() {
        return NumberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        NumberOfFloors = numberOfFloors;
    }

    public int getNumberOfOffices() {
        return NumberOfOffices;
    }

    public void setNumberOfOffices(int numberOfOffices) {
        NumberOfOffices = numberOfOffices;
    }

    @Override
    public String toString() {
        return "Building{" +
                "IdBuilding=" + IdBuilding +
                ", BuildingName='" + BuildingName + '\'' +
                ", BuildingAdress='" + BuildingAdress + '\'' +
                ", NumberOfFloors=" + NumberOfFloors +
                ", NumberOfOffices=" + NumberOfOffices +
                '}';
    }
}
