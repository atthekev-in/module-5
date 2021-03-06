/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.au.cc.gallery;

import edu.au.cc.gallery.tools.UserAdmin;
import edu.au.cc.gallery.tools.UserApp;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class App {

	public static void main(String[] args) throws Exception {

	String portString = System.getenv("JETTY_PORT");
	if (portString == null || portString.equals("")) {
	port(5000);
	} else {
		port(Integer.parseInt(portString));
	}

		DB db = new DB();

		UserApp userApp = new UserApp();
		userApp.addRoutes();
	get("/hello", (req, res) -> "Hello");


	}

}

