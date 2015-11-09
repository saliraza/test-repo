package com.jxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class App {

	/**
	 * Some thing
	 * @param args runtime arguments
	 */
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("mkyong");
		customer.setAge(29);
		customer.setVersion(122222);
		
		Company comp = new Company();
		comp.setOrgName("Zigron");
		
		write(customer);
//		read("file.xml");
	}
	
	public static void read(String fileName){
		try {

			File file = new File(fileName);
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer);
			
		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
	}
	
	public static void write(Object object){
		 try {

			File file = new File("file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(object, file);
			jaxbMarshaller.marshal(object, System.out);

	      } catch (JAXBException e) {
	    	  e.printStackTrace();
	      }
	}

}
