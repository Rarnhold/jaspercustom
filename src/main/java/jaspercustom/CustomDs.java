package jaspercustom;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class CustomDs implements JRDataSource {
	private int count = 0;

	public boolean next() throws JRException {

		// TODO Auto-generated method stub
		return count++ < 15;
	}

	public Object getFieldValue(JRField jrField) throws JRException {
		
		
		if ("f1".equals(jrField.getName())) {
			return count + " ola";	
		}
		
		if ("f2".equals(jrField.getName())) {
			return " mundo!";
		}
		
		
		
		return "indef";

		
		
		
	}
	
	
	

}
