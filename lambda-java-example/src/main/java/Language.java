import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "LanguageDefination" , uniqueConstraints=
@UniqueConstraint(columnNames = {"id"})) //Unique fieldlar burada belirlenir.
public class Language {
	 
		@Id
	  //primary key auto increment burada oluşturulur.
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id; 
	  
	  @Column(name = "language_name")
	  private String LanguageName; 
	
	  public Language(String LanguageName)
	  {
		  this.LanguageName = LanguageName;
	  }
	  public void setId(int i)
	  {
		  id = i;
	  }
}
