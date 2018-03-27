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
 * Home object for domain model class ClsClausePrescriptions.
 * @see .ClsClausePrescriptions
 * @author Hibernate Tools
 */
public class ClsClausePrescriptionsHome {

    private static final Log log = LogFactory.getLog(ClsClausePrescriptionsHome.class);

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
    
    public void persist(ClsClausePrescriptions transientInstance) {
        log.debug("persisting ClsClausePrescriptions instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(ClsClausePrescriptions instance) {
        log.debug("attaching dirty ClsClausePrescriptions instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(ClsClausePrescriptions instance) {
        log.debug("attaching clean ClsClausePrescriptions instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(ClsClausePrescriptions persistentInstance) {
        log.debug("deleting ClsClausePrescriptions instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public ClsClausePrescriptions merge(ClsClausePrescriptions detachedInstance) {
        log.debug("merging ClsClausePrescriptions instance");
        try {
            ClsClausePrescriptions result = (ClsClausePrescriptions) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ClsClausePrescriptions findById( int id) {
        log.debug("getting ClsClausePrescriptions instance with id: " + id);
        try {
            ClsClausePrescriptions instance = (ClsClausePrescriptions) sessionFactory.getCurrentSession()
                    .get("ClsClausePrescriptions", id);
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
    
    public List findByExample(ClsClausePrescriptions instance) {
        log.debug("finding ClsClausePrescriptions instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("ClsClausePrescriptions")
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

