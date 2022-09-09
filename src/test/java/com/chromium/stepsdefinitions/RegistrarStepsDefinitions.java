package com.chromium.stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import org.openqa.selenium.WebDriver;
import com.chromium.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class RegistrarStepsDefinitions {
	
	public static String user;

	@Steps(shared = true)
	private Actor actor = Actor.named("the");
	
	@Managed
	private WebDriver browser;

	@Before
	public void setUp() {
		OnStage.setTheStage(Cast.ofStandardActors());
		actor.can(BrowseTheWeb.with(browser));
	};
	
	@Given("^ingreso a la url de la pagina guru$")
	public void ingresoALaUrlDeLaPaginaGuru() {
		browser.get("https://demo.guru99.com/test/newtours/register.php");
	}
	@When("^ingreso a la opcion crear cuenta \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void ingresoALaOpcionCrearCuenta(String nombre, String apellido, String email, String password) {
		actor.wasAbleTo(Registrar.enGuru(nombre, apellido, email, password));
	}
	@Then("^puedo finalizar el registro$")
	public void puedoFinalizarElRegistro() {

	}
	
	
}
