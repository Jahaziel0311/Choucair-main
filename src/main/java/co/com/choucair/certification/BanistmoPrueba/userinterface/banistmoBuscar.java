package co.com.choucair.certification.BanistmoPrueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class banistmoBuscar {


    public static final Target ACEPTAR_COOKIES = Target.the("boton aceptar Cookies")
            .located(By.id("btn-aceptar-cookies"));
    public static final Target APRENDER_ES_FACIL = Target.the("boton de aprender es facil")
            .located(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[7]/section/div[3]/footer/div[2]/div/div/div[2]/div/ul/li[7]/a"));

    public static final Target LEGALES = Target.the("boton legales")
            .located(By.xpath("//*[@id=\"layoutContainers\"]/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/section/div[2]/div[2]/div/div/div/div[6]/div/div/div[3]/a"));


    public static final Target CONOCE_MAS = Target.the("boton legales")
            .located(By.xpath("//*[@id=\"layoutContainers\"]/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/section/div[2]/div[2]/div/div/div/div[2]/div/div/div[3]/a"));

    public static final Target BOTON_PDF = Target.the("boton legales")
            .located(By.xpath("//*[@id=\"tab1\"]/table/tbody/tr[3]/td[2]/span/a/img"));


    public static final Target NOMBRE_PDF = Target.the("Nombre del pdf")
            .located(By.xpath("//*[@id=\"tab1\"]/table/tbody/tr[3]/td[1]/span/strong[1]"));

}
