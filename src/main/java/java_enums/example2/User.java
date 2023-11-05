package java_enums.example2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private String userName;
	private UserRole userRole;
}
