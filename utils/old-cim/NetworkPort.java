/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.Serializable;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class NetworkPort as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the NetworkPortBean Interface. The CIM class NetworkPort is described as follows:
 * 
 * NetworkPort is the logical representation of network communications hardware such as a physical connector and the setup or operation of the network
 * chips, at the lowest layers of a network stack.
 */
public class NetworkPort extends LogicalPort implements Serializable {

	// TODO IT HAVE TO BE MODIFIED
	public void merge(NetworkPort networkPort) {
		if (this.getElementName() == null)
			this.setElementName(networkPort.getElementName());
		if (this.getPermanentAddress() == null)
			this.setPermanentAddress(networkPort.getPermanentAddress());

		if (this.getDescription() == null)
			this.setDescription(networkPort.getDescription());

		/* default params */
		if (!this.isFullDuplex())
			this.setFullDuplex(networkPort.isFullDuplex());
		if (this.getMaxSpeed() == 0)
			this.setMaxSpeed(networkPort.getMaxSpeed());

	}

	/**
	 * MANUALLY ADDED TO CIM (12/04/2011)<br>
	 * Sets the LogicalModule that has this port as a ModulePort
	 * 
	 * @param logicalModule
	 */
	public void setModule(LogicalModule logicalModule) {

		if (logicalModule != null) {
			Association a = this.getFirstFromAssociationByTypeAndElement(ModulePort.class, logicalModule);
			if (a != null)
				a.unlink();

			ModulePort.link(logicalModule, this);
		}
	}

	/**
	 * MANUALLY ADDED TO CIM (12/04/2011)<br>
	 * Gets the LogicalModule that has this port as a ModulePort
	 * 
	 * @return LogicalModule that exports this NetworkPort
	 */
	public LogicalModule getModule() {
		return (LogicalModule) this.getFirstFromAssociatedElementByType(ModulePort.class);
	}

	/**
	 * This constructor creates a NetworkPortBeanImpl Class which implements the NetworkPortBean Interface, and encapsulates the CIM class NetworkPort
	 * in a Java Bean. The CIM class NetworkPort is described as follows:
	 * 
	 * NetworkPort is the logical representation of network communications hardware such as a physical connector and the setup or operation of the
	 * network chips, at the lowest layers of a network stack.
	 */
	public NetworkPort() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property speed.
	 */
	private long	speed;

	/**
	 * This method returns the NetworkPort.speed property value. This property is described as follows:
	 * 
	 * The current bandwidth of the Port in Bits per Second. For ports that vary in bandwidth or for those where no accurate estimation can be made,
	 * this property should contain the nominal bandwidth.
	 * 
	 * @return long current speed property value
	 * @exception Exception
	 */
	@Override
	public long getSpeed() {

		return this.speed;
	} // getSpeed

	/**
	 * This method sets the NetworkPort.speed property value. This property is described as follows:
	 * 
	 * The current bandwidth of the Port in Bits per Second. For ports that vary in bandwidth or for those where no accurate estimation can be made,
	 * this property should contain the nominal bandwidth.
	 * 
	 * @param long new speed property value
	 * @exception Exception
	 */
	@Override
	public void setSpeed(long speed) {

		this.speed = speed;
	} // setSpeed

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherNetworkPortType.
	 */
	@Deprecated
	private String	otherNetworkPortType;

	/**
	 * This method returns the NetworkPort.otherNetworkPortType property value. This property is described as follows:
	 * 
	 * Note: The use of this property is deprecated in lieu of CIM_LogicalPort.PortType. Deprecated description: The type of module, when PortType is
	 * set to 1 ("Other".)
	 * 
	 * @return String current otherNetworkPortType property value
	 * @exception Exception
	 */
	@Deprecated
	public String getOtherNetworkPortType() {

		return this.otherNetworkPortType;
	} // getOtherNetworkPortType

	/**
	 * This method sets the NetworkPort.otherNetworkPortType property value. This property is described as follows:
	 * 
	 * Note: The use of this property is deprecated in lieu of CIM_LogicalPort.PortType. Deprecated description: The type of module, when PortType is
	 * set to 1 ("Other".)
	 * 
	 * @param String
	 *            new otherNetworkPortType property value
	 * @exception Exception
	 */
	@Deprecated
	public void setOtherNetworkPortType(String otherNetworkPortType) {

		this.otherNetworkPortType = otherNetworkPortType;
	} // setOtherNetworkPortType

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property portNumber.
	 */
	private int	portNumber;

