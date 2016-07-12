require librealsense.inc

SRC_URI = "https://github.com/IntelRealSense/librealsense/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "3d05ab7bc3ffefecb0fc9946703b778a"
SRC_URI[sha256sum] = "ad22f743632d29a6a3efe3966c58220c2390c31d3bc334b2548c01fbe98e0490"

PR = "r0"

S = "${WORKDIR}/${PN}-${PV}"
