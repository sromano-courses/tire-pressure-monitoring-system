package it.sromano.tpms;

import java.util.Random;

public class Sensor {
	
	public static final double OFFSET = 16;

	public double popNextPressurePsiValue() {
		double pressureTelemetryValue = samplePressure();
		return OFFSET + pressureTelemetryValue;
	}

	private double samplePressure() {
		// placeholder implementation that simulate a real sensor in a real tire
		Random basicRandomNumbersGenerator = new Random();
		double pressureTelemetryValue = 6 * basicRandomNumbersGenerator.nextDouble();
		return pressureTelemetryValue;
	}
}
