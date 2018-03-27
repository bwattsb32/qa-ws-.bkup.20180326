package com.ngc.CLQA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooby.Jooby;
import org.jooby.hbm.Hbm;
import org.jooby.jdbc.Jdbc;
import org.jooby.json.Jackson;
import org.jooby.handlers.Cors;
import org.jooby.handlers.CorsHandler;

import com.ngc.CLQA.entities.QauiDocuments;
import com.ngc.CLQA.entities.QauiPathValues;
import com.ngc.CLQA.entities.QauiSections;

/**
 * @author jooby generator
 */
public class App extends Jooby {
	
	private static final Logger logger = LogManager.getLogger(App.class);

	{
		/** Render JSON: */
		use(new Jackson());
		logger.info("Using Jackson...");
		
		/** CORS !!! */
		use("*", new CorsHandler(new Cors()));
		logger.info("Handling CORS...");

		use(new Jdbc("db"));
		logger.info("Connecting to DB...");
		
		use(new Hbm().classes(QauiDocuments.class, QauiSections.class, QauiPathValues.class ));
		logger.info("Using Hibernate Database object mappings...");
		
		use(new Documents());
		logger.info("Building Documents API...");
		
		use(new Sections());
		logger.info("Building Sections API...");
		
		use(new PathValues());
		logger.info("Building PathValues API...");

	}

	public static void main(final String[] args) {
		run(App::new, args);
	}

}