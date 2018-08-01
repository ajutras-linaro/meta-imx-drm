DESCRIPTION = "Image to validate Westeros WPE on i.MX 8M machine."
LICENSE = "MIT"

inherit core-image

## Select Image Features
IMAGE_FEATURES += " \
    debug-tweaks \
    tools-profile \
    splash \
    nfs-server \
    tools-debug \
    ssh-server-dropbear \
    tools-testapps \
    hwcodecs \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-fsl-tools-audio \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-gstreamer1.0-full \
    kmscube \
    westeros-soc \
    westeros \
    westeros-simplebuffer \
    westeros-simpleshell \
    wpewebkit \
    wpebackend-rdk \
    wpeframework \
    wpeframework-plugins \
    wpeframework-ui \
"
