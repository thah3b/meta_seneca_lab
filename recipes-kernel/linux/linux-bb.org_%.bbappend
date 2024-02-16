inherit logging
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
            file://usb-gadget.cfg \
            file://0001-original-patch-k3-am625-beagleplay.patch \
            "

KERNEL_FEATURES:append = "usb-gadget.cfg"

do_patch:prepend() {
    bb.warn("Running do_patch()")
}
