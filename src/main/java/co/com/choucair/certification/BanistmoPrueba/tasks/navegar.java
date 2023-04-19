package co.com.choucair.certification.BanistmoPrueba.tasks;


import co.com.choucair.certification.BanistmoPrueba.userinterface.banistmoBuscar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;


public class navegar implements Task {







    public static navegar buscarPDF() {

        return Tasks.instrumented(navegar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(banistmoBuscar.APRENDER_ES_FACIL)






        );


    }
}
