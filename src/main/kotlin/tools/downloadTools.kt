package tools

fun downloadTools() {
	val link = "https://dl.google.com/android/repository/platform-tools-latest-linux.zip"
	val fname = "platform-tools-latest-linux.zip"
	val whereiam = System.getProperty("user.dir")
	val adbdirectory = "$whereiam/platform-tools/adb"
	val fastbootdirectory = "$whereiam/platform-tools/fastboot"
	print(whereiam)
	val downloadzip = ProcessBuilder("wget", link, "-P", "/tmp/")
	downloadzip.redirectOutput(ProcessBuilder.Redirect.INHERIT).redirectError(ProcessBuilder.Redirect.INHERIT).start().waitFor()
	val unzipIt = ProcessBuilder("unzip", "/tmp/$fname", "-d", whereiam)
	unzipIt.redirectOutput(ProcessBuilder.Redirect.INHERIT).redirectError(ProcessBuilder.Redirect.INHERIT).start().waitFor()
	println("Downloaded!!!")
	val cleanscreen = ProcessBuilder("clear")
	cleanscreen.start().waitFor()
}