
package com.emc.gs.network.validation.tool.prepopulatedto;

import java.beans.IntrospectionException;

import org.junit.Test;

import com.emc.gs.network.validation.tool.dto.JavaBeanTester;

public class TestPrepopulateDtos {

	@Test
	public void testAlternateSwitchPortsRange() {
		try {
			JavaBeanTester.test(AlternateSwitchPortsRange.class);
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
	}
	
		@Test
	public void testAlternateSwitchPortsRange_2() {
		try {
			JavaBeanTester.test(AlternateSwitchPortsRange_2.class);
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
	}
	
}
