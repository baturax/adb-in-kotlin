package tools

fun fastbootDevices() {
	val whereiam = System.getProperty("user.dir")
	val adbdirectory = "$whereiam/platform-tools/adb"
	val fastbootdirectory = "$whereiam/platform-tools/fastboot"
	val printdevsfb = ProcessBuilder(fastbootdirectory, "--version")
	printdevsfb.redirectOutput(ProcessBuilder.Redirect.INHERIT).redirectError(ProcessBuilder.Redirect.INHERIT).start().waitFor()
}
//deneme