package enumstorage.update

enum class UpdateCommand {
    OnlineUpdate,
    UsbUpdate,
    AvailableOnlineUpdates,
    IsAutoOnlineUpdateEnabled,
    IsAutoOfflineUpdateEnabled,
    EnableAutoOnlineUpdate,
    EnableAutoOfflineUpdate,
    Shutdown,
    Restart
}