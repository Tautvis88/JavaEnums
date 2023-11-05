package java_enums.example2;

public class UserService {

	public void displayUserInfo(User user) {
		System.out.println("   Username: " + user.getUserName());
		System.out.println("   UserRole: " + user.getUserRole());
		System.out.println(" Permission: " + user.getUserRole().getPermission());
		System.out.println("Description: " + getUserPermissionDescription(user.getUserRole()));
		System.out.println("--------------------------------------------------");
	}

	public String getUserPermissionDescription(UserRole userRole) {
		switch (userRole) {
			case ADMIN:
				return "Administrators are allowed to manage users, content, and system settings.";
			case USER:
				return "Registered users can create content and interact with content.";
			case GUEST:
				return "Unregistered users have read-only rights with limited access to content";
			case MODERATOR:
				return "Moderators have the ability to edit, remove, or hide violent content.";
			default:
				return "Undefined role";
		}
	}
}
