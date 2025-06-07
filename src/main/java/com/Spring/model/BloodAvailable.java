package com.Spring.model;




public class BloodAvailable{
    private String bloodGroup;
    private int availableUnits;

    public BloodAvailable(String bloodGroup, int availableUnits) {
        this.bloodGroup = bloodGroup;
        this.availableUnits = availableUnits;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }
}
