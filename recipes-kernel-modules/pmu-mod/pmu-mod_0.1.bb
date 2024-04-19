SUMMARY = "Example of how to build an external Linux kernel module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "git://github.com/thah3b/pmu-mod-source-code.git;branch=main;protocol=https"
SRCREV = "2b1519d73c9e9674455f6bb36da52c4cdc380c2f"

S = "${WORKDIR}/git"

RPROVIDES:${PN} += "pmu-mod"
