/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ServiceSAPDependency as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the ServiceSAPDependencyBean Interface. The CIM class ServiceSAPDependency is
 * described as follows:
 * 
 * CIM_ServiceSAPDependency is an association between a Service and a ServiceAccessPoint that indicates that the referenced SAP is utilized by the
 * Service to provide its functionality. For example, Boot Services can invoke BIOS Disk Services (interrupts) in order to function.
 */
public class ServiceSAPDependency extends Dependency implements Serializable
{

	/**
	 * This constructor creates a ServiceSAPDependencyBeanImpl Class which implements the ServiceSAPDependencyBean Interface, and encapsulates the CIM
	 * class ServiceSAPDependency in a Java Bean. The CIM class ServiceSAPDependency is described as follows:
	 * 
	 * CIM_ServiceSAPDependency is an association between a Service and a ServiceAccessPoint that indicates that the referenced SAP is utilized by the
	 * Service to provide its functionality. For example, Boot Services can invoke BIOS Disk Services (interrupts) in order to function.
	 */
	public ServiceSAPDependency() {
	};

	/**
	 * This method create an Association of the type ServiceSAPDependency between one ServiceAccessPoint object and Service object
	 */
	public static ServiceSAPDependency link(ServiceAccessPoint
			antecedent, Service dependent) {

		return (ServiceSAPDependency) Association.link(ServiceSAPDependency.class, antecedent, dependent);
	}// link

} // Class ServiceSAPDependency