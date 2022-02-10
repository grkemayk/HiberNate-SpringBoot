import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class main {

	public static void main(String[] args) 
	{
		System.out.print("BASLADI\n");
		Configuration config = new Configuration();
		config.configure();//Config dosyası okunur
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();//DB ve tablolar olusturulur
		try 
		{
			session.beginTransaction();
			
			Student student = new Student("Grkem12","Aykac12", "mail@mail.com12");
			session.save(student);
		
			
			session.getTransaction().commit();//Queryleri gönderir
		} 
		finally 
		{
			sessionFactory.close();
		}							
	}

}
