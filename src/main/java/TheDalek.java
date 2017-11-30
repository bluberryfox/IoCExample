import javax.inject.Singleton;

import static java.lang.Double.POSITIVE_INFINITY;

@Singleton
public class TheDalek implements IDalek {

    public String getName() {
        return "The King of Daleks";
    }

    public String getVulnerability() {
        return "The eye";
    }

    public String getEnemiesName() {
        return "Doctor";
    }

    public Double getAge() {
        return POSITIVE_INFINITY;
    }

    public String getFavoriteWord() {
        return "\"Exterminate!\"";
    }

}
