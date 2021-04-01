package io.neutrolab.operation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import io.neutrolab.operation.service.SphereService;

class SphereOpTest {

	
	@Test
	void testCalculateVolume_with_service() {
		SphereService service = Mockito.mock(SphereService.class);
		
	
		Mockito.when(service.evaluateVolume(1))
				.thenReturn( (4/3) * Math.PI);
		
		double expected = (4/3) * Math.PI;
		
		SphereOp op = new SphereOp(service);
		double actual = op.calculateVolumeWithService(1);
		
		assertEquals(expected, actual);
		
		//check to ensure the service.evaluateVolume 
		//is invoked inside op.calculateVolumeWithService
		Mockito.verify(service).evaluateVolume(1);
	}

}
