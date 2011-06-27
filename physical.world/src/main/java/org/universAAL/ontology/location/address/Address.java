package org.universAAL.ontology.location.address;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.location.outdoor.*;

/**
 * Ontological representation of an Address. It can be used on its own but it is
 * recommended to use one of its subclasses. Methods included in this class are
 * the mandatory ones for representing an ontological concept in Java classes
 * for uAAL. Usually it includes getters and setters for most of its properties.
 * 
 * @author alfiva
 * 
 */
public class Address extends ManagedIndividual {

    public static final String MY_URI;
    public static final String PROP_HAS_REGION;
    public static final String PROP_HAS_COUNTRY;
    public static final String PROP_HAS_STATE;
    public static final String PROP_HAS_CITY;
    public static final String PROP_HAS_CITYQUARTER;
    public static final String PROP_HAS_CITYREGION;
    public static final String PROP_HAS_CITYPLACE;
    public static final String PROP_HAS_POSTALCODE;
    public static final String PROP_HAS_EXTENDEDADDRESS;

    static {
	MY_URI = Location.uAAL_LOCATION_NAMESPACE + "Address";

	PROP_HAS_REGION = Location.uAAL_LOCATION_NAMESPACE + "hasAddressRegion";
	PROP_HAS_COUNTRY = Location.uAAL_LOCATION_NAMESPACE
		+ "hasAddressCountry";
	PROP_HAS_STATE = Location.uAAL_LOCATION_NAMESPACE + "hasAddressState";
	PROP_HAS_CITY = Location.uAAL_LOCATION_NAMESPACE + "hasAddressCity";
	PROP_HAS_CITYQUARTER = Location.uAAL_LOCATION_NAMESPACE
		+ "hasAddressCityQuarter";
	PROP_HAS_CITYREGION = Location.uAAL_LOCATION_NAMESPACE
		+ "hasAddressCityRegion";
	PROP_HAS_CITYPLACE = Location.uAAL_LOCATION_NAMESPACE
		+ "hasAddressCityPlace";
	PROP_HAS_POSTALCODE = Location.uAAL_LOCATION_NAMESPACE
		+ "hasAddressPostalCode";
	PROP_HAS_EXTENDEDADDRESS = Location.uAAL_LOCATION_NAMESPACE
		+ "hasExtendedAddressDescription";

	register(Address.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {

	if (PROP_HAS_REGION.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Region.MY_URI, 1, 0);
	if (PROP_HAS_COUNTRY.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Country.MY_URI, 1, 0);
	if (PROP_HAS_STATE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    State.MY_URI, 1, 0);
	if (PROP_HAS_CITY.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    City.MY_URI, 1, 0);
	if (PROP_HAS_CITYQUARTER.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    CityQuarter.MY_URI, 1, 0);
	if (PROP_HAS_CITYREGION.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    CityRegion.MY_URI, 1, 0);
	if (PROP_HAS_CITYPLACE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    CityPlace.MY_URI, 1, 0);
	if (PROP_HAS_POSTALCODE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 0);
	if (PROP_HAS_EXTENDEDADDRESS.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 0);

	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = ManagedIndividual.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 9];

	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i++] = PROP_HAS_REGION;
	toReturn[i++] = PROP_HAS_COUNTRY;
	toReturn[i++] = PROP_HAS_STATE;
	toReturn[i++] = PROP_HAS_CITY;
	toReturn[i++] = PROP_HAS_CITYQUARTER;
	toReturn[i++] = PROP_HAS_CITYREGION;
	toReturn[i++] = PROP_HAS_CITYPLACE;
	toReturn[i++] = PROP_HAS_POSTALCODE;
	toReturn[i] = PROP_HAS_EXTENDEDADDRESS;
	return toReturn;
    }

    /**
     * Creates a Address object
     */
    public Address() {

    }

