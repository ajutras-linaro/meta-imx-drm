DESCRIPTION = "Freescale Image - Adds DRM"
LICENSE = "MIT"

require recipes-fsl/images/fsl-image-qt5-validation-imx.bb

# Add Chromium
IMAGE_INSTALL_append = \
     " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'chromium-wayland chromium-wayland-chromedriver libexif', \
         bb.utils.contains('DISTRO_FEATURES',     'x11', 'chromium chromium-chromedriver libexif', \
                                                         '', d), d)}"

LICENSE_FLAGS_WHITELIST_append = \
     " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'commercial', \
         bb.utils.contains('DISTRO_FEATURES',     'x11', 'commercial', \
                                                         '', d), d)}"

# Add optee-aes-decryptor, ocdmi and portmap
IMAGE_INSTALL_append = " ${@bb.utils.contains('MACHINE_FEATURES', 'optee', 'optee-aes-decryptor ocdmi portmap', '', d)}"

# Mask unused recipes
BBMASK += "rpb-westonchromium-image linux-hikey linux-96boards ti-sgx-ddk-um"

