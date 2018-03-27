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
 * Home object for domain model class WillTestingProcurementqa.
 * @see .WillTestingProcurementqa
 * @author Hibernate Tools
 */
public class WillTestingProcurementqaHome {

    private static final Log log = LogFactory.getLog(WillTestingProcurementqaHome.class);

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
    
    public void persist(WillTestingProcurementqa transientInstance) {
        log.debug("persisting WillTestingProcurementqa instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(WillTestingProcurementqa instance) {
        log.debug("attaching dirty WillTestingProcurementqa instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(WillTestingProcurementqa instance) {
        log.debug("attaching clean WillTestingProcurementqa instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(WillTestingProcurementqa persistentInstance) {
        log.debug("deleting WillTestingProcurementqa instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public WillTestingProcurementqa merge(WillTestingProcurementqa detachedInstance) {
        log.debug("merging WillTestingProcurementqa instance");
        try {
            WillTestingProcurementqa result = (WillTestingProcurementqa) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public WillTestingProcurementqa findById( java.math.BigDecimal id) {
        log.debug("getting WillTestingProcurementqa instance with id: " + id);
        try {
            WillTestingProcurementqa instance = (WillTestingProcurementqa) sessionFactory.getCurrentSession()
                    .get("WillTestingProcurementqa", id);
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
    
    public List findByExample(WillTestingProcurementqa instance) {
        log.debug("finding WillTestingProcurementqa instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("WillTestingProcurementqa")
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

