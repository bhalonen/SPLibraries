package net.relinc.libraries.data;

public class IncidentBarStrainPulse extends IncidentPulse {

	public IncidentBarStrainPulse(double[] t, double[] d) {
		super(t, d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double[] getUsefulTrimmedData() {
		return super.getTrimmedData();
	}

}
