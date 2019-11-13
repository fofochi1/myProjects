public class DemoItemsAndPets {
    public static void main (String [] args){
        PetSold pet1 = new PetSold();
        pet1.setInvoiceNumber(50);
        pet1.setDescription("German Shepard");
        pet1.setPrice(500);
        pet1.setVaccinated(true);
        pet1.setNeutered(false);
        pet1.setHouseBroken(true);
        System.out.println("Invoice Number: " + pet1.getInvoiceNumber());
        System.out.println("Description of Dog: " + pet1.getDescription());
        System.out.println("Price of Dog: $" + pet1.getPrice());
        System.out.println("Dog is Vaccinated: " + pet1.getVaccinated());
        System.out.println("Dog is Neutered: " + pet1.getNeutered());
        System.out.println("Dog is Housebroken: " + pet1.getHouseBroken());
        System.out.println();

        PetSold pet2 = new PetSold();
        pet2.setInvoiceNumber(59);
        pet2.setDescription("Golden Lab");
        pet2.setPrice(399);
        pet2.setVaccinated(true);
        pet2.setNeutered(false);
        pet2.setHouseBroken(false);
        System.out.println("Invoice Number: " + pet2.getInvoiceNumber());
        System.out.println("Description of Dog: " + pet2.getDescription());
        System.out.println("Price of Dog: $" + pet2.getPrice());
        System.out.println("Dog is Vaccinated: " + pet2.getVaccinated());
        System.out.println("Dog is Neutered: " + pet2.getNeutered());
        System.out.println("Dog is Housebroken: " + pet2.getHouseBroken());
    }
}
