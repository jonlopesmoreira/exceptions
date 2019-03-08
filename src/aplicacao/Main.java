package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Reservacao;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner s = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Numero do quarto: ");
		int numQuarto = s.nextInt();
		System.out.print("Checkin (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(s.next());		
		System.out.print("Checkout (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(s.next());
		if (checkIn.after(checkOut))
		{
			System.out.println(checkIn);
			System.out.println("Data de chegada(checkin) tem que ser anterior a de saida(checkout)");
			System.out.println(checkOut);
		}
		else
		{
			Reservacao r = new Reservacao(numQuarto, checkIn, checkOut);
			System.out.println("Reservacao\n: " + r);
		}
		
		s.close();
		
	}

}
