package demo.rpa.persis;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

import demo.rpa.model.Contribuyente;


public class GestorDatos {
	
	/*
	 * cada vez q se llame esta variable automaticamente llama este metodo cargarArticulos
	 * 
	 * 
	 * */
	private Map<String, Contribuyente> repositorioContribuyentes = cargarContribuyentes();


	private Map<String, Contribuyente> cargarContribuyentes() {
		 Map<String, Contribuyente> contribuyenTest = new TreeMap<>();
		 
		 contribuyenTest.put("C-099A", new Contribuyente(
				 "tipoContribuyente",
				 "nombreComercial-Despegar BUenos Aires",
				 "fechaInscripcion-03/11/2013",
				 "estado-Activo",
				 "condicion",
				 "domicilioFiscal-BUenos Aires, Argentina", 
				 "actividadesEconomicas",
				 "comprobanteDePago",
				 "fechaDeAfiliacionPLE",
				 "padrones"));
		 contribuyenTest.put("C-101D",new Contribuyente(
				 "tipoContribuyente",
				 "nombreComercial-Despegar BUenos Aires",
				 "fechaInscripcion-03/11/2013",
				 "estado-Activo",
				 "condicion",
				 "domicilioFiscal-BUenos Aires, Argentina", 
				 "actividadesEconomicas",
				 "comprobanteDePago",
				 "fechaDeAfiliacionPLE",
				 "padrones"));
		 contribuyenTest.put("C-102E",new Contribuyente(
				 "tipoContribuyente",
				 "nombreComercial-Despegar BUenos Aires",
				 "fechaInscripcion-03/11/2013",
				 "estado-Activo",
				 "condicion",
				 "domicilioFiscal-BUenos Aires, Argentina", 
				 "actividadesEconomicas",
				 "comprobanteDePago",
				 "fechaDeAfiliacionPLE",
				 "padrones"));
		 contribuyenTest.put("C-103F",new Contribuyente(
				 "tipoContribuyente",
				 "nombreComercial-Despegar BUenos Aires",
				 "fechaInscripcion-03/11/2013",
				 "estado-Activo",
				 "condicion",
				 "domicilioFiscal-BUenos Aires, Argentina", 
				 "actividadesEconomicas",
				 "comprobanteDePago",
				 "fechaDeAfiliacionPLE",
				 "padrones"));
		 
		 contribuyenTest.put("C-104G",new Contribuyente(
				 "tipoContribuyente",
				 "nombreComercial-Despegar BUenos Aires",
				 "fechaInscripcion-03/11/2013",
				 "estado-Activo",
				 "condicion",
				 "domicilioFiscal-BUenos Aires, Argentina", 
				 "actividadesEconomicas",
				 "comprobanteDePago",
				 "fechaDeAfiliacionPLE",
				 "padrones"));
		 
		 contribuyenTest.put("C-105H",new Contribuyente(
				 "tipoContribuyente",
				 "nombreComercial-Despegar BUenos Aires",
				 "fechaInscripcion-03/11/2013",
				 "estado-Activo",
				 "condicion",
				 "domicilioFiscal-BUenos Aires, Argentina", 
				 "actividadesEconomicas",
				 "comprobanteDePago",
				 "fechaDeAfiliacionPLE",
				 "padrones"));
		 
		 contribuyenTest.put("C-106I",new Contribuyente(
				 "tipoContribuyente",
				 "nombreComercial-Despegar BUenos Aires",
				 "fechaInscripcion-03/11/2013",
				 "estado-Activo",
				 "condicion",
				 "domicilioFiscal-BUenos Aires, Argentina", 
				 "actividadesEconomicas",
				 "comprobanteDePago",
				 "fechaDeAfiliacionPLE",
				 "padrones"));
		 
		 contribuyenTest.put("C-107D",			 
				 new Contribuyente(
						 "tipoContribuyente",
						 "nombreComercial-Despegar BUenos Aires",
						 "fechaInscripcion-03/11/2013",
						 "estado-Activo",
						 "condicion",
						 "domicilioFiscal-BUenos Aires, Argentina", 
						 "actividadesEconomicas",
						 "comprobanteDePago",
						 "fechaDeAfiliacionPLE",
						 "padrones"));
		 
		 contribuyenTest.put("C-108D",new Contribuyente(
				 "tipoContribuyente",
				 "nombreComercial-Despegar BUenos Aires",
				 "fechaInscripcion-03/11/2013",
				 "estado-Activo",
				 "condicion",
				 "domicilioFiscal-BUenos Aires, Argentina", 
				 "actividadesEconomicas",
				 "comprobanteDePago",
				 "fechaDeAfiliacionPLE",
				 "padrones"));
		 
		return contribuyenTest;
	}
	
	public Contribuyente getContribuyente(String key) {
		return this.repositorioContribuyentes.get(key);
		
	}

}
