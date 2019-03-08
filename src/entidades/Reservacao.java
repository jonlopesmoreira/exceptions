package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservacao {
	private Integer numQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservacao(Integer numQuarto, Date checkIn, Date checkOut) {
		super();
		this.numQuarto = numQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Integer getNumQuarto() {
		return numQuarto;
	}


	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}


	public Date getCheckIn() {
		return checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration()
	{
		long dif = getCheckOut().getTime()-getCheckIn().getTime();
		return TimeUnit.DAYS.convert(dif,TimeUnit.MILLISECONDS);
	}
	
	public void updateDate(Date checkIn, Date checkOut)
	{
		
	}
	@Override
	public String toString()
	{
		return "Quarto: " + getNumQuarto() +"\n"+
				"CheckIn: " + sdf.format(getCheckIn())+ "\n"+
				"CheckOut: " + sdf.format(getCheckOut())+ "\n"+
				"Duracao: " + duration() + " noites \n";
		
	}
	

}
