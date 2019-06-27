package interpreter;

import java.text.SimpleDateFormat;

public class Mes implements Data{
	private Data data;
	SimpleDateFormat dtfmt = new SimpleDateFormat("m");
	
	public Mes(Data data) {
		this.data = data;
	}
	
	@Override
	public String interpretar() {
		// TODO Auto-generated method stub
		return dtfmt.format(data);
	}
	
	
}
