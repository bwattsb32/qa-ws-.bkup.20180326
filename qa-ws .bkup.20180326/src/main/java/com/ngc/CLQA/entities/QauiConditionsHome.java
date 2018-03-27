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
 * Home object for domain model class QauiConditions.
 * @see .QauiConditions
 * @author Hibernate Tools
 */
public class QauiConditionsHome {

	private static final Logger log = LogManager.getLogger(QauiConditionsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(QauiConditions transientInstance) {
		log.debug("persisting QauiConditions instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(QauiConditions instance) {
		log.debug("attaching dirty QauiConditions instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QauiConditions instance) {
		log.debug("attaching clean QauiConditions instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(QauiConditions persistentInstance) {
		log.debug("deleting QauiConditions instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QauiConditions merge(QauiConditions detachedInstance) {
		log.debug("merging QauiConditions instance");
		try {
			QauiConditions result = (QauiConditions) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public QauiConditions findById(QauiConditionsId id) {
		log.debug("getting QauiConditions instance with id: " + id);
		try {
			QauiConditions instance = (QauiConditions) sessionFactory.getCurrentSession().get("QauiConditions", id);
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

	public List findByExample(QauiConditions instance) {
		log.debug("finding QauiConditions instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("QauiConditions")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
