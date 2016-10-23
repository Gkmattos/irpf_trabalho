package Negocio;

public class ValidadorContribuente {
	private static ValidadorContribuente  vc = null;
	
	private ValidadorContribuente(){}
	public static ValidadorContribuente getInstance()
	{
		if(vc==null)
		{
			vc = new ValidadorContribuente();
		}
		return (vc);
	}
	public boolean validaNome(String nome)
	{
		if(nome==null || nome.length()==0||!nome.contains(""))
		{
			return false;
		}
		return true;
	}
	
	public boolean validaCPF(String cpf)
	{
		if(cpf==null|| cpf.length()!=11)
		{
			return false;
		}
		return true;
	}
	public boolean validaIdade(int idade)
	{
		if(idade<0 || idade >150)
		{
			return false;
		}
		return true;
	}
	public boolean ValidaNroDep(int nroDep)
	{
		if(nroDep<0 || nroDep>50)
		{
			return false;
		}
		return true;
		
	}
	
	public boolean alidaContrPrev(double contrPrev)
	{
		if(contrPrev<0)
		{
			return false;
		}
		return true;
	}
	public boolean validaTotRend(double totRend)
	{
		if(totRend<0){
			return false;
		}
		return true;
	}
	
}
