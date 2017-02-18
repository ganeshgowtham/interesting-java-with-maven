package com.mycompany.scrap.clone;

public enum FilePermissions {
	NO_PERMISSION(0), EXECUTE_PERMISSION(1), WRITE_PERMISSION(2);
	
	private Integer permissionCode;

	private FilePermissions(int permissionCode) {
		this.permissionCode = permissionCode;
	}
}