    /**
     * Creates a Address object
     * 
     * @param uri
     *            the object URI
     */
    public Address(String uri) {
	super(uri);
    }

    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "A basic address for a place or entity";
    }

    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "Address";
    }

    public int getPropSerializationType(String propURI) {
	if (PROP_HAS_EXTENDEDADDRESS.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true;
    }

    /**
     * Gets the Region value of the Address
     * 
     * @return The Region value
     */
    public Region getRegion() {
	return (Region) props.get(PROP_HAS_REGION);
    }

    /**
     * Sets the Region value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setRegion(Region reg) {
	props.put(PROP_HAS_REGION, reg);
    }

    /**
     * Gets the Country value of the Address
     * 
     * @return The Country value
     */
    public Country getCountry() {
	return (Country) props.get(PROP_HAS_COUNTRY);
    }

    /**
     * Sets the Country value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setCountry(Country val) {
	props.put(PROP_HAS_COUNTRY, val);
    }

    /**
     * Gets the State value of the Address
     * 
     * @return The State value
     */
    public State getState() {
	return (State) props.get(PROP_HAS_STATE);
    }

    /**
     * Sets the State value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setState(State val) {
	props.put(PROP_HAS_STATE, val);
    }

    /**
     * Gets the City value of the Address
     * 
     * @return The City value
     */
    public City getCity() {
	return (City) props.get(PROP_HAS_CITY);
    }

    /**
     * Sets the City value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setCity(City val) {
	props.put(PROP_HAS_CITY, val);
    }

    /**
     * Gets the CityQuarter value of the Address
     * 
     * @return The CityQuarter value
     */
    public CityQuarter getCityQuarter() {
	return (CityQuarter) props.get(PROP_HAS_CITYQUARTER);
    }

    /**
     * Sets the CityQuarter value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setCityQuarter(CityQuarter val) {
	props.put(PROP_HAS_CITYQUARTER, val);
    }

    /**
     * Gets the CityRegion value of the Address
     * 
     * @return The CityRegion value
     */
    public CityRegion getCityRegion() {
	return (CityRegion) props.get(PROP_HAS_CITYREGION);
    }

    /**
     * Sets the CityRegion value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setCityRegion(CityRegion val) {
	props.put(PROP_HAS_CITYREGION, val);
    }

    /**
     * Gets the CityPlace value of the Address
     * 
     * @return The CityPlace value
     */
    public CityPlace getCityPlace() {
	return (CityPlace) props.get(PROP_HAS_CITYPLACE);
    }

    /**
     * Sets the CityPlace value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setCityPlace(CityPlace val) {
	props.put(PROP_HAS_CITYPLACE, val);
    }

    /**
     * Gets the PostalCode value of the Address
     * 
     * @return The PostalCode value
     */
    public String getPostalCode() {
	return (String) props.get(PROP_HAS_POSTALCODE);
    }

    /**
     * Sets the PostalCode value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setPostalCode(String val) {
	props.put(PROP_HAS_POSTALCODE, val);
    }

    /**
     * Gets the External Address value of the Address
     * 
     * @return The External Address value
     */
    public String getExtAddress() {
	return (String) props.get(PROP_HAS_EXTENDEDADDRESS);
    }

    /**
     * Sets the ExternalAddress value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setExtAddress(String val) {
	props.put(PROP_HAS_EXTENDEDADDRESS, val);
    }

    /**
     * Returns a printable summary of the Address with all its values.
     * 
     * @return A string with the Address values. May have several lines.
     */
    public String toReadableString() {
	StringBuilder address = new StringBuilder();
	StringBuilder cities = new StringBuilder();

	if (this.getCityPlace() != null) {
	    cities.append(this.getCityPlace());
	}
	if (this.getCityQuarter() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCityQuarter());
	}
	if (this.getCityRegion() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCityRegion());
	}
	if (this.getCity() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCity());
	}
	if (cities.length() > 0)
	    cities.append("\n");
	if (this.getRegion() != null) {
	    cities.append(this.getRegion());
	}
	if (this.getState() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getState());
	}
	if (this.getCountry() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCountry());
	}
	if (this.getPostalCode() != null)
	    address.append(this.getPostalCode() + ". \n");
	if (cities.length() > 0)
	    address.append(cities.toString() + ".\n");
	if (this.getExtAddress() != null)
	    address.append(this.getExtAddress() + ". \n");

	return address.toString();
    }

}