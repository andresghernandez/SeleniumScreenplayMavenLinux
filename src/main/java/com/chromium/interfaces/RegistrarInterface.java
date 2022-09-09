package com.chromium.interfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistrarInterface {
	
	private RegistrarInterface() {}

	public static final Target TXT_FIRST_NAME = Target.the("TXT FIRST NAME").located(By.xpath("//*[@name='firstName']"));
	public static final Target TXT_LAST_NAME = Target.the("TXT LAST NAME ").located(By.xpath("//*[@name='lastName']"));
	public static final Target TXT_EMAIL = Target.the("TXT EMAIL").located(By.xpath("//*[@name='email']"));
	public static final Target TXT_PASSWORD = Target.the("TXT PASSWORD").located(By.xpath("//*[@name='password']"));
	public static final Target TXT_CONFIRM_PASSWORD = Target.the("TXT CONFIRM PASSWORD").located(By.xpath("//*[@name='confirmPassword']"));
	public static final Target BOTON_ENVIAR = Target.the("BOTON ENVIAR").located(By.xpath("//*[contains(@name,'submit')]"));
	
}
