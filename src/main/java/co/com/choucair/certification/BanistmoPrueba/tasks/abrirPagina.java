package co.com.choucair.certification.BanistmoPrueba.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class abrirPagina implements Task {

    private co.com.choucair.certification.BanistmoPrueba.userinterface.paginaBanistmo paginaBanistmo;
    public static abrirPagina laPagina() {
        return Tasks.instrumented(abrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(paginaBanistmo));

    }
}