	/**
	 * This method returns the NetworkPort.portNumber property value. This property is described as follows:
	 * 
	 * NetworkPorts are often numbered relative to either a logical module or a network element.
	 * 
	 * @return int current portNumber property value
	 * @exception Exception
	 */
	public int getPortNumber() {

		return this.portNumber;
	} // getPortNumber

	/**
	 * This method sets the NetworkPort.portNumber property value. This property is described as follows:
	 * 
	 * NetworkPorts are often numbered relative to either a logical module or a network element.
	 * 
	 * @param int new portNumber property value
	 * @exception Exception
	 */
	public void setPortNumber(int portNumber) {

		this.portNumber = portNumber;
	} // setPortNumber

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property LinkTechnology.
	 */

	public enum LinkTechnology {
		UNKNOWN, OTHER, ETHERNET, IB, FC, FDDI, ATM, TOKEN_RING, FRAME_RELAY, INFRARED, BLUETOOTH, WIRELESS_LAN
	}

	private LinkTechnology	linkTechnology;

	/**
	 * This method returns the NetworkPort.linkTechnology property value. This property is described as follows:
	 * 
	 * An enumeration of the types of links. When set to 1 ("Other"), the related property OtherLinkTechnology contains a string description of the
	 * type of link.
	 * 
	 * @return int current linkTechnology property value
	 * @exception Exception
	 */
	public LinkTechnology getLinkTechnology() {

		return this.linkTechnology;
	} // getLinkTechnology

	/**
	 * This method sets the NetworkPort.linkTechnology property value. This property is described as follows:
	 * 
	 * An enumeration of the types of links. When set to 1 ("Other"), the related property OtherLinkTechnology contains a string description of the
	 * type of link.
	 * 
	 * @param int new linkTechnology property value
	 * @exception Exception
	 */
	public void setLinkTechnology(LinkTechnology linkTechnology) {
		this.linkTechnology = linkTechnology;
	} // setLinkTechnology

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherLinkTechnology.
	 */
	private String	otherLinkTechnology;

	/**
	 * This method returns the NetworkPort.otherLinkTechnology property value. This property is described as follows:
	 * 
	 * A string value that describes LinkTechnology when it is set to 1, "Other".
	 * 
	 * @return String current otherLinkTechnology property value
	 * @exception Exception
	 */
	public String getOtherLinkTechnology() {

		return this.otherLinkTechnology;
	} // getOtherLinkTechnology

	/**
	 * This method sets the NetworkPort.otherLinkTechnology property value. This property is described as follows:
	 * 
	 * A string value that describes LinkTechnology when it is set to 1, "Other".
	 * 
	 * @param String
	 *            new otherLinkTechnology property value
	 * @exception Exception
	 */
	public void setOtherLinkTechnology(String otherLinkTechnology) {

		this.otherLinkTechnology = otherLinkTechnology;
	} // setOtherLinkTechnology

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property permanentAddress.
	 */
	private String	permanentAddress;

	/**
	 * This method returns the NetworkPort.permanentAddress property value. This property is described as follows:
	 * 
	 * PermanentAddress defines the network address that is hardcoded into a port. This 'hardcoded' address can be changed using a firmware upgrade or
	 * a software configuration. When this change is made, the field should be updated at the same time. PermanentAddress should be left blank if no
	 * 'hardcoded' address exists for the NetworkAdapter.
	 * 
	 * @return String current permanentAddress property value
	 * @exception Exception
	 */
	public String getPermanentAddress() {

		return this.permanentAddress;
	} // getPermanentAddress

	/**
	 * This method sets the NetworkPort.permanentAddress property value. This property is described as follows:
	 * 
	 * PermanentAddress defines the network address that is hardcoded into a port. This 'hardcoded' address can be changed using a firmware upgrade or
	 * a software configuration. When this change is made, the field should be updated at the same time. PermanentAddress should be left blank if no
	 * 'hardcoded' address exists for the NetworkAdapter.
	 * 
	 * @param String
	 *            new permanentAddress property value
	 * @exception Exception
	 */
	public void setPermanentAddress(String permanentAddress) {

		this.permanentAddress = permanentAddress;
	} // setPermanentAddress

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property networkAddresses.
	 */
	private String[]	networkAddresses;

	/**
	 * This method returns the NetworkPort.networkAddresses property value. This property is described as follows:
	 * 
	 * An array of strings that indicates the network addresses for the port.
	 * 
	 * @return String[] current networkAddresses property value
	 * @exception Exception
	 */
	public String[] getNetworkAddresses() {

		return this.networkAddresses;
	} // getNetworkAddresses

