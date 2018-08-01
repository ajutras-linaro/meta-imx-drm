# Wayland EGL library
do_install_append(){
cp libEGL.so.1.0 ${D}${libdir}/libwayland-egl.so
}
