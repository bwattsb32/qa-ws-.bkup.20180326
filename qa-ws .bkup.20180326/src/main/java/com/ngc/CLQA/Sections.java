package com.ngc.CLQA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooby.Jooby;
import org.jooby.hbm.UnitOfWork;

import com.ngc.CLQA.entities.QauiSections;

public class Sections extends Jooby {

	private static final Logger logger = LogManager.getLogger(Sections.class);
	{
					
		/**
		 * Returns the cursory list of QAUI_SECTIONS given documentId.
		 */
		get("/api/getSections/:documentDBID", req -> {
			return require(UnitOfWork.class).apply(em -> {
				logger.debug(":Executing query 'select * from QAUI_SECTIONS'");
				int id = req.param("documentDBID").intValue();
				return em.createQuery("from " + QauiSections.class.getName() + " where documentDbid = :documentDBID")
						.setParameter("documentDBID", id)
						.getResultList();
			});
		});
				
	}
}