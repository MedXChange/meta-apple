SUMMARY = "A protocol library to access an iPhone or iPod Touch in Linux"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "\
    file://COPYING;md5=ebb5c50ab7cab4baeffba14977030c07 \
    file://COPYING.LESSER;md5=6ab17b41640564434dda85c06b7124f7 \
"

HOMEPAGE ="http://www.libimobiledevice.org/"

DEPENDS = "libplist usbmuxd libtasn1 gnutls libgcrypt"

SRC_URI = "http://www.libimobiledevice.org/downloads/libimobiledevice-${PV}.tar.bz2 \
           file://0001-Fix-large-file-support-check-that-doesn-t-work-corre.patch \
           "

SRC_URI[md5sum] = "8757900ba7bbe2ef5f54342415d0223e"
SRC_URI[sha256sum] = "786b0de0875053bf61b5531a86ae8119e320edab724fc62fe2150cc931f11037"

inherit autotools pkgconfig

EXTRA_OECONF = " --without-cython "
