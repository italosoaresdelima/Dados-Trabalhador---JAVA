package entities;

import java.util.Date;

public class HourContract {
	private double valorPorHora;
	private Date date;
	private Integer horas;

	public HourContract() {
		super();
	}

	public HourContract(double valorPorHora, Date date, Integer horas) {
		super();
		this.valorPorHora = valorPorHora;
		this.date = date;
		this.horas = horas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public double valorTotal() {
		return valorPorHora * horas;
	}
}