	/**
	 * This method sets the NetworkPort.networkAddresses property value. This property is described as follows:
	 * 
	 * An array of strings that indicates the network addresses for the port.
	 * 
	 * @param String
	 *            [] new networkAddresses property value
	 * @exception Exception
	 */
	public void setNetworkAddresses(String networkAddresses) {

		this.networkAddresses[this.networkAddresses.length] = networkAddresses;
	} // setNetworkAddresses

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property fullDuplex.
	 */
	private boolean	fullDuplex;

	/**
	 * This method returns the NetworkPort.fullDuplex property value. This property is described as follows:
	 * 
	 * Boolean that indicates that the port is operating in full duplex mode.
	 * 
	 * @return boolean current fullDuplex property value
	 * @exception Exception
	 */
	public boolean isFullDuplex() {

		return this.fullDuplex;
	} // getFullDuplex

	/**
	 * This method sets the NetworkPort.fullDuplex property value. This property is described as follows:
	 * 
	 * Boolean that indicates that the port is operating in full duplex mode.
	 * 
	 * @param boolean new fullDuplex property value
	 * @exception Exception
	 */
	public void setFullDuplex(boolean fullDuplex) {

		this.fullDuplex = fullDuplex;
	} // setFullDuplex

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property autoSense.
	 */
	private boolean	autoSense;

	/**
	 * This method returns the NetworkPort.autoSense property value. This property is described as follows:
	 * 
	 * A Boolean that indicates whether the NetworkPort is capable of automatically determining the speed or other communications characteristics of
	 * the attached network media.
	 * 
	 * @return boolean current autoSense property value
	 * @exception Exception
	 */
	public boolean isAutoSense() {

		return this.autoSense;
	} // getAutoSense

	/**
	 * This method sets the NetworkPort.autoSense property value. This property is described as follows:
	 * 
	 * A Boolean that indicates whether the NetworkPort is capable of automatically determining the speed or other communications characteristics of
	 * the attached network media.
	 * 
	 * @param boolean new autoSense property value
	 * @exception Exception
	 */
	public void setAutoSense(boolean autoSense) {

		this.autoSense = autoSense;
	} // setAutoSense

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property supportedMaximumTransmissionUnit.
	 */
	private long	supportedMaximumTransmissionUnit;

	/**
	 * This method returns the NetworkPort.supportedMaximumTransmissionUnit property value. This property is described as follows:
	 * 
	 * The maximum transmission unit (MTU) that can be supported.
	 * 
	 * @return long current supportedMaximumTransmissionUnit property value
	 * @exception Exception
	 */
	public long getSupportedMaximumTransmissionUnit() {

		return this.supportedMaximumTransmissionUnit;
	} // getSupportedMaximumTransmissionUnit

	/**
	 * This method sets the NetworkPort.supportedMaximumTransmissionUnit property value. This property is described as follows:
	 * 
	 * The maximum transmission unit (MTU) that can be supported.
	 * 
	 * @param long new supportedMaximumTransmissionUnit property value
	 * @exception Exception
	 */
	public void setSupportedMaximumTransmissionUnit(
			long supportedMaximumTransmissionUnit) {

		this.supportedMaximumTransmissionUnit = supportedMaximumTransmissionUnit;
	} // setSupportedMaximumTransmissionUnit

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property activeMaximumTransmissionUnit.
	 */
	private long	activeMaximumTransmissionUnit;

	/**
	 * This method returns the NetworkPort.activeMaximumTransmissionUnit property value. This property is described as follows:
	 * 
	 * The active or negotiated maximum transmission unit (MTU) that can be supported.
	 * 
	 * @return long current activeMaximumTransmissionUnit property value
	 * @exception Exception
	 */
	public long getActiveMaximumTransmissionUnit() {

		return this.activeMaximumTransmissionUnit;
	} // getActiveMaximumTransmissionUnit

	/**
	 * This method sets the NetworkPort.activeMaximumTransmissionUnit property value. This property is described as follows:
	 * 
	 * The active or negotiated maximum transmission unit (MTU) that can be supported.
	 * 
	 * @param long new activeMaximumTransmissionUnit property value
	 * @exception Exception
	 */
	public void setActiveMaximumTransmissionUnit(
			long activeMaximumTransmissionUnit) {

		this.activeMaximumTransmissionUnit = activeMaximumTransmissionUnit;
	} // setActiveMaximumTransmissionUnit

} // Class NetworkPort
