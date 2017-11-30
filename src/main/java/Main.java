import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());
        TheNinthDoctorController nineDoctor = injector.getInstance(TheNinthDoctorController.class);
        TheDalekController dalek = injector.getInstance(TheDalekController.class);// и тут данные инжектятся
        nineDoctor.getDoctorData();
        dalek.getDalekData();
        System.out.println(getFight(nineDoctor, dalek));
    }
    public static String getFight(TheNinthDoctorController doctor, TheDalekController dalek) {
        return "Doctor winner, of course";
    }
}
