package Model;

public class Cliente {
	
	public int id;
	public String nome;
	public String email;
	
	public int getID(){
		return this.id;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setID(int id){
		this.id = id > 0 ? id : 0;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
}
