package br.univel;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Teste {
	
	public Teste(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		int l = 0 ;
		int i = 0 ;
		Class<?> cl = obj.getClass(); //pega a classe do objeto
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO ");
		sb.append(cl.getSimpleName().toUpperCase()).append("(");
		Field[] vetorFields = cl.getDeclaredFields();
		
		int qtdFields = vetorFields.length;
		
		for(int a = 0; a < qtdFields; a++){
			Field field = vetorFields[a];
			
			sb.append(field.getName());
			if (a < qtdFields -1){
				sb.append(", ");
			}
		}
		
		// Field sao os atributos do objeto(getDeclaredFields) .
//		for(Field field : cl.getDeclaredFields()){
//			//System.out.println(field.getName() + "  "+ field.getType());
//			sb.append(field.getName()).append(", ");
//			i+=1;
//		}
		sb.append(") VALUE (" );
	
		for(l = 0 ; l < qtdFields ; l++){
			if(l == qtdFields-1){
				sb.append("?)");
			}else{
				sb.append("? ,");
			}
		}
		
		
		String sql = sb.toString();
		
		System.out.println(sql);
		
//		
//		// m.invoke(obj, null) -> executa o metodo no objeto .
//		//Traz os metodos (getDeclaredMethods).
//		for (Method m : cl.getDeclaredMethods()) {
//			if(m.getName().startsWith("get")){ // se o metodo começar get ele invoca
//				Object retorno = m.invoke(obj, null);
//				System.out.println(retorno);
	//  }
		
	//}
		
		}
		
	

	public static void main(String[] args){
		
		Pessoa p = new Pessoa();
		
		//obj.metodo(valor);
		p.setId(1);
		p.setNome("Eratóstenes");
		
		try {
			new Teste(p);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
