package pe.com.bcp.techcases.testautomation.ui.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import pe.com.bcp.techcases.testautomation.ui.actors.SauceDemoUser;

import java.util.List;
import java.util.Map;

public class SauceStepDefinitions {

    @Steps
    private SauceDemoUser sauceUser;

    @Dado("que el usuario visita la pagina {page}")
    public void queElUsuarioVisitaLaPaginaSauceDemoPage(Class<PageObject> page) {
        sauceUser.goToPage(page);
    }

    @Cuando("ingresa las credenciales user y pass para iniciar sesión")
    public void ingresaLasCredencialesYParaIniciarSesión(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        String user = rows.get(0).get("user");
        String pass = rows.get(0).get("password");
        sauceUser.fillsFieldsAndLogin(user, pass);
    }

    @Entonces("valida que el mensaje de error contiene {string}")
    public void validaQueElMensajeDeErrorContiene(String error) {
        Assertions.assertTrue(sauceUser.errorMessage().contains(error),
                "El mensaje de error no contiene >>> "+error+"");
    }

}