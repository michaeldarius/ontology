package org.universAAL.ontology.X73;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

public class BloodPressureMonitor extends MDS {
    public static final String MY_URI = X73Ontology.NAMESPACE
	    + "BloodPressureMonitor";
    public static final String PROP_HAS_MEASURED_B_P_SYS = X73Ontology.NAMESPACE
	    + "hasMeasuredBPSys";
    public static final String PROP_HAS_MEASURED_B_P_DIA = X73Ontology.NAMESPACE
	    + "hasMeasuredBPDia";
    public static final String PROP_HAS_MEASURED_PULSE = X73Ontology.NAMESPACE
	    + "hasMeasuredPulse";

    public BloodPressureMonitor() {
	super();
    }

    public BloodPressureMonitor(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_HAS_MEASURED_B_P_SYS.equals(propURI)
		|| PROP_HAS_MEASURED_B_P_DIA.equals(propURI)
		|| PROP_HAS_MEASURED_PULSE.equals(propURI) ? PROP_SERIALIZATION_FULL
		: super.getPropSerializationType(propURI);
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_HAS_MEASURED_B_P_SYS)
		&& hasProperty(PROP_HAS_MEASURED_B_P_DIA)
		&& hasProperty(PROP_HAS_MEASURED_PULSE);
    }

    public BloodPressureSys getHasMeasuredBPSys() {
	return (BloodPressureSys) getProperty(PROP_HAS_MEASURED_B_P_SYS);
    }

    public void setHasMeasuredBPSys(BloodPressureSys newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_HAS_MEASURED_B_P_SYS, newPropValue);
    }

    public BloodPressureDia getHasMeasuredBPDia() {
	return (BloodPressureDia) getProperty(PROP_HAS_MEASURED_B_P_DIA);
    }

    public void setHasMeasuredBPDia(BloodPressureDia newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_HAS_MEASURED_B_P_DIA, newPropValue);
    }

    public BloodPressureDia getHasMeasuredPulse() {
	return (BloodPressureDia) getProperty(PROP_HAS_MEASURED_PULSE);
    }

    public void setHasMeasuredPulse(Pulse newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_HAS_MEASURED_PULSE, newPropValue);
    }
}
