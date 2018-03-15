package binarypermissions

import kotlin.test.*

class PermissionTest {

    @Test
    fun `Check if users can delete `() {
        val permissionsOfJohn = 31
        val permissionsOfMike = 2
        val permissionOfSuperAdmin = 63

        val permissionNamesOfMike = Permission.getPermissionsNames(permissionsOfMike)
        val permissionNamesOfJohn = Permission.getPermissionsNames(permissionsOfJohn)
        val permissionNamesOfSuperAdmin = Permission.getPermissionsNames(permissionOfSuperAdmin)

        assertTrue(permissionNamesOfJohn.contains(Permission.DELETE))
        assertTrue(permissionNamesOfSuperAdmin.contains(Permission.DELETE))
        assertFalse(permissionNamesOfMike.contains(Permission.DELETE))
    }
}
