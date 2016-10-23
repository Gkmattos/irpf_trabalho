package Negocio;

public class Contribuinte {
	
	private String nome;
	private String cpf;
	private int idade;
	private int nroDep;
	private double contrPrev;
	private double totRend;
	private CalculoIrpf impostoDevido;
	
	public Contribuinte(String nome, String cpf, int idade , int nroDep, double contrPrev, double totRend)throws IllegalArgumentException
	{
		if(!ValidadorContribuente.getInstance().validaNome(nome))
			throw new IllegalArgumentException("Nome Invalido");
		if(!ValidadorContribuente.getInstance().validaCPF(cpf))
			throw new IllegalArgumentException("CPF invalido");
		if(!ValidadorContribuente.getInstance().validaIdade(idade))
			throw new IllegalArgumentException("Idade invalida");
		if(!ValidadorContribuente.getInstance().ValidaNroDep(nroDep))
			throw new IllegalArgumentException("Numero de depentes invalidos");
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}
	public int getNroDep() {
		return nroDep;
	}
	public double getContrPrev() {
		return contrPrev;
	}
	public double getTotRend() {
		return totRend;
	}
	public CalculoIrpf getImpostoDevido() {
		return impostoDevido;
	}
	
}
