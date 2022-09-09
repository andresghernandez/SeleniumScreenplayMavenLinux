package com.chromium.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static com.chromium.interfaces.RegistrarInterface.*;

public class Registrar implements Task {

	private String nombre;
	private String apellido;
	private String email;
	private String password;
	
	public Registrar(String nombre, String apellido, String email, String password) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				SendKeys.of(nombre).into(TXT_FIRST_NAME),
				SendKeys.of(apellido).into(TXT_LAST_NAME),
				SendKeys.of(email).into(TXT_EMAIL),
				SendKeys.of(password).into(TXT_PASSWORD),
				SendKeys.of(password).into(TXT_CONFIRM_PASSWORD),
				Click.on(BOTON_ENVIAR)
				);
		

	}

	public static Registrar enGuru(String nombre, String apellido, String email, String password) {
		return Tasks.instrumented(Registrar.class, nombre, apellido, email, password);
	}
	
}
