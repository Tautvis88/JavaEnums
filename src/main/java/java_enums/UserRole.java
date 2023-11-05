package java_enums;

public enum UserRole {
	ADMIN("Administrator", "Full access", "admin", 1),
	USER("User", "Basic access", "user", 2),
	GUEST("Guest", "Limited access", "guest", 3),
	MODERATOR("Moderator", "Supervisory access", "moderator", 4);

	private final String roleName;
	private final String permission;
	private final String roleCode;
	private final int roleLevel;

	UserRole(String roleName, String permissions, String roleCode, int roleLevel) {
		this.roleName = roleName;
		this.permission = permissions;
		this.roleCode = roleCode;
		this.roleLevel = roleLevel;
	}

	public String getRoleName() {
		return roleName;
	}

	public String getPermission() {
		return permission;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public int getRoleLevel() {
		return roleLevel;
	}

}
