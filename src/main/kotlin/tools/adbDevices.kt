package tools

fun adbDevices() {
	val whereiam = System.getProperty("user.dir")
	val adbdirectory = "$whereiam/platform-tools/adb"
	val printdevsadb = ProcessBuilder(adbdirectory, "devices")
	printdevsadb.redirectOutput(ProcessBuilder.Redirect.INHERIT).redirectError(ProcessBuilder.Redirect.INHERIT).start().waitFor()
}