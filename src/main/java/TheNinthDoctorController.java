import com.google.inject.Inject;

public class TheNinthDoctorController {
    @Inject
    private INinthDoctor doctor;

    public void getDoctorData() {
        System.out.println("Actor is " + doctor.getName());
        System.out.println("Companions: " + doctor.getCompanionName());
        System.out.println("Enemies: " + doctor.getEnimmiesName());
        System.out.println("Screwdriver's version is " + doctor.getScrewdriverVersion());
        System.out.println("He usually cry: " + doctor.getFavoriteWord());
        System.out.println();
    }
}
