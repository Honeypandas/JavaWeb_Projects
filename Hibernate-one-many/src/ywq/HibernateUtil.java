package ywq;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;




public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;

	static {
		Configuration config=new Configuration();
		
		config.configure();
		//��������ע�����
		ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//�����Ự��������
		sessionFactory=config.buildSessionFactory(serviceRegistry);
		//�Ự����
		session=sessionFactory.openSession();
	}
	
	//��ȡSessionFactory
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	//��ȡSession
	public static Session getSession(){
		session=sessionFactory.openSession();
		return session;
	}
	
	//�ر�Session
	public static void closeSession(Session session){
		if(session!=null){
			session.close();
		}
	}
}
