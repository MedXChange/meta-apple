SUMMARY = "A library to handle Apple Property List format whereas it's binary or XML"

LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=ebb5c50ab7cab4baeffba14977030c07 \
                    file://COPYING.LESSER;md5=6ab17b41640564434dda85c06b7124f7"

DEPENDS = "libxml2 glib-2.0 swig python"

inherit autotools pkgconfig

SRC_URI = "http://www.libimobiledevice.org/downloads/libplist-${PV}.tar.bz2"

SRC_URI[md5sum] = "8b04b0f09f2398022dcd4fba75012997"
SRC_URI[sha256sum] = "0effdedcb3de128c4930d8c03a3854c74c426c16728b8ab5f0a5b6bdc0b644be"

do_install_append () {
    if [ -e ${D}${libdir}/python*/site-packages/plist/_plist.so ]; then
        chrpath -d ${D}${libdir}/python*/site-packages/plist/_plist.so
    fi
}

PACKAGES =+ "${PN}-utils ${PN}++ ${PN}-python"
FILES_${PN} = "${libdir}/libplist${SOLIBS}"
FILES_${PN}++ = "${libdir}/libplist++${SOLIBS}"
FILES_${PN}-utils = "${bindir}/*"
FILES_${PN}-python = "${libdir}/python*/site-packages/*"

EXTRA_OECONF = " --without-cython"

# Yes, both this and the export in do_compile_prepend are needed :/

# TODO can we get the python version from a variable instead of hardcoding it to 3.5?
PYTHON_LDFLAGS = " -lpython3.5m"

do_compile_prepend() {
    export PYTHON_LDFLAGS="$PYTHON_LDFLAGS -lpython3.5m"
}