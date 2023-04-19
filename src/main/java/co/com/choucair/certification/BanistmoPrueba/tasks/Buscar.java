package co.com.choucair.certification.BanistmoPrueba.tasks;

import co.com.choucair.certification.BanistmoPrueba.userinterface.banistmoBuscar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Buscar implements Task {
    public static Buscar laRuta() {
        return Tasks.instrumented(Buscar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(banistmoBuscar.ACEPTAR_COOKIES),
                Click.on(banistmoBuscar.APRENDER_ES_FACIL),
                Click.on(banistmoBuscar.LEGALES),
                Click.on(banistmoBuscar.CONOCE_MAS)
                );

    }
}
