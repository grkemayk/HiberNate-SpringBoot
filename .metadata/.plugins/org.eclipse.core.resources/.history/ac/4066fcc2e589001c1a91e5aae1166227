import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class main {

	public static void main(String[] args) {
		System.out.print("BASLADI\n");
		 Configuration config = new Configuration();
		 config.configure();
		 SessionFactory sessionFactory = config.buildSessionFactory();
		 Session session = sessionFactory.getCurrentSession();
			try {
				Student student = new Student("Grkem12","Aykac12", "mail@mail.com12");
				session.beginTransaction();
				session.save(student);
			
				//session.delete(student);
				//session.update(student);
				//Student xStudent = (Student)session.get(Student.class, 163840);
				
				session.getTransaction().commit();
				
				
			} finally {
				sessionFactory.close();
			}	
			
				}

}
