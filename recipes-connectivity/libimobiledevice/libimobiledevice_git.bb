SUMMARY = "A protocol library to access an iPhone or iPod Touch in Linux"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "\
    file://COPYING;md5=ebb5c50ab7cab4baeffba14977030c07 \
    file://COPYING.LESSER;md5=6ab17b41640564434dda85c06b7124f7 \
"

HOMEPAGE ="http://www.libimobiledevice.org/"

DEPENDS = "libplist libusbmuxd libtasn1 gnutls libgcrypt"


SRCREV = "d200973897e281ba35d6c9c433e1355a49056da8"
SRC_URI = "git://git.libimobiledevice.org/libimobiledevice.git;protocol=http \
           file://0001-fix-large-file-check.patch \
           "

S = "${WORKDIR}/git"

inherit autotools pkgconfig

EXTRA_OECONF = " --without-cython "
