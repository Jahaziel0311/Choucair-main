package co.com.choucair.certification.BanistmoPrueba.stepdefinitions;




import co.com.choucair.certification.BanistmoPrueba.tasks.Buscar;
import co.com.choucair.certification.BanistmoPrueba.tasks.Descargar;
import co.com.choucair.certification.BanistmoPrueba.tasks.abrirPagina;
import co.com.choucair.certification.BanistmoPrueba.questions.Validacion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;




public class BanistmoPruebaStepdefinitions {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Yo necesito entrar al portal de Banistmo$")
    public void queYoNecesitoEntrarAlPortalDeBanistmo() throws Exception{

        OnStage.theActorCalled("Jahaziel").wasAbleTo(abrirPagina.laPagina());

    }

    @Cuando("^este dentro buscar el PDF deseado$")
    public void esteDentroBuscarElPDFDeseado(){
        OnStage.theActorInTheSpotlight().wasAbleTo(Buscar.laRuta());
    }

    @Y("^poder descargarlo$")
    public void poderPescargarlo()
    {
        OnStage.theActorInTheSpotlight().wasAbleTo(Descargar.PDF());
    }

    @Entonces("^validar que la descarga sea valida(.*)$")
    public void validarQueLaDescargaSeaValida(String pregunta){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validacion.la(pregunta)));
    }
}
