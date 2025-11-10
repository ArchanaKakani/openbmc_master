HOMEPAGE = "https://github.com/openbmc/spdm"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"
SRC_URI = "git://github.com/openbmc/spdm;branch=main;protocol=https"
SRCREV = "08ffcb8ed2091a72c3739f9d6591a047a000d188"

SUMMARY = "SPDM Stack"
DESCRIPTION = "Implementation of the SPDM specifications"
DEPENDS += "systemd"
DEPENDS += "sdeventplus"
DEPENDS += "phosphor-dbus-interfaces"
DEPENDS += "nlohmann-json"
DEPENDS += "cli11"
DEPENDS += "libspdm"
DEPENDS += "phosphor-logging"
PV = "1.0+git${SRCPV}"
PR = "r1"
EXTRA_OEMESON = " \
        -Dtests=false \
        "

S = "${WORKDIR}/git"
SYSTEMD_SERVICE:${PN} += "attestation.service"

inherit meson pkgconfig
inherit systemd
