package binarypermissions


enum class Permission(val flag: Int) {

    READ(0b000001),
    WRITE(0b000010),
    DELETE(0b000100),
    READ_PERMISSIONS(0b001000),
    WRITE_PERMISSIONS(0b010000),
    DELETE_PERMISSIONS(0b100000);

    /**
     * Converter for a permission integer into a collection of PermissionFlags
     *
     * @param permissionFlag numeric permission flag
     * @return set of [Permission]
     */
    companion object {
        fun getPermissionsNames(permissionFlag: Int): Set<Permission> {
            val permissions = mutableSetOf<Permission>()
            for (permission in Permission.values()) {
                val flagValue = permission.flag
                if (flagValue and permissionFlag == flagValue) {
                    permissions.add(permission)
                }
            }
            return permissions
        }
    }
}

