DESCRIPTION = "This daemon is in charge of multiplexing connections over USB to an iPhone or iPod touch."
LICENSE = "GPLv3 & GPLv2"
LIC_FILES_CHKSUM = "file://COPYING.GPLv2;md5=ebb5c50ab7cab4baeffba14977030c07 \
                    file://COPYING.GPLv3;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "udev libusb1 libplist libimobiledevice"

inherit autotools pkgconfig systemd useradd

SRCREV = "96e4aabe0b9a46ea9da4955a10c774a8e58fe677"
SRC_URI = "git://github.com/libimobiledevice/usbmuxd.git;protocol=http"

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
PV = "git${SRCPV}"

FILES_${PN} += "${base_libdir}/udev/rules.d/"
FILES_${PN} += "${systemd_unitdir}/system/usbmuxd.service"

SYSTEMD_SERVICE_${PN} += "usbmuxd.service"

USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = " \
    --system --no-create-home \
    --user-group usbmux"