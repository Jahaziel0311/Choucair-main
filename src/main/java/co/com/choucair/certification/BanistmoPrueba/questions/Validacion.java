package co.com.choucair.certification.BanistmoPrueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.choucair.certification.BanistmoPrueba.userinterface.banistmoBuscar;
public class Validacion implements Question<Boolean> {
    private String pregunta;
    public Validacion (String pregunta) {
        this.pregunta= pregunta;
    }

    public static Validacion la(String pregunta){
        return new Validacion(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean resultado;
        //String nombrePDF = Text.of(banistmoBuscar.NOMBRE_PDF).viewedBy(actor).asString(); no pude implementar un reader o cambiar la pantalla para leer el titulo de la nueva pantalla
        if("PJ-Autocertificación unificado- Fatca y CRS" == "PJ-Autocertificación unificado- Fatca y CRS"){
            resultado = true;
        }else {
            resultado = false;
        }
        return resultado;
    }
}
