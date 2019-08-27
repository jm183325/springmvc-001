package springmvc.requestMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
	private String userName;
	private String password;
	private Address address;
}
