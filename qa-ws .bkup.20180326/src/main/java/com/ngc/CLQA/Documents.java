package com.ngc.CLQA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooby.Jooby;
import org.jooby.hbm.UnitOfWork;
import com.ngc.CLQA.entities.QauiDocuments;

public class Documents extends Jooby {

	private static final Logger logger = LogManager.getLogger(Documents.class);
	{
		
		/**
		 * Returns the cursory list of QAUI_DOCUMENTS.
		 */
		get("/api/getDocuments/", req -> {
			return require(UnitOfWork.class).apply(em -> {
				logger.info("Executing query 'select * from QAUI_DOCUMENTS'");
				return em.createQuery("from " + QauiDocuments.class.getName()).getResultList();
			});
		});
		
		/**
		 * Returns a single QAUI_DOCUMENT given an ID.
		 */
		get("/api/getDocuments/:documentDBID", req -> {
			return require(UnitOfWork.class).apply(em -> {
				logger.info("Executing query 'select * from QAUI_DOCUMENTS'");
				int id = req.param("documentDBID").intValue();
				return em.createQuery("from " + QauiDocuments.class.getName() + " where documentDbid = :documentDBID")
					.setParameter("documentDBID", id)
					.getResultList();

			});
		});
				
		
	}
}
