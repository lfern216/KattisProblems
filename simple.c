#include <linux/init.h>
#include <linux/module.h>
#include <linux/kernel.h>

/*
##########################################################
## COP4610 – Principles of Operating Systems – Summer C 2017
## Prof. Jose F. Osorio
## Student: Lazaro Fernandez – 4156745
##
## Assignment #: 1
## Specs: Creating Linux Kernel Modules
## Due Date: 05/24/2017 by 11:55pm
##
## Module Name:
##
## We Certify that this program code has been written by us
## and no part of it has been taken from any sources.
##########################################################
*/

/* This function is called when the module is loaded. */
int simple_init(void) {
       printk(KERN_INFO "Loading Module\n");

       return 0;
}

/* This function is called when the module is removed. */
void simple_exit(void) {
	printk(KERN_INFO "Removing Module\n");
}

/* Macros for registering module entry and exit points. */
module_init( simple_init );
module_exit( simple_exit );

MODULE_LICENSE("GPL");
MODULE_DESCRIPTION("Simple Module");
MODULE_AUTHOR("SGG");

