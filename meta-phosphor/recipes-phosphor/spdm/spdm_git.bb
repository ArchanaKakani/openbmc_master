SUMMARY = "SPDM Stack"
DESCRIPTION = "Implementation of the SPDM specification for secure authentication and attestation"

SRC_URI = "git://github.com/openbmc/spdm;branch=main;protocol=https"
SRCREV = "826f2d7dcf8d6c5b3befc63a0be62410ccf3fb68"

PV = "1.0+git${SRCPV}"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

inherit meson pkgconfig systemd

S = "${WORKDIR}/git"

DEPENDS = " \
    systemd \
    sdeventplus \
    phosphor-dbus-interfaces \
    cli11 \
    libspdm \
    phosphor-logging \
"
SYSTEMD_SERVICE:${PN} += "spdmd.service"

