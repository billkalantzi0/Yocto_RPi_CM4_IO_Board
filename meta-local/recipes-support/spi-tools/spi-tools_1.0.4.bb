SUMMARY = "SPI Tools"
DESCRIPTION = "Utilities for controlling SPI devices from userspace"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
SRC_URI = "git://github.com/czmilacek/spi-tools.git;branch=master;protocol=https"
SRCREV = "6e53ee872e4277d5a03cfa66e38b03d2dbaff342"
S = "${WORKDIR}/git"

inherit autotools pkgconfig

BBCLASSEXTEND = "native nativesdk"
