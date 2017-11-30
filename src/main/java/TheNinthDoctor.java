import javax.inject.Singleton;

@Singleton
public class TheNinthDoctor implements INinthDoctor {
    public String getName() {
        return "Christopher Eccleston";
    }

    public String getCompanionName() {
        return "Rose";
    }

    public String getEnimmiesName() {
        return "Daleks and The Bad Wolf";
    }

    public Integer getAge() {
        return 900;
    }

    public Double getScrewdriverVersion() {
        return 1.0;
    }

    public String getFavoriteWord() {
        return "\"Fantastic!\"";
    }

}