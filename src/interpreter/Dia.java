package interpreter;

import java.text.SimpleDateFormat;

public class Dia implements Data {
	private Data data;
	SimpleDateFormat dtfmt = new SimpleDateFormat("dd");
	
	public Dia(Data data) {
		this.data = data;
	}
	
	@Override
	public String interpretar() {
		// TODO Auto-generated method stub
		return dtfmt.format(data);
	}
}
