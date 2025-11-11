package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do departamento: ");
		String departamento = sc.nextLine();

		System.out.println("---Dados do trabalhador---");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Nível: ");
		String nivel = sc.nextLine();
		System.out.println("Salário base: ");
		double salario_base = sc.nextDouble();
		Worker trabalhador = new Worker(nome, salario_base, WorkerLevel.valueOf(nivel), new Department(departamento));
		System.out.println("Quantos contratos esse trabalhador terá? ");
		int quantidade = sc.nextInt();
		
		System.out.println();

		for (int i = 1; i <= quantidade; i++) {
			System.out.println("---#" + i + "Dados do contrato---");
			System.out.println("Data (DD)/(MM)/(YYYY): ");
			Date data_contrato = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valor_por_hora = sc.nextDouble();
			System.out.println("Duração (horas): ");
			int hora = sc.nextInt();
			HourContract contrato = new HourContract(valor_por_hora, data_contrato, hora);
			trabalhador.adicionarContratos(contrato); 
		}
		System.out.println();
		
		System.out.println("Entre com o mês e ano (MM)/YYYY): ");
		String mes_ano = sc.next();
		int mes = Integer.parseInt(mes_ano.substring(0, 2));
		int ano = Integer.parseInt(mes_ano.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartment().getNome());
		System.out.println("Renda em " + mes_ano + ": " + String.format("%.2f", trabalhador.renda(ano, mes))) ;
		
		sc.close();
	}

}
