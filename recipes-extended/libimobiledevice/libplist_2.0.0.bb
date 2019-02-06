SUMMARY = "A library to handle Apple Property List format whereas it's binary or XML"

LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=ebb5c50ab7cab4baeffba14977030c07 \
                    file://COPYING.LESSER;md5=6ab17b41640564434dda85c06b7124f7"

SRCREV = "bec850fe399639f3b8582a39386216970dea15ed"
SRC_URI = "git://github.com/libimobiledevice/libplist.git;protocol=http"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

EXTRA_OECONF = " --without-cython"