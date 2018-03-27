package com.ngc.CLQA.entities;
// Generated Mar 20, 2018 10:08:57 AM by Hibernate Tools 5.2.8.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class QauiQuestions.
 * @see .QauiQuestions
 * @author Hibernate Tools
 */
public class QauiQuestionsHome {

	private static final Logger log = LogManager.getLogger(QauiQuestionsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(QauiQuestions transientInstance) {
		log.debug("persisting QauiQuestions instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(QauiQuestions instance) {
		log.debug("attaching dirty QauiQuestions instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QauiQuestions instance) {
		log.debug("attaching clean QauiQuestions instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(QauiQuestions persistentInstance) {
		log.debug("deleting QauiQuestions instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QauiQuestions merge(QauiQuestions detachedInstance) {
		log.debug("merging QauiQuestions instance");
		try {
			QauiQuestions result = (QauiQuestions) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public QauiQuestions findById(java.math.BigDecimal id) {
		log.debug("getting QauiQuestions instance with id: " + id);
		try {
			QauiQuestions instance = (QauiQuestions) sessionFactory.getCurrentSession().get("QauiQuestions", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QauiQuestions instance) {
		log.debug("finding QauiQuestions instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("QauiQuestions")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
