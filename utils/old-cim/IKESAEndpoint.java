/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class IKESAEndpoint as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the IKESAEndpointBean Interface. The CIM class IKESAEndpoint is described as follows:
 * 
 * IKESAEndpoint is created in the first phase of SA negotiation and protects the key negotiation traffic. This endpoint is only created when IKE is
 * the key exchange protocol. Other protocols and their endpoints will be defined in a future release.
 */
public class IKESAEndpoint extends SecurityAssociationEndpoint implements
		Serializable {

	/**
	 * This constructor creates a IKESAEndpointBeanImpl Class which implements the IKESAEndpointBean Interface, and encapsulates the CIM class
	 * IKESAEndpoint in a Java Bean. The CIM class IKESAEndpoint is described as follows:
	 * 
	 * IKESAEndpoint is created in the first phase of SA negotiation and protects the key negotiation traffic. This endpoint is only created when IKE
	 * is the key exchange protocol. Other protocols and their endpoints will be defined in a future release.
	 */
	public IKESAEndpoint() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property initiatorCookie.
	 */
	private long	initiatorCookie;

	/**
	 * This method returns the IKESAEndpoint.initiatorCookie property value. This property is described as follows:
	 * 
	 * Identifier of the IKE phase 1 negotiation initiator. Combined with the ResponderCookie, this value, in string form, may be used to construct
	 * the value of the key field 'Name', inherited from ServiceAccessPoint.
	 * 
	 * @return long current initiatorCookie property value
	 * @exception Exception
	 */
	public long getInitiatorCookie() {

		return this.initiatorCookie;
	} // getInitiatorCookie

	/**
	 * This method sets the IKESAEndpoint.initiatorCookie property value. This property is described as follows:
	 * 
	 * Identifier of the IKE phase 1 negotiation initiator. Combined with the ResponderCookie, this value, in string form, may be used to construct
	 * the value of the key field 'Name', inherited from ServiceAccessPoint.
	 * 
	 * @param long new initiatorCookie property value
	 * @exception Exception
	 */
	public void setInitiatorCookie(long initiatorCookie) {

		this.initiatorCookie = initiatorCookie;
	} // setInitiatorCookie

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property responderCookie.
	 */
	private long	responderCookie;

	/**
	 * This method returns the IKESAEndpoint.responderCookie property value. This property is described as follows:
	 * 
	 * Identifier of the IKE phase 1 negotiation responder. Combined with the InitiatorCookie, this value, in string form, may be used to construct
	 * the value of the key field 'Name', inherited from ServiceAccessPoint.
	 * 
	 * @return long current responderCookie property value
	 * @exception Exception
	 */
	public long getResponderCookie() {

		return this.responderCookie;
	} // getResponderCookie

	/**
	 * This method sets the IKESAEndpoint.responderCookie property value. This property is described as follows:
	 * 
	 * Identifier of the IKE phase 1 negotiation responder. Combined with the InitiatorCookie, this value, in string form, may be used to construct
	 * the value of the key field 'Name', inherited from ServiceAccessPoint.
	 * 
	 * @param long new responderCookie property value
	 * @exception Exception
	 */
	public void setResponderCookie(long responderCookie) {

		this.responderCookie = responderCookie;
	} // setResponderCookie

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property CipherAlgorithm.
	 */

	public enum CipherAlgorithm {
		UNKNOWN,
		OTHER,
		DES,
		IDEA,
		BLOWFISH,
		RC5,
		_3DES,
		CAST,
		DMTF_IANA_RESERVED,
		VENDOR_RESERVED
	}

	private CipherAlgorithm	cipherAlgorithm;

	/**
	 * This method returns the IKESAEndpoint.cipherAlgorithm property value. This property is described as follows:
	 * 
	 * CipherAlgorithm is an enumeration that specifies the encryption algorithm used by the IKESAEndpoint. The list of algorithms was generated from
	 * Appendix A of RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	 * 
	 * @return int current cipherAlgorithm property value
	 * @exception Exception
	 */
	public CipherAlgorithm getCipherAlgorithm() {

		return this.cipherAlgorithm;
	} // getCipherAlgorithm

	/**
	 * This method sets the IKESAEndpoint.cipherAlgorithm property value. This property is described as follows:
	 * 
	 * CipherAlgorithm is an enumeration that specifies the encryption algorithm used by the IKESAEndpoint. The list of algorithms was generated from
	 * Appendix A of RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	 * 
	 * @param int new cipherAlgorithm property value
	 * @exception Exception
	 */
	public void setCipherAlgorithm(CipherAlgorithm cipherAlgorithm) {

		this.cipherAlgorithm = cipherAlgorithm;
	} // setCipherAlgorithm

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherCipherAlgorithm.
	 */
	private String	otherCipherAlgorithm;

	/**
	 * This method returns the IKESAEndpoint.otherCipherAlgorithm property value. This property is described as follows:
	 * 
	 * Description of the encryption algorithm when the value 1 ("Other") is specified for the property, CipherAlgorithm.
	 * 
	 * @return String current otherCipherAlgorithm property value
	 * @exception Exception
	 */
	public String getOtherCipherAlgorithm() {

		return this.otherCipherAlgorithm;
	} // getOtherCipherAlgorithm

	/**
	 * This method sets the IKESAEndpoint.otherCipherAlgorithm property value. This property is described as follows:
	 * 
	 * Description of the encryption algorithm when the value 1 ("Other") is specified for the property, CipherAlgorithm.
	 * 
	 * @param String
	 *            new otherCipherAlgorithm property value
	 * @exception Exception
	 */
	public void setOtherCipherAlgorithm(String otherCipherAlgorithm) {

		this.otherCipherAlgorithm = otherCipherAlgorithm;
	} // setOtherCipherAlgorithm

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property HashAlgorithm.
	 */

	public enum HashAlgorithm {
		UNKNOWN,
		OTHER,
		MD5,
		SHA_1,
		TIGER,
		DMTF_IANA_RESERVED,
		VENDOR_RESERVED
	}

	private HashAlgorithm	hashAlgorithm;

	/**
	 * This method returns the IKESAEndpoint.hashAlgorithm property value. This property is described as follows:
	 * 
	 * HashAlgorithm is an enumeration that specifies the hash function used by the IKESAEndpoint. The list of algorithms was generated from Appendix
	 * A of RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	 * 
	 * @return int current hashAlgorithm property value
	 * @exception Exception
	 */
	public HashAlgorithm getHashAlgorithm() {

		return this.hashAlgorithm;
	} // getHashAlgorithm

	/**
	 * This method sets the IKESAEndpoint.hashAlgorithm property value. This property is described as follows:
	 * 
	 * HashAlgorithm is an enumeration that specifies the hash function used by the IKESAEndpoint. The list of algorithms was generated from Appendix
	 * A of RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	 * 
	 * @param int new hashAlgorithm property value
	 * @exception Exception
	 */
	public void setHashAlgorithm(HashAlgorithm hashAlgorithm) {

		this.hashAlgorithm = hashAlgorithm;
	} // setHashAlgorithm

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherHashAlgorithm.
	 */
	private String	otherHashAlgorithm;

	/**
	 * This method returns the IKESAEndpoint.otherHashAlgorithm property value. This property is described as follows:
	 * 
	 * Description of the hash function when the value 1 ("Other") is specified for the property, HashAlgorithm.
	 * 
	 * @return String current otherHashAlgorithm property value
	 * @exception Exception
	 */
	public String getOtherHashAlgorithm() {

		return this.otherHashAlgorithm;
	} // getOtherHashAlgorithm

	/**
	 * This method sets the IKESAEndpoint.otherHashAlgorithm property value. This property is described as follows:
	 * 
	 * Description of the hash function when the value 1 ("Other") is specified for the property, HashAlgorithm.
	 * 
	 * @param String
	 *            new otherHashAlgorithm property value
	 * @exception Exception
	 */
	public void setOtherHashAlgorithm(String otherHashAlgorithm) {

		this.otherHashAlgorithm = otherHashAlgorithm;
	} // setOtherHashAlgorithm

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property AuthenticationMethod.
	 */

	public enum AuthenticationMethod {
		UNKNOWN,
		OTHER,
		PRE_SHARED_KEY,
		DSS_SIGNATURES,
		RSA_SIGNATURES,
		ENCRYPTION_WITH_RSA,
		REVISED_ENCRYPTION_WITH_RSA,
		DMTF_IANA_RESERVED,
		VENDOR_RESERVED
	}

	private AuthenticationMethod	authenticationMethod;

	/**
	 * This method returns the IKESAEndpoint.authenticationMethod property value. This property is described as follows:
	 * 
	 * AuthenticationMethod is an enumeration that specifies the operation of the IKESAEndpoint. The list of methods was generated from Appendix A of
	 * RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	 * 
	 * @return int current authenticationMethod property value
	 * @exception Exception
	 */
	public AuthenticationMethod getAuthenticationMethod() {

		return this.authenticationMethod;
	} // getAuthenticationMethod

	/**
	 * This method sets the IKESAEndpoint.authenticationMethod property value. This property is described as follows:
	 * 
	 * AuthenticationMethod is an enumeration that specifies the operation of the IKESAEndpoint. The list of methods was generated from Appendix A of
	 * RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	 * 
	 * @param int new authenticationMethod property value
	 * @exception Exception
	 */
	public void setAuthenticationMethod(AuthenticationMethod
			authenticationMethod) {

		this.authenticationMethod = authenticationMethod;
	} // setAuthenticationMethod

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherAuthenticationMethod.
	 */
	private String	otherAuthenticationMethod;

	/**
	 * This method returns the IKESAEndpoint.otherAuthenticationMethod property value. This property is described as follows:
	 * 
	 * Description of the method when the value 1 ("Other") is specified for the property, AuthenticationMethod.
	 * 
	 * @return String current otherAuthenticationMethod property value
	 * @exception Exception
	 */
	public String getOtherAuthenticationMethod() {

		return this.otherAuthenticationMethod;
	} // getOtherAuthenticationMethod

	/**
	 * This method sets the IKESAEndpoint.otherAuthenticationMethod property value. This property is described as follows:
	 * 
	 * Description of the method when the value 1 ("Other") is specified for the property, AuthenticationMethod.
	 * 
	 * @param String
	 *            new otherAuthenticationMethod property value
	 * @exception Exception
	 */
	public void setOtherAuthenticationMethod(String otherAuthenticationMethod)
	{

		this.otherAuthenticationMethod = otherAuthenticationMethod;
	} // setOtherAuthenticationMethod

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property GroupId.
	 */

	public enum GroupId {
		NO_GROUP_NON_DIFFIE_HELLMAN_EXCHANGE,
		DH_768_BIT_PRIME,
		DH_1024_BIT_PRIME,
		EC2N_155_BIT_FIELD_ELEMENT,
		EC2N_185_BIT_FIELD_ELEMENT,
		DH_1536_BIT_PRIME,
		STANDARD_GROUP_RESERVED,
		VENDOR_RESERVED
	}

	private GroupId	groupId;

	/**
	 * This method returns the IKESAEndpoint.groupId property value. This property is described as follows:
	 * 
	 * GroupId specifies the key exchange group ID. If the GroupID number is from the vendor-specific range (32768-65535), the VendorID qualifies the
	 * group number. Well-known group identifiers from RFC2412, Appendix E, are: Group 1='768 bit prime', Group 2='1024 bit prime', Group 3= 'Elliptic
	 * Curve Group with 155 bit field element', Group 4= 'Large Elliptic Curve Group with 185 bit field element', and Group 5='1536 bit prime'.
	 * 
	 * @return int current groupId property value
	 * @exception Exception
	 */
	public GroupId getGroupId() {

		return this.groupId;
	} // getGroupId

	/**
	 * This method sets the IKESAEndpoint.groupId property value. This property is described as follows:
	 * 
	 * GroupId specifies the key exchange group ID. If the GroupID number is from the vendor-specific range (32768-65535), the VendorID qualifies the
	 * group number. Well-known group identifiers from RFC2412, Appendix E, are: Group 1='768 bit prime', Group 2='1024 bit prime', Group 3= 'Elliptic
	 * Curve Group with 155 bit field element', Group 4= 'Large Elliptic Curve Group with 185 bit field element', and Group 5='1536 bit prime'.
	 * 
	 * @param int new groupId property value
	 * @exception Exception
	 */
	public void setGroupId(GroupId groupId) {

		this.groupId = groupId;
	} // setGroupId

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property vendorID.
	 */
	private String	vendorID;

	/**
	 * This method returns the IKESAEndpoint.vendorID property value. This property is described as follows:
	 * 
	 * VendorID identifies the vendor when the value of GroupID is in the vendor-specific range, 32768 to 65535.
	 * 
	 * @return String current vendorID property value
	 * @exception Exception
	 */
	public String getVendorID() {

		return this.vendorID;
	} // getVendorID

	/**
	 * This method sets the IKESAEndpoint.vendorID property value. This property is described as follows:
	 * 
	 * VendorID identifies the vendor when the value of GroupID is in the vendor-specific range, 32768 to 65535.
	 * 
	 * @param String
	 *            new vendorID property value
	 * @exception Exception
	 */
	public void setVendorID(String vendorID) {

		this.vendorID = vendorID;
	} // setVendorID

} // Class IKESAEndpoint
