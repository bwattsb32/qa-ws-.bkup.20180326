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
 * Home object for domain model class QauiAnswers.
 * @see .QauiAnswers
 * @author Hibernate Tools
 */
public class QauiAnswersHome {

	private static final Logger log = LogManager.getLogger(QauiAnswersHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(QauiAnswers transientInstance) {
		log.debug("persisting QauiAnswers instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(QauiAnswers instance) {
		log.debug("attaching dirty QauiAnswers instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QauiAnswers instance) {
		log.debug("attaching clean QauiAnswers instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(QauiAnswers persistentInstance) {
		log.debug("deleting QauiAnswers instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QauiAnswers merge(QauiAnswers detachedInstance) {
		log.debug("merging QauiAnswers instance");
		try {
			QauiAnswers result = (QauiAnswers) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public QauiAnswers findById(java.math.BigDecimal id) {
		log.debug("getting QauiAnswers instance with id: " + id);
		try {
			QauiAnswers instance = (QauiAnswers) sessionFactory.getCurrentSession().get("QauiAnswers", id);
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

	public List findByExample(QauiAnswers instance) {
		log.debug("finding QauiAnswers instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("QauiAnswers")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
