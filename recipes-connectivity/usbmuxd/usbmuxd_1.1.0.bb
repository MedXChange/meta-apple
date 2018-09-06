DESCRIPTION = "This daemon is in charge of multiplexing connections over USB to an iPhone or iPod touch."
LICENSE = "GPLv3 & GPLv2"
LIC_FILES_CHKSUM = "file://COPYING.GPLv2;md5=ebb5c50ab7cab4baeffba14977030c07 \
                    file://COPYING.GPLv3;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "udev libusb1 libplist libimobiledevice"

inherit autotools pkgconfig gitpkgv

PKGV = "${GITPKGVTAG}"

SRCREV = "68bdf4be88b128c56eea5117361c4e7b51eb27b1"
SRC_URI = "git://git.sukimashita.com/usbmuxd.git;protocol=http"

S = "${WORKDIR}/git"

FILES_${PN} += "${base_libdir}/udev/rules.d/"
FILES_${PN} += "${systemd_unitdir}/system/usbmuxd.service"
