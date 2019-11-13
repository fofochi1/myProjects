public class PetSold extends ItemSold {
    private Boolean vaccinated;
    private Boolean neutered;
    private Boolean houseBroken;

    public void setVaccinated(Boolean vaccines) {
        this.vaccinated = vaccines;
    }
    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setNeutered(Boolean fixed){
        this.neutered = fixed;
    }
    public Boolean getNeutered(){
        return neutered;
    }

    public void setHouseBroken(Boolean house){
        this.houseBroken = house;
    }
    public Boolean getHouseBroken(){
        return houseBroken;
    }

}
