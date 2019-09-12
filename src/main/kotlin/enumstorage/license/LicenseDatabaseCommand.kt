package enumstorage.license

/**
 * Enum class for available database commands
 *
 * @author      Markus Graf
 */
enum class LicenseDatabaseCommand {
    Activate,
    GetAllLicenses,
    AddLicense,
    ExtendExpirationDate,
    Lock,
    LockAll,
    Unlock,
    Delete,
    GetActiveLicense,
    Deactivate,
    Command
}