package hrmsapp.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee implements Comparable {
    private Integer id;
    private String name;
    private LocalDate dateOfBirth;
    private Double salary;
    //HAS-A
    private Address address;
	@Override
	public int compareTo(Object o) {
		if(this.id == (((Employee)o).id)) {
			return 0;
		}else if(this.id < (((Employee)o).id)) {
			return 1;
		}else {
			return -1;
		}
	}
}