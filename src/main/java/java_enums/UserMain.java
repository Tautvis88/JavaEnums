package java_enums;

public class UserMain {

	public static void main(String[] args) {

		User adminUser = new User("adminas", UserRole.ADMIN);
		User regularUser = new User("useris", UserRole.USER);
		User guestUser = new User("svecias", UserRole.GUEST);
		User moderatorUser = new User("moderatorius", UserRole.MODERATOR);

		UserService userService = new UserService();
		userService.displayUserInfo(adminUser);
		userService.displayUserInfo(regularUser);
		userService.displayUserInfo(guestUser);
		userService.displayUserInfo(moderatorUser);
	}
}
