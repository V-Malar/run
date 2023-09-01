package asn3;

import java.io.Serializable;
import asn3.Exposure;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public class Patient implements Comparable<Patient>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6070998807281092680L;
	public UUID patientId;
	String firstName, lastName;
	Exposure[] exposures;
	UUID[] diseaseIds;

	public Patient(int maxDiseases, int maxExposures) {
		if (maxDiseases > 0) {
			diseaseIds = new UUID[maxDiseases];
		} else {
			throw new IllegalArgumentException("Invalid maxDisease count..");
		}
		if (maxExposures > 0) {
			exposures = new Exposure[maxExposures];
		} else {
			throw new IllegalArgumentException("Invalid maxExposure count..");
		}
	}

	public void addDiseaseId(UUID diseaseId) {
		for (int i = 0; i < diseaseIds.length; i++) {
			if (diseaseIds[i] == null) {
				diseaseIds[i] = diseaseId;
				return;
			}
		}
		throw new ArrayIndexOutOfBoundsException("Max level reached..");
	}

	public void addExposure(Exposure exposure) {
		for (int i = 0; i < exposures.length; i++) {
			if (exposures[i] == null) {
				exposures[i] = exposure;
				return;
			}
		}
		throw new ArrayIndexOutOfBoundsException("Max level reached..");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}

	public void setDiseaseIds(UUID[] diseaseIds) {
		this.diseaseIds = diseaseIds;
	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	public Exposure[] getExposures() {
		return exposures;
	}

	public void setExposures(Exposure[] exposures) {
		this.exposures = exposures;
	}

	@Override
	public int hashCode() {
		return Objects.hash(patientId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(patientId, other.patientId);
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + "]";
	}

	@Override
	public int compareTo(Patient other) {
		Comparator<String> lastNameComparator = Comparator.comparing(String::toLowerCase);
		return lastNameComparator.compare(this.lastName, other.lastName);
	}

}
