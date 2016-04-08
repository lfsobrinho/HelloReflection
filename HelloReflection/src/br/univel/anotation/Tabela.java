package br.univel.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//politica de retençao do annotation
@Retention(RetentionPolicy.RUNTIME)
//Essa anotaçao modifica para anotaçoes so sobre classes , classes abstratas e tipos
//Nao pode colocar anotation em : atributos ,parametros , metodos.
@Target(ElementType.TYPE)
// @ = annotation 
public @interface Tabela {

	String value();
	
}
