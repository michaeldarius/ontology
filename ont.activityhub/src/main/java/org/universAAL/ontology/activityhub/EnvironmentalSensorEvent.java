package org.universAAL.ontology.activityhub;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.ActivityHubOntology;

/**
 * Ontological enumeration of environmental sensor events according
 * to ISO 11073 - Part 10471 (Indepentend living activity hub).
 * Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * Specific sensor events (from standard specification):
 * - condition detected
 * - no condition detected (optional)
 * 
 * NOTE: In the standard specification an "environmental sensor" abstracts
 * following types of sensors: smoke-, co-, water- and gas sensor.
 *  
 * @author Thomas Fuxreiter
 *
 */
public class EnvironmentalSensorEvent extends ManagedIndividual {
	public static final String MY_URI = ActivityHubOntology.NAMESPACE + 
	"EnvironmentalSensorEvent";

	public static final int CONDITION_DETECTED = 0;
	public static final int NO_CONDITION_DETECTED = 1;

	private static final String[] names = { "condition_detected", 
		"no_condition_detected"};

	public static final EnvironmentalSensorEvent condition_detected = 
		new EnvironmentalSensorEvent(CONDITION_DETECTED);
	public static final EnvironmentalSensorEvent no_condition_detected = 
		new EnvironmentalSensorEvent(NO_CONDITION_DETECTED);

	private int order = 0;

	public EnvironmentalSensorEvent(String uri) {
		super(uri);
	}

	private EnvironmentalSensorEvent(int order) {
		super(ActivityHubOntology.NAMESPACE + names[order]);
		this.order  = order;
	}

	public static EnvironmentalSensorEvent getEventByOrder(int order) {
		switch (order) {
		case CONDITION_DETECTED:
			return condition_detected;
		case NO_CONDITION_DETECTED:
			return no_condition_detected;
		default:
			return null;
		}
	}

	public static final EnvironmentalSensorEvent valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(ActivityHubOntology.NAMESPACE))
			name = name.substring(ActivityHubOntology.NAMESPACE.length());

		for (int i = CONDITION_DETECTED; i <= NO_CONDITION_DETECTED; i++)
			if (names[i].equals(name))
				return getEventByOrder(i);

		return null;
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		/*This class has no property*/
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}

	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}
}