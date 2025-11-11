package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String nome;
	private double salarioBase;
	private WorkerLevel nivel;

	private Department department;
	private List<HourContract> contratos = new ArrayList<>();

	public Worker() {
		super();
	}

	public Worker(String nome, double salarioBase, WorkerLevel nivel, Department department) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.nivel = nivel;
		this.department = department;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public WorkerLevel getNivel() {
		return nivel;
	}

	public void setNivel(WorkerLevel nivel) {
		this.nivel = nivel;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContratos() {
		return contratos;
	}

	public void adicionarContratos(HourContract contrato) {
		contratos.add(contrato);

	}

	public void removerContrato(HourContract contrato) {
		contratos.remove(contrato);
	}

	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contratos) {
			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);

			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}
