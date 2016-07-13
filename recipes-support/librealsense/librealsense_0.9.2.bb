require librealsense.inc

SRC_URI = "https://github.com/IntelRealSense/librealsense/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "6fdc1ca62ae8aeda2ece35283c47fef5"
SRC_URI[sha256sum] = "945a7b1b1500a93678f9e52801f7611c003735038ad3d9bceabcb8ac8d07142f"

PR = "r0"

S = "${WORKDIR}/${PN}-${PV}"
