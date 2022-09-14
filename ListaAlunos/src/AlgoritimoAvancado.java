import java.util.ArrayList;
import java.util.List;

public class AlgoritimoAvancado {

	public static void main(String[] args) {
		
		ListaAlunos lista = new ListaAlunos();
		
		List<Aluno> alunos = new ArrayList<>();
		
		Aluno aluno = new Aluno();
		aluno.nome = "Jhonatan";
		alunos.add(aluno);
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Lucas";
		alunos.add(aluno);
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Marcos";
		alunos.add(aluno);
		lista.adicionar(aluno);
		
		for (int i = 0 ; i <lista.tamanho(); i++) {
			Aluno a = lista.obter(i);
			System.out.println("Aluno: " + a.nome);
		}
		
		for (Aluno al: alunos) {
			System.out.println("Aluno: " + al.nome);
		}
	}

}
