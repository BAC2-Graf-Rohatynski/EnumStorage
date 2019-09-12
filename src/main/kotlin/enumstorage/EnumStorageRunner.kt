package enumstorage

import enumstorage.update.ApplicationName
import org.json.JSONObject

object EnumStorageRunner {
    fun getUpdateInformation(): JSONObject = UpdateInformation.getAsJson(applicationName = ApplicationName.Enum.name)
}