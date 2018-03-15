package binarypermissions

fun main(args: Array<String>) {
    canRead(0b000001)
    val johnsPermissions = Permission.READ.flag or Permission.WRITE.flag
    val adamsPermissions = Permission.DELETE.flag or Permission.READ_PERMISSIONS.flag

    if (canRead(johnsPermissions)) {
        println("John can read a book")
    }

    if (!canRead(adamsPermissions)) {
        throw UnsupportedOperationException("Adam can't read :(")
    }
}

fun canRead(userPermissionFlags: Int): Boolean {
    return userPermissionFlags and Permission.READ.flag != 0
}
