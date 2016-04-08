package br.univel;
import br.univel.anotation.Tabela;
import br.univel.enums.EstadoCivil;
import br.univel.enums.Uf;
public class ReadAnnotation {

	public ReadAnnotation(Object obj) {
		Class<?> cl = obj.getClass();
		
		if(cl.isAnnotationPresent(Tabela.class)){
			Tabela t = cl.getAnnotation(Tabela.class);
			System.out.println(t.value());
		}
	}
	public static void main(String[] args){
		
		Pessoa p = new Pessoa();
		p.setId(1);
		p.setNome("Java");
		p.setEstadoCivil(EstadoCivil.SOLTEIRO);
		p.setUf(Uf.SC);
		System.out.println(p.getUf().getNome());
		new ReadAnnotation(p);
	}
}
