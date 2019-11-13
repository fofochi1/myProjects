public class DemoHorses {
    public static void main(String[] args){
        RaceHorse horse = new RaceHorse();
        horse.setName("Mustang");
        horse.setColor("Brown");
        horse.setBirthYear(1993);
        horse.setRacesCompeted(15);

        System.out.println("Name of horse: " + horse.getName());
        System.out.println("Color of the horse: " + horse.getColor());
        System.out.println("Year of birth: " + horse.getBirthYear());
        System.out.println("Races Competed: " + horse.getRacesCompeted());

    }
}
