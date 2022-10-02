package hrmsapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
    private Integer id;
    private Integer houseNo;
    private String street;
    private String city;
    private String state;
    private String country;
    private Long zipcode;
}