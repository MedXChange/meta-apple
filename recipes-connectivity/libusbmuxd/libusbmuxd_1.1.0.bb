DESCRIPTION = "A client library to multiplex connections from and to iOS devices."
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=6ab17b41640564434dda85c06b7124f7"

DEPENDS = "udev libusb1 libplist"

inherit autotools pkgconfig

SRCREV = "c75605d862cd1c312494f6c715246febc26b2e05"
SRC_URI = "git://github.com/libimobiledevice/libusbmuxd.git;protocol=http"

S = "${WORKDIR}/git"

FILES_${PN} += "${base_libdir}/udev/rules.d/"