package com.ibm.kohsawa.webservices;

//https://developer.ibm.com/answers/questions/14046/facing-issues-on-simple-webservice-in-bluemix.html
/*
 * Maybe the default server.xml generated for your application is not sufficient.
 * As recommended above, try to deploy to local Liberty server first. If you are able run this application locally on your liberty server, package up the server, and then push the package.
 * To package server to a zip: ./bin/server package <yourserver> --include=usr To push that zip: cf push <yourappname> -p <pathtopackage> -m 512M
 * https://www.ng.bluemix.net/docs/Liberty/LibertyApp.html#liberty_server
 * 
 * C:\Bluemix\WASLiberty\bin>server package defaultServer --include=usr
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
