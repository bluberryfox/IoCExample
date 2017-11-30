import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule {
    protected void configure() {
        bind(INinthDoctor.class).to(TheNinthDoctor.class);
        bind(IDalek.class).to(TheDalek.class);
    }
}
