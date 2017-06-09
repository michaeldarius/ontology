/*
     Copyright 2010-2014 AIT Austrian Institute of Technology GmbH
	 http://www.ait.ac.at
     
     See the NOTICE file distributed with this work for additional
     information regarding copyright ownership

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
*/

package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;
import org.universAAL.ontology.activityhub.util.ActivityHubSensorType;

/**
 * Ontological representation of a property exit sensor according to ISO 11073 -
 * Part 10471 (Independent living activity hub). Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * Specific sensor events (from standard specification): - occupant exit
 * property // one or more people have departed via exit door - exit door left
 * open (optional) // exit door remains open - no condition detected (optional)
 * 
 * TODO: Implement generic sensor properties flags for activity hub sensors
 * 
 * @author Thomas Fuxreiter
 */
public class PropertyExitSensor extends ActivityHubSensor {

	public static final String MY_URI = ActivityHubOntology.NAMESPACE + "PropertyExitSensor";

	public static final int MY_SENSOR_TYPE = ActivityHubSensorType.PropertyExitSensor;

	/**
	 * 
	 */
	public PropertyExitSensor() {
		// super();
	}

	/**
	 * @param uri
	 */
	public PropertyExitSensor(String uri) {
		super(uri);
	}

	/**
	 * From Resource class: The properties denote the RDF triples of this
	 * resource, realized as Hashtable. The RDF subject is this Resource itself,
	 * the key of the Hashtable is the RDF predicate and the value of the
	 * Hashtable is the RDF object, which can be a literal or another resource.
	 * See {@link #setProperty(String propURI, Object value)} for more
	 * information.
	 */
	public void setMeasuredValue(PropertyExitSensorEvent event) {
		props.put(PROP_HAS_VALUE, event);
	}

	public PropertyExitSensorEvent getMeasuredvalue() {
		return ((PropertyExitSensorEvent) props.get(PROP_HAS_VALUE));
	}

	/**
	 * @see org.universAAL.ontology.phThing.Sensor#getClassURI()
	 * @return Ontology namespace for this class
	 */
	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_HAS_VALUE.equals(propURI) ? PROP_SERIALIZATION_FULL : super.getPropSerializationType(propURI);
	}

	public boolean isWellFormed() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.universAAL.ontology.activityhub.ActivityHubSensor#getSensorType()
	 */
	public int getSensorType() {
		return MY_SENSOR_TYPE;
	}
}
