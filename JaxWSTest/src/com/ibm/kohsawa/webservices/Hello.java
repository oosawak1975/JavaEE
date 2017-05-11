package com.ibm.kohsawa.webservices;

//https://developer.ibm.com/answers/questions/14046/facing-issues-on-simple-webservice-in-bluemix.html
/*
 * 1. Stop Liberty server
 * 2. > ./bin/server package <yourserver> --include=usr
 * 3. > cf push <yourappname> -p <pathtopackage> -m 512M
 * 
 * e.g.
 * > C:\WASLiberty\bin>server package defaultServer --include=usr
 * > cf push JaxWSTest -p defaultServer.zip -m 512M
 */
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {
	@WebMethod
	public String hello(){
		return "hello";
	}
}
