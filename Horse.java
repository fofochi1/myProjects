public class Horse {
    private String name;
    private String color;
    private int birthYear;


    public void setName(String firstName){
        this.name = firstName;
    }
    public String getName(){
        return name;
    }

    public void setColor(String colorName){
        this.color = colorName;
    }
    public String getColor(){
        return color;
    }

    public void setBirthYear(int year){
        this.birthYear = year;
    }
    public int getBirthYear() {
        return birthYear;
    }
}
