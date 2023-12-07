import lombok.Data;

//@Setter
//@Getter
//@AllArgsConstructor
//@ToString
@Data // adds setters, getters, toString(), hashCode(), equals(Object) and many other methods
public class Employee {		
	  
	  private Integer id;	 
	  private String name;
	  private Integer age;
	  private String city;
	  
}