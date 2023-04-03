package it.sromano.tpms;

/**
 * How to use this class:
 * Alarm alarm = new Alarm();
 * alarm.check();
 * alarm.isAlarmOn();
 *
 */
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

		if (psiPressureValue < lowPressureThreshold || psiPressureValue > highPressureThreshold) {
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
