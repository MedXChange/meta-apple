SUMMARY = "A fuse filesystem to access the contents of an iPhone or iPod Touch"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=6ab17b41640564434dda85c06b7124f7"
HOMEPAGE ="http://www.libimobiledevice.org/"

DEPENDS = "fuse libimobiledevice"

SRC_URI = " \
    http://www.libimobiledevice.org/downloads/ifuse-${PV}.tar.bz2 \
"

SRC_URI[md5sum] = "83478c7b531b26db286c293bb25bd917"
SRC_URI[sha256sum] = "a788de66fb7720c84a5a775df415f78bbfb7c467a76c732d23292c6986252add"

inherit autotools pkgconfig
