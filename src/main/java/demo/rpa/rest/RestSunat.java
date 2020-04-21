package demo.rpa.rest;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

 

import demo.rpa.model.Contribuyente;
import demo.rpa.util.SunatUtil;

@Path("sunac")
public class RestSunat {	

 	
		@GET
		@Path(value="/contribuyente/{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public Response getDatosContribuyenteById(@PathParam("id") Long id) {		 
			if(id<0 || !SunatUtil.isRUCValid(id)){
				System.out.println("Ruc No Valido");
				return Response.noContent().build();
			}
			else {
			 
					Contribuyente con = new Contribuyente();
					System.out.println("Ruc Valido");
					con.setId(id);
					con.setActividadesEconomicas("actividadesEconomicas");
					con.setComprobanteDePago("comprobanteDePago");
					con.setTipoContribuyente("tipoContribuyente"); 
					GenericEntity<Contribuyente> entity = new GenericEntity<Contribuyente>(con, Contribuyente.class);					
				
				return Response.ok().entity(entity).build(); 
				 
			}
			
		}
		


	}
