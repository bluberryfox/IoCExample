import com.google.inject.Inject;

public class TheDalekController {
        @Inject
        private IDalek dalek;
        public void getDalekData() {
            System.out.println("Name is " + dalek.getName());
            System.out.println("Vulnerability: " + dalek.getVulnerability());
            System.out.println("Enemies: " + dalek.getEnemiesName());
            System.out.println("Age: " + dalek.getAge());
            System.out.println("He usually cry: " + dalek.getFavoriteWord());
            System.out.println();
        }
    }

