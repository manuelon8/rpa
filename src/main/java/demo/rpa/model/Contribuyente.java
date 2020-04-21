package demo.rpa.model;

public class Contribuyente {
	
	private Long id;
	private String tipoContribuyente;
	private String NombreComercial;
	private String fechaInscripcion;
	private String estado;
	private String condicion;
	private String domicilioFiscal;
	private String actividadesEconomicas;
	private String comprobanteDePago;
	private String fechaDeAfiliacionPLE;
	private String padrones;
	
	
	
	public Contribuyente() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Contribuyente(String tipoContribuyente, String nombreComercial, String fechaInscripcion, String estado,
			String condicion, String domicilioFiscal, String actividadesEconomicas, String comprobanteDePago,
			String fechaDeAfiliacionPLE, String padrones) {
		super();
		this.tipoContribuyente = tipoContribuyente;
		NombreComercial = nombreComercial;
		this.fechaInscripcion = fechaInscripcion;
		this.estado = estado;
		this.condicion = condicion;
		this.domicilioFiscal = domicilioFiscal;
		this.actividadesEconomicas = actividadesEconomicas;
		this.comprobanteDePago = comprobanteDePago;
		this.fechaDeAfiliacionPLE = fechaDeAfiliacionPLE;
		this.padrones = padrones;
	}

	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoContribuyente() {
		return tipoContribuyente;
	}
	public void setTipoContribuyente(String tipoContribuyente) {
		this.tipoContribuyente = tipoContribuyente;
	}
	public String getNombreComercial() {
		return NombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		NombreComercial = nombreComercial;
	}
	public String getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(String fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	public String getDomicilioFiscal() {
		return domicilioFiscal;
	}
	public void setDomicilioFiscal(String domicilioFiscal) {
		this.domicilioFiscal = domicilioFiscal;
	}
	public String getActividadesEconomicas() {
		return actividadesEconomicas;
	}
	public void setActividadesEconomicas(String actividadesEconomicas) {
		this.actividadesEconomicas = actividadesEconomicas;
	}
	public String getComprobanteDePago() {
		return comprobanteDePago;
	}
	public void setComprobanteDePago(String comprobanteDePago) {
		this.comprobanteDePago = comprobanteDePago;
	}
	public String getFechaDeAfiliacionPLE() {
		return fechaDeAfiliacionPLE;
	}
	public void setFechaDeAfiliacionPLE(String fechaDeAfiliacionPLE) {
		this.fechaDeAfiliacionPLE = fechaDeAfiliacionPLE;
	}
	public String getPadrones() {
		return padrones;
	}
	public void setPadrones(String padrones) {
		this.padrones = padrones;
	}
	
	
	
	
	

}
