// default package
// Generated Mar 21, 2018 3:34:06 PM by Hibernate Tools 5.2.8.Final


import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class QauiPathValues.
 * @see .QauiPathValues
 * @author Hibernate Tools
 */
public class QauiPathValuesHome {

    private static final Log log = LogFactory.getLog(QauiPathValuesHome.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("SessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(QauiPathValues transientInstance) {
        log.debug("persisting QauiPathValues instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(QauiPathValues instance) {
        log.debug("attaching dirty QauiPathValues instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(QauiPathValues instance) {
        log.debug("attaching clean QauiPathValues instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(QauiPathValues persistentInstance) {
        log.debug("deleting QauiPathValues instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public QauiPathValues merge(QauiPathValues detachedInstance) {
        log.debug("merging QauiPathValues instance");
        try {
            QauiPathValues result = (QauiPathValues) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public QauiPathValues findById( java.math.BigDecimal id) {
        log.debug("getting QauiPathValues instance with id: " + id);
        try {
            QauiPathValues instance = (QauiPathValues) sessionFactory.getCurrentSession()
                    .get("QauiPathValues", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List findByExample(QauiPathValues instance) {
        log.debug("finding QauiPathValues instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("QauiPathValues")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 
}

