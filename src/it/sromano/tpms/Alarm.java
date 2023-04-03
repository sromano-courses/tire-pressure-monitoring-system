package it.sromano.tpms;

public class Alarm {
	
	private final double lowPressureThreshold = 17;
	private final double highPressureThreshold = 21;
	private Sensor sensor;
	private boolean alarmOn = false;


	public Alarm() {
		this.sensor = new Sensor();
		this.alarmOn = false;
	}

	public void check() {
		double psiPressureValue = sensor.popNextPressurePsiValue();

		if (psiPressureValue < lowPressureThreshold || highPressureThreshold < psiPressureValue) {
			alarmOn = true;
		}
	}

	public boolean isAlarmOn() {
		return alarmOn;
	}
	
	public void resetAlarm() {
		alarmOn = false;
	}
}
