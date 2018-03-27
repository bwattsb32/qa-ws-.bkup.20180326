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
 * Home object for domain model class ClsClausePrescriptionTemp.
 * @see .ClsClausePrescriptionTemp
 * @author Hibernate Tools
 */
public class ClsClausePrescriptionTempHome {

    private static final Log log = LogFactory.getLog(ClsClausePrescriptionTempHome.class);

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
    
    public void persist(ClsClausePrescriptionTemp transientInstance) {
        log.debug("persisting ClsClausePrescriptionTemp instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(ClsClausePrescriptionTemp instance) {
        log.debug("attaching dirty ClsClausePrescriptionTemp instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(ClsClausePrescriptionTemp instance) {
        log.debug("attaching clean ClsClausePrescriptionTemp instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(ClsClausePrescriptionTemp persistentInstance) {
        log.debug("deleting ClsClausePrescriptionTemp instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public ClsClausePrescriptionTemp merge(ClsClausePrescriptionTemp detachedInstance) {
        log.debug("merging ClsClausePrescriptionTemp instance");
        try {
            ClsClausePrescriptionTemp result = (ClsClausePrescriptionTemp) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ClsClausePrescriptionTemp findById( ClsClausePrescriptionTempId id) {
        log.debug("getting ClsClausePrescriptionTemp instance with id: " + id);
        try {
            ClsClausePrescriptionTemp instance = (ClsClausePrescriptionTemp) sessionFactory.getCurrentSession()
                    .get("ClsClausePrescriptionTemp", id);
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
    
    public List findByExample(ClsClausePrescriptionTemp instance) {
        log.debug("finding ClsClausePrescriptionTemp instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("ClsClausePrescriptionTemp")
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

