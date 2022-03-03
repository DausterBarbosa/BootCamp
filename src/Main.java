import br.com.bootcamp.dominio.BootCamp;
import br.com.bootcamp.dominio.Curso;
import br.com.bootcamp.dominio.Dev;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setCargaHoraria(10);
		curso1.setDescricao("Classes em Java");
		curso1.setTitulo("Aprenda Classes em Java");
		
		
		BootCamp bootcamp = new BootCamp();
		
		bootcamp.setNome("Bootcamp de POO em Java");
		bootcamp.setDescricao("Venha aprender POO em Java");
		bootcamp.getConteudos().add(curso1);
		
		Dev dev = new Dev();
		
		dev.setNome("Joseph");
		
		System.out.print(dev.getConteudosInscritos());
		
		dev.inscreverBootcamp(bootcamp);
		
		System.out.print(dev.getConteudosInscritos());
		
	}
	
}
