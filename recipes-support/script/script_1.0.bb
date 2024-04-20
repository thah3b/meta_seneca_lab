SUMMARY = "Recipe to run a GStreamer pipeline"
LICENSE = "MIT"

SRC_URI = "file://script.sh"

S = "${WORKDIR}"

inherit update-rc.d

INSTALL_INITD_${PN} = "script-init"
INITSCRIPT_PARAMS = "start 98 2 3 4 5 . stop 20 0 1 6 ."
