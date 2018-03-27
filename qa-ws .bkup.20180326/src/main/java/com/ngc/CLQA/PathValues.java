package com.ngc.CLQA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooby.Jooby;
import org.jooby.hbm.UnitOfWork;

import com.ngc.CLQA.entities.QauiPathValues;

public class PathValues extends Jooby {

	private static final Logger logger = LogManager.getLogger(PathValues.class);
	{
		
		/**
		 * Returns the PATH-VALUE given ID.
		 */
		get("/api/getPathValues/:answerDBID", req -> {
			return require(UnitOfWork.class).apply(em -> {
				logger.info("Executing query 'select * from QAUI_PATH_VALUES'");
				int id = req.param("answerDBID").intValue();
				return em.createQuery("from " + QauiPathValues.class.getName() + " where answerReference = :answerDBID")
						.setParameter("answerDBID", id)
						.getResultList();
			});
		});
				
		
	}
}
