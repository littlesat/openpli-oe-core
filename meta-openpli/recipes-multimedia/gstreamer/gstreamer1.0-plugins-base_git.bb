require gstreamer1.0-plugins-base.inc
include gstreamer1.0-common.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=c54ce9345727175ff66d17b67ff51f58 \
                    file://COPYING.LIB;md5=6762ed442b3822387a51c92d928ead0d \
                   "

SRC_URI = " \
	git://anongit.freedesktop.org/gstreamer/gst-plugins-base;branch=${GST_BRANCH};name=base \
	file://0001-Makefile.am-don-t-hardcode-libtool-name-when-running.patch \
	file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
	file://0002-Makefile.am-prefix-calls-to-pkg-config-with-PKG_CONF.patch \
	file://0003-riff-media-added-fourcc-to-all-ffmpeg-mpeg4-video-caps.patch \
	file://0004-rtsp-drop-incorrect-reference-to-gstreamer-sdp-in-Ma.patch \
	file://subparse-avoid-false-negatives-dealing-with-UTF-8.patch \
"

