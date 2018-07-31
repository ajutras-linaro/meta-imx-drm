GYP_DEFINES_append_mx8mq = " ${@base_contains('MACHINE_FEATURES', 'optee', 'ion_secure_heap_id_decoder=2', '', d)}"

