SUMMARY = "A fuse filesystem to access the contents of an iPhone or iPod Touch"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=6ab17b41640564434dda85c06b7124f7"
HOMEPAGE ="http://www.libimobiledevice.org/"

DEPENDS = "fuse libimobiledevice usbmuxd"

SRCREV = "e75d32c34d0e8b80320f0a007d5ecbb3f55ef7f0"
SRC_URI = "git://github.com/libimobiledevice/ifuse.git;protocol=http"

S = "${WORKDIR}/git"

inherit autotools pkgconfig
