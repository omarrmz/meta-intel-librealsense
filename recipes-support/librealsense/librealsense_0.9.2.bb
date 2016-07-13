require librealsense.inc

BB_STRICT_CHECKSUM="0"

SRC_URI = "https://github.com/IntelRealSense/librealsense/archive/v${PV}.tar.gz"

PR = "r0"

S = "${WORKDIR}/${PN}-${PV}"
