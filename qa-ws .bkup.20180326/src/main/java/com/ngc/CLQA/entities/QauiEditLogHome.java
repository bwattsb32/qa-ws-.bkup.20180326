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
 * Home object for domain model class QauiEditLog.
 * @see .QauiEditLog
 * @author Hibernate Tools
 */
public class QauiEditLogHome {

	private static final Logger log = LogManager.getLogger(QauiEditLogHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(QauiEditLog transientInstance) {
		log.debug("persisting QauiEditLog instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(QauiEditLog instance) {
		log.debug("attaching dirty QauiEditLog instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QauiEditLog instance) {
		log.debug("attaching clean QauiEditLog instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(QauiEditLog persistentInstance) {
		log.debug("deleting QauiEditLog instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QauiEditLog merge(QauiEditLog detachedInstance) {
		log.debug("merging QauiEditLog instance");
		try {
			QauiEditLog result = (QauiEditLog) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public QauiEditLog findById(java.math.BigDecimal id) {
		log.debug("getting QauiEditLog instance with id: " + id);
		try {
			QauiEditLog instance = (QauiEditLog) sessionFactory.getCurrentSession().get("QauiEditLog", id);
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

	public List findByExample(QauiEditLog instance) {
		log.debug("finding QauiEditLog instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("QauiEditLog")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
