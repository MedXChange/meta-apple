DESCRIPTION = "This daemon is in charge of multiplexing connections over USB to an iPhone or iPod touch."
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=6ab17b41640564434dda85c06b7124f7"

DEPENDS = "udev libusb1 libplist"

inherit autotools pkgconfig gitpkgv

PKGV = "${GITPKGVTAG}"

SRCREV = "fe871d7a2fb67170ecc27c5b88d84585d0de6a89"
SRC_URI = "git://git.sukimashita.com/libusbmuxd.git;protocol=http"

S = "${WORKDIR}/git"

FILES_${PN} += "${base_libdir}/udev/rules.d/"

# fix usbmuxd installing files to /usr/lib64 on 64bit hosts:
#EXTRA_OECMAKE = "-DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')}"

#PACKAGECONFIG ??= ""
#PACKAGECONFIG[plist] = "-DWANT_PLIST=1,-DWANT_PLIST=0,libplist"
