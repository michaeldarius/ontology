package org.universAAL.ontology.test;

import org.universAAL.middleware.bus.junit.BusTestCase;
import org.universAAL.ontology.LightingActivator;
import org.universAAL.ontology.PhWorldActivator;

public class MyTest extends BusTestCase {

    protected void setUp() throws Exception {
	super.setUp();
	new PhWorldActivator().start(mc);
	new LightingActivator().start(mc);
    }

    public void test() {
    }
}