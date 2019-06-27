package interpreter;

import java.text.SimpleDateFormat;

public class Ano implements Data{

	private Data data;
	SimpleDateFormat dtfmt = new SimpleDateFormat("YYYY");
	
	public Ano(Data data) {
		this.data = data;
	}
	
	@Override
	public String interpretar() {
		// TODO Auto-generated method stub
		return dtfmt.format(data);
	}
	
}
