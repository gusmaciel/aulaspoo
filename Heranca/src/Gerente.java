
public class Gerente extends Funcionario {
	
	private String nomeDeUsuario;
	private String senha;
	
	
	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}
	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	@Override
	public double Bonificacao() {
		return getSalario() * 0.2;
		
	}
	
}
