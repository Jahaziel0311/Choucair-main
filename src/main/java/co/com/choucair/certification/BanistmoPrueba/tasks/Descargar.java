package co.com.choucair.certification.BanistmoPrueba.tasks;

import co.com.choucair.certification.BanistmoPrueba.userinterface.banistmoBuscar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Descargar implements Task {
    public static Descargar PDF() {
        return Tasks.instrumented(Descargar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(banistmoBuscar.BOTON_PDF)
                );

    }
}
